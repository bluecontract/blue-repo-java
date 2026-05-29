package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EqJ715y2fFsWhgBRXg5X9GDBxrkEsdend14hHmSsD8Ma")
public class PermissionGrant extends Document {
    public static String blueId() {
        return "EqJ715y2fFsWhgBRXg5X9GDBxrkEsdend14hHmSsD8Ma";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "PermissionGrant";
    }

    public static String qualifiedName() {
        return "Common/PermissionGrant";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/PermissionGrant.json";
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
