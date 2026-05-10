package blue.repository.v0_28_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("C77W4kVGcxL7Mkx9WL9QESPEFFL2GzWAe647s1Efprt")
public class TriggeredEventChannel extends blue.language.processor.model.TriggeredEventChannel {
    public static String blueId() {
        return "C77W4kVGcxL7Mkx9WL9QESPEFFL2GzWAe647s1Efprt";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Triggered Event Channel";
    }

    public static String qualifiedName() {
        return "Core/Triggered Event Channel";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Core/TriggeredEventChannel.json";
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

    public TriggeredEventChannel event(Node event) {
        this.event = event;
        return this;
    }

}
