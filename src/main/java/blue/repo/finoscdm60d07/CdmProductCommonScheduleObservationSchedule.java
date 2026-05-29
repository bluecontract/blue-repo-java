package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9u9p5Su6VwfpvLMNyxWJQBwM6RcDB48Qg2uBsbZWycbT")
public class CdmProductCommonScheduleObservationSchedule {
    public static String blueId() {
        return "9u9p5Su6VwfpvLMNyxWJQBwM6RcDB48Qg2uBsbZWycbT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/ObservationSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/ObservationSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleObservationSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessDayAdjustments dateAdjustments;

    private List<CdmProductCommonScheduleObservationDate> observationDate;

    public CdmBaseDatetimeBusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public CdmProductCommonScheduleObservationSchedule dateAdjustments(CdmBaseDatetimeBusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public List<CdmProductCommonScheduleObservationDate> getObservationDate() {
        return observationDate;
    }

    public CdmProductCommonScheduleObservationSchedule observationDate(List<CdmProductCommonScheduleObservationDate> observationDate) {
        this.observationDate = observationDate;
        return this;
    }

}
