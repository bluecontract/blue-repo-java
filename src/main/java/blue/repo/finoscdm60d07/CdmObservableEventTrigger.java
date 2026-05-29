package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EtRtJbAYawm4BahJ614Gb2M2Tet6P158rBXpLguQyhY8")
public class CdmObservableEventTrigger {
    public static String blueId() {
        return "EtRtJbAYawm4BahJ614Gb2M2Tet6P158rBXpLguQyhY8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/Trigger";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/Trigger";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventTrigger.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableEventCreditEvents creditEvents;

    private CdmObservableEventMetafieldsReferenceWithMetaCreditEvents creditEventsReference;

    private List<CdmObservableAssetPriceSchedule> level;

    private CdmObservableEventTriggerTimeTypeEnum triggerTimeType;

    private CdmObservableEventTriggerTypeEnum triggerType;

    public CdmObservableEventCreditEvents getCreditEvents() {
        return creditEvents;
    }

    public CdmObservableEventTrigger creditEvents(CdmObservableEventCreditEvents creditEvents) {
        this.creditEvents = creditEvents;
        return this;
    }

    public CdmObservableEventMetafieldsReferenceWithMetaCreditEvents getCreditEventsReference() {
        return creditEventsReference;
    }

    public CdmObservableEventTrigger creditEventsReference(CdmObservableEventMetafieldsReferenceWithMetaCreditEvents creditEventsReference) {
        this.creditEventsReference = creditEventsReference;
        return this;
    }

    public List<CdmObservableAssetPriceSchedule> getLevel() {
        return level;
    }

    public CdmObservableEventTrigger level(List<CdmObservableAssetPriceSchedule> level) {
        this.level = level;
        return this;
    }

    public CdmObservableEventTriggerTimeTypeEnum getTriggerTimeType() {
        return triggerTimeType;
    }

    public CdmObservableEventTrigger triggerTimeType(CdmObservableEventTriggerTimeTypeEnum triggerTimeType) {
        this.triggerTimeType = triggerTimeType;
        return this;
    }

    public CdmObservableEventTriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public CdmObservableEventTrigger triggerType(CdmObservableEventTriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

}
