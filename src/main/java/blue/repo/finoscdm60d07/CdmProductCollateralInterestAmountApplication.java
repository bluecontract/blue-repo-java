package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8Gv1Qef23Mz4g1ohaQfw4qpqAEfyrSh8MP24i2eHPWCd")
public class CdmProductCollateralInterestAmountApplication {
    public static String blueId() {
        return "8Gv1Qef23Mz4g1ohaQfw4qpqAEfyrSh8MP24i2eHPWCd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/InterestAmountApplication";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/InterestAmountApplication";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralInterestAmountApplication.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralDeliveryAmount deliveryAmount;

    private CdmProductCollateralReturnAmount returnAmount;

    public CdmProductCollateralDeliveryAmount getDeliveryAmount() {
        return deliveryAmount;
    }

    public CdmProductCollateralInterestAmountApplication deliveryAmount(CdmProductCollateralDeliveryAmount deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
        return this;
    }

    public CdmProductCollateralReturnAmount getReturnAmount() {
        return returnAmount;
    }

    public CdmProductCollateralInterestAmountApplication returnAmount(CdmProductCollateralReturnAmount returnAmount) {
        this.returnAmount = returnAmount;
        return this;
    }

}
