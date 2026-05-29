package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9NWJbMy2sRh6KdLQGhQqFx6Ta8LZen5NMcdg2vqeG9yC")
public class Space extends Document {
    public static String blueId() {
        return "9NWJbMy2sRh6KdLQGhQqFx6Ta8LZen5NMcdg2vqeG9yC";
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
