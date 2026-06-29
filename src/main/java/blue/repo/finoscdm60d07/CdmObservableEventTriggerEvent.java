package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GT5JdpPhpfWRiqpWewnjoM2tbwvGnNZDGUV3MrHoQ3pC")
public class CdmObservableEventTriggerEvent {
    public static String blueId() {
        return "GT5JdpPhpfWRiqpWewnjoM2tbwvGnNZDGUV3MrHoQ3pC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/TriggerEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/TriggerEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventTriggerEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableEventFeaturePayment featurePayment;

    private List<CdmBaseDatetimeAveragingSchedule> schedule;

    private CdmObservableEventTrigger trigger;

    private CdmBaseDatetimeDateList triggerDates;

    public CdmObservableEventFeaturePayment getFeaturePayment() {
        return featurePayment;
    }

    public CdmObservableEventTriggerEvent featurePayment(CdmObservableEventFeaturePayment featurePayment) {
        this.featurePayment = featurePayment;
        return this;
    }

    public List<CdmBaseDatetimeAveragingSchedule> getSchedule() {
        return schedule;
    }

    public CdmObservableEventTriggerEvent schedule(List<CdmBaseDatetimeAveragingSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    public CdmObservableEventTrigger getTrigger() {
        return trigger;
    }

    public CdmObservableEventTriggerEvent trigger(CdmObservableEventTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public CdmBaseDatetimeDateList getTriggerDates() {
        return triggerDates;
    }

    public CdmObservableEventTriggerEvent triggerDates(CdmBaseDatetimeDateList triggerDates) {
        this.triggerDates = triggerDates;
        return this;
    }

}
