package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5zq87khS45k4gBqm2hMskQyWmGUWRPYcQGEtEiVfv3rF")
public class SpreadScheduleTypeEnum {
    public static String blueId() {
        return "5zq87khS45k4gBqm2hMskQyWmGUWRPYcQGEtEiVfv3rF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SpreadScheduleTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SpreadScheduleTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SpreadScheduleTypeEnum.json";
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

    public SpreadScheduleTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
