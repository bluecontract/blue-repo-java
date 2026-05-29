package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9bqvrNKcjCcPiCxRzbyxGxZxmA12bMERkxetj5qQnFg4")
public class CdmObservableAssetCommodityReferencePriceEnum {
    public static String blueId() {
        return "9bqvrNKcjCcPiCxRzbyxGxZxmA12bMERkxetj5qQnFg4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CommodityReferencePriceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CommodityReferencePriceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCommodityReferencePriceEnum.json";
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
