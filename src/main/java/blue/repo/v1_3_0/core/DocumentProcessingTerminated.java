package blue.repo.v1_3_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5AJiAUgiSDwfCzv9rCYKNaAJu1hm8BXFu7eLNAEHNACr")
public class DocumentProcessingTerminated {
    public static String blueId() {
        return "5AJiAUgiSDwfCzv9rCYKNaAJu1hm8BXFu7eLNAEHNACr";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Document Processing Terminated";
    }

    public static String qualifiedName() {
        return "Core/Document Processing Terminated";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Core/DocumentProcessingTerminated.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String cause;

    private String reason;

    public String getCause() {
        return cause;
    }

    public DocumentProcessingTerminated cause(String cause) {
        this.cause = cause;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public DocumentProcessingTerminated reason(String reason) {
        this.reason = reason;
        return this;
    }

}
