package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EKsqSPxoGmR5imAgsasYuqaxL25TcER9TCmeQ72XTn9E")
public class InformationProviderEnum {
    public static String blueId() {
        return "EKsqSPxoGmR5imAgsasYuqaxL25TcER9TCmeQ72XTn9E";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InformationProviderEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InformationProviderEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InformationProviderEnum.json";
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

    public InformationProviderEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
