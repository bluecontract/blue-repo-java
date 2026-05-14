package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JEeYj7QJE1gCVbVn23WZCKxP68yvZjK7v49o4EfNEcN")
public class ReturnTerms {
    public static String blueId() {
        return "JEeYj7QJE1gCVbVn23WZCKxP68yvZjK7v49o4EfNEcN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ReturnTerms.json";
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

    private CorrelationReturnTerms correlationReturnTerms;

    private DividendReturnTerms dividendReturnTerms;

    private PriceReturnTerms priceReturnTerms;

    private VarianceReturnTerms varianceReturnTerms;

    private VolatilityReturnTerms volatilityReturnTerms;

    public String getNamespace() {
        return namespace;
    }

    public ReturnTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CorrelationReturnTerms getCorrelationReturnTerms() {
        return correlationReturnTerms;
    }

    public ReturnTerms correlationReturnTerms(CorrelationReturnTerms correlationReturnTerms) {
        this.correlationReturnTerms = correlationReturnTerms;
        return this;
    }

    public DividendReturnTerms getDividendReturnTerms() {
        return dividendReturnTerms;
    }

    public ReturnTerms dividendReturnTerms(DividendReturnTerms dividendReturnTerms) {
        this.dividendReturnTerms = dividendReturnTerms;
        return this;
    }

    public PriceReturnTerms getPriceReturnTerms() {
        return priceReturnTerms;
    }

    public ReturnTerms priceReturnTerms(PriceReturnTerms priceReturnTerms) {
        this.priceReturnTerms = priceReturnTerms;
        return this;
    }

    public VarianceReturnTerms getVarianceReturnTerms() {
        return varianceReturnTerms;
    }

    public ReturnTerms varianceReturnTerms(VarianceReturnTerms varianceReturnTerms) {
        this.varianceReturnTerms = varianceReturnTerms;
        return this;
    }

    public VolatilityReturnTerms getVolatilityReturnTerms() {
        return volatilityReturnTerms;
    }

    public ReturnTerms volatilityReturnTerms(VolatilityReturnTerms volatilityReturnTerms) {
        this.volatilityReturnTerms = volatilityReturnTerms;
        return this;
    }

}
