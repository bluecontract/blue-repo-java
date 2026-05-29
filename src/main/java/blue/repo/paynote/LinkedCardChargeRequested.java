package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("8btGPWw748VG2tHnj248YNV6EirmDg8oJWAN5UmzcwEo")
public class LinkedCardChargeRequested extends Request {
    public static String blueId() {
        return "8btGPWw748VG2tHnj248YNV6EirmDg8oJWAN5UmzcwEo";
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
        return "blue/repo/definitions/PayNote/LinkedCardChargeRequested.json";
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
