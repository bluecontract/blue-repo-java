package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7wpEHf7qA5weBHeHYzbTWdBGab3YnorGtnnrHSaaqwNR")
public class ClosedState {
    public static String blueId() {
        return "7wpEHf7qA5weBHeHYzbTWdBGab3YnorGtnnrHSaaqwNR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ClosedState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ClosedState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ClosedState.json";
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

    private String activityDate;

    private String effectiveDate;

    private String lastPaymentDate;

    private ClosedStateEnum state;

    public String getNamespace() {
        return namespace;
    }

    public ClosedState namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getActivityDate() {
        return activityDate;
    }

    public ClosedState activityDate(String activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public ClosedState effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public ClosedState lastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
        return this;
    }

    public ClosedStateEnum getState() {
        return state;
    }

    public ClosedState state(ClosedStateEnum state) {
        this.state = state;
        return this;
    }

}
