package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4UaBp7XHg4snovp8dDMVW8VCyBmegR6733GPBXWvcHmz")
public class DomesticCurrencyIssued {
    public static String blueId() {
        return "4UaBp7XHg4snovp8dDMVW8VCyBmegR6733GPBXWvcHmz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DomesticCurrencyIssued";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DomesticCurrencyIssued";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DomesticCurrencyIssued.json";
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

    private Boolean domesticCurrencyIssued;

    public String getNamespace() {
        return namespace;
    }

    public DomesticCurrencyIssued namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getDomesticCurrencyIssued() {
        return domesticCurrencyIssued;
    }

    public DomesticCurrencyIssued domesticCurrencyIssued(Boolean domesticCurrencyIssued) {
        this.domesticCurrencyIssued = domesticCurrencyIssued;
        return this;
    }

}
