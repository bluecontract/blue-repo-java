package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EnrrQTpK4YHwS3naHuysSQuMiTUXSQvxZSzN79FhAhez")
public class PaymentDetail {
    public static String blueId() {
        return "EnrrQTpK4YHwS3naHuysSQuMiTUXSQvxZSzN79FhAhez";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PaymentDetail";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PaymentDetail";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PaymentDetail.json";
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

    private Money paymentAmount;

    private AdjustableOrRelativeDate paymentDate;

    private PaymentRule paymentRule;

    public String getNamespace() {
        return namespace;
    }

    public PaymentDetail namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getPaymentAmount() {
        return paymentAmount;
    }

    public PaymentDetail paymentAmount(Money paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    public AdjustableOrRelativeDate getPaymentDate() {
        return paymentDate;
    }

    public PaymentDetail paymentDate(AdjustableOrRelativeDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public PaymentRule getPaymentRule() {
        return paymentRule;
    }

    public PaymentDetail paymentRule(PaymentRule paymentRule) {
        this.paymentRule = paymentRule;
        return this;
    }

}
