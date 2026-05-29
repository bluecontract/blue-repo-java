package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#8")
public class CdmProductTemplateTransferableProduct {
    public static String blueId() {
        return "9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/TransferableProduct";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/TransferableProduct";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateTransferableProduct.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: Cash
    @JsonProperty("Cash")
    private CdmBaseStaticdataAssetCommonCash cash;

    // Original Blue property name: Commodity
    @JsonProperty("Commodity")
    private CdmBaseStaticdataAssetCommonCommodity commodity;

    // Original Blue property name: DigitalAsset
    @JsonProperty("DigitalAsset")
    private CdmBaseStaticdataAssetCommonDigitalAsset digitalAsset;

    private CdmProductTemplateEconomicTerms economicTerms;

    // Original Blue property name: Instrument
    @JsonProperty("Instrument")
    private CdmBaseStaticdataAssetCommonInstrument instrument;

    public CdmBaseStaticdataAssetCommonCash getCash() {
        return cash;
    }

    public CdmProductTemplateTransferableProduct cash(CdmBaseStaticdataAssetCommonCash cash) {
        this.cash = cash;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCommodity getCommodity() {
        return commodity;
    }

    public CdmProductTemplateTransferableProduct commodity(CdmBaseStaticdataAssetCommonCommodity commodity) {
        this.commodity = commodity;
        return this;
    }

    public CdmBaseStaticdataAssetCommonDigitalAsset getDigitalAsset() {
        return digitalAsset;
    }

    public CdmProductTemplateTransferableProduct digitalAsset(CdmBaseStaticdataAssetCommonDigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
        return this;
    }

    public CdmProductTemplateEconomicTerms getEconomicTerms() {
        return economicTerms;
    }

    public CdmProductTemplateTransferableProduct economicTerms(CdmProductTemplateEconomicTerms economicTerms) {
        this.economicTerms = economicTerms;
        return this;
    }

    public CdmBaseStaticdataAssetCommonInstrument getInstrument() {
        return instrument;
    }

    public CdmProductTemplateTransferableProduct instrument(CdmBaseStaticdataAssetCommonInstrument instrument) {
        this.instrument = instrument;
        return this;
    }

}
