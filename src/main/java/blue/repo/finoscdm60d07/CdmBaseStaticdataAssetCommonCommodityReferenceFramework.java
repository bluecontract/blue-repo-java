package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HDT1YvxXgi3cM2yks6rSRWPGwk9zAhbCjYs4AV4jbGo1")
public class CdmBaseStaticdataAssetCommonCommodityReferenceFramework {
    public static String blueId() {
        return "HDT1YvxXgi3cM2yks6rSRWPGwk9zAhbCjYs4AV4jbGo1";
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
