package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("5cwVBvBpQWLmYmpAMfXVt7mGrrZDZinBkdgJ61oT2FGR")
public class ChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "5cwVBvBpQWLmYmpAMfXVt7mGrrZDZinBkdgJ61oT2FGR";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Change Workflow";
    }

    public static String qualifiedName() {
        return "Conversation/Change Workflow";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/ChangeWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ChangeRequest request;

    public ChangeRequest getRequest() {
        return request;
    }

    public ChangeWorkflow request(ChangeRequest request) {
        this.request = request;
        return this;
    }

}
