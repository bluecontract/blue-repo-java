# Blue Repository Java

Java companion package for [repo.blue](https://repo.blue).

This repository packages published Blue repository definitions as Java
resources and generated Java classes. It lets Java applications resolve
repo.blue types by qualified name or BlueId, use generated model classes, and
compose the repository catalog with the immutable `blue-language-java`
runtime.

It does not add executable behavior for repository-defined contracts. The
generic Contracts 1.0 runtime comes from `blue-language-java`; behavior for
Coordination workflows or timeline channels belongs in
`blue-coordination-java`.

## How This Fits

| Repository | Responsibility |
| --- | --- |
| `blue-language-java` | Blue language core: parsing, BlueId, resolution, snapshots, processor foundation. |
| `blue-repo-java` | Generated Java catalog and exact-content provider for repo.blue packages and types. |
| `blue-coordination-java` | Executable processors for selected Coordination repository contracts. |

Use this project when you need Java access to real repo.blue types:

- `Coordination/Operation`
- `Coordination/Sequential Workflow Operation`
- `Workflows/Accept Change Workflow`
- `FINOS-CDM-6.0-d07/Trade`
- `MyOS/MyOS Timeline Channel`
- `PayNote/PayNote`
- and the rest of the packaged type catalog.

## What You Get

This artifact is versioned independently from the bundled Blue repository
dictionary. Java packages remain stable across repository updates, while the
bundled dictionary is identified by its content-addressed repository BlueId.
The public facade always opens the current bundled dictionary; the manifest
retains historical identity metadata for dictionary negotiation and export.

It provides:

- classpath resources for the generated Blue type definitions;
- a repository manifest with registry and provider-bundle provenance;
- lookup by qualified name and BlueId;
- an identity-verifying, cyclic-set-aware `NodeProvider` for exact reference
  resolution;
- `TypeDictionary` utilities for repository-version lookup;
- generated Java classes under `blue.repo`;
- generated type constants under `blue.repo.types`;
- a `BlueMapper` and compatibility `TypeClassResolver` configured with all
  generated `@TypeBlueId` classes;
- type alias preprocessing so YAML can use names like
  `Coordination/Operation` instead of raw BlueIds.

## Installation

### Gradle

Add the Maven Central repository and use the released artifact:

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation "blue.repo:blue-repo-java:<version>"
}
```

`blue-language-java` is pulled transitively. If you need to declare it
directly, use the published language artifact:

```groovy
implementation "blue.language:blue-language-java:3.1.0-rc.24"
```

### Maven

```xml
<dependency>
    <groupId>blue.repo</groupId>
    <artifactId>blue-repo-java</artifactId>
    <version>VERSION</version>
</dependency>
```

### Local Development

Local builds use the version from `.cz.toml` with `-SNAPSHOT` appended.

To test this package from another local project before release:

```bash
./gradlew publishToMavenLocal
```

Then depend on:

```groovy
implementation "blue.repo:blue-repo-java:<version>-SNAPSHOT"
```

Local development uses the published `blue.language:blue-language-java`
coordinate from Maven repositories. It does not substitute a sibling
`../blue-language-java` checkout.

## Quick Start

### Create A Repository Catalog

```java
import blue.repo.BlueRepository;

BlueRepository repo = BlueRepository.current();

System.out.println(repo.repositoryBlueId());
System.out.println(repo.blueId("Coordination/Operation"));
System.out.println(repo.packageNames());
```

### Resolve A Repository Type By Name

```java
import blue.language.model.Node;
import blue.repo.BlueRepository;

BlueRepository repo = BlueRepository.current();

Node operationType = repo.nodeByName("Coordination/Operation")
        .orElseThrow(IllegalStateException::new);

System.out.println(operationType.getName());
System.out.println(operationType.getBlueId());
```

### Use Repository Definitions As A `NodeProvider`

```java
import blue.language.BlueRuntime;
import blue.language.model.Node;
import blue.repo.BlueRepository;
import blue.repo.types.CoordinationTypes;

BlueRepository repo = BlueRepository.current();
try (BlueRuntime runtime = repo.runtimeBuilder().build()) {
    Node message = new Node()
            .type(CoordinationTypes.CHAT_MESSAGE.reference())
            .properties("message", new Node().value("hello"));

    Node resolved = runtime.language().resolution().resolve(message);
    System.out.println(resolved.getType().getName()); // Chat Message
}
```

`@TypeBlueId` maps current repository BlueIds to Java classes. The repository
manifest also retains repository-version metadata used by `TypeDictionary`
lookup utilities. Exact definitions are supplied by the repository
`NodeProvider`; every plain definition is re-hashable and cyclic definitions
carry complete cyclic-set proof content.

### Use Qualified Names In YAML

Repository-authored documents usually use qualified type names:

```yaml
name: Example
contracts:
  increment:
    type: Coordination/Operation
    channel: ownerChannel
    request:
      type: Integer
```

Attach `repo.importsDirective()` before preprocessing. It creates the portable
`blue.imports` object whose values are exact pure references:

```java
import blue.language.BlueRuntime;
import blue.language.codec.jackson.UncheckedObjectMapper;
import blue.language.model.Node;
import blue.repo.BlueRepository;

BlueRepository repo = BlueRepository.current();
try (BlueRuntime runtime = repo.runtimeBuilder().build()) {
    Node document = UncheckedObjectMapper.YAML_MAPPER
            .readValue(yaml, Node.class)
            .blue(repo.importsDirective());

    Node preprocessed = runtime.language().preprocessing()
            .preprocess(document);
    Node resolved = runtime.language().resolution().resolve(preprocessed);
}
```

Blue Language 1.0 imports accept only plain BlueIds. Repository types that are
members of a cyclic set must therefore be referenced by their exact BlueId,
not imported by a qualified-name alias.

### Use Generated Java Model Classes

Generated model classes live under stable packages. The artifact version and
repository manifest identify which repo.blue dictionary version is packaged,
while Java imports remain stable across compatible repository updates:

```java
import blue.language.mapping.BlueMapper;
import blue.language.model.Node;
import blue.repo.BlueRepository;
import blue.repo.coordination.ChatMessage;
import blue.repo.coordination.Operation;
import blue.repo.coordination.SequentialWorkflowOperation;

BlueRepository repo = BlueRepository.current();
BlueMapper mapper = repo.mapper();

ChatMessage message = new ChatMessage()
        .message("hello");

Node messageNode = mapper.toNode(message);

Operation operation = new Operation()
        .request(new Node().type("Integer"));
operation.channel("ownerChannel");

SequentialWorkflowOperation implementation =
        new SequentialWorkflowOperation();
implementation.channel("ownerChannel");
```

Every generated class has:

- `@TypeBlueId(...)`;
- `blueId()`;
- `packageName()`;
- `typeName()`;
- `qualifiedName()`;
- `resourcePath()`;
- `repositoryType()`;
- fluent setters for generated fields.

Example:

```java
String id = Operation.blueId();
String name = Operation.qualifiedName(); // Coordination/Operation
```

## Combine With Application Types

If your application has its own Blue documents in addition to repo.blue types,
compose providers:

```java
import blue.language.BlueRuntime;
import blue.language.provider.NodeProvider;
import blue.repo.BlueRepository;
import blue.repo.provider.CompositeNodeProvider;

BlueRepository repo = BlueRepository.current();

NodeProvider appProvider = blueId -> null; // your storage/provider
NodeProvider provider = CompositeNodeProvider.of(
        repo.nodeProvider(),
        appProvider
);

try (BlueRuntime runtime = BlueRuntime.builder()
        .nodeProvider(provider)
        .mapping(repo.mapper())
        .build()) {
    // use runtime.language(), runtime.contracts(), and runtime.mapping()
}
```

## What This Does Not Do

This project does not implement contract behavior.

For example:

- `Coordination/Update Document` is generated here as a model class;
- `Coordination/Sequential Workflow Operation` is generated here as a model
  class;
- `Workflows/Accept Change Workflow` is generated here as a model class;
- `MyOS/MyOS Timeline Channel` is generated here as a model class;
- but registering and executing their Coordination-specific behavior is
  `blue-coordination-java`'s job.

This separation is intentional. The repository package is stable generated
catalog data; the contract package is executable behavior.

## Generated Packages

Current generated package groups include:

- `blue.repo.bootstrap`
- `blue.repo.common`
- `blue.repo.coordination`
- `blue.repo.finoscdm60d07`
- `blue.repo.mandate`
- `blue.repo.myos`
- `blue.repo.paynote`
- `blue.repo.sessioninteraction`
- `blue.repo.workflows`

Convenience constants:

- `blue.repo.types.BootstrapTypes`
- `blue.repo.types.CommonTypes`
- `blue.repo.types.CoordinationTypes`
- `blue.repo.types.FINOSCDM60d07Types`
- `blue.repo.types.MandateTypes`
- `blue.repo.types.MyOSTypes`
- `blue.repo.types.PayNoteTypes`
- `blue.repo.types.SessionInteractionTypes`
- `blue.repo.types.WorkflowsTypes`

## Regenerating Sources

Generated output is checked in.

Regenerate from the sibling repository bundle:

```bash
./gradlew generateRepositorySources
```

Regenerate from an explicit upstream checkout or downloaded bundle:

```bash
./gradlew generateRepositorySources \
  -PblueRepositorySource=/path/to/blue-repository/BlueRepository.blue \
  -PblueRepositoryProviderBundle=/path/to/blue-repository/BlueRepository.provider.json
```

Verify checked-in output is current:

```bash
./gradlew verifyGeneratedSources
```

`verifyGeneratedSources` is wired into `check`.

The generator uses the checked-in `BlueRepository.blue` and
`BlueRepository.provider.json` for the current version when available. The
first is repository/version metadata plus authored storage content; the second
contains the exact canonical provider content whose direct BlueIds are the
declared type identities. For a new repository release, supply both artifacts
from the same generator run. The Java generator rejects missing, mixed, or
tampered provider provenance.

Generation also extracts and verifies the Language 1.0 and Contracts 1.0
registries from the pinned `blue-language-core` and `blue-contracts-core`
dependencies. Their package identities and every declared resource digest
must match the selected registry release before Java sources are written.

Run `npm ci` once to install the generator's pinned `js-yaml` dependency.

## Build And Test

Gradle runs on JDK 25 and uses a Java 8 toolchain for tests. If Java 8 is not
installed locally, Gradle can provision it through the configured Foojay
toolchain resolver.

```bash
./gradlew test
```

Full check, including generated-source verification:

```bash
./gradlew check
```

Publish to local Maven:

```bash
./gradlew publishToMavenLocal
```

The project targets Java 8-compatible bytecode, builds with JDK 25, and runs
tests on Java 8.

## Release Setup

The project version is stored in `.cz.toml`. Local builds append `-SNAPSHOT`;
CI builds publish the plain version.

Publishing uses the same JReleaser/Maven Central flow as `blue-language-java`:

```bash
./gradlew clean build
./gradlew publish
./gradlew jreleaserFullRelease
```

The release workflow expects these repository secrets:

- `GH_TOKEN`
- `MAVENCENTRAL_USERNAME` - the Central Portal user-token username
- `MAVENCENTRAL_PASSWORD` - the Central Portal user-token password/passcode
- `GPG_PUBLIC_KEY`
- `GPG_SECRET_KEY`
- `GPG_PASSPHRASE`

Use the raw Central Portal user-token values, the same as
`blue-language-java`: `MAVENCENTRAL_USERNAME` is the token username and
`MAVENCENTRAL_PASSWORD` is the token password/passcode.

The `blue.repo` namespace must be verified in Maven Central before release.

## Project Layout

```text
src/main/java/blue/repo
  BlueRepository.java                  main facade
  RepositoryManifest.java              manifest loader/model
  common/                              generated Common model classes
  coordination/                        generated Coordination model classes
  finoscdm60d07/                       generated FINOS CDM model classes
  myos/                                generated MyOS model classes
  paynote/                             generated PayNote model classes
  workflows/                           generated Workflows model classes
  provider/                            repository NodeProvider helpers
  types/                               generated RepositoryType constants

src/main/resources/blue/repo
  manifest.json
  definitions/
  BlueRepository.blue
  BlueRepository.provider.json

tools/
  generate-repository-sources.js
```

## Common Pitfalls

`type: Coordination/Operation` does not resolve by itself.

Use `repo.importsDirective()` or direct BlueId references:

```java
Node document = raw.blue(repo.importsDirective());
try (BlueRuntime runtime = repo.runtimeBuilder().build()) {
    Node preprocessed = runtime.language().preprocessing().preprocess(document);
}
```

Generated classes are not processors.

If you want to execute Coordination workflows, compose the repository artifact
with the matching `blue-coordination-java` release and its processors.

## Links

- Repository browser: <https://repo.blue>
- Blue language spec: <https://language.blue/docs/reference/specification>
- Blue language Java: <https://github.com/bluecontract/blue-language-java>
