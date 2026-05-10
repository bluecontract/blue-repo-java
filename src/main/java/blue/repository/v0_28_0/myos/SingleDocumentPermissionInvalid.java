package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Event;
import java.util.List;

@TypeBlueId("567voUMtKJQoqru6ZVPYb4EGwdeV99rUSAqsnod7gqfd")
public class SingleDocumentPermissionInvalid extends Event {
    public static String blueId() {
        return "567voUMtKJQoqru6ZVPYb4EGwdeV99rUSAqsnod7gqfd";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Invalid";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Invalid";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/SingleDocumentPermissionInvalid.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> issues;

    public List<String> getIssues() {
        return issues;
    }

    public SingleDocumentPermissionInvalid issues(List<String> issues) {
        this.issues = issues;
        return this;
    }

}
