package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DDAmA9UAt9mPSwLfBN95yLy3MPrvsC2tjGPcAYaxoWHc")
public class Profile extends Document {
    public static String blueId() {
        return "DDAmA9UAt9mPSwLfBN95yLy3MPrvsC2tjGPcAYaxoWHc";
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
        return "blue/repo/definitions/Common/Profile.json";
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
