package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CkeF18aQokqFBEX3MBXjrXciqtnKfoa1FHbLDTBZ3H8C")
public class ListedDerivative {
    public static String blueId() {
        return "CkeF18aQokqFBEX3MBXjrXciqtnKfoa1FHbLDTBZ3H8C";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ListedDerivative";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ListedDerivative";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ListedDerivative.json";
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

    private String deliveryTerm;

    private LegalEntity exchange;

    private List<AssetIdentifier> identifier;

    private InstrumentTypeEnum instrumentType;

    private Boolean isExchangeListed;

    private PutCallEnum optionType;

    private List<LegalEntity> relatedExchange;

    private Double strike;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public ListedDerivative namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDeliveryTerm() {
        return deliveryTerm;
    }

    public ListedDerivative deliveryTerm(String deliveryTerm) {
        this.deliveryTerm = deliveryTerm;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public ListedDerivative exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public ListedDerivative identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public InstrumentTypeEnum getInstrumentType() {
        return instrumentType;
    }

    public ListedDerivative instrumentType(InstrumentTypeEnum instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public ListedDerivative isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public PutCallEnum getOptionType() {
        return optionType;
    }

    public ListedDerivative optionType(PutCallEnum optionType) {
        this.optionType = optionType;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public ListedDerivative relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public Double getStrike() {
        return strike;
    }

    public ListedDerivative strike(Double strike) {
        this.strike = strike;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public ListedDerivative taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
