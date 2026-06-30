package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EQwUBWQNzAfwaD546noV7pi1eo589s6uaDsRWdx2YCMX")
public class CdmProductCollateralCollateralCriteriaBase {
    public static String blueId() {
        return "EQwUBWQNzAfwaD546noV7pi1eo589s6uaDsRWdx2YCMX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralCriteriaBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralCriteriaBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralCriteriaBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyCounterpartyRoleEnum> appliesTo;

    private CdmProductCollateralCollateralCriteria collateralCriteria;

    private CdmProductCollateralRatingPriorityResolutionEnum ratingPriorityResolution;

    private CdmProductCollateralCollateralMarginTypeEnum restrictTo;

    public List<CdmBaseStaticdataPartyCounterpartyRoleEnum> getAppliesTo() {
        return appliesTo;
    }

    public CdmProductCollateralCollateralCriteriaBase appliesTo(List<CdmBaseStaticdataPartyCounterpartyRoleEnum> appliesTo) {
        this.appliesTo = appliesTo;
        return this;
    }

    public CdmProductCollateralCollateralCriteria getCollateralCriteria() {
        return collateralCriteria;
    }

    public CdmProductCollateralCollateralCriteriaBase collateralCriteria(CdmProductCollateralCollateralCriteria collateralCriteria) {
        this.collateralCriteria = collateralCriteria;
        return this;
    }

    public CdmProductCollateralRatingPriorityResolutionEnum getRatingPriorityResolution() {
        return ratingPriorityResolution;
    }

    public CdmProductCollateralCollateralCriteriaBase ratingPriorityResolution(CdmProductCollateralRatingPriorityResolutionEnum ratingPriorityResolution) {
        this.ratingPriorityResolution = ratingPriorityResolution;
        return this;
    }

    public CdmProductCollateralCollateralMarginTypeEnum getRestrictTo() {
        return restrictTo;
    }

    public CdmProductCollateralCollateralCriteriaBase restrictTo(CdmProductCollateralCollateralMarginTypeEnum restrictTo) {
        this.restrictTo = restrictTo;
        return this;
    }

}
