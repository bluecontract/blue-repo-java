package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7TtU1hUAjvsacfDaexUF7KT2eUEoXBSdb42ndSSufh5a")
public class CdmProductCommonSettlementCommodityPriceReturnTerms {
    public static String blueId() {
        return "7TtU1hUAjvsacfDaexUF7KT2eUEoXBSdb42ndSSufh5a";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/CommodityPriceReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/CommodityPriceReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementCommodityPriceReturnTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double conversionFactor;

    private CdmProductCommonSettlementRollFeature rollFeature;

    private CdmBaseMathRounding rounding;

    private CdmProductAssetSpreadSchedule spread;

    public Double getConversionFactor() {
        return conversionFactor;
    }

    public CdmProductCommonSettlementCommodityPriceReturnTerms conversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
        return this;
    }

    public CdmProductCommonSettlementRollFeature getRollFeature() {
        return rollFeature;
    }

    public CdmProductCommonSettlementCommodityPriceReturnTerms rollFeature(CdmProductCommonSettlementRollFeature rollFeature) {
        this.rollFeature = rollFeature;
        return this;
    }

    public CdmBaseMathRounding getRounding() {
        return rounding;
    }

    public CdmProductCommonSettlementCommodityPriceReturnTerms rounding(CdmBaseMathRounding rounding) {
        this.rounding = rounding;
        return this;
    }

    public CdmProductAssetSpreadSchedule getSpread() {
        return spread;
    }

    public CdmProductCommonSettlementCommodityPriceReturnTerms spread(CdmProductAssetSpreadSchedule spread) {
        this.spread = spread;
        return this;
    }

}
