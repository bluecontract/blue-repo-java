package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Event;

@TypeBlueId("6gQWKeJHZEbBo13Vvyf2nsdg7TA9kLSYdzMaJgySPG7V")
public class TransactionIdentified extends Event {
    public static String blueId() {
        return "6gQWKeJHZEbBo13Vvyf2nsdg7TA9kLSYdzMaJgySPG7V";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Identified";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Identified";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/TransactionIdentified.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
