package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("HtjNf3aJBBJnxx21C9ZjvmgVj3CJyaSF1wwWaT6fJciq")
public class CdmBaseDatetimeOffset {
    public static String blueId() {
        return "HtjNf3aJBBJnxx21C9ZjvmgVj3CJyaSF1wwWaT6fJciq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/Offset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/Offset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeOffset.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeDayTypeEnum dayType;

    private CdmBaseDatetimePeriodEnum period;

    private BigInteger periodMultiplier;

    public CdmBaseDatetimeDayTypeEnum getDayType() {
        return dayType;
    }

    public CdmBaseDatetimeOffset dayType(CdmBaseDatetimeDayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public CdmBaseDatetimePeriodEnum getPeriod() {
        return period;
    }

    public CdmBaseDatetimeOffset period(CdmBaseDatetimePeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmBaseDatetimeOffset periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
