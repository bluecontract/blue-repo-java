package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2bSWEoMSZwzf32Hnr4BDVsuq8NRjrWEpnhZvMZAJGhh2")
public class TriggerEvent extends SequentialWorkflowStep {
    public static String blueId() {
        return "2bSWEoMSZwzf32Hnr4BDVsuq8NRjrWEpnhZvMZAJGhh2";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Trigger Event";
    }

    public static String qualifiedName() {
        return "Conversation/Trigger Event";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/TriggerEvent.json";
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

    public TriggerEvent event(Node event) {
        this.event = event;
        return this;
    }

}
