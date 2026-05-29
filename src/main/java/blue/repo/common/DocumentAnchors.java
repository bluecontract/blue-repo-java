package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5UhQNW5kxq9QrAkjnajrGV7B4nN5Cun6puDNkqUyxF4e")
public class DocumentAnchors {
    public static String blueId() {
        return "5UhQNW5kxq9QrAkjnajrGV7B4nN5Cun6puDNkqUyxF4e";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Document Anchors";
    }

    public static String qualifiedName() {
        return "Common/Document Anchors";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/DocumentAnchors.json";
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
