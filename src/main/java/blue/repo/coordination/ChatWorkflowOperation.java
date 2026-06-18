package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AwomMHqfREQrDWk9K2yqKz9XPMUR6FyCJgwjabEy44gT")
public class ChatWorkflowOperation extends SequentialWorkflowOperation {
    public static String blueId() {
        return "AwomMHqfREQrDWk9K2yqKz9XPMUR6FyCJgwjabEy44gT";
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
