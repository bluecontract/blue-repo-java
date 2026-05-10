package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("DVdWNtgwNrRFw2xoM6nbjPtSr9HhHNxxZVurf3Dr4cX2")
public class PaymentInitiated extends Response {
    public static String blueId() {
        return "DVdWNtgwNrRFw2xoM6nbjPtSr9HhHNxxZVurf3Dr4cX2";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Payment Initiated";
    }

    public static String qualifiedName() {
        return "MyOS/Payment Initiated";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/PaymentInitiated.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String paynoteDocumentId;

    private String paynotePayeeSessionId;

    public String getPaynoteDocumentId() {
        return paynoteDocumentId;
    }

    public PaymentInitiated paynoteDocumentId(String paynoteDocumentId) {
        this.paynoteDocumentId = paynoteDocumentId;
        return this;
    }

    public String getPaynotePayeeSessionId() {
        return paynotePayeeSessionId;
    }

    public PaymentInitiated paynotePayeeSessionId(String paynotePayeeSessionId) {
        this.paynotePayeeSessionId = paynotePayeeSessionId;
        return this;
    }

}
