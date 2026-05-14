package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("Cxo6m5oV3MiBZ4FSXzuCV4L8GT1cYBeYRneyLmTdSSnc")
public class CalculationPeriodFrequency {
    public static String blueId() {
        return "Cxo6m5oV3MiBZ4FSXzuCV4L8GT1cYBeYRneyLmTdSSnc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationPeriodFrequency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationPeriodFrequency";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CalculationPeriodFrequency.json";
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

    private Boolean balanceOfFirstPeriod;

    private PeriodExtendedEnum period;

    private BigInteger periodMultiplier;

    private RollConventionEnum rollConvention;

    public String getNamespace() {
        return namespace;
    }

    public CalculationPeriodFrequency namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getBalanceOfFirstPeriod() {
        return balanceOfFirstPeriod;
    }

    public CalculationPeriodFrequency balanceOfFirstPeriod(Boolean balanceOfFirstPeriod) {
        this.balanceOfFirstPeriod = balanceOfFirstPeriod;
        return this;
    }

    public PeriodExtendedEnum getPeriod() {
        return period;
    }

    public CalculationPeriodFrequency period(PeriodExtendedEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CalculationPeriodFrequency periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

    public RollConventionEnum getRollConvention() {
        return rollConvention;
    }

    public CalculationPeriodFrequency rollConvention(RollConventionEnum rollConvention) {
        this.rollConvention = rollConvention;
        return this;
    }

}
