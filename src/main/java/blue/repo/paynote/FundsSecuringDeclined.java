package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("F9uGVcesweVvK72Uw95r5uoC3N9rK7wEqrLesNF2dg6t")
public class FundsSecuringDeclined extends Response {
    public static String blueId() {
        return "F9uGVcesweVvK72Uw95r5uoC3N9rK7wEqrLesNF2dg6t";
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
