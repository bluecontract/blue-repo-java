package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HrFwCVPZz2sNinVETY4mk2sLLziGQWejTU2eWjxcUuuX")
public class DocumentLinks {
    public static String blueId() {
        return "HrFwCVPZz2sNinVETY4mk2sLLziGQWejTU2eWjxcUuuX";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Links";
    }

    public static String qualifiedName() {
        return "MyOS/Document Links";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/DocumentLinks.json";
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
