package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("4Bn4UjJ5wyJD2wnAH9KECmxuQwXJQSheu8KjM7LicENA")
public class AdjustedRelativeDateOffset {
    public static String blueId() {
        return "4Bn4UjJ5wyJD2wnAH9KECmxuQwXJQSheu8KjM7LicENA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdjustedRelativeDateOffset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdjustedRelativeDateOffset";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AdjustedRelativeDateOffset.json";
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

    private BusinessDayAdjustments relativeDateAdjustments;

    public String getNamespace() {
        return namespace;
    }

    public AdjustedRelativeDateOffset namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedDate() {
        return adjustedDate;
    }

    public AdjustedRelativeDateOffset adjustedDate(String adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public AdjustedRelativeDateOffset businessCenters(BusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public ReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public AdjustedRelativeDateOffset businessCentersReference(ReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public AdjustedRelativeDateOffset businessDayConvention(BusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public ReferenceWithMetaString getDateRelativeTo() {
        return dateRelativeTo;
    }

    public AdjustedRelativeDateOffset dateRelativeTo(ReferenceWithMetaString dateRelativeTo) {
        this.dateRelativeTo = dateRelativeTo;
        return this;
    }

    public DayTypeEnum getDayType() {
        return dayType;
    }

    public AdjustedRelativeDateOffset dayType(DayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public PeriodEnum getPeriod() {
        return period;
    }

    public AdjustedRelativeDateOffset period(PeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public AdjustedRelativeDateOffset periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

    public BusinessDayAdjustments getRelativeDateAdjustments() {
        return relativeDateAdjustments;
    }

    public AdjustedRelativeDateOffset relativeDateAdjustments(BusinessDayAdjustments relativeDateAdjustments) {
        this.relativeDateAdjustments = relativeDateAdjustments;
        return this;
    }

}
