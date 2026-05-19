package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;

@TypeBlueId("DhxGBjA6Gow9E6ZKZ49SdziihHZ4PeXxFNatSqmesKZu")
public class CardTransactionCaptureLockRequested extends Request {
    public static String blueId() {
        return "DhxGBjA6Gow9E6ZKZ49SdziihHZ4PeXxFNatSqmesKZu";
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
