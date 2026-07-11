package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Message;
import java.math.BigInteger;

@TypeBlueId("4kYaMvec6yt4xdXwoHaPDH1gXamJY11txz7cBeFuJYD5")
public class MandateActivated extends Message {
    public static String blueId() {
        return "4kYaMvec6yt4xdXwoHaPDH1gXamJY11txz7cBeFuJYD5";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate Activated";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate Activated";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/MandateActivated.json";
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

    public MandateActivated timestampUs(BigInteger timestampUs) {
        this.timestampUs = timestampUs;
        return this;
    }

}
