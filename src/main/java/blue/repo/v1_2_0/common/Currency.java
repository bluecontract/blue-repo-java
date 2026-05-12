package blue.repo.v1_2_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CBnZ7aaNetj9KEqXpUWj5jvjKbmviLivP98T2EiyxiYc")
public class Currency {
    public static String blueId() {
        return "CBnZ7aaNetj9KEqXpUWj5jvjKbmviLivP98T2EiyxiYc";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Currency";
    }

    public static String qualifiedName() {
        return "Common/Currency";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Common/Currency.json";
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
