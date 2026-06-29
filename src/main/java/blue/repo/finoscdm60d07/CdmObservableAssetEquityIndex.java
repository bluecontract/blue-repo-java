package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EArWxvBkePDwUEtKBhh6BFEHXRgqmUAiHbHAVCW9EWu4")
public class CdmObservableAssetEquityIndex {
    public static String blueId() {
        return "EArWxvBkePDwUEtKBhh6BFEHXRgqmUAiHbHAVCW9EWu4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/EquityIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/EquityIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetEquityIndex.json";
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

    private CdmBaseStaticdataPartyLegalEntity provider;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    public CdmBaseStaticdataAssetCommonAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public CdmObservableAssetEquityIndex assetClass(CdmBaseStaticdataAssetCommonAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmObservableAssetEquityIndex exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmObservableAssetEquityIndex identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmObservableAssetEquityIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getProvider() {
        return provider;
    }

    public CdmObservableAssetEquityIndex provider(CdmBaseStaticdataPartyLegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmObservableAssetEquityIndex relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmObservableAssetEquityIndex taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
