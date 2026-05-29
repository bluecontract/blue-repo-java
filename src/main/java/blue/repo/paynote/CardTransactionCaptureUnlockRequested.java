package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("GRKRovDGMJjtV4dtaUmmUJEojNCwyosV6hZtmsjPzs4d")
public class CardTransactionCaptureUnlockRequested extends Request {
    public static String blueId() {
        return "GRKRovDGMJjtV4dtaUmmUJEojNCwyosV6hZtmsjPzs4d";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Capture Unlock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Capture Unlock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CardTransactionCaptureUnlockRequested.json";
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

    public CardTransactionCaptureUnlockRequested cardTransactionDetails(CardTransactionDetails cardTransactionDetails) {
        this.cardTransactionDetails = cardTransactionDetails;
        return this;
    }

}
