package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("67Ud3jXeu1WjJh3uXk333v2o9jPN8SRqNpRGHYZi7NLW")
public class Valuation {
    public static String blueId() {
        return "67Ud3jXeu1WjJh3uXk333v2o9jPN8SRqNpRGHYZi7NLW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Valuation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Valuation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Valuation.json";
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

    private Money amount;

    private Double delta;

    private ValuationTypeEnum method;

    private Price priceComponent;

    private ValuationSourceEnum source;

    private String timestamp;

    private PriceTimingEnum valuationTiming;

    public String getNamespace() {
        return namespace;
    }

    public Valuation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getAmount() {
        return amount;
    }

    public Valuation amount(Money amount) {
        this.amount = amount;
        return this;
    }

    public Double getDelta() {
        return delta;
    }

    public Valuation delta(Double delta) {
        this.delta = delta;
        return this;
    }

    public ValuationTypeEnum getMethod() {
        return method;
    }

    public Valuation method(ValuationTypeEnum method) {
        this.method = method;
        return this;
    }

    public Price getPriceComponent() {
        return priceComponent;
    }

    public Valuation priceComponent(Price priceComponent) {
        this.priceComponent = priceComponent;
        return this;
    }

    public ValuationSourceEnum getSource() {
        return source;
    }

    public Valuation source(ValuationSourceEnum source) {
        this.source = source;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Valuation timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public PriceTimingEnum getValuationTiming() {
        return valuationTiming;
    }

    public Valuation valuationTiming(PriceTimingEnum valuationTiming) {
        this.valuationTiming = valuationTiming;
        return this;
    }

}
