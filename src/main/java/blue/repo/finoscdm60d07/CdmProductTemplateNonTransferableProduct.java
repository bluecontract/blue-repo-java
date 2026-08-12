package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("52zbUBnH8375AE19gNSXRU7GgGs5tcoUhR84LVdMrBWi#5")
public class CdmProductTemplateNonTransferableProduct {
    public static String blueId() {
        return "52zbUBnH8375AE19gNSXRU7GgGs5tcoUhR84LVdMrBWi#5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/NonTransferableProduct";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/NonTransferableProduct";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateNonTransferableProduct.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateEconomicTerms economicTerms;

    private List<CdmBaseStaticdataAssetCommonProductIdentifier> identifier;

    private List<CdmBaseStaticdataAssetCommonProductTaxonomy> taxonomy;

    public CdmProductTemplateEconomicTerms getEconomicTerms() {
        return economicTerms;
    }

    public CdmProductTemplateNonTransferableProduct economicTerms(CdmProductTemplateEconomicTerms economicTerms) {
        this.economicTerms = economicTerms;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonProductIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmProductTemplateNonTransferableProduct identifier(List<CdmBaseStaticdataAssetCommonProductIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonProductTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmProductTemplateNonTransferableProduct taxonomy(List<CdmBaseStaticdataAssetCommonProductTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
