package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AHERRTvoobMfRp6PiLhPrTZP4nTxqRBzjnoRJt5nETTP")
public class FloatingRate {
    public static String blueId() {
        return "AHERRTvoobMfRp6PiLhPrTZP4nTxqRBzjnoRJt5nETTP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRate";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRate.json";
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

    private StrikeSchedule capRateSchedule;

    private FallbackRateParameters fallbackRate;

    private RateSchedule floatingRateMultiplierSchedule;

    private StrikeSchedule floorRateSchedule;

    private ReferenceWithMetaInterestRateIndex rateOption;

    private RateTreatmentEnum rateTreatment;

    private SpreadSchedule spreadSchedule;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FloatingRateCalculationParameters getCalculationParameters() {
        return calculationParameters;
    }

    public FloatingRate calculationParameters(FloatingRateCalculationParameters calculationParameters) {
        this.calculationParameters = calculationParameters;
        return this;
    }

    public StrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public FloatingRate capRateSchedule(StrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public FallbackRateParameters getFallbackRate() {
        return fallbackRate;
    }

    public FloatingRate fallbackRate(FallbackRateParameters fallbackRate) {
        this.fallbackRate = fallbackRate;
        return this;
    }

    public RateSchedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    public FloatingRate floatingRateMultiplierSchedule(RateSchedule floatingRateMultiplierSchedule) {
        this.floatingRateMultiplierSchedule = floatingRateMultiplierSchedule;
        return this;
    }

    public StrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public FloatingRate floorRateSchedule(StrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public ReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public FloatingRate rateOption(ReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public RateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    public FloatingRate rateTreatment(RateTreatmentEnum rateTreatment) {
        this.rateTreatment = rateTreatment;
        return this;
    }

    public SpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public FloatingRate spreadSchedule(SpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
