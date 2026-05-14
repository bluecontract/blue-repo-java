package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3CUtQ48KKedRPvjGsnNqngJ6qL5BdeyQtP9zi6rEyrvb")
public class Commodity {
    public static String blueId() {
        return "3CUtQ48KKedRPvjGsnNqngJ6qL5BdeyQtP9zi6rEyrvb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Commodity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Commodity";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Commodity.json";
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

    private CommodityProductDefinition commodityProductDefinition;

    private DeliveryDateParameters deliveryDateReference;

    private LegalEntity exchange;

    private List<AssetIdentifier> identifier;

    private Boolean isExchangeListed;

    private QuotationSideEnum priceQuoteType;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public Commodity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CommodityProductDefinition getCommodityProductDefinition() {
        return commodityProductDefinition;
    }

    public Commodity commodityProductDefinition(CommodityProductDefinition commodityProductDefinition) {
        this.commodityProductDefinition = commodityProductDefinition;
        return this;
    }

    public DeliveryDateParameters getDeliveryDateReference() {
        return deliveryDateReference;
    }

    public Commodity deliveryDateReference(DeliveryDateParameters deliveryDateReference) {
        this.deliveryDateReference = deliveryDateReference;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public Commodity exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public Commodity identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public Commodity isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public QuotationSideEnum getPriceQuoteType() {
        return priceQuoteType;
    }

    public Commodity priceQuoteType(QuotationSideEnum priceQuoteType) {
        this.priceQuoteType = priceQuoteType;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public Commodity relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public Commodity taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
