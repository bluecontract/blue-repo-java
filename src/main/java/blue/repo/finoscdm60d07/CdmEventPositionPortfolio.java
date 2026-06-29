package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5uwV9tJmkwW5rZ6mfKRco97dQEw9rwznJePYQbLyAJco")
public class CdmEventPositionPortfolio {
    public static String blueId() {
        return "5uwV9tJmkwW5rZ6mfKRco97dQEw9rwznJePYQbLyAJco";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/Portfolio";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/Portfolio";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionPortfolio.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventPositionAggregationParameters aggregationParameters;

    private CdmEventPositionPortfolioState portfolioState;

    public CdmEventPositionAggregationParameters getAggregationParameters() {
        return aggregationParameters;
    }

    public CdmEventPositionPortfolio aggregationParameters(CdmEventPositionAggregationParameters aggregationParameters) {
        this.aggregationParameters = aggregationParameters;
        return this;
    }

    public CdmEventPositionPortfolioState getPortfolioState() {
        return portfolioState;
    }

    public CdmEventPositionPortfolio portfolioState(CdmEventPositionPortfolioState portfolioState) {
        this.portfolioState = portfolioState;
        return this;
    }

}
