package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ANGa5VARZehQFEWaSUBwwneoDMYRDt22j3S1esKYuhDw")
public class CommodityReferencePriceEnum {
    public static String blueId() {
        return "ANGa5VARZehQFEWaSUBwwneoDMYRDt22j3S1esKYuhDw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CommodityReferencePriceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CommodityReferencePriceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CommodityReferencePriceEnum.json";
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

    public CommodityReferencePriceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
