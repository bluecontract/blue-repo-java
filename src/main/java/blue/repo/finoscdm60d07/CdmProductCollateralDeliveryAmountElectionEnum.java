package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7zN23BZUEoGuJWr9KLCaerDQuzA6dqYYf1EKtMJarYkq")
public class CdmProductCollateralDeliveryAmountElectionEnum {
    public static String blueId() {
        return "7zN23BZUEoGuJWr9KLCaerDQuzA6dqYYf1EKtMJarYkq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/DeliveryAmountElectionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/DeliveryAmountElectionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralDeliveryAmountElectionEnum.json";
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
