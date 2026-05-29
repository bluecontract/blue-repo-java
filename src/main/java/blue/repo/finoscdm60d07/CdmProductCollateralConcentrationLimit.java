package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("62q2jf1UThTg4Tiiha4dGaAXRwgtPtXZVjTKWNYyATKi")
public class CdmProductCollateralConcentrationLimit {
    public static String blueId() {
        return "62q2jf1UThTg4Tiiha4dGaAXRwgtPtXZVjTKWNYyATKi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/ConcentrationLimit";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/ConcentrationLimit";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralConcentrationLimit.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralConcentrationLimitCriteria concentrationLimitCriteria;

    private CdmBaseMathNumberRange percentageLimit;

    private CdmBaseMathMoneyRange valueLimit;

    public CdmProductCollateralConcentrationLimitCriteria getConcentrationLimitCriteria() {
        return concentrationLimitCriteria;
    }

    public CdmProductCollateralConcentrationLimit concentrationLimitCriteria(CdmProductCollateralConcentrationLimitCriteria concentrationLimitCriteria) {
        this.concentrationLimitCriteria = concentrationLimitCriteria;
        return this;
    }

    public CdmBaseMathNumberRange getPercentageLimit() {
        return percentageLimit;
    }

    public CdmProductCollateralConcentrationLimit percentageLimit(CdmBaseMathNumberRange percentageLimit) {
        this.percentageLimit = percentageLimit;
        return this;
    }

    public CdmBaseMathMoneyRange getValueLimit() {
        return valueLimit;
    }

    public CdmProductCollateralConcentrationLimit valueLimit(CdmBaseMathMoneyRange valueLimit) {
        this.valueLimit = valueLimit;
        return this;
    }

}
