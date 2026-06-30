package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6xhUj24tdK3fZ5cyajqu3YGHmhotZzzXE5P1CxK4E7uu")
public class CdmProductAssetFloatingrateFloatingRateProcessingParameters {
    public static String blueId() {
        return "6xhUj24tdK3fZ5cyajqu3YGHmhotZzzXE5P1CxK4E7uu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/floatingrate/FloatingRateProcessingParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/floatingrate/FloatingRateProcessingParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetfloatingrateFloatingRateProcessingParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double capRate;

    private Double floorRate;

    private CdmObservableAssetPrice initialRate;

    private Double multiplier;

    private CdmProductAssetNegativeInterestRateTreatmentEnum negativeTreatment;

    private CdmBaseMathRounding rounding;

    private Double spread;

    private CdmProductAssetRateTreatmentEnum treatment;

    public Double getCapRate() {
        return capRate;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters capRate(Double capRate) {
        this.capRate = capRate;
        return this;
    }

    public Double getFloorRate() {
        return floorRate;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters floorRate(Double floorRate) {
        this.floorRate = floorRate;
        return this;
    }

    public CdmObservableAssetPrice getInitialRate() {
        return initialRate;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters initialRate(CdmObservableAssetPrice initialRate) {
        this.initialRate = initialRate;
        return this;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters multiplier(Double multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public CdmProductAssetNegativeInterestRateTreatmentEnum getNegativeTreatment() {
        return negativeTreatment;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters negativeTreatment(CdmProductAssetNegativeInterestRateTreatmentEnum negativeTreatment) {
        this.negativeTreatment = negativeTreatment;
        return this;
    }

    public CdmBaseMathRounding getRounding() {
        return rounding;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters rounding(CdmBaseMathRounding rounding) {
        this.rounding = rounding;
        return this;
    }

    public Double getSpread() {
        return spread;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters spread(Double spread) {
        this.spread = spread;
        return this;
    }

    public CdmProductAssetRateTreatmentEnum getTreatment() {
        return treatment;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters treatment(CdmProductAssetRateTreatmentEnum treatment) {
        this.treatment = treatment;
        return this;
    }

}
