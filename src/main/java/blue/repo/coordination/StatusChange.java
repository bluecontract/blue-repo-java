package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8crrz93vvovMkh91qyLj6ajwEDAZw1DdTZ3NBjK6jaqV")
public class StatusChange extends Event {
    public static String blueId() {
        return "8crrz93vvovMkh91qyLj6ajwEDAZw1DdTZ3NBjK6jaqV";
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

    private DocumentStatus status;

    public DocumentStatus getStatus() {
        return status;
    }

    public StatusChange status(DocumentStatus status) {
        this.status = status;
        return this;
    }

}
