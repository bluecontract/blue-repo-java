package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("CfSpcRXYk2qwu1vNs9LL8rycBsxzL2R4LGyDdrDzwCjh")
public class PayNoteAccepted extends Response {
    public static String blueId() {
        return "CfSpcRXYk2qwu1vNs9LL8rycBsxzL2R4LGyDdrDzwCjh";
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
        return "blue/repo/v1_3_0/definitions/PayNote/PayNoteAccepted.json";
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
