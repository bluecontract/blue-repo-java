package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("8PufMmsuBgpX5YCpiS7XuiCFUWDan1fN8c3TLLwh57gL")
public class FundsSecuringDeclined extends Response {
    public static String blueId() {
        return "8PufMmsuBgpX5YCpiS7XuiCFUWDan1fN8c3TLLwh57gL";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Funds Securing Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Funds Securing Declined";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/FundsSecuringDeclined.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public FundsSecuringDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
