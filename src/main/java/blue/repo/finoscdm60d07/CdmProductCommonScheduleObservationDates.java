package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FYooiGp5NstVeJrTPaDL77uw9XPrE8hFTrPxDruKmLCh")
public class CdmProductCommonScheduleObservationDates {
    public static String blueId() {
        return "FYooiGp5NstVeJrTPaDL77uw9XPrE8hFTrPxDruKmLCh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/ObservationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/ObservationDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleObservationDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonScheduleObservationSchedule observationSchedule;

    private CdmProductCommonScheduleParametricDates parametricDates;

    private CdmBaseDatetimePeriodicDates periodicSchedule;

    public CdmProductCommonScheduleObservationSchedule getObservationSchedule() {
        return observationSchedule;
    }

    public CdmProductCommonScheduleObservationDates observationSchedule(CdmProductCommonScheduleObservationSchedule observationSchedule) {
        this.observationSchedule = observationSchedule;
        return this;
    }

    public CdmProductCommonScheduleParametricDates getParametricDates() {
        return parametricDates;
    }

    public CdmProductCommonScheduleObservationDates parametricDates(CdmProductCommonScheduleParametricDates parametricDates) {
        this.parametricDates = parametricDates;
        return this;
    }

    public CdmBaseDatetimePeriodicDates getPeriodicSchedule() {
        return periodicSchedule;
    }

    public CdmProductCommonScheduleObservationDates periodicSchedule(CdmBaseDatetimePeriodicDates periodicSchedule) {
        this.periodicSchedule = periodicSchedule;
        return this;
    }

}
