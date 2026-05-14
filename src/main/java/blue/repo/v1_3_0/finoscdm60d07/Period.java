package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("DvFZ2x4FbWKKUWDZYbURfz4u6KAciqiKaaB4rHHcgyEL")
public class Period {
    public static String blueId() {
        return "DvFZ2x4FbWKKUWDZYbURfz4u6KAciqiKaaB4rHHcgyEL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Period";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Period";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Period.json";
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

    private PeriodEnum period;

    private BigInteger periodMultiplier;

    public String getNamespace() {
        return namespace;
    }

    public Period namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PeriodEnum getPeriod() {
        return period;
    }

    public Period period(PeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public Period periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
