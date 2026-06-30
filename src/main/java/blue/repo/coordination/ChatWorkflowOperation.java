package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G889Jtx4DZPf5QkaEVNoQVUa4mA6EPzfbpT32ArvRhBv")
public class ChatWorkflowOperation extends SequentialWorkflowOperation {
    public static String blueId() {
        return "G889Jtx4DZPf5QkaEVNoQVUa4mA6EPzfbpT32ArvRhBv";
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
