package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5dUZnHXjGnaZkRQ7u3RThz6DXG9iwSrZNPy6Uv1HAPsJ")
public class CollateralTransferAgreementElections {
    public static String blueId() {
        return "5dUZnHXjGnaZkRQ7u3RThz6DXG9iwSrZNPy6Uv1HAPsJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralTransferAgreementElections";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralTransferAgreementElections";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralTransferAgreementElections.json";
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

    public CollateralTransferAgreementElections namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
