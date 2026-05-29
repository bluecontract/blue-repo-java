package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("2BGKdGTmrSuS7j7wE2bneyopsfgj5MwLLeU21CodKn4p")
public class IssueChildPayNoteRequested extends Request {
    public static String blueId() {
        return "2BGKdGTmrSuS7j7wE2bneyopsfgj5MwLLeU21CodKn4p";
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
