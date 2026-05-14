package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("G26P7eS3WvPxhoNpE1Ky1LvReJAvc2SUoYcjLksC2RhQ")
public class RelativeDates {
    public static String blueId() {
        return "G26P7eS3WvPxhoNpE1Ky1LvReJAvc2SUoYcjLksC2RhQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RelativeDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RelativeDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RelativeDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private String adjustedDate;

    private BusinessCenters businessCenters;

    private ReferenceWithMetaBusinessCenters businessCentersReference;

    private BusinessDayConventionEnum businessDayConvention;

    private ReferenceWithMetaString dateRelativeTo;

    private DayTypeEnum dayType;

    private PeriodEnum period;

    private BigInteger periodMultiplier;

    private BigInteger periodSkip;

    private DateRange scheduleBounds;

    public String getNamespace() {
        return namespace;
    }

    public RelativeDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedDate() {
        return adjustedDate;
    }

    public RelativeDates adjustedDate(String adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public RelativeDates businessCenters(BusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public ReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public RelativeDates businessCentersReference(ReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public RelativeDates businessDayConvention(BusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public ReferenceWithMetaString getDateRelativeTo() {
        return dateRelativeTo;
    }

    public RelativeDates dateRelativeTo(ReferenceWithMetaString dateRelativeTo) {
        this.dateRelativeTo = dateRelativeTo;
        return this;
    }

    public DayTypeEnum getDayType() {
        return dayType;
    }

    public RelativeDates dayType(DayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public PeriodEnum getPeriod() {
        return period;
    }

    public RelativeDates period(PeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public RelativeDates periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

    public BigInteger getPeriodSkip() {
        return periodSkip;
    }

    public RelativeDates periodSkip(BigInteger periodSkip) {
        this.periodSkip = periodSkip;
        return this;
    }

    public DateRange getScheduleBounds() {
        return scheduleBounds;
    }

    public RelativeDates scheduleBounds(DateRange scheduleBounds) {
        this.scheduleBounds = scheduleBounds;
        return this;
    }

}
