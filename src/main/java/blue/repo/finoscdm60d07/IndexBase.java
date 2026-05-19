package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6q7B8yLMLiQPDrHajch4mYevUgVMhJMsWNEGoCebTuSZ")
public class IndexBase {
    public static String blueId() {
        return "6q7B8yLMLiQPDrHajch4mYevUgVMhJMsWNEGoCebTuSZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IndexBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IndexBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/IndexBase.json";
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

    private LegalEntity provider;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public IndexBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetClassEnum getAssetClass() {
        return assetClass;
    }

    public IndexBase assetClass(AssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public IndexBase exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public IndexBase identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public IndexBase isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public LegalEntity getProvider() {
        return provider;
    }

    public IndexBase provider(LegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public IndexBase relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public IndexBase taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
