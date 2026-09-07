package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("vsv57yBArFZjHCerd1ibJnQiireaFSnTaECgDQsXjcC")
public class CdmObservableAssetInflationIndex {
    public static String blueId() {
        return "vsv57yBArFZjHCerd1ibJnQiireaFSnTaECgDQsXjcC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/InflationIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/InflationIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetInflationIndex.json";
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

    private CdmBaseDatetimePeriod indexTenor;

    private CdmBaseStaticdataAssetRatesFieldWithMetaInflationRateIndexEnum inflationRateIndex;

    private Boolean isExchangeListed;

    private CdmBaseStaticdataPartyLegalEntity provider;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    public CdmBaseStaticdataAssetCommonAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public CdmObservableAssetInflationIndex assetClass(CdmBaseStaticdataAssetCommonAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmObservableAssetInflationIndex exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmObservableAssetInflationIndex identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseDatetimePeriod getIndexTenor() {
        return indexTenor;
    }

    public CdmObservableAssetInflationIndex indexTenor(CdmBaseDatetimePeriod indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public CdmBaseStaticdataAssetRatesFieldWithMetaInflationRateIndexEnum getInflationRateIndex() {
        return inflationRateIndex;
    }

    public CdmObservableAssetInflationIndex inflationRateIndex(CdmBaseStaticdataAssetRatesFieldWithMetaInflationRateIndexEnum inflationRateIndex) {
        this.inflationRateIndex = inflationRateIndex;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmObservableAssetInflationIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getProvider() {
        return provider;
    }

    public CdmObservableAssetInflationIndex provider(CdmBaseStaticdataPartyLegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmObservableAssetInflationIndex relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmObservableAssetInflationIndex taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
