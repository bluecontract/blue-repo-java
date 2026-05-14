package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AFWUrY5FWgFnzVAmZJHAH1wEhtyCfPunsEwybUry8Ssy")
public class BusinessCenterEnum {
    public static String blueId() {
        return "AFWUrY5FWgFnzVAmZJHAH1wEhtyCfPunsEwybUry8Ssy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BusinessCenterEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BusinessCenterEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BusinessCenterEnum.json";
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

    public BusinessCenterEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
