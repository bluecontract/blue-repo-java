package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6aAJEFVdFAgLVre8azY4YZQnNiv2FkXJpdpGAYSHiNrY")
public class Status extends DocumentStatus {
    public static String blueId() {
        return "6aAJEFVdFAgLVre8azY4YZQnNiv2FkXJpdpGAYSHiNrY";
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
