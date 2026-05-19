package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2nR3WCnVt38AFUKhannVhTFWYzzg9WzNQuqVcNjEgTBG")
public class CreditDefaultPayout {
    public static String blueId() {
        return "2nR3WCnVt38AFUKhannVhTFWYzzg9WzNQuqVcNjEgTBG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditDefaultPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditDefaultPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditDefaultPayout.json";
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

    private GeneralTerms generalTerms;

    private PayerReceiver payerReceiver;

    private ResolvablePriceQuantity priceQuantity;

    private PrincipalPayments principalPayment;

    private List<ProtectionTerms> protectionTerms;

    private SettlementTerms settlementTerms;

    private TransactedPrice transactedPrice;

    public String getNamespace() {
        return namespace;
    }

    public CreditDefaultPayout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public GeneralTerms getGeneralTerms() {
        return generalTerms;
    }

    public CreditDefaultPayout generalTerms(GeneralTerms generalTerms) {
        this.generalTerms = generalTerms;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CreditDefaultPayout payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CreditDefaultPayout priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CreditDefaultPayout principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public List<ProtectionTerms> getProtectionTerms() {
        return protectionTerms;
    }

    public CreditDefaultPayout protectionTerms(List<ProtectionTerms> protectionTerms) {
        this.protectionTerms = protectionTerms;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CreditDefaultPayout settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public TransactedPrice getTransactedPrice() {
        return transactedPrice;
    }

    public CreditDefaultPayout transactedPrice(TransactedPrice transactedPrice) {
        this.transactedPrice = transactedPrice;
        return this;
    }

}
