package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FzdjhNEc5CouNmNAxV4Dco95NE9z2qjSmv9TGnkPD5AM")
public class FloatingRateIndexCategoryEnum {
    public static String blueId() {
        return "FzdjhNEc5CouNmNAxV4Dco95NE9z2qjSmv9TGnkPD5AM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndexCategoryEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndexCategoryEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateIndexCategoryEnum.json";
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

    public FloatingRateIndexCategoryEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
