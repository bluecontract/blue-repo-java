package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("k9HgXaUDtMTpLPttfBXXf8LCfPgNGBwYyAkMswVBvas")
public class RelativeDateOffset {
    public static String blueId() {
        return "k9HgXaUDtMTpLPttfBXXf8LCfPgNGBwYyAkMswVBvas";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RelativeDateOffset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RelativeDateOffset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/RelativeDateOffset.json";
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

    public String getNamespace() {
        return namespace;
    }

    public RelativeDateOffset namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedDate() {
        return adjustedDate;
    }

    public RelativeDateOffset adjustedDate(String adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public RelativeDateOffset businessCenters(BusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public ReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public RelativeDateOffset businessCentersReference(ReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public RelativeDateOffset businessDayConvention(BusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public ReferenceWithMetaString getDateRelativeTo() {
        return dateRelativeTo;
    }

    public RelativeDateOffset dateRelativeTo(ReferenceWithMetaString dateRelativeTo) {
        this.dateRelativeTo = dateRelativeTo;
        return this;
    }

    public DayTypeEnum getDayType() {
        return dayType;
    }

    public RelativeDateOffset dayType(DayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public PeriodEnum getPeriod() {
        return period;
    }

    public RelativeDateOffset period(PeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public RelativeDateOffset periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
