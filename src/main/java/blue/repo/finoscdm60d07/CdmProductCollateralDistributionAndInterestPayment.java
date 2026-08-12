package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("G7uiW62tU8ZEp154HMirF14igxnmokJoTp3RbgGSGvzQ")
public class CdmProductCollateralDistributionAndInterestPayment {
    public static String blueId() {
        return "G7uiW62tU8ZEp154HMirF14igxnmokJoTp3RbgGSGvzQ";
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
