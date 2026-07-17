package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.StatusCompleted;

@TypeBlueId("CMW7kGBbCw1uDmaV5ydLVnzRSo2iaBNDFTspMX9QdvZ2")
public class StatusTerminated extends StatusCompleted {
    public static String blueId() {
        return "CMW7kGBbCw1uDmaV5ydLVnzRSo2iaBNDFTspMX9QdvZ2";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Status Terminated";
    }

    public static String qualifiedName() {
        return "Mandate/Status Terminated";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/StatusTerminated.json";
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
