package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FrA8YUSmWhqWmKLQsPkcHEvJ9etE2LvgNi5FEBwH9ntr")
public class ReferenceWithMetaCashSettlementTerms {
    public static String blueId() {
        return "FrA8YUSmWhqWmKLQsPkcHEvJ9etE2LvgNi5FEBwH9ntr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceWithMetaCashSettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceWithMetaCashSettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceWithMetaCashSettlementTerms.json";
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

    private Reference address;

    private String externalReference;

    private String globalReference;

    public String getNamespace() {
        return namespace;
    }

    public ReferenceWithMetaCashSettlementTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Reference getAddress() {
        return address;
    }

    public ReferenceWithMetaCashSettlementTerms address(Reference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public ReferenceWithMetaCashSettlementTerms externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public ReferenceWithMetaCashSettlementTerms globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
