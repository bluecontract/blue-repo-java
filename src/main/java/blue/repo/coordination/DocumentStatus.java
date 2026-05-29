package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9rzc7B4yEw9gVuuaoFbRUpfajTPuxBLecVWkmHuBSg7z")
public class DocumentStatus {
    public static String blueId() {
        return "9rzc7B4yEw9gVuuaoFbRUpfajTPuxBLecVWkmHuBSg7z";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Status";
    }

    public static String qualifiedName() {
        return "Coordination/Document Status";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentStatus.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String mode;

    public String getMode() {
        return mode;
    }

    public DocumentStatus mode(String mode) {
        this.mode = mode;
        return this;
    }

}
