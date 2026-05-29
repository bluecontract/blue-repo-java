package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("3WUS7fRk3isWgjSnFGXta9HMkGmj2zg6898rbLH5G5iz")
public class CardTransactionCaptureLockRequested extends Request {
    public static String blueId() {
        return "3WUS7fRk3isWgjSnFGXta9HMkGmj2zg6898rbLH5G5iz";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Capture Lock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Capture Lock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CardTransactionCaptureLockRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CardTransactionDetails cardTransactionDetails;

    public CardTransactionDetails getCardTransactionDetails() {
        return cardTransactionDetails;
    }

    public CardTransactionCaptureLockRequested cardTransactionDetails(CardTransactionDetails cardTransactionDetails) {
        this.cardTransactionDetails = cardTransactionDetails;
        return this;
    }

}
