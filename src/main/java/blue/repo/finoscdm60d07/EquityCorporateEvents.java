package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8L1q1FLbHwLUdeRvc2vqwXVjLu1eg4CfnkNygFtoftvn")
public class EquityCorporateEvents {
    public static String blueId() {
        return "8L1q1FLbHwLUdeRvc2vqwXVjLu1eg4CfnkNygFtoftvn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EquityCorporateEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EquityCorporateEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EquityCorporateEvents.json";
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

    public EquityCorporateEvents namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
