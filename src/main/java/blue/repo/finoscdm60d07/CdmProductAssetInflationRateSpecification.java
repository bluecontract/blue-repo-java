package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HgvUazWUT3cYBnJe67N6uNczREHE3zyrajGM4ouhEa1L")
public class CdmProductAssetInflationRateSpecification {
    public static String blueId() {
        return "HgvUazWUT3cYBnJe67N6uNczREHE3zyrajGM4ouhEa1L";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/InflationRateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/InflationRateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetInflationRateSpecification.json";
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

    private CdmObservableAssetCalculatedrateInflationCalculationMethodEnum calculationMethod;

    private CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationParameters;

    private CdmObservableAssetCalculatedrateInflationCalculationStyleEnum calculationStyle;

    private CdmProductTemplateStrikeSchedule capRateSchedule;

    private Boolean fallbackBondApplicable;

    private CdmObservableAssetCalculatedrateFallbackRateParameters fallbackRate;

    private CdmProductAssetFinalPrincipalExchangeCalculationEnum finalPrincipalExchangeCalculation;

    private CdmBaseMathRounding finalRateRounding;

    private CdmProductCommonScheduleRateSchedule floatingRateMultiplierSchedule;

    private CdmProductTemplateStrikeSchedule floorRateSchedule;

    private ComRosettaModelFieldWithMetaString indexSource;

    private CdmBaseDatetimeOffset inflationLag;

    private Double initialIndexLevel;

    private CdmObservableAssetPrice initialRate;

    private CdmObservableAssetFieldWithMetaInterpolationMethodEnum interpolationMethod;

    private ComRosettaModelFieldWithMetaString mainPublication;

    private CdmProductAssetNegativeInterestRateTreatmentEnum negativeInterestRateTreatment;

    private CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption;

    private CdmProductAssetRateTreatmentEnum rateTreatment;

    private CdmProductAssetSpreadSchedule spreadSchedule;

    public CdmBaseMathAveragingWeightingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    public CdmProductAssetInflationRateSpecification averagingMethod(CdmBaseMathAveragingWeightingMethodEnum averagingMethod) {
        this.averagingMethod = averagingMethod;
        return this;
    }

    public CdmObservableAssetCalculatedrateInflationCalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    public CdmProductAssetInflationRateSpecification calculationMethod(CdmObservableAssetCalculatedrateInflationCalculationMethodEnum calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters getCalculationParameters() {
        return calculationParameters;
    }

    public CdmProductAssetInflationRateSpecification calculationParameters(CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationParameters) {
        this.calculationParameters = calculationParameters;
        return this;
    }

    public CdmObservableAssetCalculatedrateInflationCalculationStyleEnum getCalculationStyle() {
        return calculationStyle;
    }

    public CdmProductAssetInflationRateSpecification calculationStyle(CdmObservableAssetCalculatedrateInflationCalculationStyleEnum calculationStyle) {
        this.calculationStyle = calculationStyle;
        return this;
    }

    public CdmProductTemplateStrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public CdmProductAssetInflationRateSpecification capRateSchedule(CdmProductTemplateStrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public Boolean getFallbackBondApplicable() {
        return fallbackBondApplicable;
    }

    public CdmProductAssetInflationRateSpecification fallbackBondApplicable(Boolean fallbackBondApplicable) {
        this.fallbackBondApplicable = fallbackBondApplicable;
        return this;
    }

    public CdmObservableAssetCalculatedrateFallbackRateParameters getFallbackRate() {
        return fallbackRate;
    }

    public CdmProductAssetInflationRateSpecification fallbackRate(CdmObservableAssetCalculatedrateFallbackRateParameters fallbackRate) {
        this.fallbackRate = fallbackRate;
        return this;
    }

    public CdmProductAssetFinalPrincipalExchangeCalculationEnum getFinalPrincipalExchangeCalculation() {
        return finalPrincipalExchangeCalculation;
    }

    public CdmProductAssetInflationRateSpecification finalPrincipalExchangeCalculation(CdmProductAssetFinalPrincipalExchangeCalculationEnum finalPrincipalExchangeCalculation) {
        this.finalPrincipalExchangeCalculation = finalPrincipalExchangeCalculation;
        return this;
    }

    public CdmBaseMathRounding getFinalRateRounding() {
        return finalRateRounding;
    }

    public CdmProductAssetInflationRateSpecification finalRateRounding(CdmBaseMathRounding finalRateRounding) {
        this.finalRateRounding = finalRateRounding;
        return this;
    }

    public CdmProductCommonScheduleRateSchedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    public CdmProductAssetInflationRateSpecification floatingRateMultiplierSchedule(CdmProductCommonScheduleRateSchedule floatingRateMultiplierSchedule) {
        this.floatingRateMultiplierSchedule = floatingRateMultiplierSchedule;
        return this;
    }

    public CdmProductTemplateStrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public CdmProductAssetInflationRateSpecification floorRateSchedule(CdmProductTemplateStrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getIndexSource() {
        return indexSource;
    }

    public CdmProductAssetInflationRateSpecification indexSource(ComRosettaModelFieldWithMetaString indexSource) {
        this.indexSource = indexSource;
        return this;
    }

    public CdmBaseDatetimeOffset getInflationLag() {
        return inflationLag;
    }

    public CdmProductAssetInflationRateSpecification inflationLag(CdmBaseDatetimeOffset inflationLag) {
        this.inflationLag = inflationLag;
        return this;
    }

    public Double getInitialIndexLevel() {
        return initialIndexLevel;
    }

    public CdmProductAssetInflationRateSpecification initialIndexLevel(Double initialIndexLevel) {
        this.initialIndexLevel = initialIndexLevel;
        return this;
    }

    public CdmObservableAssetPrice getInitialRate() {
        return initialRate;
    }

    public CdmProductAssetInflationRateSpecification initialRate(CdmObservableAssetPrice initialRate) {
        this.initialRate = initialRate;
        return this;
    }

    public CdmObservableAssetFieldWithMetaInterpolationMethodEnum getInterpolationMethod() {
        return interpolationMethod;
    }

    public CdmProductAssetInflationRateSpecification interpolationMethod(CdmObservableAssetFieldWithMetaInterpolationMethodEnum interpolationMethod) {
        this.interpolationMethod = interpolationMethod;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getMainPublication() {
        return mainPublication;
    }

    public CdmProductAssetInflationRateSpecification mainPublication(ComRosettaModelFieldWithMetaString mainPublication) {
        this.mainPublication = mainPublication;
        return this;
    }

    public CdmProductAssetNegativeInterestRateTreatmentEnum getNegativeInterestRateTreatment() {
        return negativeInterestRateTreatment;
    }

    public CdmProductAssetInflationRateSpecification negativeInterestRateTreatment(CdmProductAssetNegativeInterestRateTreatmentEnum negativeInterestRateTreatment) {
        this.negativeInterestRateTreatment = negativeInterestRateTreatment;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public CdmProductAssetInflationRateSpecification rateOption(CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public CdmProductAssetRateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    public CdmProductAssetInflationRateSpecification rateTreatment(CdmProductAssetRateTreatmentEnum rateTreatment) {
        this.rateTreatment = rateTreatment;
        return this;
    }

    public CdmProductAssetSpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public CdmProductAssetInflationRateSpecification spreadSchedule(CdmProductAssetSpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
