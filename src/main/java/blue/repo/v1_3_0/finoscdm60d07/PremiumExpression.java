package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9q7JojGrbjPEXZEnjbCLbSzFWEUqMjffs3hCj2k6Cfs1")
public class PremiumExpression {
    public static String blueId() {
        return "9q7JojGrbjPEXZEnjbCLbSzFWEUqMjffs3hCj2k6Cfs1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PremiumExpression";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PremiumExpression";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PremiumExpression.json";
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

    private Double percentageOfNotional;

    private PremiumTypeEnum premiumType;

    private Money pricePerOption;

    public String getNamespace() {
        return namespace;
    }

    public PremiumExpression namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getPercentageOfNotional() {
        return percentageOfNotional;
    }

    public PremiumExpression percentageOfNotional(Double percentageOfNotional) {
        this.percentageOfNotional = percentageOfNotional;
        return this;
    }

    public PremiumTypeEnum getPremiumType() {
        return premiumType;
    }

    public PremiumExpression premiumType(PremiumTypeEnum premiumType) {
        this.premiumType = premiumType;
        return this;
    }

    public Money getPricePerOption() {
        return pricePerOption;
    }

    public PremiumExpression pricePerOption(Money pricePerOption) {
        this.pricePerOption = pricePerOption;
        return this;
    }

}
