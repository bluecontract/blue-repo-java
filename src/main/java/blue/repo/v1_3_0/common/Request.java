package blue.repo.v1_3_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ccj91K18JfH77i8bawJzR9GpRWXYf598uPjggxZU7Shd")
public class Request extends Document {
    public static String blueId() {
        return "Ccj91K18JfH77i8bawJzR9GpRWXYf598uPjggxZU7Shd";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Request";
    }

    public static String qualifiedName() {
        return "Common/Request";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Common/Request.json";
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
