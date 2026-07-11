package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("jkonpkUSjCXMpHcJ4e1N7bfCgKzwssQuXEEboaqUTsb")
public class Status extends DocumentStatus {
    public static String blueId() {
        return "jkonpkUSjCXMpHcJ4e1N7bfCgKzwssQuXEEboaqUTsb";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status";
    }

    public static String qualifiedName() {
        return "Coordination/Status";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Status.json";
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
