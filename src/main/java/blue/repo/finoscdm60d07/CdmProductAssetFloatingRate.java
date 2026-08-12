package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D8hZPmsoKyM5N1bgRUwPgkkjdHx56x7Wgat14eXk6QzP")
public class CdmProductAssetFloatingRate {
    public static String blueId() {
        return "D8hZPmsoKyM5N1bgRUwPgkkjdHx56x7Wgat14eXk6QzP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FloatingRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FloatingRate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFloatingRate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationParameters;

    private CdmProductTemplateStrikeSchedule capRateSchedule;

    private CdmObservableAssetCalculatedrateFallbackRateParameters fallbackRate;

    private CdmProductCommonScheduleRateSchedule floatingRateMultiplierSchedule;

    private CdmProductTemplateStrikeSchedule floorRateSchedule;

    private CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption;

    private CdmProductAssetRateTreatmentEnum rateTreatment;

    private CdmProductAssetSpreadSchedule spreadSchedule;

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters getCalculationParameters() {
        return calculationParameters;
    }

    public CdmProductAssetFloatingRate calculationParameters(CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationParameters) {
        this.calculationParameters = calculationParameters;
        return this;
    }

    public CdmProductTemplateStrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public CdmProductAssetFloatingRate capRateSchedule(CdmProductTemplateStrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public CdmObservableAssetCalculatedrateFallbackRateParameters getFallbackRate() {
        return fallbackRate;
    }

    public CdmProductAssetFloatingRate fallbackRate(CdmObservableAssetCalculatedrateFallbackRateParameters fallbackRate) {
        this.fallbackRate = fallbackRate;
        return this;
    }

    public CdmProductCommonScheduleRateSchedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    public CdmProductAssetFloatingRate floatingRateMultiplierSchedule(CdmProductCommonScheduleRateSchedule floatingRateMultiplierSchedule) {
        this.floatingRateMultiplierSchedule = floatingRateMultiplierSchedule;
        return this;
    }

    public CdmProductTemplateStrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public CdmProductAssetFloatingRate floorRateSchedule(CdmProductTemplateStrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public CdmProductAssetFloatingRate rateOption(CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public CdmProductAssetRateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    public CdmProductAssetFloatingRate rateTreatment(CdmProductAssetRateTreatmentEnum rateTreatment) {
        this.rateTreatment = rateTreatment;
        return this;
    }

    public CdmProductAssetSpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public CdmProductAssetFloatingRate spreadSchedule(CdmProductAssetSpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
