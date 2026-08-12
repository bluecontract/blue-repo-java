package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("hjVS7GrE9QqNFk61XTvTkP6ktQxzv96UUaGK74mg9YK")
public class CdmBaseDatetimeAveragingSchedule {
    public static String blueId() {
        return "hjVS7GrE9QqNFk61XTvTkP6ktQxzv96UUaGK74mg9YK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AveragingSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AveragingSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAveragingSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeCalculationPeriodFrequency averagingPeriodFrequency;

    private String endDate;

    private String startDate;

    public CdmBaseDatetimeCalculationPeriodFrequency getAveragingPeriodFrequency() {
        return averagingPeriodFrequency;
    }

    public CdmBaseDatetimeAveragingSchedule averagingPeriodFrequency(CdmBaseDatetimeCalculationPeriodFrequency averagingPeriodFrequency) {
        this.averagingPeriodFrequency = averagingPeriodFrequency;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public CdmBaseDatetimeAveragingSchedule endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CdmBaseDatetimeAveragingSchedule startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
