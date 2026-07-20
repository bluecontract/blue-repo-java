package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("GiwuMm3gtbi79CVSUtHGZmpUnQma7EK6A17G9PRmh6jK")
public class BootstrapFailed extends Event {
    public static String blueId() {
        return "GiwuMm3gtbi79CVSUtHGZmpUnQma7EK6A17G9PRmh6jK";
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
