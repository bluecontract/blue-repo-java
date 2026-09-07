package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("2AxgqmJErtvQs4JRAzX36FaC3Whn5dTkUzfCXp6ZxCgJ")
public class CdmProductCollateralSpecificAsset {
    public static String blueId() {
        return "2AxgqmJErtvQs4JRAzX36FaC3Whn5dTkUzfCXp6ZxCgJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/SpecificAsset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/SpecificAsset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralSpecificAsset.json";
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

    // Original Blue property name: Instrument
    @JsonProperty("Instrument")
    private CdmBaseStaticdataAssetCommonInstrument instrument;

    public CdmBaseStaticdataAssetCommonCash getCash() {
        return cash;
    }

    public CdmProductCollateralSpecificAsset cash(CdmBaseStaticdataAssetCommonCash cash) {
        this.cash = cash;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCommodity getCommodity() {
        return commodity;
    }

    public CdmProductCollateralSpecificAsset commodity(CdmBaseStaticdataAssetCommonCommodity commodity) {
        this.commodity = commodity;
        return this;
    }

    public CdmBaseStaticdataAssetCommonDigitalAsset getDigitalAsset() {
        return digitalAsset;
    }

    public CdmProductCollateralSpecificAsset digitalAsset(CdmBaseStaticdataAssetCommonDigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
        return this;
    }

    public CdmBaseStaticdataAssetCommonInstrument getInstrument() {
        return instrument;
    }

    public CdmProductCollateralSpecificAsset instrument(CdmBaseStaticdataAssetCommonInstrument instrument) {
        this.instrument = instrument;
        return this;
    }

}
