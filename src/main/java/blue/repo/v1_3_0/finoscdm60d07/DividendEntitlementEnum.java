package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HUJ5qePeHDZGujF6ZXJXX71Tku4qoCq91vnnSZakrbif")
public class DividendEntitlementEnum {
    public static String blueId() {
        return "HUJ5qePeHDZGujF6ZXJXX71Tku4qoCq91vnnSZakrbif";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendEntitlementEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendEntitlementEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DividendEntitlementEnum.json";
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

    public DividendEntitlementEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
