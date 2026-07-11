package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.StatusInProgress;

@TypeBlueId("AgwzrsZ7sDFXUryLWQdjG6w8D7SRLMXFWHuVFLa55jcZ")
public class StatusAuthorityConfirmed extends StatusInProgress {
    public static String blueId() {
        return "AgwzrsZ7sDFXUryLWQdjG6w8D7SRLMXFWHuVFLa55jcZ";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Status Authority Confirmed";
    }

    public static String qualifiedName() {
        return "Mandate/Status Authority Confirmed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/StatusAuthorityConfirmed.json";
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
