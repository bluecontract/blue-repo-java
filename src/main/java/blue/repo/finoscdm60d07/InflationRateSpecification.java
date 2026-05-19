package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CxtEzzESyTL74AXXw2zojUfYFDUNXjLU8ZHXzE2fVTAn")
public class InflationRateSpecification {
    public static String blueId() {
        return "CxtEzzESyTL74AXXw2zojUfYFDUNXjLU8ZHXzE2fVTAn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InflationRateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InflationRateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InflationRateSpecification.json";
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

    private InflationCalculationMethodEnum calculationMethod;

    private FloatingRateCalculationParameters calculationParameters;

    private InflationCalculationStyleEnum calculationStyle;

    private StrikeSchedule capRateSchedule;

    private Boolean fallbackBondApplicable;

    private FallbackRateParameters fallbackRate;

    private FinalPrincipalExchangeCalculationEnum finalPrincipalExchangeCalculation;

    private Rounding finalRateRounding;

    private RateSchedule floatingRateMultiplierSchedule;

    private StrikeSchedule floorRateSchedule;

    private FieldWithMetaString indexSource;

    private Offset inflationLag;

    private Double initialIndexLevel;

    private Price initialRate;

    private FieldWithMetaInterpolationMethodEnum interpolationMethod;

    private FieldWithMetaString mainPublication;

    private NegativeInterestRateTreatmentEnum negativeInterestRateTreatment;

    private ReferenceWithMetaInterestRateIndex rateOption;

    private RateTreatmentEnum rateTreatment;

    private SpreadSchedule spreadSchedule;

    public String getNamespace() {
        return namespace;
    }

    public InflationRateSpecification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingWeightingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    public InflationRateSpecification averagingMethod(AveragingWeightingMethodEnum averagingMethod) {
        this.averagingMethod = averagingMethod;
        return this;
    }

    public InflationCalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    public InflationRateSpecification calculationMethod(InflationCalculationMethodEnum calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    public FloatingRateCalculationParameters getCalculationParameters() {
        return calculationParameters;
    }

    public InflationRateSpecification calculationParameters(FloatingRateCalculationParameters calculationParameters) {
        this.calculationParameters = calculationParameters;
        return this;
    }

    public InflationCalculationStyleEnum getCalculationStyle() {
        return calculationStyle;
    }

    public InflationRateSpecification calculationStyle(InflationCalculationStyleEnum calculationStyle) {
        this.calculationStyle = calculationStyle;
        return this;
    }

    public StrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public InflationRateSpecification capRateSchedule(StrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public Boolean getFallbackBondApplicable() {
        return fallbackBondApplicable;
    }

    public InflationRateSpecification fallbackBondApplicable(Boolean fallbackBondApplicable) {
        this.fallbackBondApplicable = fallbackBondApplicable;
        return this;
    }

    public FallbackRateParameters getFallbackRate() {
        return fallbackRate;
    }

    public InflationRateSpecification fallbackRate(FallbackRateParameters fallbackRate) {
        this.fallbackRate = fallbackRate;
        return this;
    }

    public FinalPrincipalExchangeCalculationEnum getFinalPrincipalExchangeCalculation() {
        return finalPrincipalExchangeCalculation;
    }

    public InflationRateSpecification finalPrincipalExchangeCalculation(FinalPrincipalExchangeCalculationEnum finalPrincipalExchangeCalculation) {
        this.finalPrincipalExchangeCalculation = finalPrincipalExchangeCalculation;
        return this;
    }

    public Rounding getFinalRateRounding() {
        return finalRateRounding;
    }

    public InflationRateSpecification finalRateRounding(Rounding finalRateRounding) {
        this.finalRateRounding = finalRateRounding;
        return this;
    }

    public RateSchedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    public InflationRateSpecification floatingRateMultiplierSchedule(RateSchedule floatingRateMultiplierSchedule) {
        this.floatingRateMultiplierSchedule = floatingRateMultiplierSchedule;
        return this;
    }

    public StrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public InflationRateSpecification floorRateSchedule(StrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public FieldWithMetaString getIndexSource() {
        return indexSource;
    }

    public InflationRateSpecification indexSource(FieldWithMetaString indexSource) {
        this.indexSource = indexSource;
        return this;
    }

    public Offset getInflationLag() {
        return inflationLag;
    }

    public InflationRateSpecification inflationLag(Offset inflationLag) {
        this.inflationLag = inflationLag;
        return this;
    }

    public Double getInitialIndexLevel() {
        return initialIndexLevel;
    }

    public InflationRateSpecification initialIndexLevel(Double initialIndexLevel) {
        this.initialIndexLevel = initialIndexLevel;
        return this;
    }

    public Price getInitialRate() {
        return initialRate;
    }

    public InflationRateSpecification initialRate(Price initialRate) {
        this.initialRate = initialRate;
        return this;
    }

    public FieldWithMetaInterpolationMethodEnum getInterpolationMethod() {
        return interpolationMethod;
    }

    public InflationRateSpecification interpolationMethod(FieldWithMetaInterpolationMethodEnum interpolationMethod) {
        this.interpolationMethod = interpolationMethod;
        return this;
    }

    public FieldWithMetaString getMainPublication() {
        return mainPublication;
    }

    public InflationRateSpecification mainPublication(FieldWithMetaString mainPublication) {
        this.mainPublication = mainPublication;
        return this;
    }

    public NegativeInterestRateTreatmentEnum getNegativeInterestRateTreatment() {
        return negativeInterestRateTreatment;
    }

    public InflationRateSpecification negativeInterestRateTreatment(NegativeInterestRateTreatmentEnum negativeInterestRateTreatment) {
        this.negativeInterestRateTreatment = negativeInterestRateTreatment;
        return this;
    }

    public ReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public InflationRateSpecification rateOption(ReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public RateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    public InflationRateSpecification rateTreatment(RateTreatmentEnum rateTreatment) {
        this.rateTreatment = rateTreatment;
        return this;
    }

    public SpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public InflationRateSpecification spreadSchedule(SpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
