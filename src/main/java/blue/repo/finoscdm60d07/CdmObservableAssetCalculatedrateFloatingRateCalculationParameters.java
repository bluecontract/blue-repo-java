package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BzAmRPH81HKGy6cSBQMksdVVxBpKtdVhJKSbFqKiErQP")
public class CdmObservableAssetCalculatedrateFloatingRateCalculationParameters {
    public static String blueId() {
        return "BzAmRPH81HKGy6cSBQMksdVVxBpKtdVhJKSbFqKiErQP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/calculatedrate/FloatingRateCalculationParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/calculatedrate/FloatingRateCalculationParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetcalculatedrateFloatingRateCalculationParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessCenters applicableBusinessDays;

    private CdmObservableAssetCalculatedrateCalculationMethodEnum calculationMethod;

    private CdmObservableAssetCalculatedrateOffsetCalculation lockoutCalculation;

    private CdmObservableAssetCalculatedrateOffsetCalculation lookbackCalculation;

    private CdmObservableAssetCalculatedrateObservationParameters observationParameters;

    private CdmObservableAssetCalculatedrateObservationShiftCalculation observationShiftCalculation;

    public CdmBaseDatetimeBusinessCenters getApplicableBusinessDays() {
        return applicableBusinessDays;
    }

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters applicableBusinessDays(CdmBaseDatetimeBusinessCenters applicableBusinessDays) {
        this.applicableBusinessDays = applicableBusinessDays;
        return this;
    }

    public CdmObservableAssetCalculatedrateCalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters calculationMethod(CdmObservableAssetCalculatedrateCalculationMethodEnum calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    public CdmObservableAssetCalculatedrateOffsetCalculation getLockoutCalculation() {
        return lockoutCalculation;
    }

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters lockoutCalculation(CdmObservableAssetCalculatedrateOffsetCalculation lockoutCalculation) {
        this.lockoutCalculation = lockoutCalculation;
        return this;
    }

    public CdmObservableAssetCalculatedrateOffsetCalculation getLookbackCalculation() {
        return lookbackCalculation;
    }

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters lookbackCalculation(CdmObservableAssetCalculatedrateOffsetCalculation lookbackCalculation) {
        this.lookbackCalculation = lookbackCalculation;
        return this;
    }

    public CdmObservableAssetCalculatedrateObservationParameters getObservationParameters() {
        return observationParameters;
    }

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters observationParameters(CdmObservableAssetCalculatedrateObservationParameters observationParameters) {
        this.observationParameters = observationParameters;
        return this;
    }

    public CdmObservableAssetCalculatedrateObservationShiftCalculation getObservationShiftCalculation() {
        return observationShiftCalculation;
    }

    public CdmObservableAssetCalculatedrateFloatingRateCalculationParameters observationShiftCalculation(CdmObservableAssetCalculatedrateObservationShiftCalculation observationShiftCalculation) {
        this.observationShiftCalculation = observationShiftCalculation;
        return this;
    }

}
