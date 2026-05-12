package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("34v52X6nVj6muiD11W8nohLFn7DjT2RiaRYwjRNpq4v3")
public class PayeeAssignmentConfirmed extends Response {
    public static String blueId() {
        return "34v52X6nVj6muiD11W8nohLFn7DjT2RiaRYwjRNpq4v3";
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
        return "blue/repository/v1_2_0/definitions/PayNote/PayeeAssignmentConfirmed.json";
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
