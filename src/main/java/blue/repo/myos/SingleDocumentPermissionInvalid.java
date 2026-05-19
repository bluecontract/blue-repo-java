package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Event;
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
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionInvalid.json";
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
