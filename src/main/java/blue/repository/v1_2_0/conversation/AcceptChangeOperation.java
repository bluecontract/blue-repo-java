package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("APk3siB8g9pvWLG3qyqtGjRNNGB7RDpFWQtG4epj5Avv")
public class AcceptChangeOperation extends Operation {
    public static String blueId() {
        return "APk3siB8g9pvWLG3qyqtGjRNNGB7RDpFWQtG4epj5Avv";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Accept Change Operation";
    }

    public static String qualifiedName() {
        return "Conversation/Accept Change Operation";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/AcceptChangeOperation.json";
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
