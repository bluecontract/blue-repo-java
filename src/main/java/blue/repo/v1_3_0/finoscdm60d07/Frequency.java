package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("9oAFpaZmZoU5msdeRmJqmKkHYzAK5TUS4Y1RBFzqrPFn")
public class Frequency {
    public static String blueId() {
        return "9oAFpaZmZoU5msdeRmJqmKkHYzAK5TUS4Y1RBFzqrPFn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Frequency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Frequency";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Frequency.json";
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

    public String getNamespace() {
        return namespace;
    }

    public Frequency namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PeriodExtendedEnum getPeriod() {
        return period;
    }

    public Frequency period(PeriodExtendedEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public Frequency periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
