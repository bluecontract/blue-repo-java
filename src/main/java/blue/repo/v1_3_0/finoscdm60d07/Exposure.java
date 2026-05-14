package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9x7CCjsnmMwNUJwmhsufooyuvgcMigcXRjAubNDSCgNw")
public class Exposure {
    public static String blueId() {
        return "9x7CCjsnmMwNUJwmhsufooyuvgcMigcXRjAubNDSCgNw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Exposure";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Exposure";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Exposure.json";
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

    private Money aggregateValue;

    private String calculationDateTime;

    private ReferenceWithMetaPortfolioState tradePortfolio;

    private String valuationDateTime;

    public String getNamespace() {
        return namespace;
    }

    public Exposure namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getAggregateValue() {
        return aggregateValue;
    }

    public Exposure aggregateValue(Money aggregateValue) {
        this.aggregateValue = aggregateValue;
        return this;
    }

    public String getCalculationDateTime() {
        return calculationDateTime;
    }

    public Exposure calculationDateTime(String calculationDateTime) {
        this.calculationDateTime = calculationDateTime;
        return this;
    }

    public ReferenceWithMetaPortfolioState getTradePortfolio() {
        return tradePortfolio;
    }

    public Exposure tradePortfolio(ReferenceWithMetaPortfolioState tradePortfolio) {
        this.tradePortfolio = tradePortfolio;
        return this;
    }

    public String getValuationDateTime() {
        return valuationDateTime;
    }

    public Exposure valuationDateTime(String valuationDateTime) {
        this.valuationDateTime = valuationDateTime;
        return this;
    }

}
