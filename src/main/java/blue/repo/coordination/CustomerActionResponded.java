package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;

@TypeBlueId("3z3AhCpsFML9BhsStAPdJX1Da78fsB5ofRm9ooi1Co7X")
public class CustomerActionResponded extends Response {
    public static String blueId() {
        return "3z3AhCpsFML9BhsStAPdJX1Da78fsB5ofRm9ooi1Co7X";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Customer Action Responded";
    }

    public static String qualifiedName() {
        return "Coordination/Customer Action Responded";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/CustomerActionResponded.json";
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
