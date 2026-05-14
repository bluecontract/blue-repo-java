package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4vvAod3Rh6F22hkEN7SKj4WFsW9FBoakk3fGMq9aQ8CD")
public class ConcentrationLimitCriteria {
    public static String blueId() {
        return "4vvAod3Rh6F22hkEN7SKj4WFsW9FBoakk3fGMq9aQ8CD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ConcentrationLimitCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ConcentrationLimitCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ConcentrationLimitCriteria.json";
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

    private AverageTradingVolume averageTradingVolume;

    private CollateralCriteria collateralCriteria;

    private ConcentrationLimitTypeEnum concentrationLimitType;

    private RatingPriorityResolutionEnum ratingPriorityResolution;

    private CollateralMarginTypeEnum restrictTo;

    public String getNamespace() {
        return namespace;
    }

    public ConcentrationLimitCriteria namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CounterpartyRoleEnum> getAppliesTo() {
        return appliesTo;
    }

    public ConcentrationLimitCriteria appliesTo(List<CounterpartyRoleEnum> appliesTo) {
        this.appliesTo = appliesTo;
        return this;
    }

    public AverageTradingVolume getAverageTradingVolume() {
        return averageTradingVolume;
    }

    public ConcentrationLimitCriteria averageTradingVolume(AverageTradingVolume averageTradingVolume) {
        this.averageTradingVolume = averageTradingVolume;
        return this;
    }

    public CollateralCriteria getCollateralCriteria() {
        return collateralCriteria;
    }

    public ConcentrationLimitCriteria collateralCriteria(CollateralCriteria collateralCriteria) {
        this.collateralCriteria = collateralCriteria;
        return this;
    }

    public ConcentrationLimitTypeEnum getConcentrationLimitType() {
        return concentrationLimitType;
    }

    public ConcentrationLimitCriteria concentrationLimitType(ConcentrationLimitTypeEnum concentrationLimitType) {
        this.concentrationLimitType = concentrationLimitType;
        return this;
    }

    public RatingPriorityResolutionEnum getRatingPriorityResolution() {
        return ratingPriorityResolution;
    }

    public ConcentrationLimitCriteria ratingPriorityResolution(RatingPriorityResolutionEnum ratingPriorityResolution) {
        this.ratingPriorityResolution = ratingPriorityResolution;
        return this;
    }

    public CollateralMarginTypeEnum getRestrictTo() {
        return restrictTo;
    }

    public ConcentrationLimitCriteria restrictTo(CollateralMarginTypeEnum restrictTo) {
        this.restrictTo = restrictTo;
        return this;
    }

}
