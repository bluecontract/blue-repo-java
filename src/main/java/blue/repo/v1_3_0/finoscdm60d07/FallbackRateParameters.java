package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7sj3q44yNoFVqhehFV24BmDmshudcVddxNXx48fWQM4x")
public class FallbackRateParameters {
    public static String blueId() {
        return "7sj3q44yNoFVqhehFV24BmDmshudcVddxNXx48fWQM4x";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FallbackRateParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FallbackRateParameters";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FallbackRateParameters.json";
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

    private FloatingRateCalculationParameters calculationParameters;

    private String effectiveDate;

    private FloatingRateIndexEnum floatingRateIndex;

    private Double spreadAdjustment;

    public String getNamespace() {
        return namespace;
    }

    public FallbackRateParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FloatingRateCalculationParameters getCalculationParameters() {
        return calculationParameters;
    }

    public FallbackRateParameters calculationParameters(FloatingRateCalculationParameters calculationParameters) {
        this.calculationParameters = calculationParameters;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public FallbackRateParameters effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public FloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public FallbackRateParameters floatingRateIndex(FloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public Double getSpreadAdjustment() {
        return spreadAdjustment;
    }

    public FallbackRateParameters spreadAdjustment(Double spreadAdjustment) {
        this.spreadAdjustment = spreadAdjustment;
        return this;
    }

}
