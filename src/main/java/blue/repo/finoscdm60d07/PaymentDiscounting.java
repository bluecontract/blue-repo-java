package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3vicc7as3nn2YJ2rjji6rMd8bpBRgzRM3q4GYempHppN")
public class PaymentDiscounting {
    public static String blueId() {
        return "3vicc7as3nn2YJ2rjji6rMd8bpBRgzRM3q4GYempHppN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PaymentDiscounting";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PaymentDiscounting";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PaymentDiscounting.json";
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

    private Double discountFactor;

    private Money presentValueAmount;

    public String getNamespace() {
        return namespace;
    }

    public PaymentDiscounting namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getDiscountFactor() {
        return discountFactor;
    }

    public PaymentDiscounting discountFactor(Double discountFactor) {
        this.discountFactor = discountFactor;
        return this;
    }

    public Money getPresentValueAmount() {
        return presentValueAmount;
    }

    public PaymentDiscounting presentValueAmount(Money presentValueAmount) {
        this.presentValueAmount = presentValueAmount;
        return this;
    }

}
