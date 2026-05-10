#!/usr/bin/env node

const fs = require('fs');
const path = require('path');
let yaml;
try {
  yaml = require('js-yaml');
} catch (error) {
  yaml = require(path.resolve(
    __dirname,
    '..',
    '..',
    'blue-repository-js',
    'node_modules',
    'js-yaml'
  ));
}

const repositoryVersion = '0.28.0';
const resourceBase = 'blue/repository/v0_28_0';
const javaVersionPackage = 'blue.repository.v0_28_0';
const repoRoot = path.resolve(__dirname, '..');
const sourceRepositoryRoot = path.resolve(__dirname, '..', '..', 'blue-repository');
const sourceBundle = path.join(sourceRepositoryRoot, 'BlueRepository.blue');
const resourcesRoot = path.join(repoRoot, 'src', 'main', 'resources', resourceBase);
const definitionsRoot = path.join(resourcesRoot, 'definitions');
const constantsRoot = path.join(repoRoot, 'src', 'main', 'java', 'blue', 'repository', 'types');
const modelsRoot = path.join(repoRoot, 'src', 'main', 'java', 'blue', 'repository', 'v0_28_0');

const reservedNodeKeys = new Set([
  'name',
  'description',
  'type',
  'itemType',
  'keyType',
  'valueType',
  'value',
  'items',
  'blueId',
  'schema',
  'mergePolicy',
  'previousBlueId',
  'position',
  'blue',
  'inlineValue',
]);

const javaKeywords = new Set([
  'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char', 'class', 'const',
  'continue', 'default', 'do', 'double', 'else', 'enum', 'extends', 'final', 'finally',
  'float', 'for', 'goto', 'if', 'implements', 'import', 'instanceof', 'int', 'interface',
  'long', 'native', 'new', 'package', 'private', 'protected', 'public', 'return', 'short',
  'static', 'strictfp', 'super', 'switch', 'synchronized', 'this', 'throw', 'throws',
  'transient', 'try', 'void', 'volatile', 'while',
]);

const basicBlueIds = {
  text: 'DLRQwz7MQeCrzjy9bohPNwtCxKEBbKaMK65KBrwjfG6K',
  double: '7pwXmXYCJtWnd348c2JQGBkm9C4renmZRwxbfaypsx5y',
  integer: '5WNMiV9Knz63B4dVY5JtMyh3FB4FSGqv7ceScvuapdE1',
  boolean: '4EzhSubEimSQD3zrYHRtobfPPWntUuhEz8YcdxHsi12u',
  list: '6aehfNAxHLC1PHHoDr3tYtFH3RWNbiWdFancJ1bypXEY',
  dictionary: 'G7fBT9PSod1RfHLHkpafAGBDVAJMrMhAMY51ERcyXNrj',
};

const externalBaseTypes = new Map([
  ['Core/Contract', {
    extendsType: 'blue.language.processor.model.Contract',
    inheritedFields: new Set(['order']),
  }],
  ['Core/Handler', {
    extendsType: 'blue.language.processor.model.HandlerContract',
    inheritedFields: new Set(['channel', 'event']),
  }],
  ['Core/Channel', {
    extendsType: 'blue.language.processor.model.ChannelContract',
    inheritedFields: new Set(['path', 'definition']),
  }],
  ['Core/Marker', {
    extendsType: 'blue.language.processor.model.MarkerContract',
    inheritedFields: new Set(),
  }],
]);

function mkdirp(dir) {
  fs.mkdirSync(dir, { recursive: true });
}

function javaString(value) {
  return `${value}`.replace(/\\/g, '\\\\').replace(/"/g, '\\"');
}

function upperSnake(name) {
  let result = `${name}`.replace(/[^A-Za-z0-9]+/g, '_').replace(/^_+|_+$/g, '').toUpperCase();
  if (!result) {
    result = 'TYPE';
  }
  if (/^[0-9]/.test(result)) {
    result = `TYPE_${result}`;
  }
  return result;
}

function words(value) {
  return `${value}`.replace(/[^A-Za-z0-9]+/g, ' ').trim().split(/\s+/).filter(Boolean);
}

function className(name) {
  let result = words(name).map((word) => word.charAt(0).toUpperCase() + word.slice(1)).join('');
  if (!result) {
    result = 'Type';
  }
  if (/^[0-9]/.test(result)) {
    result = `Type${result}`;
  }
  return result;
}

function fieldName(name) {
  const parts = words(name);
  if (!parts.length) {
    return 'field';
  }
  let result = parts[0].charAt(0).toLowerCase() + parts[0].slice(1);
  for (let i = 1; i < parts.length; i += 1) {
    result += parts[i].charAt(0).toUpperCase() + parts[i].slice(1);
  }
  if (/^[0-9]/.test(result)) {
    result = `field${result}`;
  }
  if (javaKeywords.has(result)) {
    result = `${result}Value`;
  }
  return result;
}

function getterName(field) {
  return `get${field.charAt(0).toUpperCase()}${field.slice(1)}`;
}

function packageSegment(packageName) {
  return `${packageName}`.replace(/[^A-Za-z0-9]+/g, '').toLowerCase();
}

function constantsClassName(packageName) {
  return `${packageName}`.replace(/[^A-Za-z0-9]+/g, '') + 'Types';
}

function fileName(name, used) {
  const base = `${name}`.replace(/[^A-Za-z0-9]+/g, '');
  let candidate = base || 'Type';
  let index = 2;
  while (used.has(candidate)) {
    candidate = `${base || 'Type'}${index}`;
    index += 1;
  }
  used.add(candidate);
  return `${candidate}.json`;
}

function latestVersion(versions) {
  if (!Array.isArray(versions) || versions.length === 0) {
    throw new Error('Repository type is missing versions');
  }
  return versions.reduce((latest, candidate) =>
    candidate.repositoryVersionIndex > latest.repositoryVersionIndex ? candidate : latest
  );
}

function discoverDefinitions(repository) {
  const definitions = [];
  const definitionsByPackage = new Map();
  const byBlueId = new Map();

  for (const pkg of repository.packages || []) {
    const packageDefinitions = [];
    const usedFileNames = new Set();
    for (const type of pkg.types || []) {
      const version = latestVersion(type.versions);
      const name = type.content && type.content.name;
      if (!name) {
        throw new Error(`Repository type in package ${pkg.name} is missing content.name`);
      }
      const definition = {
        packageName: pkg.name,
        packageSegment: packageSegment(pkg.name),
        name,
        className: className(name),
        qualifiedName: `${pkg.name}/${name}`,
        blueId: version.typeBlueId,
        resourcePath: `${resourceBase}/definitions/${pkg.name}/${fileName(name, usedFileNames)}`,
        status: type.status || null,
        repositoryVersionIndex: version.repositoryVersionIndex,
        content: type.content,
      };
      definitions.push(definition);
      packageDefinitions.push(definition);
      byBlueId.set(definition.blueId, definition);
    }
    definitionsByPackage.set(pkg.name, packageDefinitions);
  }

  return { definitions, definitionsByPackage, byBlueId };
}

function modelPackage(definition) {
  return `${javaVersionPackage}.${definition.packageSegment}`;
}

function modelFqcn(definition) {
  return `${modelPackage(definition)}.${definition.className}`;
}

function referencedDefinition(typeNode, byBlueId) {
  if (!typeNode || !typeNode.blueId) {
    return null;
  }
  return byBlueId.get(typeNode.blueId) || null;
}

function javaType(typeNode, byBlueId, imports, currentDefinition) {
  if (!typeNode) {
    return 'Node';
  }

  const blueId = typeNode.blueId;
  if (blueId === basicBlueIds.text) {
    return 'String';
  }
  if (blueId === basicBlueIds.integer) {
    imports.add('java.math.BigInteger');
    return 'BigInteger';
  }
  if (blueId === basicBlueIds.double) {
    return 'Double';
  }
  if (blueId === basicBlueIds.boolean) {
    return 'Boolean';
  }
  if (blueId === basicBlueIds.list) {
    imports.add('java.util.List');
    return `List<${javaType(typeNode.itemType, byBlueId, imports, currentDefinition)}>`;
  }
  if (blueId === basicBlueIds.dictionary) {
    imports.add('java.util.Map');
    const keyType = dictionaryKeyType(typeNode.keyType, imports);
    return `Map<${keyType}, ${javaType(typeNode.valueType, byBlueId, imports, currentDefinition)}>`;
  }

  const referenced = referencedDefinition(typeNode, byBlueId);
  if (referenced) {
    const fqcn = modelFqcn(referenced);
    if (modelPackage(referenced) !== modelPackage(currentDefinition)) {
      imports.add(fqcn);
    }
    return referenced.className;
  }

  return 'Node';
}

function fieldJavaType(propertyNode, byBlueId, imports, currentDefinition) {
  if (propertyNode && propertyNode.type) {
    return javaType(effectiveTypeNode(propertyNode), byBlueId, imports, currentDefinition);
  }
  if (propertyNode && propertyNode.items) {
    imports.add('java.util.List');
    return 'List<Node>';
  }
  if (propertyNode && propertyNode.properties) {
    imports.add('java.util.Map');
    return 'Map<String, Node>';
  }
  return 'Node';
}

function dictionaryKeyType(typeNode, imports) {
  if (!typeNode || !typeNode.blueId || typeNode.blueId === basicBlueIds.text) {
    return 'String';
  }
  if (typeNode.blueId === basicBlueIds.integer) {
    imports.add('java.math.BigInteger');
    return 'BigInteger';
  }
  if (typeNode.blueId === basicBlueIds.double) {
    return 'Double';
  }
  if (typeNode.blueId === basicBlueIds.boolean) {
    return 'Boolean';
  }
  return 'String';
}

function effectiveTypeNode(propertyNode) {
  if (!propertyNode || !propertyNode.type) {
    return null;
  }
  return {
    ...propertyNode.type,
    itemType: propertyNode.itemType || propertyNode.type.itemType,
    keyType: propertyNode.keyType || propertyNode.type.keyType,
    valueType: propertyNode.valueType || propertyNode.type.valueType,
  };
}

function ownFields(definition) {
  return Object.keys(definition.content || {})
    .filter((key) => !reservedNodeKeys.has(key))
    .map((key) => ({
      originalName: key,
      fieldName: fieldName(key),
      node: definition.content[key],
    }));
}

function inheritedFieldNames(definition, byBlueId, seen = new Set()) {
  const result = new Set();
  const externalBase = externalBaseTypes.get(definition.qualifiedName);
  if (externalBase) {
    for (const fieldName of externalBase.inheritedFields) {
      result.add(fieldName);
    }
  }
  const parent = referencedDefinition(definition.content.type, byBlueId);
  if (!parent || seen.has(parent.blueId)) {
    return result;
  }
  seen.add(parent.blueId);
  for (const fieldName of inheritedFieldNames(parent, byBlueId, seen)) {
    result.add(fieldName);
  }
  for (const field of ownFields(parent)) {
    result.add(field.fieldName);
  }
  return result;
}

function writeConstantsClass(packageName, definitions) {
  const cls = constantsClassName(packageName);
  const usedConstants = new Set();
  const lines = [
    'package blue.repository.types;',
    '',
    'import blue.repository.RepositoryType;',
    '',
    `public final class ${cls} {`,
  ];
  for (const definition of definitions) {
    lines.splice(lines.length - 1, 0, `import ${modelFqcn(definition)};`);
  }
  lines.splice(lines.length - 1, 0, '');

  for (const definition of definitions) {
    let identifier = upperSnake(definition.name);
    let suffix = 2;
    while (usedConstants.has(identifier)) {
      identifier = `${upperSnake(definition.name)}_${suffix}`;
      suffix += 1;
    }
    usedConstants.add(identifier);
    lines.push(`    public static final RepositoryType ${identifier} = ${definition.className}.repositoryType();`);
    lines.push('');
  }

  lines.push(`    private ${cls}() {`);
  lines.push('    }');
  lines.push('}');
  lines.push('');

  fs.writeFileSync(path.join(constantsRoot, `${cls}.java`), lines.join('\n'));
}

function writeModelClass(definition, byBlueId) {
  const pkg = modelPackage(definition);
  const dir = path.join(modelsRoot, definition.packageSegment);
  mkdirp(dir);

  const imports = new Set([
    'blue.language.model.Node',
    'blue.language.model.TypeBlueId',
    'blue.repository.RepositoryType',
  ]);
  const parent = referencedDefinition(definition.content.type, byBlueId);
  let extendsClause = '';
  const externalBase = externalBaseTypes.get(definition.qualifiedName);
  if (externalBase) {
    extendsClause = ` extends ${externalBase.extendsType}`;
  } else if (parent) {
    if (modelPackage(parent) !== modelPackage(definition)) {
      imports.add(modelFqcn(parent));
    }
    extendsClause = ` extends ${parent.className}`;
  }

  const inherited = inheritedFieldNames(definition, byBlueId);
  const fields = ownFields(definition).filter((field) => !inherited.has(field.fieldName));
  for (const field of fields) {
    field.javaType = fieldJavaType(field.node, byBlueId, imports, definition);
    if (field.originalName !== field.fieldName) {
      imports.add('com.fasterxml.jackson.annotation.JsonProperty');
    }
  }

  const lines = [
    `package ${pkg};`,
    '',
  ];
  for (const item of Array.from(imports).sort()) {
    lines.push(`import ${item};`);
  }
  lines.push('');
  lines.push(`@TypeBlueId("${javaString(definition.blueId)}")`);
  lines.push(`public class ${definition.className}${extendsClause} {`);
  lines.push('    public static String blueId() {');
  lines.push(`        return "${javaString(definition.blueId)}";`);
  lines.push('    }');
  lines.push('');
  lines.push('    public static String packageName() {');
  lines.push(`        return "${javaString(definition.packageName)}";`);
  lines.push('    }');
  lines.push('');
  lines.push('    public static String typeName() {');
  lines.push(`        return "${javaString(definition.name)}";`);
  lines.push('    }');
  lines.push('');
  lines.push('    public static String qualifiedName() {');
  lines.push(`        return "${javaString(definition.qualifiedName)}";`);
  lines.push('    }');
  lines.push('');
  lines.push('    public static String resourcePath() {');
  lines.push(`        return "${javaString(definition.resourcePath)}";`);
  lines.push('    }');
  lines.push('');
  lines.push('    public static RepositoryType repositoryType() {');
  lines.push('        return RepositoryType.of(');
  lines.push('                packageName(),');
  lines.push('                typeName(),');
  lines.push('                qualifiedName(),');
  lines.push('                blueId(),');
  lines.push('                resourcePath());');
  lines.push('    }');
  lines.push('');

  for (const field of fields) {
    if (field.originalName !== field.fieldName) {
      lines.push(`    // Original Blue property name: ${field.originalName}`);
      lines.push(`    @JsonProperty("${javaString(field.originalName)}")`);
    }
    lines.push(`    private ${field.javaType} ${field.fieldName};`);
    lines.push('');
  }

  for (const field of fields) {
    lines.push(`    public ${field.javaType} ${getterName(field.fieldName)}() {`);
    lines.push(`        return ${field.fieldName};`);
    lines.push('    }');
    lines.push('');
    lines.push(`    public ${definition.className} ${field.fieldName}(${field.javaType} ${field.fieldName}) {`);
    lines.push(`        this.${field.fieldName} = ${field.fieldName};`);
    lines.push('        return this;');
    lines.push('    }');
    lines.push('');
  }

  lines.push('}');
  lines.push('');

  fs.writeFileSync(path.join(dir, `${definition.className}.java`), lines.join('\n'));
}

function writeVersionRegistry(definitions) {
  const lines = [
    `package ${javaVersionPackage};`,
    '',
    'import blue.language.utils.TypeClassResolver;',
    '',
    'public final class BlueRepositoryV0_28_0 {',
    `    public static final String VERSION = "${repositoryVersion}";`,
    '',
    '    public static TypeClassResolver typeClassResolver() {',
    '        return registerAll(new TypeClassResolver());',
    '    }',
    '',
    '    public static TypeClassResolver registerAll(TypeClassResolver resolver) {',
    '        if (resolver == null) {',
    '            throw new IllegalArgumentException("resolver must not be null");',
    '        }',
  ];

  for (const definition of definitions) {
    lines.push(`        resolver.registerAnnotatedClass(${modelFqcn(definition)}.class);`);
  }

  lines.push('        return resolver;');
  lines.push('    }');
  lines.push('');
  lines.push('    private BlueRepositoryV0_28_0() {');
  lines.push('    }');
  lines.push('}');
  lines.push('');

  fs.writeFileSync(path.join(modelsRoot, 'BlueRepositoryV0_28_0.java'), lines.join('\n'));
}

function main() {
  const repository = yaml.load(fs.readFileSync(sourceBundle, 'utf8'));
  const repositoryVersions = repository.repositoryVersions || [];
  const repositoryVersionBlueId = repositoryVersions[repositoryVersions.length - 1];
  const { definitions, definitionsByPackage, byBlueId } = discoverDefinitions(repository);

  fs.rmSync(resourcesRoot, { recursive: true, force: true });
  fs.rmSync(constantsRoot, { recursive: true, force: true });
  fs.rmSync(modelsRoot, { recursive: true, force: true });
  mkdirp(resourcesRoot);
  mkdirp(definitionsRoot);
  mkdirp(constantsRoot);
  mkdirp(modelsRoot);
  fs.copyFileSync(sourceBundle, path.join(resourcesRoot, 'BlueRepository.blue'));

  for (const [packageName, packageDefinitions] of definitionsByPackage.entries()) {
    mkdirp(path.join(definitionsRoot, packageName));
    for (const definition of packageDefinitions) {
      fs.writeFileSync(
        path.join(repoRoot, 'src', 'main', 'resources', definition.resourcePath),
        `${JSON.stringify(definition.content, null, 2)}\n`
      );
    }
    writeConstantsClass(packageName, packageDefinitions);
  }

  const manifest = {
    repositoryName: repository.name,
    repositoryVersion,
    repositoryVersionBlueId,
    sourceResource: `${resourceBase}/BlueRepository.blue`,
    packageNames: Array.from(definitionsByPackage.keys()),
    definitions: definitions.map((definition) => ({
      packageName: definition.packageName,
      name: definition.name,
      qualifiedName: definition.qualifiedName,
      blueId: definition.blueId,
      resourcePath: definition.resourcePath,
      status: definition.status,
      repositoryVersionIndex: definition.repositoryVersionIndex,
    })),
  };
  fs.writeFileSync(path.join(resourcesRoot, 'manifest.json'), `${JSON.stringify(manifest, null, 2)}\n`);

  for (const definition of definitions) {
    writeModelClass(definition, byBlueId);
  }
  writeVersionRegistry(definitions);
}

main();
