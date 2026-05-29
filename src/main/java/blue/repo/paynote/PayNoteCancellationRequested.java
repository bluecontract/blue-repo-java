package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("3RY8mx3eh39FJDi6wBK95ZLr9vq8aXNWy7ynX95hCR8z")
public class PayNoteCancellationRequested extends Request {
    public static String blueId() {
        return "3RY8mx3eh39FJDi6wBK95ZLr9vq8aXNWy7ynX95hCR8z";
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
