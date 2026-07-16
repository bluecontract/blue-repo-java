package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("DhMGXZUUoZKjNmPbBKyY882k9rAnPK5F6Kup76KPLdKR")
public class ReservationDeclined extends Response {
    public static String blueId() {
        return "DhMGXZUUoZKjNmPbBKyY882k9rAnPK5F6Kup76KPLdKR";
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
        return "blue/repo/definitions/PayNote/ReservationDeclined.json";
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
