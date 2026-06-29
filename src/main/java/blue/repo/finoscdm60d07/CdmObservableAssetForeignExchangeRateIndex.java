package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3r42QBCBADZWzkxMBCQkvH3c6M3c1raWTFgLjoCsjZoe")
public class CdmObservableAssetForeignExchangeRateIndex {
    public static String blueId() {
        return "3r42QBCBADZWzkxMBCQkvH3c6M3c1raWTFgLjoCsjZoe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/ForeignExchangeRateIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/ForeignExchangeRateIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetForeignExchangeRateIndex.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonAssetClassEnum assetClass;

    private CdmBaseStaticdataPartyLegalEntity exchange;

    private List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier;

    private Boolean isExchangeListed;

    private CdmObservableAssetInformationSource primaryFxSpotRateSource;

    private CdmBaseStaticdataPartyLegalEntity provider;

    private CdmObservableAssetFieldWithMetaQuotedCurrencyPair quotedCurrencyPair;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private CdmObservableAssetInformationSource secondaryFxSpotRateSource;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    public CdmBaseStaticdataAssetCommonAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public CdmObservableAssetForeignExchangeRateIndex assetClass(CdmBaseStaticdataAssetCommonAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmObservableAssetForeignExchangeRateIndex exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmObservableAssetForeignExchangeRateIndex identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmObservableAssetForeignExchangeRateIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public CdmObservableAssetInformationSource getPrimaryFxSpotRateSource() {
        return primaryFxSpotRateSource;
    }

    public CdmObservableAssetForeignExchangeRateIndex primaryFxSpotRateSource(CdmObservableAssetInformationSource primaryFxSpotRateSource) {
        this.primaryFxSpotRateSource = primaryFxSpotRateSource;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getProvider() {
        return provider;
    }

    public CdmObservableAssetForeignExchangeRateIndex provider(CdmBaseStaticdataPartyLegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public CdmObservableAssetFieldWithMetaQuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    public CdmObservableAssetForeignExchangeRateIndex quotedCurrencyPair(CdmObservableAssetFieldWithMetaQuotedCurrencyPair quotedCurrencyPair) {
        this.quotedCurrencyPair = quotedCurrencyPair;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmObservableAssetForeignExchangeRateIndex relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public CdmObservableAssetInformationSource getSecondaryFxSpotRateSource() {
        return secondaryFxSpotRateSource;
    }

    public CdmObservableAssetForeignExchangeRateIndex secondaryFxSpotRateSource(CdmObservableAssetInformationSource secondaryFxSpotRateSource) {
        this.secondaryFxSpotRateSource = secondaryFxSpotRateSource;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmObservableAssetForeignExchangeRateIndex taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
