package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4f82ZPnwyqMBT4ELy5TKzMBw4TbgpFf2vsTC1dAXSyeT")
public class Portfolio {
    public static String blueId() {
        return "4f82ZPnwyqMBT4ELy5TKzMBw4TbgpFf2vsTC1dAXSyeT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Portfolio";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Portfolio";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Portfolio.json";
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

    private AggregationParameters aggregationParameters;

    private PortfolioState portfolioState;

    public String getNamespace() {
        return namespace;
    }

    public Portfolio namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AggregationParameters getAggregationParameters() {
        return aggregationParameters;
    }

    public Portfolio aggregationParameters(AggregationParameters aggregationParameters) {
        this.aggregationParameters = aggregationParameters;
        return this;
    }

    public PortfolioState getPortfolioState() {
        return portfolioState;
    }

    public Portfolio portfolioState(PortfolioState portfolioState) {
        this.portfolioState = portfolioState;
        return this;
    }

}
