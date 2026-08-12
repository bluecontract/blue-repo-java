package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("5hoFwtCWywpjW2iVxqcevJ5qtXxE46qvSVAb8NxpJke")
public class CdmProductCommonScheduleObservationTerms {
    public static String blueId() {
        return "5hoFwtCWywpjW2iVxqcevJ5qtXxE46qvSVAb8NxpJke";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/ObservationTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/ObservationTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleObservationTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonScheduleCalculationPeriodDates calculationPeriodDates;

    private CdmObservableAssetFxSpotRateSource informationSource;

    private BigInteger numberOfObservationDates;

    private CdmProductCommonScheduleObservationDates observationDates;

    private CdmBaseDatetimeBusinessCenterTime observationTime;

    private CdmObservableCommonTimeTypeEnum observationTimeType;

    private CdmBaseMathRounding precision;

    public CdmProductCommonScheduleCalculationPeriodDates getCalculationPeriodDates() {
        return calculationPeriodDates;
    }

    public CdmProductCommonScheduleObservationTerms calculationPeriodDates(CdmProductCommonScheduleCalculationPeriodDates calculationPeriodDates) {
        this.calculationPeriodDates = calculationPeriodDates;
        return this;
    }

    public CdmObservableAssetFxSpotRateSource getInformationSource() {
        return informationSource;
    }

    public CdmProductCommonScheduleObservationTerms informationSource(CdmObservableAssetFxSpotRateSource informationSource) {
        this.informationSource = informationSource;
        return this;
    }

    public BigInteger getNumberOfObservationDates() {
        return numberOfObservationDates;
    }

    public CdmProductCommonScheduleObservationTerms numberOfObservationDates(BigInteger numberOfObservationDates) {
        this.numberOfObservationDates = numberOfObservationDates;
        return this;
    }

    public CdmProductCommonScheduleObservationDates getObservationDates() {
        return observationDates;
    }

    public CdmProductCommonScheduleObservationTerms observationDates(CdmProductCommonScheduleObservationDates observationDates) {
        this.observationDates = observationDates;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getObservationTime() {
        return observationTime;
    }

    public CdmProductCommonScheduleObservationTerms observationTime(CdmBaseDatetimeBusinessCenterTime observationTime) {
        this.observationTime = observationTime;
        return this;
    }

    public CdmObservableCommonTimeTypeEnum getObservationTimeType() {
        return observationTimeType;
    }

    public CdmProductCommonScheduleObservationTerms observationTimeType(CdmObservableCommonTimeTypeEnum observationTimeType) {
        this.observationTimeType = observationTimeType;
        return this;
    }

    public CdmBaseMathRounding getPrecision() {
        return precision;
    }

    public CdmProductCommonScheduleObservationTerms precision(CdmBaseMathRounding precision) {
        this.precision = precision;
        return this;
    }

}
