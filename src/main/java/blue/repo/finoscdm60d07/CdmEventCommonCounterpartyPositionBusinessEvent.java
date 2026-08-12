package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6crPYSSUWEcDZ3RkdT8acaFQUW3W3Ly2kdiaX8dpynAw")
public class CdmEventCommonCounterpartyPositionBusinessEvent {
    public static String blueId() {
        return "6crPYSSUWEcDZ3RkdT8acaFQUW3W3Ly2kdiaX8dpynAw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CounterpartyPositionBusinessEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CounterpartyPositionBusinessEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCounterpartyPositionBusinessEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventCommonCounterpartyPositionState> after;

    private CdmEventCommonCorporateActionTypeEnum corporateActionIntent;

    private String effectiveDate;

    private String eventDate;

    private CdmEventCommonPositionEventIntentEnum intent;

    private CdmBaseStaticdataIdentifierIdentifiedList packageInformation;

    public List<CdmEventCommonCounterpartyPositionState> getAfter() {
        return after;
    }

    public CdmEventCommonCounterpartyPositionBusinessEvent after(List<CdmEventCommonCounterpartyPositionState> after) {
        this.after = after;
        return this;
    }

    public CdmEventCommonCorporateActionTypeEnum getCorporateActionIntent() {
        return corporateActionIntent;
    }

    public CdmEventCommonCounterpartyPositionBusinessEvent corporateActionIntent(CdmEventCommonCorporateActionTypeEnum corporateActionIntent) {
        this.corporateActionIntent = corporateActionIntent;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmEventCommonCounterpartyPositionBusinessEvent effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getEventDate() {
        return eventDate;
    }

    public CdmEventCommonCounterpartyPositionBusinessEvent eventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public CdmEventCommonPositionEventIntentEnum getIntent() {
        return intent;
    }

    public CdmEventCommonCounterpartyPositionBusinessEvent intent(CdmEventCommonPositionEventIntentEnum intent) {
        this.intent = intent;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifiedList getPackageInformation() {
        return packageInformation;
    }

    public CdmEventCommonCounterpartyPositionBusinessEvent packageInformation(CdmBaseStaticdataIdentifierIdentifiedList packageInformation) {
        this.packageInformation = packageInformation;
        return this;
    }

}
