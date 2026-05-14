package blue.repo.v1_3_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BrpmpNt5JkapeUvPqYcxgXZrHNZX3R757dRwuXXdfNM2")
public class DocumentProcessingInitiated {
    public static String blueId() {
        return "BrpmpNt5JkapeUvPqYcxgXZrHNZX3R757dRwuXXdfNM2";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Document Processing Initiated";
    }

    public static String qualifiedName() {
        return "Core/Document Processing Initiated";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Core/DocumentProcessingInitiated.json";
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

    public DocumentProcessingInitiated documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

}
