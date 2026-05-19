package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("HwqWW55bo4bkhWeAb4ag6VeyerySjYpo4PnTrtjxbne7")
public class FxFixingDate {
    public static String blueId() {
        return "HwqWW55bo4bkhWeAb4ag6VeyerySjYpo4PnTrtjxbne7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxFixingDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxFixingDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FxFixingDate.json";
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

    private BusinessCenters businessCenters;

    private ReferenceWithMetaBusinessCenters businessCentersReference;

    private BusinessDayConventionEnum businessDayConvention;

    private DateRelativeToCalculationPeriodDates dateRelativeToCalculationPeriodDates;

    private DateRelativeToPaymentDates dateRelativeToPaymentDates;

    private DateRelativeToValuationDates dateRelativeToValuationDates;

    private DayTypeEnum dayType;

    private AdjustableOrRelativeDate fxFixingDate;

    private PeriodEnum period;

    private BigInteger periodMultiplier;

    public String getNamespace() {
        return namespace;
    }

    public FxFixingDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public FxFixingDate businessCenters(BusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public ReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public FxFixingDate businessCentersReference(ReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public FxFixingDate businessDayConvention(BusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public DateRelativeToCalculationPeriodDates getDateRelativeToCalculationPeriodDates() {
        return dateRelativeToCalculationPeriodDates;
    }

    public FxFixingDate dateRelativeToCalculationPeriodDates(DateRelativeToCalculationPeriodDates dateRelativeToCalculationPeriodDates) {
        this.dateRelativeToCalculationPeriodDates = dateRelativeToCalculationPeriodDates;
        return this;
    }

    public DateRelativeToPaymentDates getDateRelativeToPaymentDates() {
        return dateRelativeToPaymentDates;
    }

    public FxFixingDate dateRelativeToPaymentDates(DateRelativeToPaymentDates dateRelativeToPaymentDates) {
        this.dateRelativeToPaymentDates = dateRelativeToPaymentDates;
        return this;
    }

    public DateRelativeToValuationDates getDateRelativeToValuationDates() {
        return dateRelativeToValuationDates;
    }

    public FxFixingDate dateRelativeToValuationDates(DateRelativeToValuationDates dateRelativeToValuationDates) {
        this.dateRelativeToValuationDates = dateRelativeToValuationDates;
        return this;
    }

    public DayTypeEnum getDayType() {
        return dayType;
    }

    public FxFixingDate dayType(DayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public AdjustableOrRelativeDate getFxFixingDate() {
        return fxFixingDate;
    }

    public FxFixingDate fxFixingDate(AdjustableOrRelativeDate fxFixingDate) {
        this.fxFixingDate = fxFixingDate;
        return this;
    }

    public PeriodEnum getPeriod() {
        return period;
    }

    public FxFixingDate period(PeriodEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public FxFixingDate periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
