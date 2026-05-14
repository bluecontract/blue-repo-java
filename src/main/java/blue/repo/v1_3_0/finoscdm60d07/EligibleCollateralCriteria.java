package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GBEjAv1Sq34YZbzbYvKfWnzWG5QHDjmBayZf13xAeW89")
public class EligibleCollateralCriteria {
    public static String blueId() {
        return "GBEjAv1Sq34YZbzbYvKfWnzWG5QHDjmBayZf13xAeW89";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EligibleCollateralCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EligibleCollateralCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EligibleCollateralCriteria.json";
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

    private List<CounterpartyRoleEnum> appliesTo;

    private CollateralCriteria collateralCriteria;

    private RatingPriorityResolutionEnum ratingPriorityResolution;

    private CollateralMarginTypeEnum restrictTo;

    private CollateralTreatment treatment;

    public String getNamespace() {
        return namespace;
    }

    public EligibleCollateralCriteria namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CounterpartyRoleEnum> getAppliesTo() {
        return appliesTo;
    }

    public EligibleCollateralCriteria appliesTo(List<CounterpartyRoleEnum> appliesTo) {
        this.appliesTo = appliesTo;
        return this;
    }

    public CollateralCriteria getCollateralCriteria() {
        return collateralCriteria;
    }

    public EligibleCollateralCriteria collateralCriteria(CollateralCriteria collateralCriteria) {
        this.collateralCriteria = collateralCriteria;
        return this;
    }

    public RatingPriorityResolutionEnum getRatingPriorityResolution() {
        return ratingPriorityResolution;
    }

    public EligibleCollateralCriteria ratingPriorityResolution(RatingPriorityResolutionEnum ratingPriorityResolution) {
        this.ratingPriorityResolution = ratingPriorityResolution;
        return this;
    }

    public CollateralMarginTypeEnum getRestrictTo() {
        return restrictTo;
    }

    public EligibleCollateralCriteria restrictTo(CollateralMarginTypeEnum restrictTo) {
        this.restrictTo = restrictTo;
        return this;
    }

    public CollateralTreatment getTreatment() {
        return treatment;
    }

    public EligibleCollateralCriteria treatment(CollateralTreatment treatment) {
        this.treatment = treatment;
        return this;
    }

}
