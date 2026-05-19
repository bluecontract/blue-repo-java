package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EWq52hzth8quHstTkqnrwDn2cXXd1fDc9uSSvBJBSbWs")
public class Collateral {
    public static String blueId() {
        return "EWq52hzth8quHstTkqnrwDn2cXXd1fDc9uSSvBJBSbWs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Collateral";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Collateral";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Collateral.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private List<ReferenceWithMetaCollateralPortfolio> collateralPortfolio;

    private CollateralProvisions collateralProvisions;

    private IndependentAmount independentAmount;

    private List<Identifier> portfolioIdentifier;

    public String getNamespace() {
        return namespace;
    }

    public Collateral namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferenceWithMetaCollateralPortfolio> getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public Collateral collateralPortfolio(List<ReferenceWithMetaCollateralPortfolio> collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CollateralProvisions getCollateralProvisions() {
        return collateralProvisions;
    }

    public Collateral collateralProvisions(CollateralProvisions collateralProvisions) {
        this.collateralProvisions = collateralProvisions;
        return this;
    }

    public IndependentAmount getIndependentAmount() {
        return independentAmount;
    }

    public Collateral independentAmount(IndependentAmount independentAmount) {
        this.independentAmount = independentAmount;
        return this;
    }

    public List<Identifier> getPortfolioIdentifier() {
        return portfolioIdentifier;
    }

    public Collateral portfolioIdentifier(List<Identifier> portfolioIdentifier) {
        this.portfolioIdentifier = portfolioIdentifier;
        return this;
    }

}
