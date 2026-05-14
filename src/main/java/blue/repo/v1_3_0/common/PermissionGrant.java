package blue.repo.v1_3_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EHTR6jFrqbmjPf7dNSJUsGUJrgr5kLh62QiT2bxD6KRp")
public class PermissionGrant extends Document {
    public static String blueId() {
        return "EHTR6jFrqbmjPf7dNSJUsGUJrgr5kLh62QiT2bxD6KRp";
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
        return "blue/repo/v1_3_0/definitions/Common/PermissionGrant.json";
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
