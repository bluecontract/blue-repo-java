package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GeZWvUThNX3mSiYHbmQAjoE7tffzYFRiC4dktuRGe1sS")
public class StatusFailed extends Status {
    public static String blueId() {
        return "GeZWvUThNX3mSiYHbmQAjoE7tffzYFRiC4dktuRGe1sS";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status Failed";
    }

    public static String qualifiedName() {
        return "Coordination/Status Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusFailed.json";
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
