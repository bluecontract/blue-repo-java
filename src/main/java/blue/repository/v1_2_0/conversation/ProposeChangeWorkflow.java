package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("ELAgjQ99vBZLGfY6tJMuPRnm3avxpByyZsXc65aKQmi4")
public class ProposeChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "ELAgjQ99vBZLGfY6tJMuPRnm3avxpByyZsXc65aKQmi4";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Propose Change Workflow";
    }

    public static String qualifiedName() {
        return "Conversation/Propose Change Workflow";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/ProposeChangeWorkflow.json";
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

    private String postfix;

    public ChangeRequest getRequest() {
        return request;
    }

    public ProposeChangeWorkflow request(ChangeRequest request) {
        this.request = request;
        return this;
    }

    public String getPostfix() {
        return postfix;
    }

    public ProposeChangeWorkflow postfix(String postfix) {
        this.postfix = postfix;
        return this;
    }

}
