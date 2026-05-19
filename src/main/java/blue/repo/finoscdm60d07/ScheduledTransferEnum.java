package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FL4qJkAiXnAgS5Yf5aysoCPxPbWq6nR8dhf8dXtRWNej")
public class ScheduledTransferEnum {
    public static String blueId() {
        return "FL4qJkAiXnAgS5Yf5aysoCPxPbWq6nR8dhf8dXtRWNej";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ScheduledTransferEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ScheduledTransferEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ScheduledTransferEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public ScheduledTransferEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
