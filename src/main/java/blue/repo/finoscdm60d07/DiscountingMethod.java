package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3LH4mJEbjjsS57FpVzBFrvEEXYTKwWEXot1UJMjgP18c")
public class DiscountingMethod {
    public static String blueId() {
        return "3LH4mJEbjjsS57FpVzBFrvEEXYTKwWEXot1UJMjgP18c";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DiscountingMethod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DiscountingMethod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DiscountingMethod.json";
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

    private DiscountingTypeEnum discountingType;

    private Double discountRate;

    private FieldWithMetaDayCountFractionEnum discountRateDayCountFraction;

    public String getNamespace() {
        return namespace;
    }

    public DiscountingMethod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DiscountingTypeEnum getDiscountingType() {
        return discountingType;
    }

    public DiscountingMethod discountingType(DiscountingTypeEnum discountingType) {
        this.discountingType = discountingType;
        return this;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public DiscountingMethod discountRate(Double discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    public FieldWithMetaDayCountFractionEnum getDiscountRateDayCountFraction() {
        return discountRateDayCountFraction;
    }

    public DiscountingMethod discountRateDayCountFraction(FieldWithMetaDayCountFractionEnum discountRateDayCountFraction) {
        this.discountRateDayCountFraction = discountRateDayCountFraction;
        return this;
    }

}
