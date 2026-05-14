package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("67BprL1WeSSpJDKawcnaNC6VF2vz68JQ5qrVfi37biBA")
public class FundsSecuringFailed extends Response {
    public static String blueId() {
        return "67BprL1WeSSpJDKawcnaNC6VF2vz68JQ5qrVfi37biBA";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Funds Securing Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Funds Securing Failed";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/FundsSecuringFailed.json";
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

    public FundsSecuringFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
