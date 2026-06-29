package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EE9ddWepUCVpA88PcNq8buPwyuFbJawoqrJwAAwpCjcx")
public class CdmProductCollateralCollateralProvisions {
    public static String blueId() {
        return "EE9ddWepUCVpA88PcNq8buPwyuFbJawoqrJwAAwpCjcx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralProvisions";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralProvisions";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralProvisions.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralCollateralTypeEnum collateralType;

    private List<CdmProductCollateralEligibleCollateralCriteria> eligibleCollateral;

    private CdmProductCollateralSubstitutionProvisions substitutionProvisions;

    public CdmProductCollateralCollateralTypeEnum getCollateralType() {
        return collateralType;
    }

    public CdmProductCollateralCollateralProvisions collateralType(CdmProductCollateralCollateralTypeEnum collateralType) {
        this.collateralType = collateralType;
        return this;
    }

    public List<CdmProductCollateralEligibleCollateralCriteria> getEligibleCollateral() {
        return eligibleCollateral;
    }

    public CdmProductCollateralCollateralProvisions eligibleCollateral(List<CdmProductCollateralEligibleCollateralCriteria> eligibleCollateral) {
        this.eligibleCollateral = eligibleCollateral;
        return this;
    }

    public CdmProductCollateralSubstitutionProvisions getSubstitutionProvisions() {
        return substitutionProvisions;
    }

    public CdmProductCollateralCollateralProvisions substitutionProvisions(CdmProductCollateralSubstitutionProvisions substitutionProvisions) {
        this.substitutionProvisions = substitutionProvisions;
        return this;
    }

}
