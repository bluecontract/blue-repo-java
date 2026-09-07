package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8tgV3efVMtQmkiUJM8szr1VSDCoG4fJb2zQCV4z31Mhk")
public class CdmProductTemplatePortfolioReturnTerms {
    public static String blueId() {
        return "8tgV3efVMtQmkiUJM8szr1VSDCoG4fJb2zQCV4z31Mhk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/PortfolioReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/PortfolioReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplatePortfolioReturnTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetCorrelationReturnTerms correlationReturnTerms;

    private CdmProductAssetDividendReturnTerms dividendReturnTerms;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> finalValuationPrice;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> initialValuationPrice;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> interimValuationPrice;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductAssetPriceReturnTerms priceReturnTerms;

    private CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule quantity;

    private CdmObservableAssetMetafieldsReferenceWithMetaObservable underlier;

    private CdmProductAssetVarianceReturnTerms varianceReturnTerms;

    private CdmProductAssetVolatilityReturnTerms volatilityReturnTerms;

    public CdmProductAssetCorrelationReturnTerms getCorrelationReturnTerms() {
        return correlationReturnTerms;
    }

    public CdmProductTemplatePortfolioReturnTerms correlationReturnTerms(CdmProductAssetCorrelationReturnTerms correlationReturnTerms) {
        this.correlationReturnTerms = correlationReturnTerms;
        return this;
    }

    public CdmProductAssetDividendReturnTerms getDividendReturnTerms() {
        return dividendReturnTerms;
    }

    public CdmProductTemplatePortfolioReturnTerms dividendReturnTerms(CdmProductAssetDividendReturnTerms dividendReturnTerms) {
        this.dividendReturnTerms = dividendReturnTerms;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getFinalValuationPrice() {
        return finalValuationPrice;
    }

    public CdmProductTemplatePortfolioReturnTerms finalValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> finalValuationPrice) {
        this.finalValuationPrice = finalValuationPrice;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getInitialValuationPrice() {
        return initialValuationPrice;
    }

    public CdmProductTemplatePortfolioReturnTerms initialValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> initialValuationPrice) {
        this.initialValuationPrice = initialValuationPrice;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getInterimValuationPrice() {
        return interimValuationPrice;
    }

    public CdmProductTemplatePortfolioReturnTerms interimValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> interimValuationPrice) {
        this.interimValuationPrice = interimValuationPrice;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductTemplatePortfolioReturnTerms payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductAssetPriceReturnTerms getPriceReturnTerms() {
        return priceReturnTerms;
    }

    public CdmProductTemplatePortfolioReturnTerms priceReturnTerms(CdmProductAssetPriceReturnTerms priceReturnTerms) {
        this.priceReturnTerms = priceReturnTerms;
        return this;
    }

    public CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule getQuantity() {
        return quantity;
    }

    public CdmProductTemplatePortfolioReturnTerms quantity(CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule quantity) {
        this.quantity = quantity;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaObservable getUnderlier() {
        return underlier;
    }

    public CdmProductTemplatePortfolioReturnTerms underlier(CdmObservableAssetMetafieldsReferenceWithMetaObservable underlier) {
        this.underlier = underlier;
        return this;
    }

    public CdmProductAssetVarianceReturnTerms getVarianceReturnTerms() {
        return varianceReturnTerms;
    }

    public CdmProductTemplatePortfolioReturnTerms varianceReturnTerms(CdmProductAssetVarianceReturnTerms varianceReturnTerms) {
        this.varianceReturnTerms = varianceReturnTerms;
        return this;
    }

    public CdmProductAssetVolatilityReturnTerms getVolatilityReturnTerms() {
        return volatilityReturnTerms;
    }

    public CdmProductTemplatePortfolioReturnTerms volatilityReturnTerms(CdmProductAssetVolatilityReturnTerms volatilityReturnTerms) {
        this.volatilityReturnTerms = volatilityReturnTerms;
        return this;
    }

}
