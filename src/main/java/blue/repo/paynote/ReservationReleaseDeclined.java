package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("6sJCbUQpaQxcBRSkTzKgMkmphhb6c3RoJERaZWvFTWex")
public class ReservationReleaseDeclined extends Response {
    public static String blueId() {
        return "6sJCbUQpaQxcBRSkTzKgMkmphhb6c3RoJERaZWvFTWex";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reservation Release Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Reservation Release Declined";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ReservationReleaseDeclined.json";
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

    public ReservationReleaseDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
