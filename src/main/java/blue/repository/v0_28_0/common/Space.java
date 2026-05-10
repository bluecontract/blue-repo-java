package blue.repository.v0_28_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("Bdyasci5huobiunZqkShQUiWzCyHLhY4fpMkG4YF5BiS")
public class Space extends Document {
    public static String blueId() {
        return "Bdyasci5huobiunZqkShQUiWzCyHLhY4fpMkG4YF5BiS";
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
        return "blue/repository/v0_28_0/definitions/Common/Space.json";
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

    private DocumentAnchors anchors;

    public String getWebsite() {
        return website;
    }

    public Space website(String website) {
        this.website = website;
        return this;
    }

    public DocumentAnchors getAnchors() {
        return anchors;
    }

    public Space anchors(DocumentAnchors anchors) {
        this.anchors = anchors;
        return this;
    }

}
