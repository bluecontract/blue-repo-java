package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("623skurB6ZSt3jpkdNpuu6fwRG3VdrVgj2FKxfrNnBbH")
public class StatusDeclined extends StatusFailed {
    public static String blueId() {
        return "623skurB6ZSt3jpkdNpuu6fwRG3VdrVgj2FKxfrNnBbH";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status Declined";
    }

    public static String qualifiedName() {
        return "Coordination/Status Declined";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusDeclined.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
