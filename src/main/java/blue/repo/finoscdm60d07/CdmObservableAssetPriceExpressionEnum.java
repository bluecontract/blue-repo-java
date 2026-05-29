package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BnAG4RP2obdcr7RWMq3ZjCqF1qqaR9bNygoiLRRB5mxQ")
public class CdmObservableAssetPriceExpressionEnum {
    public static String blueId() {
        return "BnAG4RP2obdcr7RWMq3ZjCqF1qqaR9bNygoiLRRB5mxQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/PriceExpressionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/PriceExpressionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPriceExpressionEnum.json";
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
