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
const sourceBundle = option(
  'source',
  fs.existsSync(defaultSourceBundle) ? defaultSourceBundle : path.join(sourceRepositoryRoot, 'BlueRepository.blue')
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

const booleanSchemaKeys = new Set(['required', 'uniqueItems']);
const integerSchemaKeys = new Set(['minLength', 'maxLength', 'minItems', 'maxItems', 'minFields', 'maxFields']);
const numericSchemaKeys = new Set(['minimum', 'maximum', 'exclusiveMinimum', 'exclusiveMaximum', 'multipleOf']);

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
  ['Core/Document Update Channel', {
    extendsType: 'blue.language.processor.model.DocumentUpdateChannel',
    inheritedFields: new Set(['order', 'path', 'definition']),
    preserveParentFields: true,
  }],
  ['Core/Triggered Event Channel', {
    extendsType: 'blue.language.processor.model.TriggeredEventChannel',
    inheritedFields: new Set(['order', 'path', 'definition']),
    preserveParentFields: true,
  }],
  ['Core/Lifecycle Event Channel', {
    extendsType: 'blue.language.processor.model.LifecycleChannel',
    inheritedFields: new Set(['order', 'path', 'definition']),
    preserveParentFields: true,
  }],
  ['Core/Embedded Node Channel', {
    extendsType: 'blue.language.processor.model.EmbeddedNodeChannel',
    inheritedFields: new Set(['order', 'path', 'definition', 'childPath']),
    preserveParentFields: true,
  }],
  ['Core/Process Embedded', {
    extendsType: 'blue.language.processor.model.ProcessEmbedded',
    inheritedFields: new Set(['order', 'paths']),
  }],
  ['Core/Channel Event Checkpoint', {
    extendsType: 'blue.language.processor.model.ChannelEventCheckpoint',
    inheritedFields: new Set(['order', 'lastEvents', 'lastSignatures']),
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

function normalizeTypeVersions(type) {
  const versions = Array.isArray(type.versions) ? [...type.versions] : [];
  versions.sort((a, b) => a.repositoryVersionIndex - b.repositoryVersionIndex);
  const current = latestVersion(versions);
  return versions.map((version) => ({
    repositoryVersionIndex: version.repositoryVersionIndex,
    typeBlueId: version.typeBlueId,
    attributesAdded: Array.isArray(version.attributesAdded) ? version.attributesAdded : [],
    compatibleWithCurrent: isShapeCompatibleWithCurrent(type, version, current),
  }));
}

function attributeRoot(attributePath) {
  const value = `${attributePath || ''}`.trim();
  if (!value) {
    return null;
  }
  const withoutSlash = value.startsWith('/') ? value.slice(1) : value;
  const root = withoutSlash.split('/')[0];
  return root || null;
}

function currentOwnFieldNames(type) {
  const content = type.content || {};
  return new Set(Object.keys(content).filter((key) => !reservedNodeKeys.has(key)));
}

function isShapeCompatibleWithCurrent(type, historicalVersion, currentVersion) {
  if (!historicalVersion || !currentVersion) {
    return false;
  }
  if (historicalVersion.typeBlueId === currentVersion.typeBlueId) {
    return true;
  }
  if (historicalVersion.compatibleWithCurrent !== true) {
    return false;
  }
  if (type.status !== 'stable') {
    return false;
  }

  const currentFields = currentOwnFieldNames(type);
  for (const version of type.versions || []) {
    for (const attribute of version.attributesAdded || []) {
      const root = attributeRoot(attribute);
      if (root && !currentFields.has(root)) {
        return false;
      }
    }
  }
  return true;
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

function normalizeRepositorySchemas(value) {
  if (Array.isArray(value)) {
    return value.map(normalizeRepositorySchemas);
  }
  if (!value || typeof value !== 'object') {
    return value;
  }

  const normalized = {};
  for (const [key, child] of Object.entries(value)) {
    normalized[key] = key === 'schema'
      ? normalizeSchema(child)
      : normalizeRepositorySchemas(child);
  }
  return normalized;
}

function normalizeSchema(schema) {
  if (!schema || typeof schema !== 'object' || Array.isArray(schema)) {
    return schema;
  }

  const normalized = {};
  for (const [key, child] of Object.entries(schema)) {
    if (key === 'enum') {
      normalized[key] = normalizeSchemaEnum(child);
    } else if (booleanSchemaKeys.has(key) || integerSchemaKeys.has(key) || numericSchemaKeys.has(key)) {
      normalized[key] = normalizeSchemaScalar(child);
    } else {
      normalized[key] = normalizeRepositorySchemas(child);
    }
  }
  return normalized;
}

function normalizeSchemaEnum(value) {
  if (Array.isArray(value)) {
    return value.map(normalizeSchemaEnumEntry);
  }
  if (value && typeof value === 'object' && Array.isArray(value.items) && Object.keys(value).length === 1) {
    return value.items.map(normalizeSchemaEnumEntry);
  }
  return normalizeSchemaEnumEntry(value);
}

function normalizeSchemaEnumEntry(value) {
  return normalizeSchemaScalar(value);
}

function normalizeSchemaScalar(value) {
  if (value && typeof value === 'object' && !Array.isArray(value) && Object.prototype.hasOwnProperty.call(value, 'value')) {
    const keys = Object.keys(value);
    const typeBlueId = value.type && value.type.blueId;
    const hasOnlyScalarShape = keys.every((key) => key === 'type' || key === 'value');
    if (hasOnlyScalarShape && isBasicScalarBlueId(typeBlueId)) {
      return value.value;
    }
  }
  return normalizeRepositorySchemas(value);
}

function isBasicScalarBlueId(blueId) {
  const currentBlueId = currentBasicBlueId(blueId);
  return currentBlueId === basicBlueIds.text
    || currentBlueId === basicBlueIds.double
    || currentBlueId === basicBlueIds.integer
    || currentBlueId === basicBlueIds.boolean;
}

function recalculateCurrentTypeBlueIds(definitions) {
  const definitionsByOldBlueId = new Map(definitions.map((definition) => [definition.blueId, definition]));
  const groupsByOldBaseBlueId = new Map();
  for (const definition of definitions) {
    const parsed = parseFragmentBlueId(definition.blueId);
    const group = groupsByOldBaseBlueId.get(parsed.baseBlueId) || [];
    group.push({ definition, index: parsed.index });
    groupsByOldBaseBlueId.set(parsed.baseBlueId, group);
  }

  let blueIdMap = new Map();
  for (const definition of definitions) {
    blueIdMap.set(definition.blueId, definition.blueId);
    const parsed = parseFragmentBlueId(definition.blueId);
    if (parsed.index !== null && !blueIdMap.has(parsed.baseBlueId)) {
      blueIdMap.set(parsed.baseBlueId, parsed.baseBlueId);
    }
  }

  let latestContents = new Map();
  for (let attempt = 0; attempt < 50; attempt += 1) {
    const nextBlueIdMap = new Map(blueIdMap);
    const nextContents = new Map();

    for (const [oldBaseBlueId, group] of groupsByOldBaseBlueId.entries()) {
      if (group.some((entry) => entry.index !== null)) {
        const sorted = [...group].sort((a, b) => a.index - b.index);
        const contents = sorted.map((entry) => rewriteBlueIdReferences(entry.definition.content, blueIdMap));
        const newBaseBlueId = calculateBlueIdForNodeList(contents);
        nextBlueIdMap.set(oldBaseBlueId, newBaseBlueId);
        for (const entry of sorted) {
          const newBlueId = `${newBaseBlueId}#${entry.index}`;
          nextBlueIdMap.set(entry.definition.blueId, newBlueId);
          nextContents.set(entry.definition, contents[entry.index]);
        }
      } else {
        const definition = group[0].definition;
        const content = rewriteBlueIdReferences(definition.content, blueIdMap);
        nextBlueIdMap.set(definition.blueId, calculateBlueIdForNode(content));
        nextContents.set(definition, content);
      }
    }

    if (sameMap(blueIdMap, nextBlueIdMap)) {
      latestContents = nextContents;
      break;
    }
    blueIdMap = nextBlueIdMap;
    latestContents = nextContents;
  }

  const unresolved = [];
  for (const definition of definitions) {
    const recalculatedBlueId = blueIdMap.get(definition.blueId);
    if (!recalculatedBlueId) {
      unresolved.push(definition.qualifiedName);
      continue;
    }
    definition.oldBlueId = definition.blueId;
    definition.blueId = recalculatedBlueId;
    definition.content = latestContents.get(definition) || rewriteBlueIdReferences(definition.content, blueIdMap);
    definition.versions = definition.versions.map((version) => {
      if (version.repositoryVersionIndex === definition.repositoryVersionIndex) {
        return {
          ...version,
          typeBlueId: recalculatedBlueId,
          compatibleWithCurrent: true,
        };
      }
      return version;
    });
    definition.sourceType.versions = definition.versions.map((version) => ({
      repositoryVersionIndex: version.repositoryVersionIndex,
      typeBlueId: version.typeBlueId,
      attributesAdded: version.attributesAdded,
      ...(version.compatibleWithCurrent ? { compatibleWithCurrent: true } : {}),
    }));
    definition.sourceType.content = deepClone(definition.content);
  }
  if (unresolved.length > 0) {
    throw new Error(`Unable to recalculate BlueIds for definitions: ${unresolved.join(', ')}`);
  }

  return definitionsByOldBlueId;
}

function parseFragmentBlueId(blueId) {
  const separator = blueId.indexOf('#');
  if (separator < 0) {
    return { baseBlueId: blueId, index: null };
  }
  return {
    baseBlueId: blueId.slice(0, separator),
    index: Number.parseInt(blueId.slice(separator + 1), 10),
  };
}

function rewriteBlueIdReferences(value, blueIdMap) {
  if (Array.isArray(value)) {
    return value.map((item) => rewriteBlueIdReferences(item, blueIdMap));
  }
  if (!value || typeof value !== 'object') {
    return value;
  }
  const rewritten = {};
  for (const [key, child] of Object.entries(value)) {
    if (key === 'blueId' && typeof child === 'string') {
      rewritten[key] = rewriteBlueId(child, blueIdMap);
    } else {
      rewritten[key] = rewriteBlueIdReferences(child, blueIdMap);
    }
  }
  return rewritten;
}

function rewriteBlueId(blueId, blueIdMap) {
  if (blueId === 'this' || blueId.startsWith('this#')) {
    return blueId;
  }
  if (basicBlueIdAliases.has(blueId)) {
    return basicBlueIdAliases.get(blueId);
  }
  if (blueIdMap.has(blueId)) {
    return blueIdMap.get(blueId);
  }
  const parsed = parseFragmentBlueId(blueId);
  if (parsed.index !== null && blueIdMap.has(parsed.baseBlueId)) {
    return `${blueIdMap.get(parsed.baseBlueId)}#${parsed.index}`;
  }
  return blueId;
}

function currentBasicBlueId(blueId) {
  return basicBlueIdAliases.get(blueId) || blueId;
}

function sameMap(left, right) {
  if (left.size !== right.size) {
    return false;
  }
  for (const [key, value] of left.entries()) {
    if (right.get(key) !== value) {
      return false;
    }
  }
  return true;
}

function calculateBlueIdForNode(node) {
  return calculateBlueIdFromPrepared(blueIdInput(node));
}

function calculateBlueIdForNodeList(nodes) {
  return calculateBlueIdFromPrepared(nodes.map((node) => blueIdInput(node)));
}

function blueIdInput(node) {
  if (node == null) {
    throw new Error('BlueId input must not contain null nodes');
  }
  if (Array.isArray(node)) {
    return node.map((item) => blueIdInput(item));
  }
  if (typeof node !== 'object') {
    return scalarBlueIdInput(node);
  }

  const keys = Object.keys(node);
  if (keys.length === 1 && Object.prototype.hasOwnProperty.call(node, 'blueId')) {
    return { blueId: node.blueId };
  }
  if (keys.length === 1 && Object.prototype.hasOwnProperty.call(node, '$previous')) {
    return { $previous: { blueId: node.$previous.blueId } };
  }

  const result = {};
  if (node.name != null) {
    result.name = node.name;
  }
  if (node.description != null) {
    result.description = node.description;
  }

  let valueTypeBlueId = null;
  if (node.value != null && node.type == null) {
    valueTypeBlueId = inferScalarTypeBlueId(node.value);
    if (valueTypeBlueId) {
      result.type = { blueId: valueTypeBlueId };
    }
  } else if (node.type != null) {
    valueTypeBlueId = node.type.blueId || null;
    result.type = blueIdInput(node.type);
  }

  if (node.itemType != null) {
    result.itemType = blueIdInput(node.itemType);
  }
  if (node.keyType != null) {
    result.keyType = blueIdInput(node.keyType);
  }
  if (node.valueType != null) {
    result.valueType = blueIdInput(node.valueType);
  }
  if (node.mergePolicy != null) {
    result.mergePolicy = node.mergePolicy;
  }
  if (node.value != null) {
    result.value = normalizeBlueIdValue(node.value, valueTypeBlueId);
  }
  if (node.items != null) {
    result.items = node.items.map((item) => blueIdInput(item));
  }
  if (result.items != null && isPayloadOnlyListNode(node)) {
    return result.items;
  }
  if (node.schema != null) {
    result.schema = schemaBlueIdInput(node.schema);
  }
  if (node.contracts != null) {
    result.contracts = blueIdInput(node.contracts);
  }

  for (const [key, value] of Object.entries(node)) {
    if (!reservedNodeKeys.has(key) && key !== 'contracts') {
      result[key] = blueIdInput(value);
    }
  }
  return result;
}

function isPayloadOnlyListNode(node) {
  return node.items != null
    && node.name == null
    && node.description == null
    && node.type == null
    && node.itemType == null
    && node.keyType == null
    && node.valueType == null
    && node.value == null
    && node.schema == null
    && node.mergePolicy == null
    && node.blueId == null
    && node.previousBlueId == null
    && node.position == null
    && node.blue == null
    && node.contracts == null
    && Object.keys(node).every((key) => reservedNodeKeys.has(key));
}

function scalarBlueIdInput(value) {
  const typeBlueId = inferScalarTypeBlueId(value);
  if (typeBlueId) {
    return { type: { blueId: typeBlueId }, value: normalizeBlueIdValue(value, typeBlueId) };
  }
  return { value };
}

function schemaBlueIdInput(schema) {
  const result = {};
  for (const key of [...booleanSchemaKeys, ...integerSchemaKeys, ...numericSchemaKeys]) {
    if (schema[key] != null) {
      result[key] = schema[key] && typeof schema[key] === 'object'
        ? blueIdInput(schema[key])
        : schema[key];
    }
  }
  if (Array.isArray(schema.enum)) {
    result.enum = schema.enum.map((entry) => entry && typeof entry === 'object' ? blueIdInput(entry) : entry);
  }
  return result;
}

function inferScalarTypeBlueId(value) {
  if (typeof value === 'string') {
    return basicBlueIds.text;
  }
  if (typeof value === 'boolean') {
    return basicBlueIds.boolean;
  }
  if (typeof value === 'number') {
    return Number.isInteger(value) ? basicBlueIds.integer : basicBlueIds.double;
  }
  return null;
}

function normalizeBlueIdValue(value, typeBlueId) {
  if (currentBasicBlueId(typeBlueId) === basicBlueIds.double && typeof value === 'number') {
    return Number.parseFloat(value.toString());
  }
  return value;
}

function calculateBlueIdFromPrepared(value) {
  return calculateCleanedObject(cleanRoot(value));
}

function calculateCleanedObject(value) {
  if (typeof value === 'string' || typeof value === 'number' || typeof value === 'boolean') {
    return hashCanonical(value);
  }
  if (Array.isArray(value)) {
    return calculateListBlueId(value);
  }
  if (value && typeof value === 'object') {
    return calculateMapBlueId(value);
  }
  throw new Error(`Unsupported BlueId input: ${value}`);
}

function calculateMapBlueId(map) {
  const keys = Object.keys(map);
  if (keys.length === 1 && keys[0] === 'blueId') {
    return map.blueId;
  }

  const hashes = {};
  for (const key of keys.sort()) {
    if (key === 'name' || key === 'value' || key === 'description') {
      hashes[key] = map[key];
    } else {
      hashes[key] = { blueId: calculateCleanedObject(map[key]) };
    }
  }
  return hashCanonical(hashes);
}

function calculateListBlueId(list) {
  let accumulator = hashCanonical({ $list: 'empty' });
  let start = 0;
  if (list.length > 0 && isPreviousBlueIdControl(list[0])) {
    accumulator = list[0].$previous.blueId;
    start = 1;
  }
  for (let index = start; index < list.length; index += 1) {
    const elementHash = calculateCleanedObject(list[index]);
    accumulator = hashCanonical({
      $listCons: {
        elem: { blueId: elementHash },
        prev: { blueId: accumulator },
      },
    });
  }
  return accumulator;
}

function isPreviousBlueIdControl(value) {
  return value
    && typeof value === 'object'
    && !Array.isArray(value)
    && Object.keys(value).length === 1
    && value.$previous
    && typeof value.$previous === 'object'
    && Object.keys(value.$previous).length === 1
    && typeof value.$previous.blueId === 'string';
}

function cleanRoot(value) {
  if (Array.isArray(value)) {
    return value.map(cleanListElement);
  }
  if (value && typeof value === 'object') {
    return cleanMap(value, true);
  }
  return value;
}

function cleanObjectField(value) {
  if (value == null) {
    return null;
  }
  if (Array.isArray(value)) {
    return value.map(cleanListElement);
  }
  if (value && typeof value === 'object') {
    const cleaned = cleanMap(value, false);
    return Object.keys(cleaned).length === 0 ? null : cleaned;
  }
  return value;
}

function cleanListElement(value) {
  if (value == null) {
    throw new Error('BlueId list input must not contain null elements');
  }
  if (Array.isArray(value)) {
    return value.map(cleanListElement);
  }
  if (value && typeof value === 'object') {
    return cleanMap(value, false);
  }
  return value;
}

function cleanMap(map) {
  const cleaned = {};
  for (const [key, value] of Object.entries(map)) {
    const child = cleanObjectField(value);
    if (child != null) {
      cleaned[key] = child;
    }
  }
  return cleaned;
}

function hashCanonical(value) {
  return base58Encode(crypto.createHash('sha256').update(canonicalJson(value)).digest());
}

function canonicalJson(value) {
  if (value === null || typeof value === 'string' || typeof value === 'number' || typeof value === 'boolean') {
    return JSON.stringify(value);
  }
  if (Array.isArray(value)) {
    return `[${value.map(canonicalJson).join(',')}]`;
  }
  return `{${Object.keys(value).sort().map((key) => `${JSON.stringify(key)}:${canonicalJson(value[key])}`).join(',')}}`;
}

function base58Encode(buffer) {
  const alphabet = '123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz';
  let digits = [0];
  for (const byte of buffer) {
    let carry = byte;
    for (let index = 0; index < digits.length; index += 1) {
      carry += digits[index] << 8;
      digits[index] = carry % 58;
      carry = Math.floor(carry / 58);
    }
    while (carry > 0) {
      digits.push(carry % 58);
      carry = Math.floor(carry / 58);
    }
  }
  let result = '';
  for (const byte of buffer) {
    if (byte === 0) {
      result += alphabet[0];
    } else {
      break;
    }
  }
  for (let index = digits.length - 1; index >= 0; index -= 1) {
    result += alphabet[digits[index]];
  }
  return result;
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
        content: normalizeRepositorySchemas(type.content),
        sourceType: type,
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
  const externalBase = externalBaseTypes.get(definition.qualifiedName);
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
  const externalBase = externalBaseTypes.get(definition.qualifiedName);
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
  const result = [definition.blueId];
  for (const version of [...definition.versions].reverse()) {
    if (version.typeBlueId !== definition.blueId && version.compatibleWithCurrent) {
      result.push(version.typeBlueId);
    }
  }
  return result;
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
  const sourceBundleContent = fs.readFileSync(sourceBundle, 'utf8');
  const repository = normalizeRepositorySchemas(yaml.load(sourceBundleContent));
  const repositoryVersions = repository.repositoryVersions || [];
  const repositoryVersionBlueId = repositoryVersions[repositoryVersions.length - 1];
  const { definitions, definitionsByPackage, byBlueId } = discoverDefinitions(repository);
  recalculateCurrentTypeBlueIds(definitions);
  byBlueId.clear();
  for (const definition of definitions) {
    byBlueId.set(definition.blueId, definition);
  }

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
  fs.writeFileSync(targetSourceBundle, yaml.dump(repository, { lineWidth: -1, noRefs: true }));

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
        compatibleWithCurrent: version.compatibleWithCurrent,
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
