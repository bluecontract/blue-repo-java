package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9s9B78i8qKrmRD6yEzmrNmAXCuQJ9q8BxJKPR3HF6eHR")
public class EventInstruction {
    public static String blueId() {
        return "9s9B78i8qKrmRD6yEzmrNmAXCuQJ9q8BxJKPR3HF6eHR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EventInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EventInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EventInstruction.json";
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

    private CorporateActionTypeEnum corporateActionIntent;

    private String effectiveDate;

    private String eventDate;

    private List<Instruction> instruction;

    private EventIntentEnum intent;

    private IdentifiedList packageInformation;

    public String getNamespace() {
        return namespace;
    }

    public EventInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CorporateActionTypeEnum getCorporateActionIntent() {
        return corporateActionIntent;
    }

    public EventInstruction corporateActionIntent(CorporateActionTypeEnum corporateActionIntent) {
        this.corporateActionIntent = corporateActionIntent;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public EventInstruction effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getEventDate() {
        return eventDate;
    }

    public EventInstruction eventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public List<Instruction> getInstruction() {
        return instruction;
    }

    public EventInstruction instruction(List<Instruction> instruction) {
        this.instruction = instruction;
        return this;
    }

    public EventIntentEnum getIntent() {
        return intent;
    }

    public EventInstruction intent(EventIntentEnum intent) {
        this.intent = intent;
        return this;
    }

    public IdentifiedList getPackageInformation() {
        return packageInformation;
    }

    public EventInstruction packageInformation(IdentifiedList packageInformation) {
        this.packageInformation = packageInformation;
        return this;
    }

}
