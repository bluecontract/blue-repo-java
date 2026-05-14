package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AJckhagbuMLA6QgwxYxtw79vsuiLQNS3xdkQcwKwt56Q")
public class TradePricingReport {
    public static String blueId() {
        return "AJckhagbuMLA6QgwxYxtw79vsuiLQNS3xdkQcwKwt56Q";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TradePricingReport";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TradePricingReport";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TradePricingReport.json";
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

    private FloatingRateIndexEnum discountingIndex;

    private TimeZone pricingTime;

    private Trade trade;

    public String getNamespace() {
        return namespace;
    }

    public TradePricingReport namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FloatingRateIndexEnum getDiscountingIndex() {
        return discountingIndex;
    }

    public TradePricingReport discountingIndex(FloatingRateIndexEnum discountingIndex) {
        this.discountingIndex = discountingIndex;
        return this;
    }

    public TimeZone getPricingTime() {
        return pricingTime;
    }

    public TradePricingReport pricingTime(TimeZone pricingTime) {
        this.pricingTime = pricingTime;
        return this;
    }

    public Trade getTrade() {
        return trade;
    }

    public TradePricingReport trade(Trade trade) {
        this.trade = trade;
        return this;
    }

}
