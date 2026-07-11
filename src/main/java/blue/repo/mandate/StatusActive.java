package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.StatusInProgress;

@TypeBlueId("DnV7ApZKxa9qvJHNrgbxNHz1BPCh2G2SToh1sQAUFemd")
public class StatusActive extends StatusInProgress {
    public static String blueId() {
        return "DnV7ApZKxa9qvJHNrgbxNHz1BPCh2G2SToh1sQAUFemd";
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
