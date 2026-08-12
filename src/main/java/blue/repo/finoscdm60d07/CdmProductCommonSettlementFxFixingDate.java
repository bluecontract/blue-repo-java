package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("AYe9vJYb7zmVir5VZjyWNcw2oZjtbMSkbPB8y47sai6T")
public class CdmProductCommonSettlementFxFixingDate {
    public static String blueId() {
        return "AYe9vJYb7zmVir5VZjyWNcw2oZjtbMSkbPB8y47sai6T";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/FxFixingDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/FxFixingDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementFxFixingDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessCenters businessCenters;

    private CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters businessCentersReference;

    private CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention;

    private CdmProductCommonScheduleDateRelativeToCalculationPeriodDates dateRelativeToCalculationPeriodDates;

    private CdmProductCommonScheduleDateRelativeToPaymentDates dateRelativeToPaymentDates;

    private CdmProductCommonScheduleDateRelativeToValuationDates dateRelativeToValuationDates;

    private CdmBaseDatetimeDayTypeEnum dayType;

    private CdmBaseDatetimeAdjustableOrRelativeDate fxFixingDate;

    private CdmBaseDatetimePeriodEnum period;

    private BigInteger periodMultiplier;

    public CdmBaseDatetimeBusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public CdmProductCommonSettlementFxFixingDate businessCenters(CdmBaseDatetimeBusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public CdmProductCommonSettlementFxFixingDate businessCentersReference(CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public CdmBaseDatetimeBusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public CdmProductCommonSettlementFxFixingDate businessDayConvention(CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public CdmProductCommonScheduleDateRelativeToCalculationPeriodDates getDateRelativeToCalculationPeriodDates() {
        return dateRelativeToCalculationPeriodDates;
    }

    public CdmProductCommonSettlementFxFixingDate dateRelativeToCalculationPeriodDates(CdmProductCommonScheduleDateRelativeToCalculationPeriodDates dateRelativeToCalculationPeriodDates) {
        this.dateRelativeToCalculationPeriodDates = dateRelativeToCalculationPeriodDates;
        return this;
    }

    public CdmProductCommonScheduleDateRelativeToPaymentDates getDateRelativeToPaymentDates() {
        return dateRelativeToPaymentDates;
    }

    public CdmProductCommonSettlementFxFixingDate dateRelativeToPaymentDates(CdmProductCommonScheduleDateRelativeToPaymentDates dateRelativeToPaymentDates) {
        this.dateRelativeToPaymentDates = dateRelativeToPaymentDates;
        return this;
    }

    public CdmProductCommonScheduleDateRelativeToValuationDates getDateRelativeToValuationDates() {
        return dateRelativeToValuationDates;
    }

    public CdmProductCommonSettlementFxFixingDate dateRelativeToValuationDates(CdmProductCommonScheduleDateRelativeToValuationDates dateRelativeToValuationDates) {
        this.dateRelativeToValuationDates = dateRelativeToValuationDates;
        return this;
    }

    public CdmBaseDatetimeDayTypeEnum getDayType() {
        return dayType;
    }

    public CdmProductCommonSettlementFxFixingDate dayType(CdmBaseDatetimeDayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getFxFixingDate() {
        return fxFixingDate;
    }

    public CdmProductCommonSettlementFxFixingDate fxFixingDate(CdmBaseDatetimeAdjustableOrRelativeDate fxFixingDate) {
        this.fxFixingDate = fxFixingDate;
        return this;
    }

    public CdmBaseDatetimePeriodEnum getPeriod() {
        return period;
    }

    public CdmProductCommonSettlementFxFixingDate period(CdmBaseDatetimePeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmProductCommonSettlementFxFixingDate periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
