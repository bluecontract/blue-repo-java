package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("8dggwonfALwrTSRhg8g8ncXFXierke2mogtEZQXHab64")
public class LinkedPayNoteStartFailed extends Response {
    public static String blueId() {
        return "8dggwonfALwrTSRhg8g8ncXFXierke2mogtEZQXHab64";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Linked PayNote Start Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Linked PayNote Start Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/LinkedPayNoteStartFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public LinkedPayNoteStartFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
