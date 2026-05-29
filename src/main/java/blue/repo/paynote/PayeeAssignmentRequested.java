package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("D17BbAFgz2YXvNegams28sxZqtqNKFepEMbPHrfed4bF")
public class PayeeAssignmentRequested extends Request {
    public static String blueId() {
        return "D17BbAFgz2YXvNegams28sxZqtqNKFepEMbPHrfed4bF";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payee Assignment Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payee Assignment Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayeeAssignmentRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String payeeEmail;

    public String getPayeeEmail() {
        return payeeEmail;
    }

    public PayeeAssignmentRequested payeeEmail(String payeeEmail) {
        this.payeeEmail = payeeEmail;
        return this;
    }

}
