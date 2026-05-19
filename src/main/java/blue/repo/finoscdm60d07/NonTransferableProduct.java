package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#2")
public class NonTransferableProduct {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NonTransferableProduct";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NonTransferableProduct";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/NonTransferableProduct.json";
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

    private EconomicTerms economicTerms;

    private List<ProductIdentifier> identifier;

    private List<ProductTaxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public NonTransferableProduct namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public EconomicTerms getEconomicTerms() {
        return economicTerms;
    }

    public NonTransferableProduct economicTerms(EconomicTerms economicTerms) {
        this.economicTerms = economicTerms;
        return this;
    }

    public List<ProductIdentifier> getIdentifier() {
        return identifier;
    }

    public NonTransferableProduct identifier(List<ProductIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public List<ProductTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public NonTransferableProduct taxonomy(List<ProductTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
