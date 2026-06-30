package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("F8yzCwY9qUvLmBtoJFshSpwepjNB9VZdbqdBmZ2USqN")
public class AcceptChangeOperation extends Operation {
    public static String blueId() {
        return "F8yzCwY9qUvLmBtoJFshSpwepjNB9VZdbqdBmZ2USqN";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Accept Change Operation";
    }

    public static String qualifiedName() {
        return "Workflows/Accept Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/AcceptChangeOperation.json";
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
