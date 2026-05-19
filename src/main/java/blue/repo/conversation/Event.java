package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5Wz4G9qcnBJnntYRkz4dgLK5bSuoMpYJZj4j5M59z4we")
public class Event {
    public static String blueId() {
        return "5Wz4G9qcnBJnntYRkz4dgLK5bSuoMpYJZj4j5M59z4we";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Event";
    }

    public static String qualifiedName() {
        return "Conversation/Event";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/Event.json";
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
