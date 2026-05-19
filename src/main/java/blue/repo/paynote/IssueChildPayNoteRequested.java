package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;

@TypeBlueId("53Dir2sGy1NHuCQXF6suGoDMxYacNhbcy23AKD89SghD")
public class IssueChildPayNoteRequested extends Request {
    public static String blueId() {
        return "53Dir2sGy1NHuCQXF6suGoDMxYacNhbcy23AKD89SghD";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Issue Child PayNote Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Issue Child PayNote Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/IssueChildPayNoteRequested.json";
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

    public IssueChildPayNoteRequested childPayNote(Node childPayNote) {
        this.childPayNote = childPayNote;
        return this;
    }

}
