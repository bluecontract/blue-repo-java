package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GXvnC5DhzQoF6BvatoviXKjf12hpePz4PPEEVMBnEfcU")
public class FloatingRateIndex {
    public static String blueId() {
        return "GXvnC5DhzQoF6BvatoviXKjf12hpePz4PPEEVMBnEfcU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndex";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateIndex.json";
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

    private FieldWithMetaFloatingRateIndexEnum floatingRateIndex;

    private List<AssetIdentifier> identifier;

    private Period indexTenor;

    private Boolean isExchangeListed;

    private LegalEntity provider;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateIndex namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetClassEnum getAssetClass() {
        return assetClass;
    }

    public FloatingRateIndex assetClass(AssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public FloatingRateIndex exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public FieldWithMetaFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public FloatingRateIndex floatingRateIndex(FieldWithMetaFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public FloatingRateIndex identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Period getIndexTenor() {
        return indexTenor;
    }

    public FloatingRateIndex indexTenor(Period indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public FloatingRateIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public LegalEntity getProvider() {
        return provider;
    }

    public FloatingRateIndex provider(LegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public FloatingRateIndex relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public FloatingRateIndex taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
