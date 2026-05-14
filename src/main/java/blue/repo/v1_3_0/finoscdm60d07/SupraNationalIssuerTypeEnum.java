package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B1BYgTEcX3751fEvrPxHTgLVatErK3xGPsdDwiA4TmXM")
public class SupraNationalIssuerTypeEnum {
    public static String blueId() {
        return "B1BYgTEcX3751fEvrPxHTgLVatErK3xGPsdDwiA4TmXM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SupraNationalIssuerTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SupraNationalIssuerTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SupraNationalIssuerTypeEnum.json";
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

    public SupraNationalIssuerTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
