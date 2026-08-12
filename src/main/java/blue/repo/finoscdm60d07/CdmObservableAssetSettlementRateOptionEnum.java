package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EwUsZoM9DmKcQmfrnDG5YCv3bF338gxD6n6WWJmgGirC")
public class CdmObservableAssetSettlementRateOptionEnum {
    public static String blueId() {
        return "EwUsZoM9DmKcQmfrnDG5YCv3bF338gxD6n6WWJmgGirC";
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
