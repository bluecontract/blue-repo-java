package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CemkoQ2DudZDwE7xid71zku5DfWfVs1FfxzKqbxjVogB")
public class CollateralCriteriaBase {
    public static String blueId() {
        return "CemkoQ2DudZDwE7xid71zku5DfWfVs1FfxzKqbxjVogB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralCriteriaBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralCriteriaBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralCriteriaBase.json";
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

    public String getNamespace() {
        return namespace;
    }

    public CollateralCriteriaBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CounterpartyRoleEnum> getAppliesTo() {
        return appliesTo;
    }

    public CollateralCriteriaBase appliesTo(List<CounterpartyRoleEnum> appliesTo) {
        this.appliesTo = appliesTo;
        return this;
    }

    public CollateralCriteria getCollateralCriteria() {
        return collateralCriteria;
    }

    public CollateralCriteriaBase collateralCriteria(CollateralCriteria collateralCriteria) {
        this.collateralCriteria = collateralCriteria;
        return this;
    }

    public RatingPriorityResolutionEnum getRatingPriorityResolution() {
        return ratingPriorityResolution;
    }

    public CollateralCriteriaBase ratingPriorityResolution(RatingPriorityResolutionEnum ratingPriorityResolution) {
        this.ratingPriorityResolution = ratingPriorityResolution;
        return this;
    }

    public CollateralMarginTypeEnum getRestrictTo() {
        return restrictTo;
    }

    public CollateralCriteriaBase restrictTo(CollateralMarginTypeEnum restrictTo) {
        this.restrictTo = restrictTo;
        return this;
    }

}
