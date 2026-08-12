package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("21xGvoNnChKXaDXVNTEgYY1eJr849T5okU3aXsrCK2PB")
public class CdmObservableAssetCreditRatingAgencyEnum {
    public static String blueId() {
        return "21xGvoNnChKXaDXVNTEgYY1eJr849T5okU3aXsrCK2PB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CreditRatingAgencyEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CreditRatingAgencyEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCreditRatingAgencyEnum.json";
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
