package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("44BS4uToUQLVy8cFfUjbxr99ozR6fiAtCtC3Wd38VPwd")
public class PayeeAssignmentConfirmed extends Response {
    public static String blueId() {
        return "44BS4uToUQLVy8cFfUjbxr99ozR6fiAtCtC3Wd38VPwd";
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
