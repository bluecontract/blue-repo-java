package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("Gs1jHaTTnb8cv6VH6GKwnDAzBPkRjH81wRj28zqkGtz7")
public class PaymentMandateAttached extends Event {
    public static String blueId() {
        return "Gs1jHaTTnb8cv6VH6GKwnDAzBPkRjH81wRj28zqkGtz7";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Mandate Attached";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Mandate Attached";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentMandateAttached.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String paymentMandateDocumentId;

    public String getPaymentMandateDocumentId() {
        return paymentMandateDocumentId;
    }

    public PaymentMandateAttached paymentMandateDocumentId(String paymentMandateDocumentId) {
        this.paymentMandateDocumentId = paymentMandateDocumentId;
        return this;
    }

}
