package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("rdiMJ9tNu3geCKLDwXxCCjVQzKvCyaFXHiZTFAkRsCJ")
public class Currency {
    public static String blueId() {
        return "rdiMJ9tNu3geCKLDwXxCCjVQzKvCyaFXHiZTFAkRsCJ";
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
        return "blue/repo/definitions/Common/Currency.json";
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
