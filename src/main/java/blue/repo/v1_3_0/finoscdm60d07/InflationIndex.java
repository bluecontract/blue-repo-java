package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2in6LZV5vFGWtSWwPLApCd9S76kL3vu4KZo8xbovsStg")
public class InflationIndex {
    public static String blueId() {
        return "2in6LZV5vFGWtSWwPLApCd9S76kL3vu4KZo8xbovsStg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InflationIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InflationIndex";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InflationIndex.json";
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

    private Period indexTenor;

    private FieldWithMetaInflationRateIndexEnum inflationRateIndex;

    private Boolean isExchangeListed;

    private LegalEntity provider;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public InflationIndex namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetClassEnum getAssetClass() {
        return assetClass;
    }

    public InflationIndex assetClass(AssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public InflationIndex exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public InflationIndex identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Period getIndexTenor() {
        return indexTenor;
    }

    public InflationIndex indexTenor(Period indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public FieldWithMetaInflationRateIndexEnum getInflationRateIndex() {
        return inflationRateIndex;
    }

    public InflationIndex inflationRateIndex(FieldWithMetaInflationRateIndexEnum inflationRateIndex) {
        this.inflationRateIndex = inflationRateIndex;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public InflationIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public LegalEntity getProvider() {
        return provider;
    }

    public InflationIndex provider(LegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public InflationIndex relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public InflationIndex taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
