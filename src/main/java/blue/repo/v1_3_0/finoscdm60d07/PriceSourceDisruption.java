package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BDQaYGvw3aMd17TXSKZMWW64GV96vt6vuP2PWzroJwvb")
public class PriceSourceDisruption {
    public static String blueId() {
        return "BDQaYGvw3aMd17TXSKZMWW64GV96vt6vuP2PWzroJwvb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceSourceDisruption";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceSourceDisruption";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PriceSourceDisruption.json";
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

    private FallbackReferencePrice fallbackReferencePrice;

    public String getNamespace() {
        return namespace;
    }

    public PriceSourceDisruption namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FallbackReferencePrice getFallbackReferencePrice() {
        return fallbackReferencePrice;
    }

    public PriceSourceDisruption fallbackReferencePrice(FallbackReferencePrice fallbackReferencePrice) {
        this.fallbackReferencePrice = fallbackReferencePrice;
        return this;
    }

}
