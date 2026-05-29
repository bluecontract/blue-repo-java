package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("CP7T2PwEUP3xDiT6qMxNacVrigJFMKYFPLZCEkSdoddu")
public class ReservationReleased extends Response {
    public static String blueId() {
        return "CP7T2PwEUP3xDiT6qMxNacVrigJFMKYFPLZCEkSdoddu";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reservation Released";
    }

    public static String qualifiedName() {
        return "PayNote/Reservation Released";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ReservationReleased.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amountReleased;

    public BigInteger getAmountReleased() {
        return amountReleased;
    }

    public ReservationReleased amountReleased(BigInteger amountReleased) {
        this.amountReleased = amountReleased;
        return this;
    }

}
