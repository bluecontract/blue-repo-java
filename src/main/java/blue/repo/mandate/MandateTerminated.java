package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Message;

@TypeBlueId("C6zMJV5BTUBbzAQ4UJ2jcaNjxhravLVF82euN8hNe5K8")
public class MandateTerminated extends Message {
    public static String blueId() {
        return "C6zMJV5BTUBbzAQ4UJ2jcaNjxhravLVF82euN8hNe5K8";
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

    private String reason;

    public String getReason() {
        return reason;
    }

    public MandateTerminated reason(String reason) {
        this.reason = reason;
        return this;
    }

}
