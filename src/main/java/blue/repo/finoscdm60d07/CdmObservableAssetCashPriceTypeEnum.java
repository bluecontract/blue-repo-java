package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9dUrzD1y7GL9TdKFceXPYzF4LkjJbsTTRtWN9aaKMyW7")
public class CdmObservableAssetCashPriceTypeEnum {
    public static String blueId() {
        return "9dUrzD1y7GL9TdKFceXPYzF4LkjJbsTTRtWN9aaKMyW7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CashPriceTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CashPriceTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCashPriceTypeEnum.json";
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
