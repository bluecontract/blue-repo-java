package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EkADwYRGxyEjw7y7ezqUTqYfki9dYESzagxw46kV7ibo")
public class CdmProductCollateralConcentrationLimitCriteria {
    public static String blueId() {
        return "EkADwYRGxyEjw7y7ezqUTqYfki9dYESzagxw46kV7ibo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/ConcentrationLimitCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/ConcentrationLimitCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralConcentrationLimitCriteria.json";
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

    private CdmProductCollateralAverageTradingVolume averageTradingVolume;

    private CdmProductCollateralCollateralCriteria collateralCriteria;

    private CdmProductCollateralConcentrationLimitTypeEnum concentrationLimitType;

    private CdmProductCollateralRatingPriorityResolutionEnum ratingPriorityResolution;

    private CdmProductCollateralCollateralMarginTypeEnum restrictTo;

    public List<CdmBaseStaticdataPartyCounterpartyRoleEnum> getAppliesTo() {
        return appliesTo;
    }

    public CdmProductCollateralConcentrationLimitCriteria appliesTo(List<CdmBaseStaticdataPartyCounterpartyRoleEnum> appliesTo) {
        this.appliesTo = appliesTo;
        return this;
    }

    public CdmProductCollateralAverageTradingVolume getAverageTradingVolume() {
        return averageTradingVolume;
    }

    public CdmProductCollateralConcentrationLimitCriteria averageTradingVolume(CdmProductCollateralAverageTradingVolume averageTradingVolume) {
        this.averageTradingVolume = averageTradingVolume;
        return this;
    }

    public CdmProductCollateralCollateralCriteria getCollateralCriteria() {
        return collateralCriteria;
    }

    public CdmProductCollateralConcentrationLimitCriteria collateralCriteria(CdmProductCollateralCollateralCriteria collateralCriteria) {
        this.collateralCriteria = collateralCriteria;
        return this;
    }

    public CdmProductCollateralConcentrationLimitTypeEnum getConcentrationLimitType() {
        return concentrationLimitType;
    }

    public CdmProductCollateralConcentrationLimitCriteria concentrationLimitType(CdmProductCollateralConcentrationLimitTypeEnum concentrationLimitType) {
        this.concentrationLimitType = concentrationLimitType;
        return this;
    }

    public CdmProductCollateralRatingPriorityResolutionEnum getRatingPriorityResolution() {
        return ratingPriorityResolution;
    }

    public CdmProductCollateralConcentrationLimitCriteria ratingPriorityResolution(CdmProductCollateralRatingPriorityResolutionEnum ratingPriorityResolution) {
        this.ratingPriorityResolution = ratingPriorityResolution;
        return this;
    }

    public CdmProductCollateralCollateralMarginTypeEnum getRestrictTo() {
        return restrictTo;
    }

    public CdmProductCollateralConcentrationLimitCriteria restrictTo(CdmProductCollateralCollateralMarginTypeEnum restrictTo) {
        this.restrictTo = restrictTo;
        return this;
    }

}
