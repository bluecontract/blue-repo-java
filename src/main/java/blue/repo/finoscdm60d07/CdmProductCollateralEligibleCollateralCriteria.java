package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3GcdhwSwCmcXjxmxraErSqcv6hktXM5krtm5PeusABq6")
public class CdmProductCollateralEligibleCollateralCriteria {
    public static String blueId() {
        return "3GcdhwSwCmcXjxmxraErSqcv6hktXM5krtm5PeusABq6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/EligibleCollateralCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/EligibleCollateralCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralEligibleCollateralCriteria.json";
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

    private CdmProductCollateralCollateralTreatment treatment;

    public List<CdmBaseStaticdataPartyCounterpartyRoleEnum> getAppliesTo() {
        return appliesTo;
    }

    public CdmProductCollateralEligibleCollateralCriteria appliesTo(List<CdmBaseStaticdataPartyCounterpartyRoleEnum> appliesTo) {
        this.appliesTo = appliesTo;
        return this;
    }

    public CdmProductCollateralCollateralCriteria getCollateralCriteria() {
        return collateralCriteria;
    }

    public CdmProductCollateralEligibleCollateralCriteria collateralCriteria(CdmProductCollateralCollateralCriteria collateralCriteria) {
        this.collateralCriteria = collateralCriteria;
        return this;
    }

    public CdmProductCollateralRatingPriorityResolutionEnum getRatingPriorityResolution() {
        return ratingPriorityResolution;
    }

    public CdmProductCollateralEligibleCollateralCriteria ratingPriorityResolution(CdmProductCollateralRatingPriorityResolutionEnum ratingPriorityResolution) {
        this.ratingPriorityResolution = ratingPriorityResolution;
        return this;
    }

    public CdmProductCollateralCollateralMarginTypeEnum getRestrictTo() {
        return restrictTo;
    }

    public CdmProductCollateralEligibleCollateralCriteria restrictTo(CdmProductCollateralCollateralMarginTypeEnum restrictTo) {
        this.restrictTo = restrictTo;
        return this;
    }

    public CdmProductCollateralCollateralTreatment getTreatment() {
        return treatment;
    }

    public CdmProductCollateralEligibleCollateralCriteria treatment(CdmProductCollateralCollateralTreatment treatment) {
        this.treatment = treatment;
        return this;
    }

}
