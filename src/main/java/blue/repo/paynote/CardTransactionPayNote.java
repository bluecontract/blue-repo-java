package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("NR2wzb11pfvgGmxF6RzeZcojakrFHhxZwkBJstzD997")
public class CardTransactionPayNote extends PayNote {
    public static String blueId() {
        return "NR2wzb11pfvgGmxF6RzeZcojakrFHhxZwkBJstzD997";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction PayNote";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction PayNote";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CardTransactionPayNote.json";
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

    public CardTransactionPayNote cardTransactionDetails(CardTransactionDetails cardTransactionDetails) {
        this.cardTransactionDetails = cardTransactionDetails;
        return this;
    }

}
