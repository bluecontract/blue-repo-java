package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AB5iQZKEM83BUxXQ3n1ekRQ1dsy7gC7Tpf9qnmnBtVJL")
public class CdmProductAssetCreditDefaultPayout {
    public static String blueId() {
        return "AB5iQZKEM83BUxXQ3n1ekRQ1dsy7gC7Tpf9qnmnBtVJL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/CreditDefaultPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/CreditDefaultPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetCreditDefaultPayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetGeneralTerms generalTerms;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductCommonSettlementResolvablePriceQuantity priceQuantity;

    private CdmProductCommonSettlementPrincipalPayments principalPayment;

    private List<CdmProductAssetProtectionTerms> protectionTerms;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    private CdmObservableAssetTransactedPrice transactedPrice;

    public CdmProductAssetGeneralTerms getGeneralTerms() {
        return generalTerms;
    }

    public CdmProductAssetCreditDefaultPayout generalTerms(CdmProductAssetGeneralTerms generalTerms) {
        this.generalTerms = generalTerms;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductAssetCreditDefaultPayout payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductAssetCreditDefaultPayout priceQuantity(CdmProductCommonSettlementResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CdmProductAssetCreditDefaultPayout principalPayment(CdmProductCommonSettlementPrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public List<CdmProductAssetProtectionTerms> getProtectionTerms() {
        return protectionTerms;
    }

    public CdmProductAssetCreditDefaultPayout protectionTerms(List<CdmProductAssetProtectionTerms> protectionTerms) {
        this.protectionTerms = protectionTerms;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmProductAssetCreditDefaultPayout settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public CdmObservableAssetTransactedPrice getTransactedPrice() {
        return transactedPrice;
    }

    public CdmProductAssetCreditDefaultPayout transactedPrice(CdmObservableAssetTransactedPrice transactedPrice) {
        this.transactedPrice = transactedPrice;
        return this;
    }

}
