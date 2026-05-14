package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hwp8TYT9wFtwwDz88WRCnqX18m4mzmHgqrU8pURnjMmZ")
public class ISOCurrencyCodeEnum {
    public static String blueId() {
        return "Hwp8TYT9wFtwwDz88WRCnqX18m4mzmHgqrU8pURnjMmZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ISOCurrencyCodeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ISOCurrencyCodeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ISOCurrencyCodeEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public ISOCurrencyCodeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
