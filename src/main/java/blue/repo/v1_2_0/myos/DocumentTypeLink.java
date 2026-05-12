package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D9Ret9Hmz5TWxzuJEeauWEuZVPkPL7hcHYsSNY1cZ5zX")
public class DocumentTypeLink extends Link {
    public static String blueId() {
        return "D9Ret9Hmz5TWxzuJEeauWEuZVPkPL7hcHYsSNY1cZ5zX";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Type Link";
    }

    public static String qualifiedName() {
        return "MyOS/Document Type Link";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/DocumentTypeLink.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node documentType;

    public Node getDocumentType() {
        return documentType;
    }

    public DocumentTypeLink documentType(Node documentType) {
        this.documentType = documentType;
        return this;
    }

}
