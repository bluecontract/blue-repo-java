package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("2wQPopE8rNJu4jigpcsKNP5ifSGS1mCEULs5TFyadHG9")
public class CdmBaseDatetimeRelativeDateOffset {
    public static String blueId() {
        return "2wQPopE8rNJu4jigpcsKNP5ifSGS1mCEULs5TFyadHG9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/RelativeDateOffset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/RelativeDateOffset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeRelativeDateOffset.json";
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

    public String getAdjustedDate() {
        return adjustedDate;
    }

    public CdmBaseDatetimeRelativeDateOffset adjustedDate(String adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public CdmBaseDatetimeBusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public CdmBaseDatetimeRelativeDateOffset businessCenters(CdmBaseDatetimeBusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public CdmBaseDatetimeRelativeDateOffset businessCentersReference(CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public CdmBaseDatetimeBusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public CdmBaseDatetimeRelativeDateOffset businessDayConvention(CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public ComRosettaModelMetafieldsReferenceWithMetaString getDateRelativeTo() {
        return dateRelativeTo;
    }

    public CdmBaseDatetimeRelativeDateOffset dateRelativeTo(ComRosettaModelMetafieldsReferenceWithMetaString dateRelativeTo) {
        this.dateRelativeTo = dateRelativeTo;
        return this;
    }

    public CdmBaseDatetimeDayTypeEnum getDayType() {
        return dayType;
    }

    public CdmBaseDatetimeRelativeDateOffset dayType(CdmBaseDatetimeDayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public CdmBaseDatetimePeriodEnum getPeriod() {
        return period;
    }

    public CdmBaseDatetimeRelativeDateOffset period(CdmBaseDatetimePeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmBaseDatetimeRelativeDateOffset periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
