package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ASqG3ZVEgxpGpxe29YZKsoXZzNQtJq7UhyMRGSFetEg8")
public class PaymentDates {
    public static String blueId() {
        return "ASqG3ZVEgxpGpxe29YZKsoXZzNQtJq7UhyMRGSFetEg8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PaymentDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PaymentDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PaymentDates.json";
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

    private String firstPaymentDate;

    private String lastRegularPaymentDate;

    private BusinessDayAdjustments paymentDatesAdjustments;

    private PaymentDateSchedule paymentDateSchedule;

    private Offset paymentDaysOffset;

    private Frequency paymentFrequency;

    private PayRelativeToEnum payRelativeTo;

    public String getNamespace() {
        return namespace;
    }

    public PaymentDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getFirstPaymentDate() {
        return firstPaymentDate;
    }

    public PaymentDates firstPaymentDate(String firstPaymentDate) {
        this.firstPaymentDate = firstPaymentDate;
        return this;
    }

    public String getLastRegularPaymentDate() {
        return lastRegularPaymentDate;
    }

    public PaymentDates lastRegularPaymentDate(String lastRegularPaymentDate) {
        this.lastRegularPaymentDate = lastRegularPaymentDate;
        return this;
    }

    public BusinessDayAdjustments getPaymentDatesAdjustments() {
        return paymentDatesAdjustments;
    }

    public PaymentDates paymentDatesAdjustments(BusinessDayAdjustments paymentDatesAdjustments) {
        this.paymentDatesAdjustments = paymentDatesAdjustments;
        return this;
    }

    public PaymentDateSchedule getPaymentDateSchedule() {
        return paymentDateSchedule;
    }

    public PaymentDates paymentDateSchedule(PaymentDateSchedule paymentDateSchedule) {
        this.paymentDateSchedule = paymentDateSchedule;
        return this;
    }

    public Offset getPaymentDaysOffset() {
        return paymentDaysOffset;
    }

    public PaymentDates paymentDaysOffset(Offset paymentDaysOffset) {
        this.paymentDaysOffset = paymentDaysOffset;
        return this;
    }

    public Frequency getPaymentFrequency() {
        return paymentFrequency;
    }

    public PaymentDates paymentFrequency(Frequency paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
        return this;
    }

    public PayRelativeToEnum getPayRelativeTo() {
        return payRelativeTo;
    }

    public PaymentDates payRelativeTo(PayRelativeToEnum payRelativeTo) {
        this.payRelativeTo = payRelativeTo;
        return this;
    }

}
