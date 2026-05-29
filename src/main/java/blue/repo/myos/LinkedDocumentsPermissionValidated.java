package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("Gqf8h8GKR98kdptTXPABstPSc5ezuKGRsTQ8w1QDcSnQ")
public class LinkedDocumentsPermissionValidated extends Response {
    public static String blueId() {
        return "Gqf8h8GKR98kdptTXPABstPSc5ezuKGRsTQ8w1QDcSnQ";
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
