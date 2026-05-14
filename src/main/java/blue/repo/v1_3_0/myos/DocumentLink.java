package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BFxgEnovNHQ693YR2YvALi4FP8vjcwSQiX63LiLwjUhk")
public class DocumentLink extends Link {
    public static String blueId() {
        return "BFxgEnovNHQ693YR2YvALi4FP8vjcwSQiX63LiLwjUhk";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Link";
    }

    public static String qualifiedName() {
        return "MyOS/Document Link";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/DocumentLink.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String documentId;

    public String getDocumentId() {
        return documentId;
    }

    public DocumentLink documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

}
