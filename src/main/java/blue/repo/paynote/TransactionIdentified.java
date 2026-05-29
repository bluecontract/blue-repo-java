package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("BDeXDAG91B72CFtoPcDUk3odhFMBhiueneS1RcM4nbPf")
public class TransactionIdentified extends Event {
    public static String blueId() {
        return "BDeXDAG91B72CFtoPcDUk3odhFMBhiueneS1RcM4nbPf";
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
