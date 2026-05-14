package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6F4yhdTjPNVipy2oGnAJSTiCQouTuSdmJkZZyrPZPCuM")
public class FixedAmountCalculationDetails {
    public static String blueId() {
        return "6F4yhdTjPNVipy2oGnAJSTiCQouTuSdmJkZZyrPZPCuM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FixedAmountCalculationDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FixedAmountCalculationDetails";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FixedAmountCalculationDetails.json";
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

    private Double calculatedAmount;

    private CalculationPeriodBase calculationPeriod;

    private Money calculationPeriodNotionalAmount;

    private Double fixedRate;

    private Double yearFraction;

    public String getNamespace() {
        return namespace;
    }

    public FixedAmountCalculationDetails namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getCalculatedAmount() {
        return calculatedAmount;
    }

    public FixedAmountCalculationDetails calculatedAmount(Double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
        return this;
    }

    public CalculationPeriodBase getCalculationPeriod() {
        return calculationPeriod;
    }

    public FixedAmountCalculationDetails calculationPeriod(CalculationPeriodBase calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
        return this;
    }

    public Money getCalculationPeriodNotionalAmount() {
        return calculationPeriodNotionalAmount;
    }

    public FixedAmountCalculationDetails calculationPeriodNotionalAmount(Money calculationPeriodNotionalAmount) {
        this.calculationPeriodNotionalAmount = calculationPeriodNotionalAmount;
        return this;
    }

    public Double getFixedRate() {
        return fixedRate;
    }

    public FixedAmountCalculationDetails fixedRate(Double fixedRate) {
        this.fixedRate = fixedRate;
        return this;
    }

    public Double getYearFraction() {
        return yearFraction;
    }

    public FixedAmountCalculationDetails yearFraction(Double yearFraction) {
        this.yearFraction = yearFraction;
        return this;
    }

}
