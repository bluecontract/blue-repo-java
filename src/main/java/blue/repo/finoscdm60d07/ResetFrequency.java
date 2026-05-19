package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("7Yq1LQrAG6V8wq2Zk2QFbw87Vmox8Z6DS85Ckk1AyCdo")
public class ResetFrequency {
    public static String blueId() {
        return "7Yq1LQrAG6V8wq2Zk2QFbw87Vmox8Z6DS85Ckk1AyCdo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ResetFrequency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ResetFrequency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ResetFrequency.json";
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

    private PeriodExtendedEnum period;

    private BigInteger periodMultiplier;

    private WeeklyRollConventionEnum weeklyRollConvention;

    public String getNamespace() {
        return namespace;
    }

    public ResetFrequency namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PeriodExtendedEnum getPeriod() {
        return period;
    }

    public ResetFrequency period(PeriodExtendedEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public ResetFrequency periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

    public WeeklyRollConventionEnum getWeeklyRollConvention() {
        return weeklyRollConvention;
    }

    public ResetFrequency weeklyRollConvention(WeeklyRollConventionEnum weeklyRollConvention) {
        this.weeklyRollConvention = weeklyRollConvention;
        return this;
    }

}
