package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("Bini6FefW5nZTkMuiVtPCbxWPfATrtYWpSDfwEvEcXTp")
public class PaymentMandateAttachmentFailed extends Event {
    public static String blueId() {
        return "Bini6FefW5nZTkMuiVtPCbxWPfATrtYWpSDfwEvEcXTp";
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
        return "blue/repo/definitions/PayNote/PaymentMandateAttachmentFailed.json";
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
