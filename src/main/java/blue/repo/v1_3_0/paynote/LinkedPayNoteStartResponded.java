package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("BQioEtRPYv2fWVryRsSYQc1Vnp9eyX3CYDrNY1hEy1Ye")
public class LinkedPayNoteStartResponded extends Response {
    public static String blueId() {
        return "BQioEtRPYv2fWVryRsSYQc1Vnp9eyX3CYDrNY1hEy1Ye";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Linked PayNote Start Responded";
    }

    public static String qualifiedName() {
        return "PayNote/Linked PayNote Start Responded";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/LinkedPayNoteStartResponded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String status;

    private String reason;

    public String getStatus() {
        return status;
    }

    public LinkedPayNoteStartResponded status(String status) {
        this.status = status;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public LinkedPayNoteStartResponded reason(String reason) {
        this.reason = reason;
        return this;
    }

}
