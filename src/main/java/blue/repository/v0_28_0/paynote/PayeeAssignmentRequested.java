package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Request;

@TypeBlueId("BVLMcTzag3D2rvg8LoKQ3Htgoqsh77EAoiTLTxH5aVBE")
public class PayeeAssignmentRequested extends Request {
    public static String blueId() {
        return "BVLMcTzag3D2rvg8LoKQ3Htgoqsh77EAoiTLTxH5aVBE";
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
        return "blue/repository/v0_28_0/definitions/PayNote/PayeeAssignmentRequested.json";
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
