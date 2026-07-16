package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("8x9kLwfX9bJdvChLgQjwhPBCAMDZrmRJPMdaWsKKkbjN")
public class FundsSecuringDeclined extends Response {
    public static String blueId() {
        return "8x9kLwfX9bJdvChLgQjwhPBCAMDZrmRJPMdaWsKKkbjN";
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
        return "blue/repo/definitions/PayNote/FundsSecuringDeclined.json";
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
