package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("DB6iVUgsWh96zaypurZR5jT6EGdwELEteNPomRqo4ZY7")
public class ChildPayNoteIssued extends Response {
    public static String blueId() {
        return "DB6iVUgsWh96zaypurZR5jT6EGdwELEteNPomRqo4ZY7";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Child PayNote Issued";
    }

    public static String qualifiedName() {
        return "PayNote/Child PayNote Issued";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ChildPayNoteIssued.json";
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

    public ChildPayNoteIssued childPayNote(Node childPayNote) {
        this.childPayNote = childPayNote;
        return this;
    }

}
