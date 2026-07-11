package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Message;

@TypeBlueId("8azbFfadtUzwW6iD96ajqrrW4szxitBLSGjLhKtj3HTc")
public class MandateTerminationRequested extends Message {
    public static String blueId() {
        return "8azbFfadtUzwW6iD96ajqrrW4szxitBLSGjLhKtj3HTc";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate Termination Requested";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate Termination Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/MandateTerminationRequested.json";
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

    public MandateTerminationRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
