package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HXL6x5GboEmQeMmrmtmEQQdYkr271G2tDVBXpJxUZxmz")
public class CdmProductCommonScheduleAveragingPeriod {
    public static String blueId() {
        return "HXL6x5GboEmQeMmrmtmEQQdYkr271G2tDVBXpJxUZxmz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/AveragingPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/AveragingPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleAveragingPeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeDateTimeList averagingDateTimes;

    private CdmProductCommonScheduleAveragingObservationList averagingObservations;

    private CdmObservableEventFieldWithMetaMarketDisruptionEnum marketDisruption;

    private List<CdmBaseDatetimeAveragingSchedule> schedule;

    public CdmBaseDatetimeDateTimeList getAveragingDateTimes() {
        return averagingDateTimes;
    }

    public CdmProductCommonScheduleAveragingPeriod averagingDateTimes(CdmBaseDatetimeDateTimeList averagingDateTimes) {
        this.averagingDateTimes = averagingDateTimes;
        return this;
    }

    public CdmProductCommonScheduleAveragingObservationList getAveragingObservations() {
        return averagingObservations;
    }

    public CdmProductCommonScheduleAveragingPeriod averagingObservations(CdmProductCommonScheduleAveragingObservationList averagingObservations) {
        this.averagingObservations = averagingObservations;
        return this;
    }

    public CdmObservableEventFieldWithMetaMarketDisruptionEnum getMarketDisruption() {
        return marketDisruption;
    }

    public CdmProductCommonScheduleAveragingPeriod marketDisruption(CdmObservableEventFieldWithMetaMarketDisruptionEnum marketDisruption) {
        this.marketDisruption = marketDisruption;
        return this;
    }

    public List<CdmBaseDatetimeAveragingSchedule> getSchedule() {
        return schedule;
    }

    public CdmProductCommonScheduleAveragingPeriod schedule(List<CdmBaseDatetimeAveragingSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

}
