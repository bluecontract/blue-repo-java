package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6Q52UKyKy7a4DAwfBNkjZbnSZiKLeK494vFXFiTinNc1")
public class SchedulePeriod {
    public static String blueId() {
        return "6Q52UKyKy7a4DAwfBNkjZbnSZiKLeK494vFXFiTinNc1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SchedulePeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SchedulePeriod";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SchedulePeriod.json";
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

    private DateRange calculationPeriod;

    private CalculationScheduleDeliveryPeriods deliveryPeriod;

    private DateRange fixingPeriod;

    private String paymentDate;

    public String getNamespace() {
        return namespace;
    }

    public SchedulePeriod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DateRange getCalculationPeriod() {
        return calculationPeriod;
    }

    public SchedulePeriod calculationPeriod(DateRange calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
        return this;
    }

    public CalculationScheduleDeliveryPeriods getDeliveryPeriod() {
        return deliveryPeriod;
    }

    public SchedulePeriod deliveryPeriod(CalculationScheduleDeliveryPeriods deliveryPeriod) {
        this.deliveryPeriod = deliveryPeriod;
        return this;
    }

    public DateRange getFixingPeriod() {
        return fixingPeriod;
    }

    public SchedulePeriod fixingPeriod(DateRange fixingPeriod) {
        this.fixingPeriod = fixingPeriod;
        return this;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public SchedulePeriod paymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

}
