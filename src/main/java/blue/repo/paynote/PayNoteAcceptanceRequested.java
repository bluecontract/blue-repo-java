package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("B2iduV8cAcvAuNCJ7HDZuR5N1YJETbdeohZF1EEXhTZE")
public class PayNoteAcceptanceRequested extends Request {
    public static String blueId() {
        return "B2iduV8cAcvAuNCJ7HDZuR5N1YJETbdeohZF1EEXhTZE";
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
