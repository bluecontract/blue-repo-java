package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("DHqXopSXGku6L9dZCavpWgPyza6XjFXGDisVumLMrNkw")
public class PaymentInitiated extends Response {
    public static String blueId() {
        return "DHqXopSXGku6L9dZCavpWgPyza6XjFXGDisVumLMrNkw";
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
        return "blue/repo/definitions/MyOS/PaymentInitiated.json";
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
