package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HdxRMsB9JqVoHg9kKoC9DRb95BmDrCJMPYDCRPqFUkGq")
public class ForeignExchangeRateIndex {
    public static String blueId() {
        return "HdxRMsB9JqVoHg9kKoC9DRb95BmDrCJMPYDCRPqFUkGq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ForeignExchangeRateIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ForeignExchangeRateIndex";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ForeignExchangeRateIndex.json";
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

    private AssetClassEnum assetClass;

    private LegalEntity exchange;

    private List<AssetIdentifier> identifier;

    private Boolean isExchangeListed;

    private InformationSource primaryFxSpotRateSource;

    private LegalEntity provider;

    private FieldWithMetaQuotedCurrencyPair quotedCurrencyPair;

    private List<LegalEntity> relatedExchange;

    private InformationSource secondaryFxSpotRateSource;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public ForeignExchangeRateIndex namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetClassEnum getAssetClass() {
        return assetClass;
    }

    public ForeignExchangeRateIndex assetClass(AssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public ForeignExchangeRateIndex exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public ForeignExchangeRateIndex identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public ForeignExchangeRateIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public InformationSource getPrimaryFxSpotRateSource() {
        return primaryFxSpotRateSource;
    }

    public ForeignExchangeRateIndex primaryFxSpotRateSource(InformationSource primaryFxSpotRateSource) {
        this.primaryFxSpotRateSource = primaryFxSpotRateSource;
        return this;
    }

    public LegalEntity getProvider() {
        return provider;
    }

    public ForeignExchangeRateIndex provider(LegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public FieldWithMetaQuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    public ForeignExchangeRateIndex quotedCurrencyPair(FieldWithMetaQuotedCurrencyPair quotedCurrencyPair) {
        this.quotedCurrencyPair = quotedCurrencyPair;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public ForeignExchangeRateIndex relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public InformationSource getSecondaryFxSpotRateSource() {
        return secondaryFxSpotRateSource;
    }

    public ForeignExchangeRateIndex secondaryFxSpotRateSource(InformationSource secondaryFxSpotRateSource) {
        this.secondaryFxSpotRateSource = secondaryFxSpotRateSource;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public ForeignExchangeRateIndex taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
