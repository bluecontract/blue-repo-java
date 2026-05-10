package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("5YZEAtUaHhNfnVnwtSsyBnBakpcSwdL75UcgtrtnqeYn")
public class LifecycleEvent extends Event {
    public static String blueId() {
        return "5YZEAtUaHhNfnVnwtSsyBnBakpcSwdL75UcgtrtnqeYn";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Lifecycle Event";
    }

    public static String qualifiedName() {
        return "Conversation/Lifecycle Event";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/LifecycleEvent.json";
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
