package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;

@TypeBlueId("DqiwzsNLbHCh6PaDF6wy6ZqBSF5JV5nAQSKFKTPRTbGB")
public class PayNoteCancellationRequested extends Request {
    public static String blueId() {
        return "DqiwzsNLbHCh6PaDF6wy6ZqBSF5JV5nAQSKFKTPRTbGB";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Cancellation Requested";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Cancellation Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteCancellationRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node childPayNote;

    public Node getChildPayNote() {
        return childPayNote;
    }

    public PayNoteCancellationRequested childPayNote(Node childPayNote) {
        this.childPayNote = childPayNote;
        return this;
    }

}
