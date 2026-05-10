package blue.repository.v0_28_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("H2aCCTUcLMTJozWkn7HPUjyFBFxamraw1q8DyWk87zxr")
public class LifecycleEventChannel extends blue.language.processor.model.LifecycleChannel {
    public static String blueId() {
        return "H2aCCTUcLMTJozWkn7HPUjyFBFxamraw1q8DyWk87zxr";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Lifecycle Event Channel";
    }

    public static String qualifiedName() {
        return "Core/Lifecycle Event Channel";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Core/LifecycleEventChannel.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node event;

    public Node getEvent() {
        return event;
    }

    public LifecycleEventChannel event(Node event) {
        this.event = event;
        return this;
    }

}
