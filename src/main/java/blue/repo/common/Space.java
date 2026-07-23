package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BFrCmuWJzm3RYrg3AD9L1YYKV3oun4MA9gL74mDQKF1j")
public class Space extends Document {
    public static String blueId() {
        return "BFrCmuWJzm3RYrg3AD9L1YYKV3oun4MA9gL74mDQKF1j";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Space";
    }

    public static String qualifiedName() {
        return "Common/Space";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Space.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String website;

    public String getWebsite() {
        return website;
    }

    public Space website(String website) {
        this.website = website;
        return this;
    }

}
