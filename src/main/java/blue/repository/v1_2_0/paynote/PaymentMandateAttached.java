package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Event;

@TypeBlueId("49TYrHpnk2gepJiGduJP3afrnT2DJ6kDxqF4Y9M4C4t7")
public class PaymentMandateAttached extends Event {
    public static String blueId() {
        return "49TYrHpnk2gepJiGduJP3afrnT2DJ6kDxqF4Y9M4C4t7";
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
        return "blue/repository/v1_2_0/definitions/PayNote/PaymentMandateAttached.json";
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
