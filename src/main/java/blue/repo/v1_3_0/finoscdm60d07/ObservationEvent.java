package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Dj95hckKTPjczykJqqyL67VzzgAG64yh23kMmQN7TAJy")
public class ObservationEvent {
    public static String blueId() {
        return "Dj95hckKTPjczykJqqyL67VzzgAG64yh23kMmQN7TAJy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationEvent";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ObservationEvent.json";
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

    private CorporateAction corporateAction;

    private CreditEvent creditEvent;

    public String getNamespace() {
        return namespace;
    }

    public ObservationEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CorporateAction getCorporateAction() {
        return corporateAction;
    }

    public ObservationEvent corporateAction(CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
        return this;
    }

    public CreditEvent getCreditEvent() {
        return creditEvent;
    }

    public ObservationEvent creditEvent(CreditEvent creditEvent) {
        this.creditEvent = creditEvent;
        return this;
    }

}
