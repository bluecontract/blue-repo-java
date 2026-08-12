package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("3Bf8GdUj3MKXvh7oTmRmwbssYTyx1Pm6fSQtDQa5uffh")
public class CdmObservableAssetCalculatedrateObservationShiftCalculation {
    public static String blueId() {
        return "3Bf8GdUj3MKXvh7oTmRmwbssYTyx1Pm6fSQtDQa5uffh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/calculatedrate/ObservationShiftCalculation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/calculatedrate/ObservationShiftCalculation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetcalculatedrateObservationShiftCalculation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessCenters additionalBusinessDays;

    private CdmObservableAssetCalculatedrateObservationPeriodDatesEnum calculationBase;

    private BigInteger offsetDays;

    public CdmBaseDatetimeBusinessCenters getAdditionalBusinessDays() {
        return additionalBusinessDays;
    }

    public CdmObservableAssetCalculatedrateObservationShiftCalculation additionalBusinessDays(CdmBaseDatetimeBusinessCenters additionalBusinessDays) {
        this.additionalBusinessDays = additionalBusinessDays;
        return this;
    }

    public CdmObservableAssetCalculatedrateObservationPeriodDatesEnum getCalculationBase() {
        return calculationBase;
    }

    public CdmObservableAssetCalculatedrateObservationShiftCalculation calculationBase(CdmObservableAssetCalculatedrateObservationPeriodDatesEnum calculationBase) {
        this.calculationBase = calculationBase;
        return this;
    }

    public BigInteger getOffsetDays() {
        return offsetDays;
    }

    public CdmObservableAssetCalculatedrateObservationShiftCalculation offsetDays(BigInteger offsetDays) {
        this.offsetDays = offsetDays;
        return this;
    }

}
