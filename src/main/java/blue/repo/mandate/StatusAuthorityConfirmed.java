package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.StatusInProgress;

@TypeBlueId("65Lj5NBD9BaeXbWq1qQYcCyxV3EoH7r3rj877KDzbWCP")
public class StatusAuthorityConfirmed extends StatusInProgress {
    public static String blueId() {
        return "65Lj5NBD9BaeXbWq1qQYcCyxV3EoH7r3rj877KDzbWCP";
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
