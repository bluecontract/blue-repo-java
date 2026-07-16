package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("DDuuaogLyNgVHbSoJxxQcX5iZqWy6U9DAxjgtdzWRnWB")
public class TransactionDetailsUpdateFailed extends Response {
    public static String blueId() {
        return "DDuuaogLyNgVHbSoJxxQcX5iZqWy6U9DAxjgtdzWRnWB";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateFailed.json";
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

    public TransactionDetailsUpdateFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
