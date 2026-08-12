package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HEsvBsA9jjaozbhgbqiG8mgGvn9NPrat2q2fe1Lmd3fe")
public class ChatWorkflowOperation extends SequentialWorkflowOperation {
    public static String blueId() {
        return "HEsvBsA9jjaozbhgbqiG8mgGvn9NPrat2q2fe1Lmd3fe";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Chat Workflow Operation";
    }

    public static String qualifiedName() {
        return "Coordination/Chat Workflow Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/ChatWorkflowOperation.json";
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
