package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Event;
import java.util.List;

@TypeBlueId("ENswN7PB5Ty8mfy1AdFsu2QR9jMjCsm5AGGJgkYSTrWU")
public class LinkedDocumentsPermissionInvalid extends Event {
    public static String blueId() {
        return "ENswN7PB5Ty8mfy1AdFsu2QR9jMjCsm5AGGJgkYSTrWU";
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
        return "blue/repository/v1_2_0/definitions/MyOS/LinkedDocumentsPermissionInvalid.json";
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
