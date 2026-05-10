package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.common.Timestamp;
import blue.repository.v0_28_0.conversation.Event;

@TypeBlueId("6VQC585V4SdpyA5hCeQQGM178bbeW3D2WcKt8ZCWK9s3")
public class PayNoteAcceptedByClient extends Event {
    public static String blueId() {
        return "6VQC585V4SdpyA5hCeQQGM178bbeW3D2WcKt8ZCWK9s3";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Accepted By Client";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Accepted By Client";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/PayNoteAcceptedByClient.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Timestamp acceptedAt;

    public Timestamp getAcceptedAt() {
        return acceptedAt;
    }

    public PayNoteAcceptedByClient acceptedAt(Timestamp acceptedAt) {
        this.acceptedAt = acceptedAt;
        return this;
    }

}
