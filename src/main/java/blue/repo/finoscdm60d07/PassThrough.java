package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AgykQU6o8mJ3oCAArudFCaMCXcEWuPx5iXqhq8QEun4J")
public class PassThrough {
    public static String blueId() {
        return "AgykQU6o8mJ3oCAArudFCaMCXcEWuPx5iXqhq8QEun4J";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PassThrough";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PassThrough";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PassThrough.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private List<PassThroughItem> passThroughItem;

    public String getNamespace() {
        return namespace;
    }

    public PassThrough namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<PassThroughItem> getPassThroughItem() {
        return passThroughItem;
    }

    public PassThrough passThroughItem(List<PassThroughItem> passThroughItem) {
        this.passThroughItem = passThroughItem;
        return this;
    }

}
