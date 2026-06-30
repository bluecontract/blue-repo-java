package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7Qg4XRChRagWG1WXXQ6SxKQFUAWi38ZztLZRLJigyUr8")
public class CdmProductAssetFloatingRateSpecification {
    public static String blueId() {
        return "7Qg4XRChRagWG1WXXQ6SxKQFUAWi38ZztLZRLJigyUr8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FloatingRateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FloatingRateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFloatingRateSpecification.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathAveragingWeightingMethodEnum averagingMethod;

    private CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationParameters;

    private CdmProductTemplateStrikeSchedule capRateSchedule;

    private CdmObservableAssetCalculatedrateFallbackRateParameters fallbackRate;

    private CdmBaseMathRounding finalRateRounding;

    private CdmProductCommonScheduleRateSchedule floatingRateMultiplierSchedule;

    private CdmProductTemplateStrikeSchedule floorRateSchedule;

    private CdmObservableAssetPrice initialRate;

    private CdmProductAssetNegativeInterestRateTreatmentEnum negativeInterestRateTreatment;

    private CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption;

    private CdmProductAssetRateTreatmentEnum rateTreatment;

    private CdmProductAssetSpreadSchedule spreadSchedule;

    public CdmBaseMathAveragingWeightingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    public CdmProductAssetFloatingRateSpecification averagingMethod(CdmBaseMathAveragingWeightingMethodEnum averagingMethod) {
        this.averagingMethod = averagingMethod;
        return this;
    }

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters getCalculationParameters() {
        return calculationParameters;
    }

    public CdmProductAssetFloatingRateSpecification calculationParameters(CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationParameters) {
        this.calculationParameters = calculationParameters;
        return this;
    }

    public CdmProductTemplateStrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public CdmProductAssetFloatingRateSpecification capRateSchedule(CdmProductTemplateStrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public CdmObservableAssetCalculatedrateFallbackRateParameters getFallbackRate() {
        return fallbackRate;
    }

    public CdmProductAssetFloatingRateSpecification fallbackRate(CdmObservableAssetCalculatedrateFallbackRateParameters fallbackRate) {
        this.fallbackRate = fallbackRate;
        return this;
    }

    public CdmBaseMathRounding getFinalRateRounding() {
        return finalRateRounding;
    }

    public CdmProductAssetFloatingRateSpecification finalRateRounding(CdmBaseMathRounding finalRateRounding) {
        this.finalRateRounding = finalRateRounding;
        return this;
    }

    public CdmProductCommonScheduleRateSchedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    public CdmProductAssetFloatingRateSpecification floatingRateMultiplierSchedule(CdmProductCommonScheduleRateSchedule floatingRateMultiplierSchedule) {
        this.floatingRateMultiplierSchedule = floatingRateMultiplierSchedule;
        return this;
    }

    public CdmProductTemplateStrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public CdmProductAssetFloatingRateSpecification floorRateSchedule(CdmProductTemplateStrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public CdmObservableAssetPrice getInitialRate() {
        return initialRate;
    }

    public CdmProductAssetFloatingRateSpecification initialRate(CdmObservableAssetPrice initialRate) {
        this.initialRate = initialRate;
        return this;
    }

    public CdmProductAssetNegativeInterestRateTreatmentEnum getNegativeInterestRateTreatment() {
        return negativeInterestRateTreatment;
    }

    public CdmProductAssetFloatingRateSpecification negativeInterestRateTreatment(CdmProductAssetNegativeInterestRateTreatmentEnum negativeInterestRateTreatment) {
        this.negativeInterestRateTreatment = negativeInterestRateTreatment;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public CdmProductAssetFloatingRateSpecification rateOption(CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public CdmProductAssetRateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    public CdmProductAssetFloatingRateSpecification rateTreatment(CdmProductAssetRateTreatmentEnum rateTreatment) {
        this.rateTreatment = rateTreatment;
        return this;
    }

    public CdmProductAssetSpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public CdmProductAssetFloatingRateSpecification spreadSchedule(CdmProductAssetSpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
