package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("47EN5A1B1ZXXdXMEoURVJquMSjdDuKFNDjMrkvVxoVJk")
public class Timestamp {
    public static String blueId() {
        return "47EN5A1B1ZXXdXMEoURVJquMSjdDuKFNDjMrkvVxoVJk";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Timestamp";
    }

    public static String qualifiedName() {
        return "Common/Timestamp";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Timestamp.json";
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
