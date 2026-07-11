package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("79ZV4j1dHpE5nt9nGN141Pte8hDbKgsxSavm9RV9wu1U")
public class PayeeAssignmentConfirmed extends Response {
    public static String blueId() {
        return "79ZV4j1dHpE5nt9nGN141Pte8hDbKgsxSavm9RV9wu1U";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payee Assignment Confirmed";
    }

    public static String qualifiedName() {
        return "PayNote/Payee Assignment Confirmed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayeeAssignmentConfirmed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String payeeRef;

    public String getPayeeRef() {
        return payeeRef;
    }

    public PayeeAssignmentConfirmed payeeRef(String payeeRef) {
        this.payeeRef = payeeRef;
        return this;
    }

}
