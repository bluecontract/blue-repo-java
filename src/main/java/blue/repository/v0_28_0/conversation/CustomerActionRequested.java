package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import java.util.List;

@TypeBlueId("6ZLHE59mb1ytEjW78jmYCU3DXxj4Fzfjea7tz3VEkwyX")
public class CustomerActionRequested extends Request {
    public static String blueId() {
        return "6ZLHE59mb1ytEjW78jmYCU3DXxj4Fzfjea7tz3VEkwyX";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Customer Action Requested";
    }

    public static String qualifiedName() {
        return "Conversation/Customer Action Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/CustomerActionRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String title;

    private String message;

    private List<Node> actions;

    public String getTitle() {
        return title;
    }

    public CustomerActionRequested title(String title) {
        this.title = title;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CustomerActionRequested message(String message) {
        this.message = message;
        return this;
    }

    public List<Node> getActions() {
        return actions;
    }

    public CustomerActionRequested actions(List<Node> actions) {
        this.actions = actions;
        return this;
    }

}
