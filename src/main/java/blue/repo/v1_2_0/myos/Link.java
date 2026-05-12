package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D2ERUvbpn6R6PR7hjFsGofwQsu9bkRfc6wbSYHcfJtMD")
public class Link {
    public static String blueId() {
        return "D2ERUvbpn6R6PR7hjFsGofwQsu9bkRfc6wbSYHcfJtMD";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Link";
    }

    public static String qualifiedName() {
        return "MyOS/Link";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/Link.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String anchor;

    public String getAnchor() {
        return anchor;
    }

    public Link anchor(String anchor) {
        this.anchor = anchor;
        return this;
    }

}
