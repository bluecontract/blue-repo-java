package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("GU8nkSnUuMs6632rHQyBndRtjDcMB9ZSbgwkGYcfGt97")
public class ReservationReleaseRequested extends Request {
    public static String blueId() {
        return "GU8nkSnUuMs6632rHQyBndRtjDcMB9ZSbgwkGYcfGt97";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reservation Release Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Reservation Release Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ReservationReleaseRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amount;

    public BigInteger getAmount() {
        return amount;
    }

    public ReservationReleaseRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

}
