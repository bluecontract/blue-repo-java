package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

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
        return "blue/repo/definitions/Conversation/Source.json";
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
