package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Request;

@TypeBlueId("531sxtH5rD9ter3EzwBTcn9GMdA7RAYFwmSQRzxCru8z")
public class CardTransactionCaptureUnlockRequested extends Request {
    public static String blueId() {
        return "531sxtH5rD9ter3EzwBTcn9GMdA7RAYFwmSQRzxCru8z";
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
        return "blue/repo/v1_3_0/definitions/PayNote/CardTransactionCaptureUnlockRequested.json";
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
