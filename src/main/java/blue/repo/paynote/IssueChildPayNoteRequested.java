package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("4paCVJn58VgBo65rXHr4SXHCnbjPa5zrrAxKW3HNRS7Q")
public class IssueChildPayNoteRequested extends Request {
    public static String blueId() {
        return "4paCVJn58VgBo65rXHr4SXHCnbjPa5zrrAxKW3HNRS7Q";
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
