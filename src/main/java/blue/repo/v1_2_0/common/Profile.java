package blue.repo.v1_2_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EWfk8qkKZYqqTyeLs4wLJTfPCLufZBiNGFQY4M4PLv99")
public class Profile extends Document {
    public static String blueId() {
        return "EWfk8qkKZYqqTyeLs4wLJTfPCLufZBiNGFQY4M4PLv99";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Profile";
    }

    public static String qualifiedName() {
        return "Common/Profile";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Common/Profile.json";
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
