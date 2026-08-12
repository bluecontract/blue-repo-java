package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("A1Ra7o2G3gF5RCJzKax5ftXky5TQrPcvjPmMipvv3PA7")
public class LinkedPayNoteStarted extends Response {
    public static String blueId() {
        return "A1Ra7o2G3gF5RCJzKax5ftXky5TQrPcvjPmMipvv3PA7";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Linked PayNote Started";
    }

    public static String qualifiedName() {
        return "PayNote/Linked PayNote Started";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/LinkedPayNoteStarted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String payNoteSessionId;

    private String payNoteDocumentId;

    public String getPayNoteSessionId() {
        return payNoteSessionId;
    }

    public LinkedPayNoteStarted payNoteSessionId(String payNoteSessionId) {
        this.payNoteSessionId = payNoteSessionId;
        return this;
    }

    public String getPayNoteDocumentId() {
        return payNoteDocumentId;
    }

    public LinkedPayNoteStarted payNoteDocumentId(String payNoteDocumentId) {
        this.payNoteDocumentId = payNoteDocumentId;
        return this;
    }

}
