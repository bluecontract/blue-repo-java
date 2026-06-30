package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DJ7mNRisRDzwiXVunMHLfDzvMqVHiQo2iHab3fCmxUL7")
public class CdmBaseMathUnitType {
    public static String blueId() {
        return "DJ7mNRisRDzwiXVunMHLfDzvMqVHiQo2iHab3fCmxUL7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/UnitType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/UnitType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathUnitType.json";
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

    private ComRosettaModelFieldWithMetaString currency;

    private CdmBaseMathFinancialUnitEnum financialUnit;

    private CdmBaseMathWeatherUnitEnum weatherUnit;

    public CdmBaseMathCapacityUnitEnum getCapacityUnit() {
        return capacityUnit;
    }

    public CdmBaseMathUnitType capacityUnit(CdmBaseMathCapacityUnitEnum capacityUnit) {
        this.capacityUnit = capacityUnit;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmBaseMathUnitType currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public CdmBaseMathFinancialUnitEnum getFinancialUnit() {
        return financialUnit;
    }

    public CdmBaseMathUnitType financialUnit(CdmBaseMathFinancialUnitEnum financialUnit) {
        this.financialUnit = financialUnit;
        return this;
    }

    public CdmBaseMathWeatherUnitEnum getWeatherUnit() {
        return weatherUnit;
    }

    public CdmBaseMathUnitType weatherUnit(CdmBaseMathWeatherUnitEnum weatherUnit) {
        this.weatherUnit = weatherUnit;
        return this;
    }

}
