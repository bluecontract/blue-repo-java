package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("2qhzWiZAVUTJvuAhexA8vRHrXWdWu7UGyAYPnfvEmTkV")
public class PayNoteAcceptanceRequested extends Request {
    public static String blueId() {
        return "2qhzWiZAVUTJvuAhexA8vRHrXWdWu7UGyAYPnfvEmTkV";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Acceptance Requested";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Acceptance Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteAcceptanceRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
