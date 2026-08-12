package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("AcV3s6B6heDQVQEMEA4xgtRY3VUtUxqKSVuioBt2pFLp")
public class FundsSecuringFailed extends Response {
    public static String blueId() {
        return "AcV3s6B6heDQVQEMEA4xgtRY3VUtUxqKSVuioBt2pFLp";
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
        return "blue/repo/definitions/PayNote/FundsSecuringFailed.json";
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
