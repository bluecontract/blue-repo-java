package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FBpr8kFbhE4mShex7etEW6a31qSN2eZBoEGNT5SSSBfa")
public class CdmObservableAssetSettlementRateOptionEnum {
    public static String blueId() {
        return "FBpr8kFbhE4mShex7etEW6a31qSN2eZBoEGNT5SSSBfa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/SettlementRateOptionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/SettlementRateOptionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetSettlementRateOptionEnum.json";
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
