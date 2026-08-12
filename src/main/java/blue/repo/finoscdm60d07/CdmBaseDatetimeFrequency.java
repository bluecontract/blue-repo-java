package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("2DcHFUdmvnUmoKpU2Ams5asKp2FjTWgEDMMrEiZUL3Bi")
public class CdmBaseDatetimeFrequency {
    public static String blueId() {
        return "2DcHFUdmvnUmoKpU2Ams5asKp2FjTWgEDMMrEiZUL3Bi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/Frequency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/Frequency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeFrequency.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimePeriodExtendedEnum period;

    private BigInteger periodMultiplier;

    public CdmBaseDatetimePeriodExtendedEnum getPeriod() {
        return period;
    }

    public CdmBaseDatetimeFrequency period(CdmBaseDatetimePeriodExtendedEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmBaseDatetimeFrequency periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
