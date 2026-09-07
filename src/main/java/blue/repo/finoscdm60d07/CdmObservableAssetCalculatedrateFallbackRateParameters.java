package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3sqs6JVYeMNrZqd2emrSoPHRq3xBcEBiWKG9xy5UnYUV")
public class CdmObservableAssetCalculatedrateFallbackRateParameters {
    public static String blueId() {
        return "3sqs6JVYeMNrZqd2emrSoPHRq3xBcEBiWKG9xy5UnYUV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/calculatedrate/FallbackRateParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/calculatedrate/FallbackRateParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetcalculatedrateFallbackRateParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationParameters;

    private String effectiveDate;

    private CdmBaseStaticdataAssetRatesFloatingRateIndexEnum floatingRateIndex;

    private Double spreadAdjustment;

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters getCalculationParameters() {
        return calculationParameters;
    }

    public CdmObservableAssetCalculatedrateFallbackRateParameters calculationParameters(CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationParameters) {
        this.calculationParameters = calculationParameters;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmObservableAssetCalculatedrateFallbackRateParameters effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public CdmBaseStaticdataAssetRatesFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public CdmObservableAssetCalculatedrateFallbackRateParameters floatingRateIndex(CdmBaseStaticdataAssetRatesFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public Double getSpreadAdjustment() {
        return spreadAdjustment;
    }

    public CdmObservableAssetCalculatedrateFallbackRateParameters spreadAdjustment(Double spreadAdjustment) {
        this.spreadAdjustment = spreadAdjustment;
        return this;
    }

}
