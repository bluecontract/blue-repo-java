package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("3YofSJJpqeirp9CQ6fcF1B2sxmu6NtLpMguqwgW4gire")
public class Offset {
    public static String blueId() {
        return "3YofSJJpqeirp9CQ6fcF1B2sxmu6NtLpMguqwgW4gire";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Offset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Offset";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Offset.json";
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

    private DayTypeEnum dayType;

    private PeriodEnum period;

    private BigInteger periodMultiplier;

    public String getNamespace() {
        return namespace;
    }

    public Offset namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DayTypeEnum getDayType() {
        return dayType;
    }

    public Offset dayType(DayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public PeriodEnum getPeriod() {
        return period;
    }

    public Offset period(PeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public Offset periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
