package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9td8wxrr4VHiiiVNvYfRvHf45EJf2c4Vqxzmg2LHYZBX")
public class EquityIndex {
    public static String blueId() {
        return "9td8wxrr4VHiiiVNvYfRvHf45EJf2c4Vqxzmg2LHYZBX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EquityIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EquityIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EquityIndex.json";
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

    public EquityIndex namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetClassEnum getAssetClass() {
        return assetClass;
    }

    public EquityIndex assetClass(AssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public EquityIndex exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public EquityIndex identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public EquityIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public LegalEntity getProvider() {
        return provider;
    }

    public EquityIndex provider(LegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public EquityIndex relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public EquityIndex taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
