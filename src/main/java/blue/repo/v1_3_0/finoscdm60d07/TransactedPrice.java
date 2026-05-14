package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("53eBJNGT21B6EFGbVjKAKr7gy6jDfDWsrG9vNSHRyc7e")
public class TransactedPrice {
    public static String blueId() {
        return "53eBJNGT21B6EFGbVjKAKr7gy6jDfDWsrG9vNSHRyc7e";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TransactedPrice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TransactedPrice";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TransactedPrice.json";
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

    private Double initialPoints;

    private Double marketFixedRate;

    private Double marketPrice;

    private QuotationStyleEnum quotationStyle;

    public String getNamespace() {
        return namespace;
    }

    public TransactedPrice namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getInitialPoints() {
        return initialPoints;
    }

    public TransactedPrice initialPoints(Double initialPoints) {
        this.initialPoints = initialPoints;
        return this;
    }

    public Double getMarketFixedRate() {
        return marketFixedRate;
    }

    public TransactedPrice marketFixedRate(Double marketFixedRate) {
        this.marketFixedRate = marketFixedRate;
        return this;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public TransactedPrice marketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public QuotationStyleEnum getQuotationStyle() {
        return quotationStyle;
    }

    public TransactedPrice quotationStyle(QuotationStyleEnum quotationStyle) {
        this.quotationStyle = quotationStyle;
        return this;
    }

}
