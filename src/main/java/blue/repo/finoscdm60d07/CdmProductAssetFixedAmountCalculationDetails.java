package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DWiJVyeaSktJL6mTLvKLC2nxdiKY3CWQfU91sHJ2wtuc")
public class CdmProductAssetFixedAmountCalculationDetails {
    public static String blueId() {
        return "DWiJVyeaSktJL6mTLvKLC2nxdiKY3CWQfU91sHJ2wtuc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FixedAmountCalculationDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FixedAmountCalculationDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFixedAmountCalculationDetails.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double calculatedAmount;

    private CdmProductCommonScheduleCalculationPeriodBase calculationPeriod;

    private CdmObservableAssetMoney calculationPeriodNotionalAmount;

    private Double fixedRate;

    private Double yearFraction;

    public Double getCalculatedAmount() {
        return calculatedAmount;
    }

    public CdmProductAssetFixedAmountCalculationDetails calculatedAmount(Double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
        return this;
    }

    public CdmProductCommonScheduleCalculationPeriodBase getCalculationPeriod() {
        return calculationPeriod;
    }

    public CdmProductAssetFixedAmountCalculationDetails calculationPeriod(CdmProductCommonScheduleCalculationPeriodBase calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
        return this;
    }

    public CdmObservableAssetMoney getCalculationPeriodNotionalAmount() {
        return calculationPeriodNotionalAmount;
    }

    public CdmProductAssetFixedAmountCalculationDetails calculationPeriodNotionalAmount(CdmObservableAssetMoney calculationPeriodNotionalAmount) {
        this.calculationPeriodNotionalAmount = calculationPeriodNotionalAmount;
        return this;
    }

    public Double getFixedRate() {
        return fixedRate;
    }

    public CdmProductAssetFixedAmountCalculationDetails fixedRate(Double fixedRate) {
        this.fixedRate = fixedRate;
        return this;
    }

    public Double getYearFraction() {
        return yearFraction;
    }

    public CdmProductAssetFixedAmountCalculationDetails yearFraction(Double yearFraction) {
        this.yearFraction = yearFraction;
        return this;
    }

}
