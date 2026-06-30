package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6jhHzxNcd11YEG9a9f1yBWhmm5qpzmbZ6E7JEqHpPj7r")
public class CdmProductCollateralCollateral {
    public static String blueId() {
        return "6jhHzxNcd11YEG9a9f1yBWhmm5qpzmbZ6E7JEqHpPj7r";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/Collateral";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/Collateral";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateral.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio> collateralPortfolio;

    private CdmProductCollateralCollateralProvisions collateralProvisions;

    private CdmProductCollateralIndependentAmount independentAmount;

    private List<CdmBaseStaticdataIdentifierIdentifier> portfolioIdentifier;

    public List<CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio> getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public CdmProductCollateralCollateral collateralPortfolio(List<CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio> collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CdmProductCollateralCollateralProvisions getCollateralProvisions() {
        return collateralProvisions;
    }

    public CdmProductCollateralCollateral collateralProvisions(CdmProductCollateralCollateralProvisions collateralProvisions) {
        this.collateralProvisions = collateralProvisions;
        return this;
    }

    public CdmProductCollateralIndependentAmount getIndependentAmount() {
        return independentAmount;
    }

    public CdmProductCollateralCollateral independentAmount(CdmProductCollateralIndependentAmount independentAmount) {
        this.independentAmount = independentAmount;
        return this;
    }

    public List<CdmBaseStaticdataIdentifierIdentifier> getPortfolioIdentifier() {
        return portfolioIdentifier;
    }

    public CdmProductCollateralCollateral portfolioIdentifier(List<CdmBaseStaticdataIdentifierIdentifier> portfolioIdentifier) {
        this.portfolioIdentifier = portfolioIdentifier;
        return this;
    }

}
