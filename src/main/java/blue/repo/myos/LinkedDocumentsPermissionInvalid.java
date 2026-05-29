package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;
import java.util.List;

@TypeBlueId("Cm9gL7QQ4CDhi18VKg5PfK11Xy6CLVJawoa88BTTy9ZU")
public class LinkedDocumentsPermissionInvalid extends Event {
    public static String blueId() {
        return "Cm9gL7QQ4CDhi18VKg5PfK11Xy6CLVJawoa88BTTy9ZU";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Invalid";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Invalid";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/LinkedDocumentsPermissionInvalid.json";
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

    public LinkedDocumentsPermissionInvalid issues(List<String> issues) {
        this.issues = issues;
        return this;
    }

}
