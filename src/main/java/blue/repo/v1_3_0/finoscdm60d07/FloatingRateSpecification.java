package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2x719RynUeGN6Qyehn7EES27qiYeBsQN6P9gc8CMiCXC")
public class FloatingRateSpecification {
    public static String blueId() {
        return "2x719RynUeGN6Qyehn7EES27qiYeBsQN6P9gc8CMiCXC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateSpecification.json";
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

    private AveragingWeightingMethodEnum averagingMethod;

    private FloatingRateCalculationParameters calculationParameters;

    private StrikeSchedule capRateSchedule;

    private FallbackRateParameters fallbackRate;

    private Rounding finalRateRounding;

    private RateSchedule floatingRateMultiplierSchedule;

    private StrikeSchedule floorRateSchedule;

    private Price initialRate;

    private NegativeInterestRateTreatmentEnum negativeInterestRateTreatment;

    private ReferenceWithMetaInterestRateIndex rateOption;

    private RateTreatmentEnum rateTreatment;

    private SpreadSchedule spreadSchedule;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateSpecification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingWeightingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    public FloatingRateSpecification averagingMethod(AveragingWeightingMethodEnum averagingMethod) {
        this.averagingMethod = averagingMethod;
        return this;
    }

    public FloatingRateCalculationParameters getCalculationParameters() {
        return calculationParameters;
    }

    public FloatingRateSpecification calculationParameters(FloatingRateCalculationParameters calculationParameters) {
        this.calculationParameters = calculationParameters;
        return this;
    }

    public StrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public FloatingRateSpecification capRateSchedule(StrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public FallbackRateParameters getFallbackRate() {
        return fallbackRate;
    }

    public FloatingRateSpecification fallbackRate(FallbackRateParameters fallbackRate) {
        this.fallbackRate = fallbackRate;
        return this;
    }

    public Rounding getFinalRateRounding() {
        return finalRateRounding;
    }

    public FloatingRateSpecification finalRateRounding(Rounding finalRateRounding) {
        this.finalRateRounding = finalRateRounding;
        return this;
    }

    public RateSchedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    public FloatingRateSpecification floatingRateMultiplierSchedule(RateSchedule floatingRateMultiplierSchedule) {
        this.floatingRateMultiplierSchedule = floatingRateMultiplierSchedule;
        return this;
    }

    public StrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public FloatingRateSpecification floorRateSchedule(StrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public Price getInitialRate() {
        return initialRate;
    }

    public FloatingRateSpecification initialRate(Price initialRate) {
        this.initialRate = initialRate;
        return this;
    }

    public NegativeInterestRateTreatmentEnum getNegativeInterestRateTreatment() {
        return negativeInterestRateTreatment;
    }

    public FloatingRateSpecification negativeInterestRateTreatment(NegativeInterestRateTreatmentEnum negativeInterestRateTreatment) {
        this.negativeInterestRateTreatment = negativeInterestRateTreatment;
        return this;
    }

    public ReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public FloatingRateSpecification rateOption(ReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public RateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    public FloatingRateSpecification rateTreatment(RateTreatmentEnum rateTreatment) {
        this.rateTreatment = rateTreatment;
        return this;
    }

    public SpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public FloatingRateSpecification spreadSchedule(SpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
