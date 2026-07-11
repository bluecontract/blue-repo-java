package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("2G6hwRBQbRA4D2n8vLPqD6hES44sGeh6kGF1uG88nn5R")
public class PayNoteCancellationRequested extends Request {
    public static String blueId() {
        return "2G6hwRBQbRA4D2n8vLPqD6hES44sGeh6kGF1uG88nn5R";
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
