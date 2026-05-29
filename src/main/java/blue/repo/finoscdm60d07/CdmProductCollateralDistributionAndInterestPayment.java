package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CfT3sBACoyTCJm6gdNWaauJSLdFjDYBNHcxDsMWy6iuH")
public class CdmProductCollateralDistributionAndInterestPayment {
    public static String blueId() {
        return "CfT3sBACoyTCJm6gdNWaauJSLdFjDYBNHcxDsMWy6iuH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/DistributionAndInterestPayment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/DistributionAndInterestPayment";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralDistributionAndInterestPayment.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCollateralCollateralInterestParameters> interestParameters;

    public List<CdmProductCollateralCollateralInterestParameters> getInterestParameters() {
        return interestParameters;
    }

    public CdmProductCollateralDistributionAndInterestPayment interestParameters(List<CdmProductCollateralCollateralInterestParameters> interestParameters) {
        this.interestParameters = interestParameters;
        return this;
    }

}
