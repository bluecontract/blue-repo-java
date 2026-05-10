# blue-repository-java

Java companion package for [repo.blue](https://repo.blue) / `blue-repository`.

This package exposes Blue repository definitions to Java code. It packages the repository type documents as classpath resources and provides Java accessors for qualified names and BlueIds. It does not implement contract processors or runtime contract behavior.

## Local Development

Put this repository next to `blue-language-java`. This repository depends on the language engine:

```groovy
dependencies {
    api 'blue.language:blue-language-java:0.8.0-SNAPSHOT'
}
```

The included `settings.gradle` picks up the sibling checkout as a composite build when it is present, so local changes in `../blue-language-java` are used automatically:

```groovy
// settings.gradle
includeBuild('../blue-language-java')
```

Applications consuming this package should depend on the repository companion artifact:

```groovy
dependencies {
    implementation 'blue.repository:blue-repository-java:0.28.0-SNAPSHOT'
}
```

Alternative local setup:

```bash
cd ../blue-language-java
./gradlew publishToMavenLocal
```

Then build this project with `mavenLocal()` enabled if you are not using the sibling composite build.

## Resolve Repository Types

```java
import blue.language.model.Node;
import blue.repository.BlueRepository;
import blue.repository.types.ConversationTypes;

import java.util.Optional;

BlueRepository repo = BlueRepository.v0_28_0();

String operationBlueId = repo.blueId("Conversation/Operation");
Optional<Node> operation = repo.nodeByName("Conversation/Operation");

String sameBlueId = ConversationTypes.OPERATION.blueId();
Node operationReference = ConversationTypes.OPERATION.reference();
```

## Use Generated Java Models

Versioned model classes live under `blue.repository.v0_28_0` package branches:

```java
import blue.repository.v0_28_0.conversation.ChatMessage;
import blue.repository.v0_28_0.conversation.Operation;
import blue.repository.v0_28_0.conversation.SequentialWorkflow;
import blue.repository.v0_28_0.conversation.SequentialWorkflowOperation;

ChatMessage message = new ChatMessage()
    .message("hello");

Operation operation = new Operation()
    .channel("operations");

SequentialWorkflowOperation implementation = new SequentialWorkflowOperation()
    .operation("approve");

boolean isWorkflow = implementation instanceof SequentialWorkflow;
```

Each generated class is annotated with the real repository BlueId:

```java
@TypeBlueId("BoAiqVUZv9Fum3wFqaX2JnQMBHJLxJSo2V9U2UBmCfsC")
public class Operation extends Marker {
    // fields, getters, fluent setters
}
```

## Create Blue With Repository Types

```java
import blue.language.Blue;
import blue.repository.BlueRepository;

BlueRepository repo = BlueRepository.v0_28_0();
Blue blue = repo.configure(new Blue(repo.nodeProvider()));
```

## Compose With User Documents

```java
import blue.language.Blue;
import blue.language.NodeProvider;
import blue.repository.BlueRepository;
import blue.repository.provider.CompositeNodeProvider;

BlueRepository repo = BlueRepository.v0_28_0();
NodeProvider userProvider = blueId -> null; // your application provider

NodeProvider provider = CompositeNodeProvider.of(
    repo.nodeProvider(),
    userProvider
);

Blue blue = repo.configure(new Blue(provider));
```

## Resolve Documents With Repository Qualified Names

Repository authored documents often use qualified type names such as `Conversation/Timeline Channel`. Attach `repo.typeAliasBlue()` before preprocessing so Blue can replace those names with BlueIds:

```java
import blue.language.Blue;
import blue.language.model.Node;
import blue.repository.BlueRepository;

import static blue.language.utils.UncheckedObjectMapper.YAML_MAPPER;

BlueRepository repo = BlueRepository.v0_28_0();
Blue blue = repo.configure(new Blue(repo.nodeProvider()));

String yaml = ""
    + "name: Counter\n"
    + "contracts:\n"
    + "  timeline:\n"
    + "    type: Conversation/Timeline Channel\n"
    + "    timelineId: counter-events\n"
    + "  incrementImpl:\n"
    + "    type: Conversation/Sequential Workflow Operation\n"
    + "    channel: timeline\n"
    + "    operation: increment\n"
    + "    steps:\n"
    + "      - type: Conversation/Update Document\n"
    + "        changeset:\n"
    + "          - type: Core/Json Patch Entry\n"
    + "            op: replace\n"
    + "            path: /count\n"
    + "            val: 1\n"
    + "count: 0\n";

Node document = YAML_MAPPER.readValue(yaml, Node.class)
    .blue(repo.typeAliasBlue());

Node preprocessed = blue.preprocess(document);
Node resolved = blue.resolve(preprocessed);
```

## Regenerate Vendored Resources

The current milestone vendors generated resources from the sibling `../blue-repository/BlueRepository.blue` bundle.

```bash
./gradlew generateRepositorySources
```

Verify checked-in generated output is current:

```bash
./gradlew verifyGeneratedSources
```

`verifyGeneratedSources` is wired into `check`; it snapshots the generated trees, reruns the generator, and fails if the output changes. The generator still expects `../blue-repository-js/node_modules/js-yaml` to be available when `js-yaml` is not installed locally.

Generated resources live under `src/main/resources/blue/repository/v0_28_0`, generated model classes live under `src/main/java/blue/repository/v0_28_0`, and generated constants live under `src/main/java/blue/repository/types`.

## Mapper Note

Generated Java fields that must avoid Java keywords preserve the Blue property name with Jackson metadata, for example `@JsonProperty("package")` on `packageValue`. The `blue-language-java` reflection mappers honor that annotation for generated `@TypeBlueId` classes, so keyword properties round-trip through `objectToNode(...)` and `nodeToObject(...)`.
