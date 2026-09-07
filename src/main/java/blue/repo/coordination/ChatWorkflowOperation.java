package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6ygHdSzD8F8UdaMpE68t9CieXbbmMrTwsEY8u7BGUpXW")
public class ChatWorkflowOperation extends SequentialWorkflowOperation {
    public static String blueId() {
        return "6ygHdSzD8F8UdaMpE68t9CieXbbmMrTwsEY8u7BGUpXW";
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
