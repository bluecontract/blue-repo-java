package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H7AyDrVPPCaUmzzapmdTotr5oq24W23DYMjftpUeYMZA")
public class FloatingAmountCalculationDetails {
    public static String blueId() {
        return "H7AyDrVPPCaUmzzapmdTotr5oq24W23DYMjftpUeYMZA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingAmountCalculationDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingAmountCalculationDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingAmountCalculationDetails.json";
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

    private Double appliedRate;

    private Double calculatedAmount;

    private CalculationPeriodBase calculationPeriod;

    private Money calculationPeriodNotionalAmount;

    private FloatingRateSettingDetails floatingRate;

    private FloatingRateProcessingDetails processingDetails;

    private Double spreadExclusiveCalculatedAMount;

    private Double yearFraction;

    public String getNamespace() {
        return namespace;
    }

    public FloatingAmountCalculationDetails namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAppliedRate() {
        return appliedRate;
    }

    public FloatingAmountCalculationDetails appliedRate(Double appliedRate) {
        this.appliedRate = appliedRate;
        return this;
    }

    public Double getCalculatedAmount() {
        return calculatedAmount;
    }

    public FloatingAmountCalculationDetails calculatedAmount(Double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
        return this;
    }

    public CalculationPeriodBase getCalculationPeriod() {
        return calculationPeriod;
    }

    public FloatingAmountCalculationDetails calculationPeriod(CalculationPeriodBase calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
        return this;
    }

    public Money getCalculationPeriodNotionalAmount() {
        return calculationPeriodNotionalAmount;
    }

    public FloatingAmountCalculationDetails calculationPeriodNotionalAmount(Money calculationPeriodNotionalAmount) {
        this.calculationPeriodNotionalAmount = calculationPeriodNotionalAmount;
        return this;
    }

    public FloatingRateSettingDetails getFloatingRate() {
        return floatingRate;
    }

    public FloatingAmountCalculationDetails floatingRate(FloatingRateSettingDetails floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public FloatingRateProcessingDetails getProcessingDetails() {
        return processingDetails;
    }

    public FloatingAmountCalculationDetails processingDetails(FloatingRateProcessingDetails processingDetails) {
        this.processingDetails = processingDetails;
        return this;
    }

    public Double getSpreadExclusiveCalculatedAMount() {
        return spreadExclusiveCalculatedAMount;
    }

    public FloatingAmountCalculationDetails spreadExclusiveCalculatedAMount(Double spreadExclusiveCalculatedAMount) {
        this.spreadExclusiveCalculatedAMount = spreadExclusiveCalculatedAMount;
        return this;
    }

    public Double getYearFraction() {
        return yearFraction;
    }

    public FloatingAmountCalculationDetails yearFraction(Double yearFraction) {
        this.yearFraction = yearFraction;
        return this;
    }

}
