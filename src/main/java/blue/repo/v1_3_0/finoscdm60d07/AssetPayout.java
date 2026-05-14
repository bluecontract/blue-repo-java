package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("C319b6ZpkQfqhXdajpXE5y9HSAvHyqHsZXH2yYa93UCs")
public class AssetPayout {
    public static String blueId() {
        return "C319b6ZpkQfqhXdajpXE5y9HSAvHyqHsZXH2yYa93UCs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetPayout";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetPayout.json";
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

    private List<AssetLeg> assetLeg;

    private DividendTerms dividendTerms;

    private Money minimumFee;

    private PayerReceiver payerReceiver;

    private ResolvablePriceQuantity priceQuantity;

    private PrincipalPayments principalPayment;

    private SettlementTerms settlementTerms;

    private AssetPayoutTradeTypeEnum tradeType;

    private Asset underlier;

    public String getNamespace() {
        return namespace;
    }

    public AssetPayout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<AssetLeg> getAssetLeg() {
        return assetLeg;
    }

    public AssetPayout assetLeg(List<AssetLeg> assetLeg) {
        this.assetLeg = assetLeg;
        return this;
    }

    public DividendTerms getDividendTerms() {
        return dividendTerms;
    }

    public AssetPayout dividendTerms(DividendTerms dividendTerms) {
        this.dividendTerms = dividendTerms;
        return this;
    }

    public Money getMinimumFee() {
        return minimumFee;
    }

    public AssetPayout minimumFee(Money minimumFee) {
        this.minimumFee = minimumFee;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public AssetPayout payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public AssetPayout priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public AssetPayout principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public AssetPayout settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public AssetPayoutTradeTypeEnum getTradeType() {
        return tradeType;
    }

    public AssetPayout tradeType(AssetPayoutTradeTypeEnum tradeType) {
        this.tradeType = tradeType;
        return this;
    }

    public Asset getUnderlier() {
        return underlier;
    }

    public AssetPayout underlier(Asset underlier) {
        this.underlier = underlier;
        return this;
    }

}
