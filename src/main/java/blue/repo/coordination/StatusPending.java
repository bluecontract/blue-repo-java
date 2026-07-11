package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FD2aGQj6GEvKL7SseBdD8XRuXmmgHsZRRgMicJV5nFCc")
public class StatusPending extends Status {
    public static String blueId() {
        return "FD2aGQj6GEvKL7SseBdD8XRuXmmgHsZRRgMicJV5nFCc";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status Pending";
    }

    public static String qualifiedName() {
        return "Coordination/Status Pending";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusPending.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
