package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("H3NZ79jALEpJ1Sn5XzQiyMaxY3sdvd41ktoJSwaAy8j9")
public class CdmProductCommonScheduleResetFrequency {
    public static String blueId() {
        return "H3NZ79jALEpJ1Sn5XzQiyMaxY3sdvd41ktoJSwaAy8j9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/ResetFrequency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/ResetFrequency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleResetFrequency.json";
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

    private CdmProductCommonScheduleWeeklyRollConventionEnum weeklyRollConvention;

    public CdmBaseDatetimePeriodExtendedEnum getPeriod() {
        return period;
    }

    public CdmProductCommonScheduleResetFrequency period(CdmBaseDatetimePeriodExtendedEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmProductCommonScheduleResetFrequency periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

    public CdmProductCommonScheduleWeeklyRollConventionEnum getWeeklyRollConvention() {
        return weeklyRollConvention;
    }

    public CdmProductCommonScheduleResetFrequency weeklyRollConvention(CdmProductCommonScheduleWeeklyRollConventionEnum weeklyRollConvention) {
        this.weeklyRollConvention = weeklyRollConvention;
        return this;
    }

}
