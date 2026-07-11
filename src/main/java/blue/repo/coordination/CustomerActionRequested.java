package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FuGWQ4hVCRPRxhZopsnBN78Q1DhRTsjjvn4HPvunf4vz")
public class CustomerActionRequested extends Request {
    public static String blueId() {
        return "FuGWQ4hVCRPRxhZopsnBN78Q1DhRTsjjvn4HPvunf4vz";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Customer Action Requested";
    }

    public static String qualifiedName() {
        return "Coordination/Customer Action Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/CustomerActionRequested.json";
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
