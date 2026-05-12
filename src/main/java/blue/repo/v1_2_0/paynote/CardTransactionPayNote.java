package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5D6BCVZDK6Q3RyigNTTNCEht3QJ4stSL5RsbYdfsPnMq")
public class CardTransactionPayNote extends PayNote {
    public static String blueId() {
        return "5D6BCVZDK6Q3RyigNTTNCEht3QJ4stSL5RsbYdfsPnMq";
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
        return "blue/repo/v1_2_0/definitions/PayNote/CardTransactionPayNote.json";
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
