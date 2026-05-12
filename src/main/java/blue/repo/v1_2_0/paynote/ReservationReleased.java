package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("CFqiZigjKE5JatANkaAkWw2NbgvEmb2BVEVPf3ckUrWg")
public class ReservationReleased extends Response {
    public static String blueId() {
        return "CFqiZigjKE5JatANkaAkWw2NbgvEmb2BVEVPf3ckUrWg";
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
        return "blue/repo/v1_2_0/definitions/PayNote/ReservationReleased.json";
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
