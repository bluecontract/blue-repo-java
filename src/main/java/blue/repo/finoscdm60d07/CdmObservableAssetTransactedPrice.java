package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FC5qtLcq8fhQandN4L4LHMUUK5cqeFtGFj8D3JnRYd9Z")
public class CdmObservableAssetTransactedPrice {
    public static String blueId() {
        return "FC5qtLcq8fhQandN4L4LHMUUK5cqeFtGFj8D3JnRYd9Z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/TransactedPrice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/TransactedPrice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetTransactedPrice.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double initialPoints;

    private Double marketFixedRate;

    private Double marketPrice;

    private CdmObservableAssetQuotationStyleEnum quotationStyle;

    public Double getInitialPoints() {
        return initialPoints;
    }

    public CdmObservableAssetTransactedPrice initialPoints(Double initialPoints) {
        this.initialPoints = initialPoints;
        return this;
    }

    public Double getMarketFixedRate() {
        return marketFixedRate;
    }

    public CdmObservableAssetTransactedPrice marketFixedRate(Double marketFixedRate) {
        this.marketFixedRate = marketFixedRate;
        return this;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public CdmObservableAssetTransactedPrice marketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public CdmObservableAssetQuotationStyleEnum getQuotationStyle() {
        return quotationStyle;
    }

    public CdmObservableAssetTransactedPrice quotationStyle(CdmObservableAssetQuotationStyleEnum quotationStyle) {
        this.quotationStyle = quotationStyle;
        return this;
    }

}
