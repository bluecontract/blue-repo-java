package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("7zoVbzvzqxvKAcvdbSSxGPR4RxjQ9iNip3WhU52bRBtb")
public class TransactionIdentificationFailed extends Event {
    public static String blueId() {
        return "7zoVbzvzqxvKAcvdbSSxGPR4RxjQ9iNip3WhU52bRBtb";
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
