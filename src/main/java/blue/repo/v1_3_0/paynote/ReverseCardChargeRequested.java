package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("Fg5CEPi8Dbr1vBwGjzf8PbQNfuWfPP7HcLFChYwpRJq5")
public class ReverseCardChargeRequested extends Request {
    public static String blueId() {
        return "Fg5CEPi8Dbr1vBwGjzf8PbQNfuWfPP7HcLFChYwpRJq5";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reverse Card Charge Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Reverse Card Charge Requested";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/ReverseCardChargeRequested.json";
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

    public ReverseCardChargeRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public String getPaymentMandateDocumentId() {
        return paymentMandateDocumentId;
    }

    public ReverseCardChargeRequested paymentMandateDocumentId(String paymentMandateDocumentId) {
        this.paymentMandateDocumentId = paymentMandateDocumentId;
        return this;
    }

    public Node getPaynote() {
        return paynote;
    }

    public ReverseCardChargeRequested paynote(Node paynote) {
        this.paynote = paynote;
        return this;
    }

}
