# Versioned Generation Plan For blue-repo-java

## Goal

Make `blue-repo-java` generate Java companion APIs from immutable `blue-repository` release tags, not from a moving sibling checkout. The artifact should continue to expose repository types only: resources, generated model classes, constants, manifests, `NodeProvider`, aliases, and type-class resolver wiring. It must not implement contract processor behavior.

## Design Decisions

Use the repository BlueId tag as the canonical version identity.

Use repo.blue SDK/package metadata only as a public version label. For example, the live Conversation package maps:

| Java/source identity | Public SDK version |
| --- | --- |
| `sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv` | `@blue-repository/types@1.2.0` |
| `B4qWEbNWRcgabYrDTxtebfRSP5nBnEYvpX5YWqa2PcE4` | `@blue-repository/types@1.1.0` |
| `5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij` | `@blue-repository/types@1.0.0` |

Use semantic Java package names when a public SDK version is known:

```text
blue.repo.v1_2_0
blue/repo/v1_2_0
BlueRepositoryV1_2_0
BlueRepository.v1_2_0()
```

For historical tags without public SDK metadata, use a deterministic tag-based slug and keep the exact tag BlueId in the manifest:

```text
blue.repo.r_suk1ihfrf7uq
blue/repo/r_suk1ihfrf7uq
```

If a later decision requires only semver-named packages, the generator can skip unmapped tags until a checked-in version catalog maps them.

Generate Java classes for the latest supported repository version first. Older type BlueIds should be represented as compatibility metadata on those latest classes, not as separate old Java classes unless there is a concrete need to expose historical class shapes.

`blue-language-java` already defines `@TypeBlueId` as a `String[]`, and its `TypeClassResolver` registers every value in that annotation. Therefore generated classes can use:

```java
@TypeBlueId({
    "CurrentTypeBlueId",
    "PreviousTypeBlueId"
})
public class Operation {
}
```

The current BlueId must be first because `BlueIdResolver.resolveBlueId(...)` returns the first annotation value for object serialization. This gives the latest class two useful behaviors:

- serializing a new Java object emits the current type BlueId;
- resolving an older document can still map an old type BlueId to the latest compatible Java class.

This matches the JS SDK's behavior conceptually: current schemas are decorated with current BlueIds, while previous BlueIds remain available in generated metadata.

## Version Catalog

Add a checked-in catalog, for example `repository-versions.json`, that records the generation inputs:

```json
{
  "versions": [
    {
      "repositoryBlueId": "sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv",
      "sourceTag": "sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv",
      "sdkPackage": "@blue-repository/types",
      "sdkVersion": "1.2.0",
      "javaVersion": "1.2.0",
      "javaPackageSegment": "v1_2_0",
      "resourceBase": "blue/repo/v1_2_0"
    }
  ]
}
```

The catalog should be generated or refreshed from:

- `git ls-remote --refs --tags https://github.com/bluecontract/blue-repository.git`;
- repo.blue package versions, starting with `https://repo.blue/packages/Conversation/versions`;
- optional manual entries for old tags that are valid repository releases but no longer exposed by the current package-version page.

## Source Acquisition

Add a generation-only source sync step that writes into `build/`, not into `../blue-repository`:

1. Enumerate remote tags.
2. Fetch each selected tag into `build/blue-repository-tags/<tag>/`.
3. Read `BlueRepository.blue` from that tag.
4. Assert the calculated repository BlueId or last `repositoryVersions` entry equals the tag.
5. Hash the source bundle and record the digest in generated manifest metadata.

Runtime code and unit tests must not require network access. Network access belongs only to explicit refresh tasks.

## Generator Refactor

Refactor `tools/generate-repository-sources.js` so one invocation is parameterized:

```bash
node tools/generate-repository-sources.js \
  --source build/blue-repository-tags/<tag>/BlueRepository.blue \
  --repository-blue-id <tag> \
  --java-version 1.2.0 \
  --java-package-segment v1_2_0 \
  --resource-base blue/repo/v1_2_0
```

The existing Java-specific mapping rules should stay:

- Blue `Integer` to `BigInteger`;
- list and dictionary type inference from `itemType`, `keyType`, and `valueType`;
- `@JsonProperty` for renamed Java keyword fields;
- Core processor foundation bridges where already required;
- no contract processors or runtime behavior.

## Generated Metadata Annotations

Add repository-owned annotations in `blue-repo-java`; do not add them to `blue-language-java`.

Recommended minimal set:

```java
public enum RepositoryTypeStatus {
    STABLE,
    DEV
}

public @interface RepositoryTypeInfo {
    String packageName();
    String name();
    String qualifiedName();
    RepositoryTypeStatus status();
    int introducedInRepositoryVersionIndex();
    String introducedInRepositoryBlueId();
    RepositoryTypeVersion[] versions() default {};
}

public @interface RepositoryTypeVersion {
    int repositoryVersionIndex();
    String repositoryBlueId();
    String typeBlueId();
    String[] attributesAdded() default {};
}

public @interface RepositoryFieldInfo {
    String name();
    int introducedInRepositoryVersionIndex();
    String introducedInRepositoryBlueId();
    String introducedInTypeBlueId() default "";
}
```

A marker annotation like `@TypeDev` is also acceptable, but it is less complete than `@RepositoryTypeInfo(status = DEV)` because consumers usually need both status and version provenance.

Generated class shape:

```java
@TypeBlueId({
    "CurrentTypeBlueId",
    "PreviousCompatibleTypeBlueId"
})
@RepositoryTypeInfo(
    packageName = "Conversation",
    name = "Operation",
    qualifiedName = "Conversation/Operation",
    status = RepositoryTypeStatus.STABLE,
    introducedInRepositoryVersionIndex = 0,
    introducedInRepositoryBlueId = "5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij",
    versions = {
        @RepositoryTypeVersion(
            repositoryVersionIndex = 0,
            repositoryBlueId = "5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij",
            typeBlueId = "..."
        )
    }
)
public class Operation {
    @RepositoryFieldInfo(
        name = "channel",
        introducedInRepositoryVersionIndex = 0,
        introducedInRepositoryBlueId = "5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij"
    )
    private String channel;
}
```

Field provenance should be derived from `attributesAdded` in `BlueRepository.blue` type versions. For fields present in the first version, use the type's first `repositoryVersionIndex`. For fields added later, map the JSON pointer in `attributesAdded` to the generated Java field and record that version.

Keep the same information in `manifest.json`; annotations are convenience reflection metadata, not the only source of truth.

## Historical Dictionary Mapping

The manifest model now stores:

- every repository version entry from `BlueRepository.blue`;
- every type version entry for each logical type;
- `attributesAdded`;
- `compatibleWithCurrent`, used to decide whether a historical type BlueId is safe to include in generated `@TypeBlueId`.

The repository dictionary uses this metadata as follows:

- `dictionaryBlueIds()` returns all repository version BlueIds in the manifest;
- `currentBlueId(...)` accepts current or historical type BlueIds and returns the current logical type BlueId;
- `typeBlueIdFor(currentBlueId, dictionaryBlueId)` chooses the type version at or before the target repository version index;
- if no type version exists at or before the target repository version, it returns empty so export can inline or strict-export can fail.

`blue-language-java` currently calls `TypeDictionary.definition(currentBlueId)` without the target dictionary BlueId. That means `blue-repo-java` can parse and expose field provenance, but it cannot prune fields from inlined type definitions for an older receiver without a future language SPI such as `definition(currentBlueId, dictionaryBlueId)`.

## Generated Layout

For each generated version:

```text
src/main/java/blue/repo/v1_2_0/
  BlueRepositoryV1_2_0.java
  common/
  conversation/
  core/
  myos/
  paynote/

src/main/java/blue/repo/v1_2_0/types/
  CommonTypes.java
  ConversationTypes.java
  CoreTypes.java
  MyOSTypes.java
  PayNoteTypes.java

src/main/resources/blue/repo/v1_2_0/
  BlueRepository.blue
  manifest.json
  definitions/
```

The current top-level `blue.repo.types.*` classes should either become latest-version aliases or remain single-version only. For multi-version generation, versioned constants are safer:

```java
blue.repo.v1_2_0.types.ConversationTypes.OPERATION
```

Then a top-level latest alias can be added deliberately:

```java
blue.repo.types.ConversationTypes.OPERATION
```

## Facade API

Keep the existing facade style, but make it version-aware:

```java
BlueRepository latest = BlueRepository.latest();
BlueRepository v1_2_0 = BlueRepository.v1_2_0();
BlueRepository byBlueId = BlueRepository.byRepositoryBlueId(
    "sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv");
```

Each facade instance should expose:

- repository display version;
- repository BlueId tag;
- source resource path;
- package names;
- manifest definitions;
- classpath `NodeProvider`;
- alias map;
- type class resolver.

## Gradle Tasks

Add explicit tasks:

```text
refreshRepositoryVersionCatalog
fetchRepositoryTagSnapshots
generateRepositorySources
verifyGeneratedSources
verifyRepositoryTagCoverage
```

Recommended behavior:

- `refreshRepositoryVersionCatalog`: network task, updates the checked catalog after review.
- `fetchRepositoryTagSnapshots`: network task, fills `build/` cache from catalog.
- `generateRepositorySources`: local task, reads the catalog and cached/source snapshots.
- `verifyGeneratedSources`: local task, regenerates and fails if checked-in generated files differ.
- `verifyRepositoryTagCoverage`: network or cached task, verifies repo.blue package revision BlueIds exist as `blue-repository` tags.

Do not wire network tasks into normal `check`. Keep `check` reproducible offline.

## Tests

Keep current tests and add version-specific coverage:

- every generated manifest repository BlueId equals its source tag;
- every generated manifest definition resolves by BlueId;
- every generated `@TypeBlueId` resolves through that version's resolver;
- all generated resource paths exist on the classpath;
- public aliases resolve to the version-local BlueIds;
- `BlueRepository.byRepositoryBlueId(...)` returns the expected facade;
- latest alias points at the catalog's latest version;
- generated constants match each version manifest;
- no Java 9+ APIs are used;
- no contract execution behavior appears in this package.

For multi-version scale, run full object-mapping tests on the latest version and lighter manifest/provider checks on all older versions.

## Migration Steps

1. Add the version catalog with the current live `sUk...` / `1.2.0` mapping.
2. Refactor the generator to accept source/version/resource parameters.
3. Generate `v1_2_0` as the current checked-in output.
4. Move constants into versioned packages and keep top-level constants as latest aliases.
5. Add `BlueRepository.latest()`, `v1_2_0()`, and `byRepositoryBlueId(...)`.
6. Add offline verification for generated files.
7. Add tag coverage verification as an explicit network task.
8. Add older packages only from explicit historical tags if compatibility classes are actually needed.
9. Expand the catalog to additional tags once the single-version flow is stable.

## Acceptance Criteria

- Generation is pinned to immutable tags.
- The generated version label and repository BlueId cannot drift.
- repo.blue Conversation versions are represented by tags in the version catalog.
- Java resources and model classes are generated from the exact tag snapshots.
- Normal build and tests run offline.
- No changes are needed in `blue-language-java`.
- No contract processors are added to `blue-repo-java`.
