package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B4btahVwY81bXQoXskPHEv3NrRPMYfXcR1fkUV8jcPne")
public class StatusChange extends Event {
    public static String blueId() {
        return "B4btahVwY81bXQoXskPHEv3NrRPMYfXcR1fkUV8jcPne";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status Change";
    }

    public static String qualifiedName() {
        return "Coordination/Status Change";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusChange.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Status status;

    public Status getStatus() {
        return status;
    }

    public StatusChange status(Status status) {
        this.status = status;
        return this;
    }

}
