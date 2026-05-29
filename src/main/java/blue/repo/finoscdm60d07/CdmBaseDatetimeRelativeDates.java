package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("ffUyEvaaqdBBm2s5LAxjVPYxafcimPQSYdjP5Kst7dK")
public class CdmBaseDatetimeRelativeDates {
    public static String blueId() {
        return "ffUyEvaaqdBBm2s5LAxjVPYxafcimPQSYdjP5Kst7dK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/RelativeDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/RelativeDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeRelativeDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedDate;

    private CdmBaseDatetimeBusinessCenters businessCenters;

    private CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters businessCentersReference;

    private CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention;

    private ComRosettaModelMetafieldsReferenceWithMetaString dateRelativeTo;

    private CdmBaseDatetimeDayTypeEnum dayType;

    private CdmBaseDatetimePeriodEnum period;

    private BigInteger periodMultiplier;

    private BigInteger periodSkip;

    private CdmBaseDatetimeDateRange scheduleBounds;

    public String getAdjustedDate() {
        return adjustedDate;
    }

    public CdmBaseDatetimeRelativeDates adjustedDate(String adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public CdmBaseDatetimeBusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public CdmBaseDatetimeRelativeDates businessCenters(CdmBaseDatetimeBusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public CdmBaseDatetimeRelativeDates businessCentersReference(CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public CdmBaseDatetimeBusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public CdmBaseDatetimeRelativeDates businessDayConvention(CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public ComRosettaModelMetafieldsReferenceWithMetaString getDateRelativeTo() {
        return dateRelativeTo;
    }

    public CdmBaseDatetimeRelativeDates dateRelativeTo(ComRosettaModelMetafieldsReferenceWithMetaString dateRelativeTo) {
        this.dateRelativeTo = dateRelativeTo;
        return this;
    }

    public CdmBaseDatetimeDayTypeEnum getDayType() {
        return dayType;
    }

    public CdmBaseDatetimeRelativeDates dayType(CdmBaseDatetimeDayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public CdmBaseDatetimePeriodEnum getPeriod() {
        return period;
    }

    public CdmBaseDatetimeRelativeDates period(CdmBaseDatetimePeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmBaseDatetimeRelativeDates periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

    public BigInteger getPeriodSkip() {
        return periodSkip;
    }

    public CdmBaseDatetimeRelativeDates periodSkip(BigInteger periodSkip) {
        this.periodSkip = periodSkip;
        return this;
    }

    public CdmBaseDatetimeDateRange getScheduleBounds() {
        return scheduleBounds;
    }

    public CdmBaseDatetimeRelativeDates scheduleBounds(CdmBaseDatetimeDateRange scheduleBounds) {
        this.scheduleBounds = scheduleBounds;
        return this;
    }

}
