package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("28FY3ugrtNmy2gcZkYRQKXRt18ejy9a8cDNMzFWs7qtF")
public class PayoutBase {
    public static String blueId() {
        return "28FY3ugrtNmy2gcZkYRQKXRt18ejy9a8cDNMzFWs7qtF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PayoutBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PayoutBase";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PayoutBase.json";
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

    private PayerReceiver payerReceiver;

    private ResolvablePriceQuantity priceQuantity;

    private PrincipalPayments principalPayment;

    private SettlementTerms settlementTerms;

    public String getNamespace() {
        return namespace;
    }

    public PayoutBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public PayoutBase payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public PayoutBase priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public PayoutBase principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public PayoutBase settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

}
