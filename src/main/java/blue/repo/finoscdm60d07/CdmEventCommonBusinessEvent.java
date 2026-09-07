package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GV2XfesJywwHEqbbCbgzMGBau7qYzEGJphTo2po7cQt2")
public class CdmEventCommonBusinessEvent {
    public static String blueId() {
        return "GV2XfesJywwHEqbbCbgzMGBau7qYzEGJphTo2po7cQt2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/BusinessEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/BusinessEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonBusinessEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventCommonTradeState> after;

    private CdmEventCommonCorporateActionTypeEnum corporateActionIntent;

    private String effectiveDate;

    private String eventDate;

    private String eventQualifier;

    private List<CdmEventCommonInstruction> instruction;

    private CdmEventCommonEventIntentEnum intent;

    private CdmBaseStaticdataIdentifierIdentifiedList packageInformation;

    public List<CdmEventCommonTradeState> getAfter() {
        return after;
    }

    public CdmEventCommonBusinessEvent after(List<CdmEventCommonTradeState> after) {
        this.after = after;
        return this;
    }

    public CdmEventCommonCorporateActionTypeEnum getCorporateActionIntent() {
        return corporateActionIntent;
    }

    public CdmEventCommonBusinessEvent corporateActionIntent(CdmEventCommonCorporateActionTypeEnum corporateActionIntent) {
        this.corporateActionIntent = corporateActionIntent;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmEventCommonBusinessEvent effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getEventDate() {
        return eventDate;
    }

    public CdmEventCommonBusinessEvent eventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public String getEventQualifier() {
        return eventQualifier;
    }

    public CdmEventCommonBusinessEvent eventQualifier(String eventQualifier) {
        this.eventQualifier = eventQualifier;
        return this;
    }

    public List<CdmEventCommonInstruction> getInstruction() {
        return instruction;
    }

    public CdmEventCommonBusinessEvent instruction(List<CdmEventCommonInstruction> instruction) {
        this.instruction = instruction;
        return this;
    }

    public CdmEventCommonEventIntentEnum getIntent() {
        return intent;
    }

    public CdmEventCommonBusinessEvent intent(CdmEventCommonEventIntentEnum intent) {
        this.intent = intent;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifiedList getPackageInformation() {
        return packageInformation;
    }

    public CdmEventCommonBusinessEvent packageInformation(CdmBaseStaticdataIdentifierIdentifiedList packageInformation) {
        this.packageInformation = packageInformation;
        return this;
    }

}
