package blue.repo.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.common.Timestamp;

@TypeBlueId("GFyes2Px1cY5Yfk2oiA1qpzhz2purMED3g1L74Bu1Ho6")
public class CustomerActionResponded extends Response {
    public static String blueId() {
        return "GFyes2Px1cY5Yfk2oiA1qpzhz2purMED3g1L74Bu1Ho6";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Customer Action Responded";
    }

    public static String qualifiedName() {
        return "Conversation/Customer Action Responded";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Conversation/CustomerActionResponded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String actionLabel;

    private Node input;

    private Timestamp respondedAt;

    public String getActionLabel() {
        return actionLabel;
    }

    public CustomerActionResponded actionLabel(String actionLabel) {
        this.actionLabel = actionLabel;
        return this;
    }

    public Node getInput() {
        return input;
    }

    public CustomerActionResponded input(Node input) {
        this.input = input;
        return this;
    }

    public Timestamp getRespondedAt() {
        return respondedAt;
    }

    public CustomerActionResponded respondedAt(Timestamp respondedAt) {
        this.respondedAt = respondedAt;
        return this;
    }

}
