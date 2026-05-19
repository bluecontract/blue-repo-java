package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3HzKrzcATqi7WM6RuGTermB2R7xuyc17RMpSVgx1MLq5")
public class TriggerEvent {
    public static String blueId() {
        return "3HzKrzcATqi7WM6RuGTermB2R7xuyc17RMpSVgx1MLq5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TriggerEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TriggerEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TriggerEvent.json";
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

    private FeaturePayment featurePayment;

    private List<AveragingSchedule> schedule;

    private Trigger trigger;

    private DateList triggerDates;

    public String getNamespace() {
        return namespace;
    }

    public TriggerEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FeaturePayment getFeaturePayment() {
        return featurePayment;
    }

    public TriggerEvent featurePayment(FeaturePayment featurePayment) {
        this.featurePayment = featurePayment;
        return this;
    }

    public List<AveragingSchedule> getSchedule() {
        return schedule;
    }

    public TriggerEvent schedule(List<AveragingSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public TriggerEvent trigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public DateList getTriggerDates() {
        return triggerDates;
    }

    public TriggerEvent triggerDates(DateList triggerDates) {
        this.triggerDates = triggerDates;
        return this;
    }

}
