package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5WoMK4iUuUkMMVxDia7H9mGNH3L31mLj8RveukWvKKGi")
public class CdmObservableAssetPerformanceValuationDates {
    public static String blueId() {
        return "5WoMK4iUuUkMMVxDia7H9mGNH3L31mLj8RveukWvKKGi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/PerformanceValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/PerformanceValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPerformanceValuationDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableCommonDeterminationMethodEnum determinationMethod;

    private CdmBaseDatetimeAdjustableOrRelativeDate valuationDate;

    private CdmBaseDatetimeAdjustableRelativeOrPeriodicDates valuationDates;

    private CdmBaseDatetimeBusinessCenterTime valuationTime;

    private CdmObservableCommonTimeTypeEnum valuationTimeType;

    public CdmObservableCommonDeterminationMethodEnum getDeterminationMethod() {
        return determinationMethod;
    }

    public CdmObservableAssetPerformanceValuationDates determinationMethod(CdmObservableCommonDeterminationMethodEnum determinationMethod) {
        this.determinationMethod = determinationMethod;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getValuationDate() {
        return valuationDate;
    }

    public CdmObservableAssetPerformanceValuationDates valuationDate(CdmBaseDatetimeAdjustableOrRelativeDate valuationDate) {
        this.valuationDate = valuationDate;
        return this;
    }

    public CdmBaseDatetimeAdjustableRelativeOrPeriodicDates getValuationDates() {
        return valuationDates;
    }

    public CdmObservableAssetPerformanceValuationDates valuationDates(CdmBaseDatetimeAdjustableRelativeOrPeriodicDates valuationDates) {
        this.valuationDates = valuationDates;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getValuationTime() {
        return valuationTime;
    }

    public CdmObservableAssetPerformanceValuationDates valuationTime(CdmBaseDatetimeBusinessCenterTime valuationTime) {
        this.valuationTime = valuationTime;
        return this;
    }

    public CdmObservableCommonTimeTypeEnum getValuationTimeType() {
        return valuationTimeType;
    }

    public CdmObservableAssetPerformanceValuationDates valuationTimeType(CdmObservableCommonTimeTypeEnum valuationTimeType) {
        this.valuationTimeType = valuationTimeType;
        return this;
    }

}
