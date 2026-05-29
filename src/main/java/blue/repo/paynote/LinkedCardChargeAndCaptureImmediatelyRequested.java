package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("5EzstBLEcdv1qNVo8JYzxRd7T6P8fyZ5HrgN2fxz6CdX")
public class LinkedCardChargeAndCaptureImmediatelyRequested extends Request {
    public static String blueId() {
        return "5EzstBLEcdv1qNVo8JYzxRd7T6P8fyZ5HrgN2fxz6CdX";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Linked Card Charge and Capture Immediately Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Linked Card Charge and Capture Immediately Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/LinkedCardChargeandCaptureImmediatelyRequested.json";
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

    public LinkedCardChargeAndCaptureImmediatelyRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public String getPaymentMandateDocumentId() {
        return paymentMandateDocumentId;
    }

    public LinkedCardChargeAndCaptureImmediatelyRequested paymentMandateDocumentId(String paymentMandateDocumentId) {
        this.paymentMandateDocumentId = paymentMandateDocumentId;
        return this;
    }

    public Node getPaynote() {
        return paynote;
    }

    public LinkedCardChargeAndCaptureImmediatelyRequested paynote(Node paynote) {
        this.paynote = paynote;
        return this;
    }

}
