package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DRgYSroEbLSgrL4xb9TBzrZpbP9Yc1UmKkqiN9KtT7J8")
public class FloatingRateProcessingParameters {
    public static String blueId() {
        return "DRgYSroEbLSgrL4xb9TBzrZpbP9Yc1UmKkqiN9KtT7J8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateProcessingParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateProcessingParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingRateProcessingParameters.json";
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

    private Double capRate;

    private Double floorRate;

    private Price initialRate;

    private Double multiplier;

    private NegativeInterestRateTreatmentEnum negativeTreatment;

    private Rounding rounding;

    private Double spread;

    private RateTreatmentEnum treatment;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateProcessingParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getCapRate() {
        return capRate;
    }

    public FloatingRateProcessingParameters capRate(Double capRate) {
        this.capRate = capRate;
        return this;
    }

    public Double getFloorRate() {
        return floorRate;
    }

    public FloatingRateProcessingParameters floorRate(Double floorRate) {
        this.floorRate = floorRate;
        return this;
    }

    public Price getInitialRate() {
        return initialRate;
    }

    public FloatingRateProcessingParameters initialRate(Price initialRate) {
        this.initialRate = initialRate;
        return this;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public FloatingRateProcessingParameters multiplier(Double multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public NegativeInterestRateTreatmentEnum getNegativeTreatment() {
        return negativeTreatment;
    }

    public FloatingRateProcessingParameters negativeTreatment(NegativeInterestRateTreatmentEnum negativeTreatment) {
        this.negativeTreatment = negativeTreatment;
        return this;
    }

    public Rounding getRounding() {
        return rounding;
    }

    public FloatingRateProcessingParameters rounding(Rounding rounding) {
        this.rounding = rounding;
        return this;
    }

    public Double getSpread() {
        return spread;
    }

    public FloatingRateProcessingParameters spread(Double spread) {
        this.spread = spread;
        return this;
    }

    public RateTreatmentEnum getTreatment() {
        return treatment;
    }

    public FloatingRateProcessingParameters treatment(RateTreatmentEnum treatment) {
        this.treatment = treatment;
        return this;
    }

}
