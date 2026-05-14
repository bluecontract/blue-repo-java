package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3yWXiUX7PFyJKMxT9N3Yj8NHqAmKVdbh8sZVFbYMFMhq")
public class BusinessEvent {
    public static String blueId() {
        return "3yWXiUX7PFyJKMxT9N3Yj8NHqAmKVdbh8sZVFbYMFMhq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BusinessEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BusinessEvent";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BusinessEvent.json";
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

    private List<TradeState> after;

    private CorporateActionTypeEnum corporateActionIntent;

    private String effectiveDate;

    private String eventDate;

    private String eventQualifier;

    private List<Instruction> instruction;

    private EventIntentEnum intent;

    private IdentifiedList packageInformation;

    public String getNamespace() {
        return namespace;
    }

    public BusinessEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<TradeState> getAfter() {
        return after;
    }

    public BusinessEvent after(List<TradeState> after) {
        this.after = after;
        return this;
    }

    public CorporateActionTypeEnum getCorporateActionIntent() {
        return corporateActionIntent;
    }

    public BusinessEvent corporateActionIntent(CorporateActionTypeEnum corporateActionIntent) {
        this.corporateActionIntent = corporateActionIntent;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public BusinessEvent effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getEventDate() {
        return eventDate;
    }

    public BusinessEvent eventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public String getEventQualifier() {
        return eventQualifier;
    }

    public BusinessEvent eventQualifier(String eventQualifier) {
        this.eventQualifier = eventQualifier;
        return this;
    }

    public List<Instruction> getInstruction() {
        return instruction;
    }

    public BusinessEvent instruction(List<Instruction> instruction) {
        this.instruction = instruction;
        return this;
    }

    public EventIntentEnum getIntent() {
        return intent;
    }

    public BusinessEvent intent(EventIntentEnum intent) {
        this.intent = intent;
        return this;
    }

    public IdentifiedList getPackageInformation() {
        return packageInformation;
    }

    public BusinessEvent packageInformation(IdentifiedList packageInformation) {
        this.packageInformation = packageInformation;
        return this;
    }

}
