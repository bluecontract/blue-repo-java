package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("25sPM8RwqrMyZTDdVy6ceR7vEwisxNPGXpHzHqftjjCf")
public class CollateralPortfolio {
    public static String blueId() {
        return "25sPM8RwqrMyZTDdVy6ceR7vEwisxNPGXpHzHqftjjCf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralPortfolio";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralPortfolio";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralPortfolio.json";
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

    private List<CollateralBalance> collateralBalance;

    private List<CollateralPosition> collateralPosition;

    private ReferenceWithMetaLegalAgreement legalAgreement;

    private Identifier portfolioIdentifier;

    public String getNamespace() {
        return namespace;
    }

    public CollateralPortfolio namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CollateralBalance> getCollateralBalance() {
        return collateralBalance;
    }

    public CollateralPortfolio collateralBalance(List<CollateralBalance> collateralBalance) {
        this.collateralBalance = collateralBalance;
        return this;
    }

    public List<CollateralPosition> getCollateralPosition() {
        return collateralPosition;
    }

    public CollateralPortfolio collateralPosition(List<CollateralPosition> collateralPosition) {
        this.collateralPosition = collateralPosition;
        return this;
    }

    public ReferenceWithMetaLegalAgreement getLegalAgreement() {
        return legalAgreement;
    }

    public CollateralPortfolio legalAgreement(ReferenceWithMetaLegalAgreement legalAgreement) {
        this.legalAgreement = legalAgreement;
        return this;
    }

    public Identifier getPortfolioIdentifier() {
        return portfolioIdentifier;
    }

    public CollateralPortfolio portfolioIdentifier(Identifier portfolioIdentifier) {
        this.portfolioIdentifier = portfolioIdentifier;
        return this;
    }

}
