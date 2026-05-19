package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8z8UNaSpbcqVy5YXrGMBJtk2R9CeX36rqf9hor6f11Rq")
public class PrincipalPayment {
    public static String blueId() {
        return "8z8UNaSpbcqVy5YXrGMBJtk2R9CeX36rqf9hor6f11Rq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PrincipalPayment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PrincipalPayment";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PrincipalPayment.json";
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

    private Double discountFactor;

    private PayerReceiver payerReceiver;

    private Money presentValuePrincipalAmount;

    private Money principalAmount;

    private AdjustableDate principalPaymentDate;

    public String getNamespace() {
        return namespace;
    }

    public PrincipalPayment namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getDiscountFactor() {
        return discountFactor;
    }

    public PrincipalPayment discountFactor(Double discountFactor) {
        this.discountFactor = discountFactor;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public PrincipalPayment payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public Money getPresentValuePrincipalAmount() {
        return presentValuePrincipalAmount;
    }

    public PrincipalPayment presentValuePrincipalAmount(Money presentValuePrincipalAmount) {
        this.presentValuePrincipalAmount = presentValuePrincipalAmount;
        return this;
    }

    public Money getPrincipalAmount() {
        return principalAmount;
    }

    public PrincipalPayment principalAmount(Money principalAmount) {
        this.principalAmount = principalAmount;
        return this;
    }

    public AdjustableDate getPrincipalPaymentDate() {
        return principalPaymentDate;
    }

    public PrincipalPayment principalPaymentDate(AdjustableDate principalPaymentDate) {
        this.principalPaymentDate = principalPaymentDate;
        return this;
    }

}
