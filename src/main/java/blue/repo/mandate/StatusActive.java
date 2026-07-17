package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.StatusInProgress;

@TypeBlueId("por6Zfmm5x6kxeeeoARgZRVLWrZaDkTU3Dybc2TncPx")
public class StatusActive extends StatusInProgress {
    public static String blueId() {
        return "por6Zfmm5x6kxeeeoARgZRVLWrZaDkTU3Dybc2TncPx";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Status Active";
    }

    public static String qualifiedName() {
        return "Mandate/Status Active";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/StatusActive.json";
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
