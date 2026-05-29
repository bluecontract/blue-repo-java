package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("G2cy3t7cJUpUHVWK5hhnYd8nGCfZn6tuwhknmXE5BuiW")
public class CdmEventCommonCollateralPortfolio {
    public static String blueId() {
        return "G2cy3t7cJUpUHVWK5hhnYd8nGCfZn6tuwhknmXE5BuiW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CollateralPortfolio";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CollateralPortfolio";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCollateralPortfolio.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventCommonCollateralBalance> collateralBalance;

    private List<CdmEventCommonCollateralPosition> collateralPosition;

    private CdmLegaldocumentationCommonMetafieldsReferenceWithMetaLegalAgreement legalAgreement;

    private CdmBaseStaticdataIdentifierIdentifier portfolioIdentifier;

    public List<CdmEventCommonCollateralBalance> getCollateralBalance() {
        return collateralBalance;
    }

    public CdmEventCommonCollateralPortfolio collateralBalance(List<CdmEventCommonCollateralBalance> collateralBalance) {
        this.collateralBalance = collateralBalance;
        return this;
    }

    public List<CdmEventCommonCollateralPosition> getCollateralPosition() {
        return collateralPosition;
    }

    public CdmEventCommonCollateralPortfolio collateralPosition(List<CdmEventCommonCollateralPosition> collateralPosition) {
        this.collateralPosition = collateralPosition;
        return this;
    }

    public CdmLegaldocumentationCommonMetafieldsReferenceWithMetaLegalAgreement getLegalAgreement() {
        return legalAgreement;
    }

    public CdmEventCommonCollateralPortfolio legalAgreement(CdmLegaldocumentationCommonMetafieldsReferenceWithMetaLegalAgreement legalAgreement) {
        this.legalAgreement = legalAgreement;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getPortfolioIdentifier() {
        return portfolioIdentifier;
    }

    public CdmEventCommonCollateralPortfolio portfolioIdentifier(CdmBaseStaticdataIdentifierIdentifier portfolioIdentifier) {
        this.portfolioIdentifier = portfolioIdentifier;
        return this;
    }

}
