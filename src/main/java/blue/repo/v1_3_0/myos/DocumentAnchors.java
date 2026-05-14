package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7Usvk6dZMVqas3yqs23ZEXn1zu1YDPjgYiZFNYaw3puH")
public class DocumentAnchors {
    public static String blueId() {
        return "7Usvk6dZMVqas3yqs23ZEXn1zu1YDPjgYiZFNYaw3puH";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Anchors";
    }

    public static String qualifiedName() {
        return "MyOS/Document Anchors";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/DocumentAnchors.json";
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
