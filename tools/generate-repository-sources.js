#!/usr/bin/env node

const fs = require('fs');
const path = require('path');
const crypto = require('crypto');
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

const repoRoot = path.resolve(__dirname, '..');
const sourceRepositoryRoot = path.resolve(__dirname, '..', '..', 'blue-repository');

function option(name, defaultValue) {
  const prefix = `--${name}=`;
  const index = process.argv.indexOf(`--${name}`);
  if (index !== -1 && index + 1 < process.argv.length) {
    return process.argv[index + 1];
  }
  const match = process.argv.find((arg) => arg.startsWith(prefix));
  return match ? match.slice(prefix.length) : defaultValue;
}

function versionPackageSegment(version) {
  return `v${`${version}`.replace(/[^A-Za-z0-9]+/g, '_').replace(/^_+|_+$/g, '')}`;
}

function registryClassName(versionSegment) {
  return `BlueRepository${versionSegment.charAt(0).toUpperCase()}${versionSegment.slice(1)}`;
}

const repositoryVersion = option('repository-version', '1.3.0');
const javaVersionSegment = option('java-package-segment', versionPackageSegment(repositoryVersion));
const resourceBase = option('resource-base', 'blue/repo');
const javaVersionPackage = option('java-package', 'blue.repo');
const versionRegistryClassName = option('registry-class', 'BlueRepositoryModels');
const defaultSourceBundle = path.join(repoRoot, 'src', 'main', 'resources', resourceBase, 'BlueRepository.blue');
const canonicalRepositoryBundle = path.join(sourceRepositoryRoot, 'BlueRepository.blue');
const explicitSourceBundle = option(
  'repository',
  option('source', process.env.BLUE_REPOSITORY_BLUE || process.env.BLUE_REPOSITORY_SOURCE || null)
);
const sourceBundle = path.resolve(
  explicitSourceBundle
    || (fs.existsSync(canonicalRepositoryBundle) ? canonicalRepositoryBundle : defaultSourceBundle)
);
const javaOutputRoot = path.resolve(option('java-output-root', path.join(repoRoot, 'src', 'main', 'java')));
const resourcesOutputRoot = path.resolve(option('resources-output-root', path.join(repoRoot, 'src', 'main', 'resources')));
const resourcesRoot = path.join(resourcesOutputRoot, resourceBase);
const definitionsRoot = path.join(resourcesRoot, 'definitions');
const constantsRoot = path.join(javaOutputRoot, 'blue', 'repo', 'types');
const modelsRoot = path.join(javaOutputRoot, ...javaVersionPackage.split('.'));

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
  text: 'GX7CFUmSDrE2MzptunLCCdZwnuwwrenRQqEnHL4x3uoC',
  double: '9eWaHYz2vKrFofdHTHAizNNu8xP6QE3WQ5y7DGrGZvyJ',
  integer: 'E2LM6qgzWG9ttagq2xTmiZkgYEAgkYedFCmU9v7NnVEq',
  boolean: 'AwvXD961fmnmqcSQhjMA7r15HpVh39cefb6ZTyUz2Fm2',
  list: '8DSFoWG9MqRSUhStqoPLrwVQiYByRh18NWbDEarN8MKF',
  dictionary: 'Efkz9D1ARMM7rU43w3rDNVqat1naS6qXKCqP4eHin3yG',
};

const legacyBasicBlueIds = {
  text: 'DLRQwz7MQeCrzjy9bohPNwtCxKEBbKaMK65KBrwjfG6K',
  double: '7pwXmXYCJtWnd348c2JQGBkm9C4renmZRwxbfaypsx5y',
  integer: '5WNMiV9Knz63B4dVY5JtMyh3FB4FSGqv7ceScvuapdE1',
  boolean: '4EzhSubEimSQD3zrYHRtobfPPWntUuhEz8YcdxHsi12u',
  list: '6aehfNAxHLC1PHHoDr3tYtFH3RWNbiWdFancJ1bypXEY',
  dictionary: 'G7fBT9PSod1RfHLHkpafAGBDVAJMrMhAMY51ERcyXNrj',
};

const basicBlueIdAliases = new Map(Object.keys(basicBlueIds)
  .flatMap((key) => [
    [basicBlueIds[key], basicBlueIds[key]],
    [legacyBasicBlueIds[key], basicBlueIds[key]],
  ]));

const runtimeBlueIds = {
  contract: '6WrVQoSpKHUUg5HPrwjkVV6pxe4sdkyGnakMs8ayEGeF',
  handler: '7X46P3Q6FJrogqKrBXTALpqzkieyyiQeatnqLvWzAPXE',
  channel: '4FAZ94JPExNM4pn2ZhtdHa4CVP7uASmLNVrBy7aCG1p5',
  marker: '6zqbYGDGrMv5ReuEsjyzyyjjuqVnqDZxtY7RsPXdBTNy',
  processEmbedded: '8FVc8MPz6DcTMgcY3RXU6EBpGa9arWPJ141K2H86yi8Q',
  channelEventCheckpoint: '9GEC24YbFG9hj4banjYh2oEnDpAob1wAPmhjuykJp8T1',
  documentUpdateChannel: 'Ac9LC5T7pHVa1TtkhMBjBRtxecShzvbe7ugUdXT1Mu2o',
  triggeredEventChannel: '5HwxfbwRBCxG8xYpowWkCPC9akqUSKV7So2M4QHEmLsZ',
  lifecycleEventChannel: '2DXGQUiQBQ6CT89jwAsTAXaEPhLgiSXhKCGh9Q7Hv3MQ',
  embeddedNodeChannel: 'H6iUJp3GcLypsJDimMSVoxQQdxxuD8j6eqEUWWqCZ6i',
};

const externalBaseDescriptors = {
  contract: {
    extendsType: 'blue.language.processor.model.Contract',
    inheritedFields: new Set(['order']),
  },
  handler: {
    extendsType: 'blue.language.processor.model.HandlerContract',
    inheritedFields: new Set(['order', 'channel', 'event']),
  },
  channel: {
    extendsType: 'blue.language.processor.model.ChannelContract',
    inheritedFields: new Set(['order', 'path', 'definition']),
  },
  marker: {
    extendsType: 'blue.language.processor.model.MarkerContract',
    inheritedFields: new Set(['order']),
  },
  documentUpdateChannel: {
    extendsType: 'blue.language.processor.model.DocumentUpdateChannel',
    inheritedFields: new Set(['order', 'path', 'definition']),
    preserveParentFields: true,
  },
  triggeredEventChannel: {
    extendsType: 'blue.language.processor.model.TriggeredEventChannel',
    inheritedFields: new Set(['order', 'path', 'definition']),
    preserveParentFields: true,
  },
  lifecycleEventChannel: {
    extendsType: 'blue.language.processor.model.LifecycleChannel',
    inheritedFields: new Set(['order', 'path', 'definition']),
    preserveParentFields: true,
  },
  embeddedNodeChannel: {
    extendsType: 'blue.language.processor.model.EmbeddedNodeChannel',
    inheritedFields: new Set(['order', 'path', 'definition', 'childPath']),
    preserveParentFields: true,
  },
  processEmbedded: {
    extendsType: 'blue.language.processor.model.ProcessEmbedded',
    inheritedFields: new Set(['order', 'paths']),
  },
  channelEventCheckpoint: {
    extendsType: 'blue.language.processor.model.ChannelEventCheckpoint',
    inheritedFields: new Set(['order', 'lastEvents', 'lastSignatures']),
  },
};

const externalBaseTypes = new Map([
  ['Core/Contract', externalBaseDescriptors.contract],
  ['Core/Handler', externalBaseDescriptors.handler],
  ['Core/Channel', externalBaseDescriptors.channel],
  ['Core/Marker', externalBaseDescriptors.marker],
  ['Core/Document Update Channel', externalBaseDescriptors.documentUpdateChannel],
  ['Core/Triggered Event Channel', externalBaseDescriptors.triggeredEventChannel],
  ['Core/Lifecycle Event Channel', externalBaseDescriptors.lifecycleEventChannel],
  ['Core/Embedded Node Channel', externalBaseDescriptors.embeddedNodeChannel],
  ['Core/Process Embedded', externalBaseDescriptors.processEmbedded],
  ['Core/Channel Event Checkpoint', externalBaseDescriptors.channelEventCheckpoint],
]);

const externalBaseTypesByBlueId = new Map([
  [runtimeBlueIds.contract, externalBaseDescriptors.contract],
  [runtimeBlueIds.handler, externalBaseDescriptors.handler],
  [runtimeBlueIds.channel, externalBaseDescriptors.channel],
  [runtimeBlueIds.marker, externalBaseDescriptors.marker],
  [runtimeBlueIds.documentUpdateChannel, externalBaseDescriptors.documentUpdateChannel],
  [runtimeBlueIds.triggeredEventChannel, externalBaseDescriptors.triggeredEventChannel],
  [runtimeBlueIds.lifecycleEventChannel, externalBaseDescriptors.lifecycleEventChannel],
  [runtimeBlueIds.embeddedNodeChannel, externalBaseDescriptors.embeddedNodeChannel],
  [runtimeBlueIds.processEmbedded, externalBaseDescriptors.processEmbedded],
  [runtimeBlueIds.channelEventCheckpoint, externalBaseDescriptors.channelEventCheckpoint],
]);

function mkdirp(dir) {
  fs.mkdirSync(dir, { recursive: true });
}

function sha256(bytes) {
  return crypto.createHash('sha256').update(bytes).digest('hex');
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

function normalizeTypeVersions(type) {
  const versions = Array.isArray(type.versions) ? [...type.versions] : [];
  versions.sort((a, b) => a.repositoryVersionIndex - b.repositoryVersionIndex);
  return versions.map((version) => ({
    repositoryVersionIndex: version.repositoryVersionIndex,
    typeBlueId: version.typeBlueId,
    attributesAdded: Array.isArray(version.attributesAdded) ? version.attributesAdded : [],
  }));
}

function repositoryVersionName(index, total, currentVersion) {
  if (index === total - 1) {
    return currentVersion;
  }

  const match = /^(\d+)\.(\d+)\.(\d+)(-.+)?$/.exec(currentVersion);
  if (match) {
    const major = Number(match[1]);
    const minor = Number(match[2]);
    const patch = Number(match[3]);
    if (minor === total - 1 && patch === 0) {
      return `${major}.${index}.0`;
    }
  }

  return `repository-${index + 1}`;
}

function repositoryVersionEntries(repository) {
  const versions = Array.isArray(repository.repositoryVersions) ? repository.repositoryVersions : [];
  return versions.map((repositoryBlueId, index) => ({
    index,
    version: repositoryVersionName(index, versions.length, repositoryVersion),
    repositoryBlueId,
  }));
}

function deepClone(value) {
  if (Array.isArray(value)) {
    return value.map(deepClone);
  }
  if (value && typeof value === 'object') {
    return Object.fromEntries(Object.entries(value).map(([key, child]) => [key, deepClone(child)]));
  }
  return value;
}

function currentBasicBlueId(blueId) {
  return basicBlueIdAliases.get(blueId) || blueId;
}

function discoverDefinitions(repository) {
  const definitions = [];
  const definitionsByPackage = new Map();
  const byBlueId = new Map();

  for (const pkg of repository.packages || []) {
    const packageDefinitions = [];
    const usedFileNames = new Set();
    for (const type of pkg.types || []) {
      const versions = normalizeTypeVersions(type);
      const version = latestVersion(versions);
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
        versions,
        content: deepClone(type.content),
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

function resolvedBlueIdReference(blueId, currentDefinition) {
  if (!blueId) {
    return null;
  }
  if (!currentDefinition) {
    return blueId;
  }
  if (blueId === 'this') {
    return currentDefinition.blueId;
  }
  if (blueId.startsWith('this#')) {
    return `${currentDefinition.blueId.split('#')[0]}${blueId.substring(4)}`;
  }
  return blueId;
}

function referencedDefinition(typeNode, byBlueId, currentDefinition = null) {
  if (!typeNode || !typeNode.blueId) {
    return null;
  }
  return byBlueId.get(resolvedBlueIdReference(typeNode.blueId, currentDefinition)) || null;
}

function externalBaseForDefinition(definition) {
  const byQualifiedName = externalBaseTypes.get(definition.qualifiedName);
  if (byQualifiedName) {
    return byQualifiedName;
  }
  const typeNode = definition.content && definition.content.type;
  if (!typeNode || !typeNode.blueId) {
    return null;
  }
  return externalBaseTypesByBlueId.get(resolvedBlueIdReference(typeNode.blueId, definition)) || null;
}

function javaType(typeNode, byBlueId, imports, currentDefinition) {
  if (!typeNode) {
    return 'Node';
  }

  const blueId = currentBasicBlueId(typeNode.blueId);
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

  const referenced = referencedDefinition(typeNode, byBlueId, currentDefinition);
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
  const blueId = typeNode && typeNode.blueId ? currentBasicBlueId(typeNode.blueId) : null;
  if (!blueId || blueId === basicBlueIds.text) {
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
  const externalBase = externalBaseForDefinition(definition);
  if (externalBase) {
    for (const fieldName of externalBase.inheritedFields) {
      result.add(fieldName);
    }
  }
  const parent = referencedDefinition(definition.content.type, byBlueId, definition);
  if (!parent || seen.has(parent.blueId)) {
    return result;
  }
  seen.add(parent.blueId);
  for (const fieldName of inheritedFieldNames(parent, byBlueId, seen)) {
    result.add(fieldName);
  }
  if (!externalBase || !externalBase.preserveParentFields) {
    for (const field of ownFields(parent)) {
      result.add(field.fieldName);
    }
  }
  return result;
}

function parentFieldsToPreserve(definition, byBlueId) {
  const externalBase = externalBaseForDefinition(definition);
  if (!externalBase || !externalBase.preserveParentFields) {
    return [];
  }

  const preserved = [];
  const seenFields = new Set();
  let parent = referencedDefinition(definition.content.type, byBlueId, definition);
  const seenParents = new Set();
  while (parent && !seenParents.has(parent.blueId)) {
    seenParents.add(parent.blueId);
    for (const field of ownFields(parent)) {
      if (!externalBase.inheritedFields.has(field.fieldName) && !seenFields.has(field.fieldName)) {
        preserved.push(field);
        seenFields.add(field.fieldName);
      }
    }
    parent = referencedDefinition(parent.content.type, byBlueId, parent);
  }
  return preserved;
}

function writeConstantsClass(packageName, definitions) {
  const cls = constantsClassName(packageName);
  const usedConstants = new Set();
  const lines = [
    'package blue.repo.types;',
    '',
    'import blue.repo.RepositoryType;',
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

function typeBlueIds(definition) {
  return [definition.blueId];
}

function writeTypeBlueIdAnnotation(lines, definition) {
  const blueIds = typeBlueIds(definition);
  if (blueIds.length === 1) {
    lines.push(`@TypeBlueId("${javaString(blueIds[0])}")`);
    return;
  }

  lines.push('@TypeBlueId({');
  for (let i = 0; i < blueIds.length; i += 1) {
    const comma = i + 1 < blueIds.length ? ',' : '';
    lines.push(`    "${javaString(blueIds[i])}"${comma}`);
  }
  lines.push('})');
}

function writeModelClass(definition, byBlueId) {
  const pkg = modelPackage(definition);
  const dir = path.join(modelsRoot, definition.packageSegment);
  mkdirp(dir);

  const imports = new Set([
    'blue.language.model.Node',
    'blue.language.model.TypeBlueId',
    'blue.repo.RepositoryType',
  ]);
  const parent = referencedDefinition(definition.content.type, byBlueId, definition);
  let extendsClause = '';
  const externalBase = externalBaseForDefinition(definition);
  if (externalBase) {
    extendsClause = ` extends ${externalBase.extendsType}`;
  } else if (parent) {
    const parentIsInAnotherPackage = modelPackage(parent) !== modelPackage(definition);
    const parentNeedsQualification = parentIsInAnotherPackage
      && parent.className === definition.className;
    if (parentIsInAnotherPackage && !parentNeedsQualification) {
      imports.add(modelFqcn(parent));
    }
    extendsClause = ` extends ${parentNeedsQualification ? modelFqcn(parent) : parent.className}`;
  }

  const inherited = inheritedFieldNames(definition, byBlueId);
  const rawFields = ownFields(definition).concat(parentFieldsToPreserve(definition, byBlueId));
  const usedFieldNames = new Set();
  const fields = rawFields.filter((field) => {
    if (inherited.has(field.fieldName) || usedFieldNames.has(field.fieldName)) {
      return false;
    }
    usedFieldNames.add(field.fieldName);
    return true;
  });
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
  writeTypeBlueIdAnnotation(lines, definition);
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
    `public final class ${versionRegistryClassName} {`,
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
  lines.push(`    private ${versionRegistryClassName}() {`);
  lines.push('    }');
  lines.push('}');
  lines.push('');

  fs.writeFileSync(path.join(modelsRoot, `${versionRegistryClassName}.java`), lines.join('\n'));
}

function main() {
  const sourceBundleBytes = fs.readFileSync(sourceBundle);
  const sourceBundleContent = sourceBundleBytes.toString('utf8');
  const repository = yaml.load(sourceBundleContent);
  const repositoryVersions = repository.repositoryVersions || [];
  const repositoryVersionBlueId = repositoryVersions[repositoryVersions.length - 1];
  const { definitions, definitionsByPackage, byBlueId } = discoverDefinitions(repository);

  fs.rmSync(resourcesRoot, { recursive: true, force: true });
  fs.rmSync(constantsRoot, { recursive: true, force: true });
  fs.rmSync(path.join(modelsRoot, `${versionRegistryClassName}.java`), { force: true });
  for (const entry of fs.existsSync(modelsRoot) ? fs.readdirSync(modelsRoot, { withFileTypes: true }) : []) {
    if (!entry.isDirectory()) {
      continue;
    }
    if (entry.name !== 'provider') {
      fs.rmSync(path.join(modelsRoot, entry.name), { recursive: true, force: true });
    }
  }
  mkdirp(resourcesRoot);
  mkdirp(definitionsRoot);
  mkdirp(constantsRoot);
  mkdirp(modelsRoot);
  const targetSourceBundle = path.join(resourcesRoot, 'BlueRepository.blue');
  fs.writeFileSync(targetSourceBundle, sourceBundleBytes);
  const sourceDigest = sha256(sourceBundleBytes);
  const targetDigest = sha256(fs.readFileSync(targetSourceBundle));
  if (sourceDigest !== targetDigest) {
    throw new Error(`Canonical repository copy failed: ${sourceDigest} != ${targetDigest}`);
  }

  for (const [packageName, packageDefinitions] of definitionsByPackage.entries()) {
    mkdirp(path.join(definitionsRoot, packageName));
    for (const definition of packageDefinitions) {
      fs.writeFileSync(
        path.join(resourcesOutputRoot, definition.resourcePath),
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
    repositoryVersions: repositoryVersionEntries(repository),
    packageNames: Array.from(definitionsByPackage.keys()),
    definitions: definitions.map((definition) => ({
      packageName: definition.packageName,
      name: definition.name,
      qualifiedName: definition.qualifiedName,
      blueId: definition.blueId,
      resourcePath: definition.resourcePath,
      status: definition.status,
      repositoryVersionIndex: definition.repositoryVersionIndex,
      versions: definition.versions.map((version) => ({
        repositoryVersionIndex: version.repositoryVersionIndex,
        typeBlueId: version.typeBlueId,
        attributesAdded: version.attributesAdded,
      })),
    })),
  };
  fs.writeFileSync(path.join(resourcesRoot, 'manifest.json'), `${JSON.stringify(manifest, null, 2)}\n`);

  for (const definition of definitions) {
    writeModelClass(definition, byBlueId);
  }
  writeVersionRegistry(definitions);
}

main();
