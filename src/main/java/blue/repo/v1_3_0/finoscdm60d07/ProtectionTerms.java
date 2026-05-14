package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FPfijBXqPJrUZpS9mNR7irtAYTnQVfSwc6LTH5eCq236")
public class ProtectionTerms {
    public static String blueId() {
        return "FPfijBXqPJrUZpS9mNR7irtAYTnQVfSwc6LTH5eCq236";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ProtectionTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ProtectionTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ProtectionTerms.json";
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

    private FloatingAmountEvents floatingAmountEvents;

    private Obligations obligations;

    public String getNamespace() {
        return namespace;
    }

    public ProtectionTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CreditEvents getCreditEvents() {
        return creditEvents;
    }

    public ProtectionTerms creditEvents(CreditEvents creditEvents) {
        this.creditEvents = creditEvents;
        return this;
    }

    public FloatingAmountEvents getFloatingAmountEvents() {
        return floatingAmountEvents;
    }

    public ProtectionTerms floatingAmountEvents(FloatingAmountEvents floatingAmountEvents) {
        this.floatingAmountEvents = floatingAmountEvents;
        return this;
    }

    public Obligations getObligations() {
        return obligations;
    }

    public ProtectionTerms obligations(Obligations obligations) {
        this.obligations = obligations;
        return this;
    }

}
