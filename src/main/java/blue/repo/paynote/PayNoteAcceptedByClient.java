package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Event;

@TypeBlueId("9ST1DLJxByDzvtdeJt8SFeZadSYokstVbWYcGVXnrEzk")
public class PayNoteAcceptedByClient extends Event {
    public static String blueId() {
        return "9ST1DLJxByDzvtdeJt8SFeZadSYokstVbWYcGVXnrEzk";
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
        return "blue/repo/definitions/PayNote/PayNoteAcceptedByClient.json";
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
