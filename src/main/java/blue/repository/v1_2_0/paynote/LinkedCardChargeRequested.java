package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("Aq4dNFtLHLWYfCS7aqAgWwGi48MgbQmp2EZJtDBN7FSg")
public class LinkedCardChargeRequested extends Request {
    public static String blueId() {
        return "Aq4dNFtLHLWYfCS7aqAgWwGi48MgbQmp2EZJtDBN7FSg";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Linked Card Charge Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Linked Card Charge Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/LinkedCardChargeRequested.json";
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

    public LinkedCardChargeRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public String getPaymentMandateDocumentId() {
        return paymentMandateDocumentId;
    }

    public LinkedCardChargeRequested paymentMandateDocumentId(String paymentMandateDocumentId) {
        this.paymentMandateDocumentId = paymentMandateDocumentId;
        return this;
    }

    public Node getPaynote() {
        return paynote;
    }

    public LinkedCardChargeRequested paynote(Node paynote) {
        this.paynote = paynote;
        return this;
    }

}
