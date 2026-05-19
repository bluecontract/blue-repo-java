package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HMuwMYVUhjbcMbUqPAVQm4sLx4hyAeEWTTYUHsfZhivh")
public class CommodityReferenceFramework {
    public static String blueId() {
        return "HMuwMYVUhjbcMbUqPAVQm4sLx4hyAeEWTTYUHsfZhivh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CommodityReferenceFramework";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CommodityReferenceFramework";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CommodityReferenceFramework.json";
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

    private CapacityUnitEnum capacityUnit;

    private String commodityName;

    private FieldWithMetaString currency;

    private WeatherUnitEnum weatherUnit;

    public String getNamespace() {
        return namespace;
    }

    public CommodityReferenceFramework namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CapacityUnitEnum getCapacityUnit() {
        return capacityUnit;
    }

    public CommodityReferenceFramework capacityUnit(CapacityUnitEnum capacityUnit) {
        this.capacityUnit = capacityUnit;
        return this;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public CommodityReferenceFramework commodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public CommodityReferenceFramework currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public WeatherUnitEnum getWeatherUnit() {
        return weatherUnit;
    }

    public CommodityReferenceFramework weatherUnit(WeatherUnitEnum weatherUnit) {
        this.weatherUnit = weatherUnit;
        return this;
    }

}
