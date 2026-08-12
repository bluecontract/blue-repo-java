package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AFMZa2hViXkmuEYd3tzHVx5sJAXHE2RH9Drcb1MV7xxa")
public class CdmBaseStaticdataAssetCommonCommodityReferenceFramework {
    public static String blueId() {
        return "AFMZa2hViXkmuEYd3tzHVx5sJAXHE2RH9Drcb1MV7xxa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/CommodityReferenceFramework";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/CommodityReferenceFramework";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCommodityReferenceFramework.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathCapacityUnitEnum capacityUnit;

    private String commodityName;

    private ComRosettaModelFieldWithMetaString currency;

    private CdmBaseMathWeatherUnitEnum weatherUnit;

    public CdmBaseMathCapacityUnitEnum getCapacityUnit() {
        return capacityUnit;
    }

    public CdmBaseStaticdataAssetCommonCommodityReferenceFramework capacityUnit(CdmBaseMathCapacityUnitEnum capacityUnit) {
        this.capacityUnit = capacityUnit;
        return this;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public CdmBaseStaticdataAssetCommonCommodityReferenceFramework commodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmBaseStaticdataAssetCommonCommodityReferenceFramework currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public CdmBaseMathWeatherUnitEnum getWeatherUnit() {
        return weatherUnit;
    }

    public CdmBaseStaticdataAssetCommonCommodityReferenceFramework weatherUnit(CdmBaseMathWeatherUnitEnum weatherUnit) {
        this.weatherUnit = weatherUnit;
        return this;
    }

}
