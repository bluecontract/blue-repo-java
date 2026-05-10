package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("FAZCx2s5eq9zPV64LdHNFYbjjxD3ci1ZqyTcQk5WhXAs")
public class ChildPayNoteIssued extends Response {
    public static String blueId() {
        return "FAZCx2s5eq9zPV64LdHNFYbjjxD3ci1ZqyTcQk5WhXAs";
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
        return "blue/repository/v0_28_0/definitions/PayNote/ChildPayNoteIssued.json";
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
