package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FaZorE1FNvj9ar6rxL8jHRNYQ6WYo4hERoE35v7A5DnL")
public class BootstrapFailed {
    public static String blueId() {
        return "FaZorE1FNvj9ar6rxL8jHRNYQ6WYo4hERoE35v7A5DnL";
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
        return "blue/repo/definitions/MyOS/BootstrapFailed.json";
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
