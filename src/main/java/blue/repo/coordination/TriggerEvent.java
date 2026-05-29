package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Dg3nc6K9P7AWn4K1dpGCAKG3YXJjsUWRhG3YxfqyLTeK")
public class TriggerEvent extends SequentialWorkflowStep {
    public static String blueId() {
        return "Dg3nc6K9P7AWn4K1dpGCAKG3YXJjsUWRhG3YxfqyLTeK";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Trigger Event";
    }

    public static String qualifiedName() {
        return "Coordination/Trigger Event";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/TriggerEvent.json";
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
