package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BXfHe5xVoB8FixQGaJjUB9VefbfmoE6eatZzYkKysf2b")
public class Cash {
    public static String blueId() {
        return "BXfHe5xVoB8FixQGaJjUB9VefbfmoE6eatZzYkKysf2b";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Cash";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Cash";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Cash.json";
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

    private LegalEntity exchange;

    private List<AssetIdentifier> identifier;

    private Boolean isExchangeListed;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public Cash namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public Cash exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public Cash identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public Cash isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public Cash relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public Cash taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
