package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("HZisEChr3jH3w3sD3cYqmib79M4YmwuJqeeKGGCpCyMz")
public class CdmBaseDatetimeCalculationPeriodFrequency {
    public static String blueId() {
        return "HZisEChr3jH3w3sD3cYqmib79M4YmwuJqeeKGGCpCyMz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/CalculationPeriodFrequency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/CalculationPeriodFrequency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeCalculationPeriodFrequency.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean balanceOfFirstPeriod;

    private CdmBaseDatetimePeriodExtendedEnum period;

    private BigInteger periodMultiplier;

    private CdmBaseDatetimeRollConventionEnum rollConvention;

    public Boolean getBalanceOfFirstPeriod() {
        return balanceOfFirstPeriod;
    }

    public CdmBaseDatetimeCalculationPeriodFrequency balanceOfFirstPeriod(Boolean balanceOfFirstPeriod) {
        this.balanceOfFirstPeriod = balanceOfFirstPeriod;
        return this;
    }

    public CdmBaseDatetimePeriodExtendedEnum getPeriod() {
        return period;
    }

    public CdmBaseDatetimeCalculationPeriodFrequency period(CdmBaseDatetimePeriodExtendedEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmBaseDatetimeCalculationPeriodFrequency periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

    public CdmBaseDatetimeRollConventionEnum getRollConvention() {
        return rollConvention;
    }

    public CdmBaseDatetimeCalculationPeriodFrequency rollConvention(CdmBaseDatetimeRollConventionEnum rollConvention) {
        this.rollConvention = rollConvention;
        return this;
    }

}
