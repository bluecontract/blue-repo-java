package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;

@TypeBlueId("BqygExH4phfPLuES2VLGpYL2gDenFFCcukPXzC1PmQtM")
public class PaymentCompletionUnlockRequested extends Request {
    public static String blueId() {
        return "BqygExH4phfPLuES2VLGpYL2gDenFFCcukPXzC1PmQtM";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Unlock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Unlock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCompletionUnlockRequested.json";
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

    public PaymentCompletionUnlockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
