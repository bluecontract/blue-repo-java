package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9iEADVdqxqgacF3GAZVMFZu4m5ywuNpsGzButLUNkPWo")
public class BootstrapFailed {
    public static String blueId() {
        return "9iEADVdqxqgacF3GAZVMFZu4m5ywuNpsGzButLUNkPWo";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Bootstrap Failed";
    }

    public static String qualifiedName() {
        return "MyOS/Bootstrap Failed";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/BootstrapFailed.json";
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

    public BootstrapFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
