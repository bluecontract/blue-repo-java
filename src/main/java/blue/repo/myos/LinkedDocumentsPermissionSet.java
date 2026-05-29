package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DsDibGYwridS8uYoUcwFbBHa49UFAA7MtLNboXrXudmn")
public class LinkedDocumentsPermissionSet {
    public static String blueId() {
        return "DsDibGYwridS8uYoUcwFbBHa49UFAA7MtLNboXrXudmn";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Set";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Set";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/LinkedDocumentsPermissionSet.json";
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
