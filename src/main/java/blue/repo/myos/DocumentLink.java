package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CfdjCV1cjPJCd5sBHLMzNUx3EtkgrmBekLxB5c9Qw1Qh")
public class DocumentLink extends Link {
    public static String blueId() {
        return "CfdjCV1cjPJCd5sBHLMzNUx3EtkgrmBekLxB5c9Qw1Qh";
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
        return "blue/repo/definitions/MyOS/DocumentLink.json";
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
