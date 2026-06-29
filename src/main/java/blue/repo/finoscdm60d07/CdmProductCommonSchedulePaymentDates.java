package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("23fb9HBYcZQ8enTm83iVQjixyTrHqNc5G1ANtAbB1ixz")
public class CdmProductCommonSchedulePaymentDates {
    public static String blueId() {
        return "23fb9HBYcZQ8enTm83iVQjixyTrHqNc5G1ANtAbB1ixz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/PaymentDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/PaymentDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonschedulePaymentDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String firstPaymentDate;

    private String lastRegularPaymentDate;

    private CdmBaseDatetimeBusinessDayAdjustments paymentDatesAdjustments;

    private CdmProductCommonSchedulePaymentDateSchedule paymentDateSchedule;

    private CdmBaseDatetimeOffset paymentDaysOffset;

    private CdmBaseDatetimeFrequency paymentFrequency;

    private CdmProductCommonSchedulePayRelativeToEnum payRelativeTo;

    public String getFirstPaymentDate() {
        return firstPaymentDate;
    }

    public CdmProductCommonSchedulePaymentDates firstPaymentDate(String firstPaymentDate) {
        this.firstPaymentDate = firstPaymentDate;
        return this;
    }

    public String getLastRegularPaymentDate() {
        return lastRegularPaymentDate;
    }

    public CdmProductCommonSchedulePaymentDates lastRegularPaymentDate(String lastRegularPaymentDate) {
        this.lastRegularPaymentDate = lastRegularPaymentDate;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getPaymentDatesAdjustments() {
        return paymentDatesAdjustments;
    }

    public CdmProductCommonSchedulePaymentDates paymentDatesAdjustments(CdmBaseDatetimeBusinessDayAdjustments paymentDatesAdjustments) {
        this.paymentDatesAdjustments = paymentDatesAdjustments;
        return this;
    }

    public CdmProductCommonSchedulePaymentDateSchedule getPaymentDateSchedule() {
        return paymentDateSchedule;
    }

    public CdmProductCommonSchedulePaymentDates paymentDateSchedule(CdmProductCommonSchedulePaymentDateSchedule paymentDateSchedule) {
        this.paymentDateSchedule = paymentDateSchedule;
        return this;
    }

    public CdmBaseDatetimeOffset getPaymentDaysOffset() {
        return paymentDaysOffset;
    }

    public CdmProductCommonSchedulePaymentDates paymentDaysOffset(CdmBaseDatetimeOffset paymentDaysOffset) {
        this.paymentDaysOffset = paymentDaysOffset;
        return this;
    }

    public CdmBaseDatetimeFrequency getPaymentFrequency() {
        return paymentFrequency;
    }

    public CdmProductCommonSchedulePaymentDates paymentFrequency(CdmBaseDatetimeFrequency paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
        return this;
    }

    public CdmProductCommonSchedulePayRelativeToEnum getPayRelativeTo() {
        return payRelativeTo;
    }

    public CdmProductCommonSchedulePaymentDates payRelativeTo(CdmProductCommonSchedulePayRelativeToEnum payRelativeTo) {
        this.payRelativeTo = payRelativeTo;
        return this;
    }

}
