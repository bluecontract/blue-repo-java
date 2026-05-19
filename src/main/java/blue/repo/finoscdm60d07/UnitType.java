package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HfXGfTuZyTzdeeqQYqEwHY1aHpiGoC8VBxxVrumR378G")
public class UnitType {
    public static String blueId() {
        return "HfXGfTuZyTzdeeqQYqEwHY1aHpiGoC8VBxxVrumR378G";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "UnitType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/UnitType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/UnitType.json";
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

    private FieldWithMetaString currency;

    private FinancialUnitEnum financialUnit;

    private WeatherUnitEnum weatherUnit;

    public String getNamespace() {
        return namespace;
    }

    public UnitType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CapacityUnitEnum getCapacityUnit() {
        return capacityUnit;
    }

    public UnitType capacityUnit(CapacityUnitEnum capacityUnit) {
        this.capacityUnit = capacityUnit;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public UnitType currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public FinancialUnitEnum getFinancialUnit() {
        return financialUnit;
    }

    public UnitType financialUnit(FinancialUnitEnum financialUnit) {
        this.financialUnit = financialUnit;
        return this;
    }

    public WeatherUnitEnum getWeatherUnit() {
        return weatherUnit;
    }

    public UnitType weatherUnit(WeatherUnitEnum weatherUnit) {
        this.weatherUnit = weatherUnit;
        return this;
    }

}
