package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.common.Timestamp;
import blue.repo.v1_2_0.conversation.Event;

@TypeBlueId("EGRRGwNnReqfQQhKnML28DWz9MvvC3B5JgbBrCUxrZ3G")
public class PayNoteRejectedByClient extends Event {
    public static String blueId() {
        return "EGRRGwNnReqfQQhKnML28DWz9MvvC3B5JgbBrCUxrZ3G";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Rejected By Client";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Rejected By Client";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/PayNoteRejectedByClient.json";
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

    private Timestamp rejectedAt;

    public String getReason() {
        return reason;
    }

    public PayNoteRejectedByClient reason(String reason) {
        this.reason = reason;
        return this;
    }

    public Timestamp getRejectedAt() {
        return rejectedAt;
    }

    public PayNoteRejectedByClient rejectedAt(Timestamp rejectedAt) {
        this.rejectedAt = rejectedAt;
        return this;
    }

}
