package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("Hcg9rpEFRbEcsVyx2Doq7MHZx9bhP4J32x3jA74AgTz7")
public class PayNoteAccepted extends Response {
    public static String blueId() {
        return "Hcg9rpEFRbEcsVyx2Doq7MHZx9bhP4J32x3jA74AgTz7";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Accepted";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Accepted";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteAccepted.json";
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
