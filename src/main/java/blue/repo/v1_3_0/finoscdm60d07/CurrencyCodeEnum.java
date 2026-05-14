package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5Cc32mKEHfv3Tf4CoTNWUzsdGeG7nU65jGHC1nN3yvEr")
public class CurrencyCodeEnum {
    public static String blueId() {
        return "5Cc32mKEHfv3Tf4CoTNWUzsdGeG7nU65jGHC1nN3yvEr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CurrencyCodeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CurrencyCodeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CurrencyCodeEnum.json";
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

    public CurrencyCodeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
