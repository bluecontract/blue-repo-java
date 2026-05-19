package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Event;

@TypeBlueId("GvFQ71MZS1CrHvSopnTkSz8DBX2is4meMR5tpF5WmwCC")
public class TransactionIdentificationFailed extends Event {
    public static String blueId() {
        return "GvFQ71MZS1CrHvSopnTkSz8DBX2is4meMR5tpF5WmwCC";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Identification Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Identification Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionIdentificationFailed.json";
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

    public TransactionIdentificationFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
