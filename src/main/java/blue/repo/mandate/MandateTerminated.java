package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Message;
import java.math.BigInteger;

@TypeBlueId("5SR8BVQL9t5UakLBZFfmnFb4hEPrGx8NUcpMT2gncA16")
public class MandateTerminated extends Message {
    public static String blueId() {
        return "5SR8BVQL9t5UakLBZFfmnFb4hEPrGx8NUcpMT2gncA16";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate Terminated";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate Terminated";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/MandateTerminated.json";
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

    private String reason;

    public BigInteger getTimestampUs() {
        return timestampUs;
    }

    public MandateTerminated timestampUs(BigInteger timestampUs) {
        this.timestampUs = timestampUs;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public MandateTerminated reason(String reason) {
        this.reason = reason;
        return this;
    }

}
