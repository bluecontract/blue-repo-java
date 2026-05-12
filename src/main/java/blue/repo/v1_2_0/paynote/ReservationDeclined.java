package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("4xS8bmZQBGPENmaPfsrtYguYfq4hTtaZAXrefdyFNkKq")
public class ReservationDeclined extends Response {
    public static String blueId() {
        return "4xS8bmZQBGPENmaPfsrtYguYfq4hTtaZAXrefdyFNkKq";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reservation Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Reservation Declined";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/ReservationDeclined.json";
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

    public ReservationDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
