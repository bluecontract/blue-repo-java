package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("8DVJqK8XnidDVa8ToiHg2C67LzszVMrV57yircF3zzyM")
public class PayNoteApproved extends Response {
    public static String blueId() {
        return "8DVJqK8XnidDVa8ToiHg2C67LzszVMrV57yircF3zzyM";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Approved";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Approved";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteApproved.json";
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
