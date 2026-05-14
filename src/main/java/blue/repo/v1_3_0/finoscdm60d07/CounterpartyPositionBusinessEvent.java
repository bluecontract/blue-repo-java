package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CdMt3bHFCBhALwySEeBWATWmg2u51UjZH7cegiUh64vF")
public class CounterpartyPositionBusinessEvent {
    public static String blueId() {
        return "CdMt3bHFCBhALwySEeBWATWmg2u51UjZH7cegiUh64vF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CounterpartyPositionBusinessEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CounterpartyPositionBusinessEvent";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CounterpartyPositionBusinessEvent.json";
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

    private List<CounterpartyPositionState> after;

    private CorporateActionTypeEnum corporateActionIntent;

    private String effectiveDate;

    private String eventDate;

    private PositionEventIntentEnum intent;

    private IdentifiedList packageInformation;

    public String getNamespace() {
        return namespace;
    }

    public CounterpartyPositionBusinessEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CounterpartyPositionState> getAfter() {
        return after;
    }

    public CounterpartyPositionBusinessEvent after(List<CounterpartyPositionState> after) {
        this.after = after;
        return this;
    }

    public CorporateActionTypeEnum getCorporateActionIntent() {
        return corporateActionIntent;
    }

    public CounterpartyPositionBusinessEvent corporateActionIntent(CorporateActionTypeEnum corporateActionIntent) {
        this.corporateActionIntent = corporateActionIntent;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CounterpartyPositionBusinessEvent effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getEventDate() {
        return eventDate;
    }

    public CounterpartyPositionBusinessEvent eventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public PositionEventIntentEnum getIntent() {
        return intent;
    }

    public CounterpartyPositionBusinessEvent intent(PositionEventIntentEnum intent) {
        this.intent = intent;
        return this;
    }

    public IdentifiedList getPackageInformation() {
        return packageInformation;
    }

    public CounterpartyPositionBusinessEvent packageInformation(IdentifiedList packageInformation) {
        this.packageInformation = packageInformation;
        return this;
    }

}
