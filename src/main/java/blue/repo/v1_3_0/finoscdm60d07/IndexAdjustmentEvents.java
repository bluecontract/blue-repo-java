package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6P2CHxFyZ8wBooMX8J6djRTQAKsnFysk852JqkyZMu7K")
public class IndexAdjustmentEvents {
    public static String blueId() {
        return "6P2CHxFyZ8wBooMX8J6djRTQAKsnFysk852JqkyZMu7K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IndexAdjustmentEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IndexAdjustmentEvents";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/IndexAdjustmentEvents.json";
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

    public IndexAdjustmentEvents namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
