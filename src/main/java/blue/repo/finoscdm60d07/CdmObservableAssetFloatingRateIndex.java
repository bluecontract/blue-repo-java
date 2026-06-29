package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5HGCdXL7A44CctEHzdmFoxAvfxHpCB2myr1mHPM1b72K")
public class CdmObservableAssetFloatingRateIndex {
    public static String blueId() {
        return "5HGCdXL7A44CctEHzdmFoxAvfxHpCB2myr1mHPM1b72K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FloatingRateIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FloatingRateIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFloatingRateIndex.json";
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

    private CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum floatingRateIndex;

    private List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier;

    private CdmBaseDatetimePeriod indexTenor;

    private Boolean isExchangeListed;

    private CdmBaseStaticdataPartyLegalEntity provider;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    public CdmBaseStaticdataAssetCommonAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public CdmObservableAssetFloatingRateIndex assetClass(CdmBaseStaticdataAssetCommonAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmObservableAssetFloatingRateIndex exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public CdmObservableAssetFloatingRateIndex floatingRateIndex(CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmObservableAssetFloatingRateIndex identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseDatetimePeriod getIndexTenor() {
        return indexTenor;
    }

    public CdmObservableAssetFloatingRateIndex indexTenor(CdmBaseDatetimePeriod indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmObservableAssetFloatingRateIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getProvider() {
        return provider;
    }

    public CdmObservableAssetFloatingRateIndex provider(CdmBaseStaticdataPartyLegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmObservableAssetFloatingRateIndex relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmObservableAssetFloatingRateIndex taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
