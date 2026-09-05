package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("9Pj1uPiJvxT3zPGUPc6VAczELJJ34FQM8wbgoGePfJgF")
public class CdmBaseDatetimeAdjustedRelativeDateOffset {
    public static String blueId() {
        return "9Pj1uPiJvxT3zPGUPc6VAczELJJ34FQM8wbgoGePfJgF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AdjustedRelativeDateOffset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AdjustedRelativeDateOffset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAdjustedRelativeDateOffset.json";
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

    private CdmBaseDatetimeBusinessDayAdjustments relativeDateAdjustments;

    public String getAdjustedDate() {
        return adjustedDate;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset adjustedDate(String adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public CdmBaseDatetimeBusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset businessCenters(CdmBaseDatetimeBusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset businessCentersReference(CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public CdmBaseDatetimeBusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset businessDayConvention(CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public ComRosettaModelMetafieldsReferenceWithMetaString getDateRelativeTo() {
        return dateRelativeTo;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset dateRelativeTo(ComRosettaModelMetafieldsReferenceWithMetaString dateRelativeTo) {
        this.dateRelativeTo = dateRelativeTo;
        return this;
    }

    public CdmBaseDatetimeDayTypeEnum getDayType() {
        return dayType;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset dayType(CdmBaseDatetimeDayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public CdmBaseDatetimePeriodEnum getPeriod() {
        return period;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset period(CdmBaseDatetimePeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getRelativeDateAdjustments() {
        return relativeDateAdjustments;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset relativeDateAdjustments(CdmBaseDatetimeBusinessDayAdjustments relativeDateAdjustments) {
        this.relativeDateAdjustments = relativeDateAdjustments;
        return this;
    }

}
