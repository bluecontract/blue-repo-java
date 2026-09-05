package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2KZkqLnYVCsKupy8GLpvResn2QdzohZWF89GhPp3wzh5")
public class DocumentAnchors extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "2KZkqLnYVCsKupy8GLpvResn2QdzohZWF89GhPp3wzh5";
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
