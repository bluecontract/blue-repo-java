package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C679ZMU8EZmaa6vaEdfxHjNQD8fM5PUBNsXR3ZQJUxio")
public class CdmEventCommonExposure {
    public static String blueId() {
        return "C679ZMU8EZmaa6vaEdfxHjNQD8fM5PUBNsXR3ZQJUxio";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/Exposure";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/Exposure";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonExposure.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney aggregateValue;

    private String calculationDateTime;

    private CdmEventPositionMetafieldsReferenceWithMetaPortfolioState tradePortfolio;

    private String valuationDateTime;

    public CdmObservableAssetMoney getAggregateValue() {
        return aggregateValue;
    }

    public CdmEventCommonExposure aggregateValue(CdmObservableAssetMoney aggregateValue) {
        this.aggregateValue = aggregateValue;
        return this;
    }

    public String getCalculationDateTime() {
        return calculationDateTime;
    }

    public CdmEventCommonExposure calculationDateTime(String calculationDateTime) {
        this.calculationDateTime = calculationDateTime;
        return this;
    }

    public CdmEventPositionMetafieldsReferenceWithMetaPortfolioState getTradePortfolio() {
        return tradePortfolio;
    }

    public CdmEventCommonExposure tradePortfolio(CdmEventPositionMetafieldsReferenceWithMetaPortfolioState tradePortfolio) {
        this.tradePortfolio = tradePortfolio;
        return this;
    }

    public String getValuationDateTime() {
        return valuationDateTime;
    }

    public CdmEventCommonExposure valuationDateTime(String valuationDateTime) {
        this.valuationDateTime = valuationDateTime;
        return this;
    }

}
