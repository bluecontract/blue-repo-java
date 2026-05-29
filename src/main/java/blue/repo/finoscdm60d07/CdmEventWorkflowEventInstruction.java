package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8vLhPScyFntH9TUfMxe1WvBGi31UB5J4AQjtuZqUohJn")
public class CdmEventWorkflowEventInstruction {
    public static String blueId() {
        return "8vLhPScyFntH9TUfMxe1WvBGi31UB5J4AQjtuZqUohJn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/EventInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/EventInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowEventInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonCorporateActionTypeEnum corporateActionIntent;

    private String effectiveDate;

    private String eventDate;

    private List<CdmEventCommonInstruction> instruction;

    private CdmEventCommonEventIntentEnum intent;

    private CdmBaseStaticdataIdentifierIdentifiedList packageInformation;

    public CdmEventCommonCorporateActionTypeEnum getCorporateActionIntent() {
        return corporateActionIntent;
    }

    public CdmEventWorkflowEventInstruction corporateActionIntent(CdmEventCommonCorporateActionTypeEnum corporateActionIntent) {
        this.corporateActionIntent = corporateActionIntent;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmEventWorkflowEventInstruction effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getEventDate() {
        return eventDate;
    }

    public CdmEventWorkflowEventInstruction eventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public List<CdmEventCommonInstruction> getInstruction() {
        return instruction;
    }

    public CdmEventWorkflowEventInstruction instruction(List<CdmEventCommonInstruction> instruction) {
        this.instruction = instruction;
        return this;
    }

    public CdmEventCommonEventIntentEnum getIntent() {
        return intent;
    }

    public CdmEventWorkflowEventInstruction intent(CdmEventCommonEventIntentEnum intent) {
        this.intent = intent;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifiedList getPackageInformation() {
        return packageInformation;
    }

    public CdmEventWorkflowEventInstruction packageInformation(CdmBaseStaticdataIdentifierIdentifiedList packageInformation) {
        this.packageInformation = packageInformation;
        return this;
    }

}
