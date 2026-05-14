package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AbBoHP5AP6RF1wtQpQ6qxqCfN5FSVk9B3uj8t19ibucM")
public class MasterAgreementTypeEnum {
    public static String blueId() {
        return "AbBoHP5AP6RF1wtQpQ6qxqCfN5FSVk9B3uj8t19ibucM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterAgreementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterAgreementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MasterAgreementTypeEnum.json";
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

    public MasterAgreementTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
