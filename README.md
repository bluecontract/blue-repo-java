# Blue Repository Java

Java companion package for [repo.blue](https://repo.blue).

This repository packages published Blue repository definitions as Java
resources and generated Java classes. It lets Java applications resolve
repo.blue types by qualified name or BlueId, use generated model classes, and
configure `blue-language-java` with the repository type catalog.

It does not execute contracts. Runtime behavior for contracts such as
Conversation workflows or timeline channels belongs in `blue-contract-java`.

## How This Fits

| Repository | Responsibility |
| --- | --- |
| `blue-language-java` | Blue language core: parsing, BlueId, resolution, snapshots, processor foundation. |
| `blue-repo-java` | Generated Java catalog for repo.blue packages and types. |
| `blue-contract-java` | Executable processors for selected repository contracts. |

Use this project when you need Java access to real repo.blue types:

- `Core/Document Update Channel`
- `Conversation/Operation`
- `Conversation/Sequential Workflow Operation`
- `FINOS-CDM-6.0-d07/Trade`
- `MyOS/MyOS Timeline Channel`
- `PayNote/PayNote`
- and the rest of the packaged type catalog.

## What You Get

This package currently includes repository version `1.3.0`.

It provides:

- classpath resources for the generated Blue type definitions;
- a repository manifest;
- lookup by qualified name and BlueId;
- `NodeProvider` integration for Blue reference resolution;
- `TypeDictionary` integration for compact/portable export;
- generated Java classes under `blue.repo.v1_3_0`;
- generated type constants under `blue.repo.types`;
- a `TypeClassResolver` configured with all generated `@TypeBlueId` classes;
- type alias preprocessing so YAML can use names like
  `Conversation/Operation` instead of raw BlueIds.

## Installation

### Gradle

Add the Maven Central repository and use the released artifact:

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation "blue.repo:blue-repo-java:1.3.0"
}
```

`blue-language-java` is pulled transitively. If you need to declare it
directly, use the published language artifact:

```groovy
implementation "blue.language:blue-language-java:2.0.0"
```

### Maven

```xml
<dependency>
    <groupId>blue.repo</groupId>
    <artifactId>blue-repo-java</artifactId>
    <version>1.3.0</version>
</dependency>
```

### Local Development

Local builds use the version from `.cz.toml` with `-SNAPSHOT` appended, so this
checkout builds as `1.3.0-SNAPSHOT` outside CI.

To test this package from another local project before release:

```bash
./gradlew publishToMavenLocal
```

Then depend on:

```groovy
implementation "blue.repo:blue-repo-java:1.3.0-SNAPSHOT"
```

This repository now resolves `blue.language:blue-language-java:2.0.0` from
Maven Central or `mavenLocal()`; it does not include the sibling
`../blue-language-java` composite build by default.

## Quick Start

### Create A Repository Catalog

```java
import blue.repo.BlueRepository;

BlueRepository repo = BlueRepository.v1_3_0();

System.out.println(repo.repositoryVersion());
System.out.println(repo.blueId("Conversation/Operation"));
System.out.println(repo.packageNames());
```

### Resolve A Repository Type By Name

```java
import blue.language.model.Node;
import blue.repo.BlueRepository;

BlueRepository repo = BlueRepository.v1_3_0();

Node operationType = repo.nodeByName("Conversation/Operation")
        .orElseThrow(IllegalStateException::new);

System.out.println(operationType.getName());
System.out.println(operationType.getBlueId());
```

### Use Repository Definitions As A `NodeProvider`

```java
import blue.language.Blue;
import blue.language.model.Node;
import blue.repo.BlueRepository;
import blue.repo.types.ConversationTypes;

BlueRepository repo = BlueRepository.v1_3_0();
Blue blue = repo.configure(new Blue(repo.nodeProvider()));

Node message = new Node()
        .type(ConversationTypes.CHAT_MESSAGE.reference())
        .properties("message", new Node().value("hello"));

Node resolved = blue.resolve(message);

System.out.println(resolved.getType().getName()); // Chat Message
```

### Export With The Repository Dictionary

Register the repository dictionary when exporting documents that reference
repo.blue types:

```java
import blue.language.Blue;
import blue.language.dictionary.ExportContext;
import blue.language.model.Node;
import blue.repo.BlueRepository;
import blue.repo.types.ConversationTypes;

BlueRepository repo = BlueRepository.v1_3_0();
Blue blue = repo.configureForExport(new Blue());

Node document = new Node()
        .type(ConversationTypes.OPERATION.reference());

ExportContext context = ExportContext.builder()
        .dictionary(BlueRepository.DICTIONARY_NAME, repo.repositoryVersionBlueId())
        .build();

String yaml = blue.nodeToYaml(document, context);
```

`@TypeBlueId` maps repository BlueIds to Java classes. Generated classes may
contain the current BlueId plus compatible historical BlueIds when the current
class can safely represent older documents. The repository `TypeDictionary`
maps current and historical type BlueIds to the current logical type, then
chooses the type BlueId supported by the receiver's requested repository
version. The repository `NodeProvider` remains responsible for loading full
definitions for resolution and for fallback inlining.

When the export context includes the repository dictionary version, supported
repository types stay compact:

```yaml
type:
  blueId: BoAiqVUZv9Fum3wFqaX2JnQMBHJLxJSo2V9U2UBmCfsC
```

When no supported dictionary is declared, known repository types are inlined by
default. To fail instead of inline, use strict export:

```java
ExportContext strict = ExportContext.builder()
        .inlineUnsupportedTypes(false)
        .build();
```

If the export context names an older repository version, supported types are
exported with that older version's type BlueId. Types that did not exist in the
requested repository version are inlined by default or rejected in strict mode.
Current `blue-language-java` does not pass the requested dictionary version into
the inlined-definition callback, so version-specific field pruning is modeled in
manifest metadata but requires a follow-up language SPI extension to apply
during inlining.

### Use Qualified Names In YAML

Repository-authored documents usually use qualified type names:

```yaml
name: Example
contracts:
  increment:
    type: Conversation/Operation
    channel: ownerChannel
    request:
      type: Integer
```

Attach `repo.typeAliasBlue()` before preprocessing so `blue-language-java` can
replace qualified names with real BlueIds:

```java
import blue.language.Blue;
import blue.language.model.Node;
import blue.repo.BlueRepository;

import static blue.language.utils.UncheckedObjectMapper.YAML_MAPPER;

BlueRepository repo = BlueRepository.v1_3_0();
Blue blue = repo.configure(new Blue(repo.nodeProvider()));

Node document = YAML_MAPPER.readValue(yaml, Node.class)
        .blue(repo.typeAliasBlue());

Node preprocessed = blue.preprocess(document);
Node resolved = blue.resolve(preprocessed);
```

### Use Generated Java Model Classes

Generated model classes live under versioned packages:

```java
import blue.language.Blue;
import blue.language.model.Node;
import blue.repo.BlueRepository;
import blue.repo.v1_3_0.conversation.ChatMessage;
import blue.repo.v1_3_0.conversation.Operation;
import blue.repo.v1_3_0.conversation.SequentialWorkflowOperation;

BlueRepository repo = BlueRepository.v1_3_0();
Blue blue = repo.configure(new Blue(repo.nodeProvider()));

ChatMessage message = new ChatMessage()
        .message("hello");

Node messageNode = blue.objectToNode(message);

Operation operation = new Operation()
        .channel("ownerChannel")
        .request(new Node().type("Integer"));

SequentialWorkflowOperation implementation = new SequentialWorkflowOperation()
        .operation("increment");
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
String name = Operation.qualifiedName(); // Conversation/Operation
```

## Combine With Application Types

If your application has its own Blue documents in addition to repo.blue types,
compose providers:

```java
import blue.language.Blue;
import blue.language.NodeProvider;
import blue.repo.BlueRepository;
import blue.repo.provider.CompositeNodeProvider;

BlueRepository repo = BlueRepository.v1_3_0();

NodeProvider appProvider = blueId -> null; // your storage/provider
NodeProvider provider = CompositeNodeProvider.of(
        repo.nodeProvider(),
        appProvider
);

Blue blue = repo.configure(new Blue(provider));
```

## What This Does Not Do

This project does not implement contract behavior.

For example:

- `Conversation/Update Document` is generated here as a model class;
- `Conversation/Sequential Workflow Operation` is generated here as a model
  class;
- `MyOS/MyOS Timeline Channel` is generated here as a model class;
- but executing those contracts is `blue-contract-java`'s job.

This separation is intentional. The repository package is stable generated
catalog data; the contract package is executable behavior.

## Generated Packages

Current generated package groups include:

- `blue.repo.v1_3_0.core`
- `blue.repo.v1_3_0.common`
- `blue.repo.v1_3_0.conversation`
- `blue.repo.v1_3_0.finoscdm60d07`
- `blue.repo.v1_3_0.myos`
- `blue.repo.v1_3_0.paynote`

Convenience constants:

- `blue.repo.types.CoreTypes`
- `blue.repo.types.CommonTypes`
- `blue.repo.types.ConversationTypes`
- `blue.repo.types.FINOSCDM60d07Types`
- `blue.repo.types.MyOSTypes`
- `blue.repo.types.PayNoteTypes`

## Regenerating Sources

Generated output is checked in.

Regenerate from the sibling repository bundle:

```bash
./gradlew generateRepositorySources
```

Regenerate from an explicit upstream checkout or downloaded bundle:

```bash
./gradlew generateRepositorySources \
  -PblueRepositorySource=/path/to/blue-repository/BlueRepository.blue
```

Verify checked-in output is current:

```bash
./gradlew verifyGeneratedSources
```

`verifyGeneratedSources` is wired into `check`.

The generator uses the checked-in `BlueRepository.blue` for the current
version when available. For a new repository release, point
`blueRepositorySource` at the updated upstream `BlueRepository.blue`.

If `js-yaml` is not installed locally, the generator expects it under
`../blue-repository-js/node_modules/js-yaml`.

## Build And Test

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

The project targets Java 8 bytecode.

## Release Setup

The project version is stored in `.cz.toml`. Local builds append `-SNAPSHOT`;
CI builds publish the plain version, for example `1.3.0`.

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
  provider/                            repository NodeProvider helpers
  types/                               generated RepositoryType constants
  v1_3_0/                             generated versioned Java classes

src/main/resources/blue/repo/v1_3_0
  manifest.json
  definitions/
  BlueRepository.blue

tools/
  generate-repository-sources.js
```

## Common Pitfalls

`type: Conversation/Operation` does not resolve by itself.

You need `repo.typeAliasBlue()` or direct BlueId references:

```java
Node document = raw.blue(repo.typeAliasBlue());
Node preprocessed = blue.preprocess(document);
```

Generated classes are not processors.

If you want to execute Conversation workflows, add `blue-contract-java` and call:

```java
BlueDocumentProcessors.registerWith(blue);
```

## Links

- Repository browser: <https://repo.blue>
- Blue language spec: <https://language.blue/docs/reference/specification>
- Blue language Java: <https://github.com/bluecontract/blue-language-java>
