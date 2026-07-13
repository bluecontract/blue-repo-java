package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Message;
import java.math.BigInteger;

@TypeBlueId("EbNsQWy645JPPuWhkDw3XcrQk1neH2Z8KBsTvUTCrrmk")
public class MandateAuthorityConfirmed extends Message {
    public static String blueId() {
        return "EbNsQWy645JPPuWhkDw3XcrQk1neH2Z8KBsTvUTCrrmk";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate Authority Confirmed";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate Authority Confirmed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/MandateAuthorityConfirmed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger timestampUs;

    public BigInteger getTimestampUs() {
        return timestampUs;
    }

    public MandateAuthorityConfirmed timestampUs(BigInteger timestampUs) {
        this.timestampUs = timestampUs;
        return this;
    }

}
