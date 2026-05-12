package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("58B8orsFkxxy7bWqjLXJmtBs2b5rwnNQNbeoAbGhPkJc")
public class DocumentStatus {
    public static String blueId() {
        return "58B8orsFkxxy7bWqjLXJmtBs2b5rwnNQNbeoAbGhPkJc";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Status";
    }

    public static String qualifiedName() {
        return "Conversation/Document Status";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/DocumentStatus.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String mode;

    public String getMode() {
        return mode;
    }

    public DocumentStatus mode(String mode) {
        this.mode = mode;
        return this;
    }

}
