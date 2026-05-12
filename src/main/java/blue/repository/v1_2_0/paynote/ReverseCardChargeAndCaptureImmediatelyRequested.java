package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("F4gfZeY8P8dkfwNSbEfq7xQ8axiHdfqgzGQQr3HLDyzC")
public class ReverseCardChargeAndCaptureImmediatelyRequested extends Request {
    public static String blueId() {
        return "F4gfZeY8P8dkfwNSbEfq7xQ8axiHdfqgzGQQr3HLDyzC";
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
        return "blue/repository/v1_2_0/definitions/PayNote/ReverseCardChargeandCaptureImmediatelyRequested.json";
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
