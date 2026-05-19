package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4ZiCrYCYd4S7KUQNZk1v2d6TA68XChy7R8cbY4LZBGVw")
public class Cashflow {
    public static String blueId() {
        return "4ZiCrYCYd4S7KUQNZk1v2d6TA68XChy7R8cbY4LZBGVw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Cashflow";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Cashflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Cashflow.json";
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

    private Asset asset;

    private CashflowType cashflowType;

    private PayerReceiver payerReceiver;

    private PaymentDiscounting paymentDiscounting;

    private NonNegativeQuantity quantity;

    private AdjustableOrAdjustedOrRelativeDate settlementDate;

    public String getNamespace() {
        return namespace;
    }

    public Cashflow namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Asset getAsset() {
        return asset;
    }

    public Cashflow asset(Asset asset) {
        this.asset = asset;
        return this;
    }

    public CashflowType getCashflowType() {
        return cashflowType;
    }

    public Cashflow cashflowType(CashflowType cashflowType) {
        this.cashflowType = cashflowType;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public Cashflow payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public PaymentDiscounting getPaymentDiscounting() {
        return paymentDiscounting;
    }

    public Cashflow paymentDiscounting(PaymentDiscounting paymentDiscounting) {
        this.paymentDiscounting = paymentDiscounting;
        return this;
    }

    public NonNegativeQuantity getQuantity() {
        return quantity;
    }

    public Cashflow quantity(NonNegativeQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public AdjustableOrAdjustedOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    public Cashflow settlementDate(AdjustableOrAdjustedOrRelativeDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

}
