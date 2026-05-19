package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HmwDrGtkX4d8yqFFhZcJNkbkgcXFGEXgdLe8hyq1RLcU#1")
public class Basket {
    public static String blueId() {
        return "HmwDrGtkX4d8yqFFhZcJNkbkgcXFGEXgdLe8hyq1RLcU#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Basket";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Basket";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Basket.json";
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

    private List<FieldWithMetaBasketConstituent> basketConstituent;

    private LegalEntity exchange;

    private List<AssetIdentifier> identifier;

    private Boolean isExchangeListed;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public Basket namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaBasketConstituent> getBasketConstituent() {
        return basketConstituent;
    }

    public Basket basketConstituent(List<FieldWithMetaBasketConstituent> basketConstituent) {
        this.basketConstituent = basketConstituent;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public Basket exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public Basket identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public Basket isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public Basket relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public Basket taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
