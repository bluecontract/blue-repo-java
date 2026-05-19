package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Event;

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
        return "blue/repo/definitions/PayNote/TransactionIdentified.json";
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
