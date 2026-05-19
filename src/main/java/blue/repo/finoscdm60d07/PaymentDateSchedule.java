package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HN5EqpoYJqRw7CVSAwPmdJx6PxEYYKBAjbP6sZgDAH7W")
public class PaymentDateSchedule {
    public static String blueId() {
        return "HN5EqpoYJqRw7CVSAwPmdJx6PxEYYKBAjbP6sZgDAH7W";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PaymentDateSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PaymentDateSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PaymentDateSchedule.json";
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

    private AdjustableOrRelativeDate finalPaymentDate;

    private List<AdjustableRelativeOrPeriodicDates> interimPaymentDates;

    public String getNamespace() {
        return namespace;
    }

    public PaymentDateSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableOrRelativeDate getFinalPaymentDate() {
        return finalPaymentDate;
    }

    public PaymentDateSchedule finalPaymentDate(AdjustableOrRelativeDate finalPaymentDate) {
        this.finalPaymentDate = finalPaymentDate;
        return this;
    }

    public List<AdjustableRelativeOrPeriodicDates> getInterimPaymentDates() {
        return interimPaymentDates;
    }

    public PaymentDateSchedule interimPaymentDates(List<AdjustableRelativeOrPeriodicDates> interimPaymentDates) {
        this.interimPaymentDates = interimPaymentDates;
        return this;
    }

}
