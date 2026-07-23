package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HhGmdUeYu4H3B4pfgTNkwweuUqQ1bJ4YPNdcjC42K6bw")
public class DocumentAnchors extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "HhGmdUeYu4H3B4pfgTNkwweuUqQ1bJ4YPNdcjC42K6bw";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Anchors";
    }

    public static String qualifiedName() {
        return "Coordination/Document Anchors";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentAnchors.json";
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
