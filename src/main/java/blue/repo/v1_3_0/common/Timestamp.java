package blue.repo.v1_3_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GQaGqFxHDz64L1c9QkCbz52ths6bMVtpHnw4QDngzQYs")
public class Timestamp {
    public static String blueId() {
        return "GQaGqFxHDz64L1c9QkCbz52ths6bMVtpHnw4QDngzQYs";
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
        return "blue/repo/v1_3_0/definitions/Common/Timestamp.json";
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
