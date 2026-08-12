package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EMvkMQtTjt6kMvmoGwHz3VA8mzvuVNoPmcesVmG15Bui")
public class CdmBaseStaticdataAssetCommonCommodity {
    public static String blueId() {
        return "EMvkMQtTjt6kMvmoGwHz3VA8mzvuVNoPmcesVmG15Bui";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/Commodity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/Commodity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCommodity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonCommodityProductDefinition commodityProductDefinition;

    private CdmBaseStaticdataAssetCommonDeliveryDateParameters deliveryDateReference;

    private CdmBaseStaticdataPartyLegalEntity exchange;

    private List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier;

    private Boolean isExchangeListed;

    private CdmObservableAssetQuotationSideEnum priceQuoteType;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    public CdmBaseStaticdataAssetCommonCommodityProductDefinition getCommodityProductDefinition() {
        return commodityProductDefinition;
    }

    public CdmBaseStaticdataAssetCommonCommodity commodityProductDefinition(CdmBaseStaticdataAssetCommonCommodityProductDefinition commodityProductDefinition) {
        this.commodityProductDefinition = commodityProductDefinition;
        return this;
    }

    public CdmBaseStaticdataAssetCommonDeliveryDateParameters getDeliveryDateReference() {
        return deliveryDateReference;
    }

    public CdmBaseStaticdataAssetCommonCommodity deliveryDateReference(CdmBaseStaticdataAssetCommonDeliveryDateParameters deliveryDateReference) {
        this.deliveryDateReference = deliveryDateReference;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmBaseStaticdataAssetCommonCommodity exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataAssetCommonCommodity identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmBaseStaticdataAssetCommonCommodity isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public CdmObservableAssetQuotationSideEnum getPriceQuoteType() {
        return priceQuoteType;
    }

    public CdmBaseStaticdataAssetCommonCommodity priceQuoteType(CdmObservableAssetQuotationSideEnum priceQuoteType) {
        this.priceQuoteType = priceQuoteType;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmBaseStaticdataAssetCommonCommodity relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmBaseStaticdataAssetCommonCommodity taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
