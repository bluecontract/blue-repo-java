package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Fo4seU9ko8W45L3brhTdyVJ17exQWLx5dDWUDe7oZS8t")
public class Trigger {
    public static String blueId() {
        return "Fo4seU9ko8W45L3brhTdyVJ17exQWLx5dDWUDe7oZS8t";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Trigger";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Trigger";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Trigger.json";
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

    private CreditEvents creditEvents;

    private ReferenceWithMetaCreditEvents creditEventsReference;

    private List<PriceSchedule> level;

    private TriggerTimeTypeEnum triggerTimeType;

    private TriggerTypeEnum triggerType;

    public String getNamespace() {
        return namespace;
    }

    public Trigger namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CreditEvents getCreditEvents() {
        return creditEvents;
    }

    public Trigger creditEvents(CreditEvents creditEvents) {
        this.creditEvents = creditEvents;
        return this;
    }

    public ReferenceWithMetaCreditEvents getCreditEventsReference() {
        return creditEventsReference;
    }

    public Trigger creditEventsReference(ReferenceWithMetaCreditEvents creditEventsReference) {
        this.creditEventsReference = creditEventsReference;
        return this;
    }

    public List<PriceSchedule> getLevel() {
        return level;
    }

    public Trigger level(List<PriceSchedule> level) {
        this.level = level;
        return this;
    }

    public TriggerTimeTypeEnum getTriggerTimeType() {
        return triggerTimeType;
    }

    public Trigger triggerTimeType(TriggerTimeTypeEnum triggerTimeType) {
        this.triggerTimeType = triggerTimeType;
        return this;
    }

    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public Trigger triggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

}
