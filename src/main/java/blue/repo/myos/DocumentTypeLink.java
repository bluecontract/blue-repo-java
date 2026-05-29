package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5z86Uk79T94VasXdy6RSWjZqVUmiEfwGVWrkGc9ZooLm")
public class DocumentTypeLink extends Link {
    public static String blueId() {
        return "5z86Uk79T94VasXdy6RSWjZqVUmiEfwGVWrkGc9ZooLm";
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
        return "blue/repo/definitions/MyOS/DocumentTypeLink.json";
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
