package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("63T48TnoQTtqwqJhapzoroXE67oBew8rTpLWkaMbEoWt")
public class Security {
    public static String blueId() {
        return "63T48TnoQTtqwqJhapzoroXE67oBew8rTpLWkaMbEoWt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Security";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Security";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Security.json";
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

    private DebtType debtType;

    private EquityTypeEnum equityType;

    private LegalEntity exchange;

    private FundProductTypeEnum fundType;

    private List<AssetIdentifier> identifier;

    private InstrumentTypeEnum instrumentType;

    private Boolean isExchangeListed;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public Security namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DebtType getDebtType() {
        return debtType;
    }

    public Security debtType(DebtType debtType) {
        this.debtType = debtType;
        return this;
    }

    public EquityTypeEnum getEquityType() {
        return equityType;
    }

    public Security equityType(EquityTypeEnum equityType) {
        this.equityType = equityType;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public Security exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public FundProductTypeEnum getFundType() {
        return fundType;
    }

    public Security fundType(FundProductTypeEnum fundType) {
        this.fundType = fundType;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public Security identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public InstrumentTypeEnum getInstrumentType() {
        return instrumentType;
    }

    public Security instrumentType(InstrumentTypeEnum instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public Security isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public Security relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public Security taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
