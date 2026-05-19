package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("DFMcBSRfNqK6NqdNLCF8b88soezajjq4gyBS8QRzSBhe")
public class LinkedDocumentsPermissionValidated extends Response {
    public static String blueId() {
        return "DFMcBSRfNqK6NqdNLCF8b88soezajjq4gyBS8QRzSBhe";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Validated";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Validated";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/LinkedDocumentsPermissionValidated.json";
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
