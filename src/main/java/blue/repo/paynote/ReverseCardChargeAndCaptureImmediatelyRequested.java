package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("4yJfdAuMrzyVQPsopWMfw24CiW2xj31jC4oCwhXmPG8V")
public class ReverseCardChargeAndCaptureImmediatelyRequested extends Request {
    public static String blueId() {
        return "4yJfdAuMrzyVQPsopWMfw24CiW2xj31jC4oCwhXmPG8V";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reverse Card Charge and Capture Immediately Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Reverse Card Charge and Capture Immediately Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ReverseCardChargeandCaptureImmediatelyRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amount;

    private String paymentMandateDocumentId;

    private Node paynote;

    public BigInteger getAmount() {
        return amount;
    }

    public ReverseCardChargeAndCaptureImmediatelyRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public String getPaymentMandateDocumentId() {
        return paymentMandateDocumentId;
    }

    public ReverseCardChargeAndCaptureImmediatelyRequested paymentMandateDocumentId(String paymentMandateDocumentId) {
        this.paymentMandateDocumentId = paymentMandateDocumentId;
        return this;
    }

    public Node getPaynote() {
        return paynote;
    }

    public ReverseCardChargeAndCaptureImmediatelyRequested paynote(Node paynote) {
        this.paynote = paynote;
        return this;
    }

}
