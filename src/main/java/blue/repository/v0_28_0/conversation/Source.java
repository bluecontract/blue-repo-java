package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("6ADCPYXkusrp4dL1FC126L2ccuzYfqGdBf1w6EXh2hnC")
public class Source {
    public static String blueId() {
        return "6ADCPYXkusrp4dL1FC126L2ccuzYfqGdBf1w6EXh2hnC";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Source";
    }

    public static String qualifiedName() {
        return "Conversation/Source";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/Source.json";
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
