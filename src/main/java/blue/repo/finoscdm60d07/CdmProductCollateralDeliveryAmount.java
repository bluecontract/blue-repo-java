package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4YTA1E4uwjskCqTfuhW2LSGT6LEXwkh3y2Sps8W8XFWs")
public class CdmProductCollateralDeliveryAmount {
    public static String blueId() {
        return "4YTA1E4uwjskCqTfuhW2LSGT6LEXwkh3y2Sps8W8XFWs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/DeliveryAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/DeliveryAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralDeliveryAmount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String customElection;

    private CdmProductCollateralDeliveryAmountElectionEnum standardElection;

    public String getCustomElection() {
        return customElection;
    }

    public CdmProductCollateralDeliveryAmount customElection(String customElection) {
        this.customElection = customElection;
        return this;
    }

    public CdmProductCollateralDeliveryAmountElectionEnum getStandardElection() {
        return standardElection;
    }

    public CdmProductCollateralDeliveryAmount standardElection(CdmProductCollateralDeliveryAmountElectionEnum standardElection) {
        this.standardElection = standardElection;
        return this;
    }

}
