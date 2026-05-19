package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Event;

@TypeBlueId("GtFG4Nt2fAamUZi9fSZNotab3BEUuv236LuPAcErVj5y")
public class PayNoteDeliveryFailed extends Event {
    public static String blueId() {
        return "GtFG4Nt2fAamUZi9fSZNotab3BEUuv236LuPAcErVj5y";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Delivery Failed";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Delivery Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteDeliveryFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public PayNoteDeliveryFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
