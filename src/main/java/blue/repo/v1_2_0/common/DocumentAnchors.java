package blue.repo.v1_2_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3KRfhgbFdvyW9SGuKiq3WxWF9bHSATEb8tMso8Pykpre")
public class DocumentAnchors {
    public static String blueId() {
        return "3KRfhgbFdvyW9SGuKiq3WxWF9bHSATEb8tMso8Pykpre";
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
        return "blue/repo/v1_2_0/definitions/Common/DocumentAnchors.json";
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
