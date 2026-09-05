package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9rWpCKB8oC7JAfjNfkkHKe3wymog22cWN5vgb9rqXTri")
public class CdmProductAssetFloatingrateFloatingAmountCalculationDetails {
    public static String blueId() {
        return "9rWpCKB8oC7JAfjNfkkHKe3wymog22cWN5vgb9rqXTri";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/floatingrate/FloatingAmountCalculationDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/floatingrate/FloatingAmountCalculationDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetfloatingrateFloatingAmountCalculationDetails.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double appliedRate;

    private Double calculatedAmount;

    private CdmProductCommonScheduleCalculationPeriodBase calculationPeriod;

    private CdmObservableAssetMoney calculationPeriodNotionalAmount;

    private CdmProductAssetFloatingrateFloatingRateSettingDetails floatingRate;

    private CdmProductAssetFloatingrateFloatingRateProcessingDetails processingDetails;

    private Double spreadExclusiveCalculatedAMount;

    private Double yearFraction;

    public Double getAppliedRate() {
        return appliedRate;
    }

    public CdmProductAssetFloatingrateFloatingAmountCalculationDetails appliedRate(Double appliedRate) {
        this.appliedRate = appliedRate;
        return this;
    }

    public Double getCalculatedAmount() {
        return calculatedAmount;
    }

    public CdmProductAssetFloatingrateFloatingAmountCalculationDetails calculatedAmount(Double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
        return this;
    }

    public CdmProductCommonScheduleCalculationPeriodBase getCalculationPeriod() {
        return calculationPeriod;
    }

    public CdmProductAssetFloatingrateFloatingAmountCalculationDetails calculationPeriod(CdmProductCommonScheduleCalculationPeriodBase calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
        return this;
    }

    public CdmObservableAssetMoney getCalculationPeriodNotionalAmount() {
        return calculationPeriodNotionalAmount;
    }

    public CdmProductAssetFloatingrateFloatingAmountCalculationDetails calculationPeriodNotionalAmount(CdmObservableAssetMoney calculationPeriodNotionalAmount) {
        this.calculationPeriodNotionalAmount = calculationPeriodNotionalAmount;
        return this;
    }

    public CdmProductAssetFloatingrateFloatingRateSettingDetails getFloatingRate() {
        return floatingRate;
    }

    public CdmProductAssetFloatingrateFloatingAmountCalculationDetails floatingRate(CdmProductAssetFloatingrateFloatingRateSettingDetails floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingDetails getProcessingDetails() {
        return processingDetails;
    }

    public CdmProductAssetFloatingrateFloatingAmountCalculationDetails processingDetails(CdmProductAssetFloatingrateFloatingRateProcessingDetails processingDetails) {
        this.processingDetails = processingDetails;
        return this;
    }

    public Double getSpreadExclusiveCalculatedAMount() {
        return spreadExclusiveCalculatedAMount;
    }

    public CdmProductAssetFloatingrateFloatingAmountCalculationDetails spreadExclusiveCalculatedAMount(Double spreadExclusiveCalculatedAMount) {
        this.spreadExclusiveCalculatedAMount = spreadExclusiveCalculatedAMount;
        return this;
    }

    public Double getYearFraction() {
        return yearFraction;
    }

    public CdmProductAssetFloatingrateFloatingAmountCalculationDetails yearFraction(Double yearFraction) {
        this.yearFraction = yearFraction;
        return this;
    }

}
