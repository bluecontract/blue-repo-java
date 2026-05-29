package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6LzxLRpgV6a2HEZ98LXXF55BsfsTE8ChXghCZGBSJYSF")
public class DocumentAnchors {
    public static String blueId() {
        return "6LzxLRpgV6a2HEZ98LXXF55BsfsTE8ChXghCZGBSJYSF";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Anchors";
    }

    public static String qualifiedName() {
        return "MyOS/Document Anchors";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/DocumentAnchors.json";
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
