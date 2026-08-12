package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("2eRPMxKZ8upfUGCDqNY6xXko7GTGvozudp1i9wznQmXL")
public class CdmBaseDatetimePeriod {
    public static String blueId() {
        return "2eRPMxKZ8upfUGCDqNY6xXko7GTGvozudp1i9wznQmXL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/Period";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/Period";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimePeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimePeriodEnum period;

    private BigInteger periodMultiplier;

    public CdmBaseDatetimePeriodEnum getPeriod() {
        return period;
    }

    public CdmBaseDatetimePeriod period(CdmBaseDatetimePeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmBaseDatetimePeriod periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
