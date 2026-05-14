package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Event;

@TypeBlueId("GTwsVrbVb31sMub1vvU2KyY2nA8ekKWYDoqNAB1m4Vh2")
public class PaymentMandateAttachmentFailed extends Event {
    public static String blueId() {
        return "GTwsVrbVb31sMub1vvU2KyY2nA8ekKWYDoqNAB1m4Vh2";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Mandate Attachment Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Mandate Attachment Failed";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/PaymentMandateAttachmentFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public PaymentMandateAttachmentFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
