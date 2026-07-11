package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("HqD5YrGeruxAeibVpGJwpqXRcmCuoSNWN2j48iRaJdoU")
public class TransactionDetailsUpdateUnlockRequested extends Request {
    public static String blueId() {
        return "HqD5YrGeruxAeibVpGJwpqXRcmCuoSNWN2j48iRaJdoU";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Unlock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Unlock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateUnlockRequested.json";
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

    public TransactionDetailsUpdateUnlockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
