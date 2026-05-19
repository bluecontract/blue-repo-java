package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8dbvnLPu5svTYRQQgXsPjNe1nyZ3xC2ombPwJ2mDCMfg")
public class CashPrice {
    public static String blueId() {
        return "8dbvnLPu5svTYRQQgXsPjNe1nyZ3xC2ombPwJ2mDCMfg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CashPrice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CashPrice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CashPrice.json";
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

    private CashPriceTypeEnum cashPriceType;

    private FeeTypeEnum feeType;

    private PremiumExpression premiumExpression;

    public String getNamespace() {
        return namespace;
    }

    public CashPrice namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CashPriceTypeEnum getCashPriceType() {
        return cashPriceType;
    }

    public CashPrice cashPriceType(CashPriceTypeEnum cashPriceType) {
        this.cashPriceType = cashPriceType;
        return this;
    }

    public FeeTypeEnum getFeeType() {
        return feeType;
    }

    public CashPrice feeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
        return this;
    }

    public PremiumExpression getPremiumExpression() {
        return premiumExpression;
    }

    public CashPrice premiumExpression(PremiumExpression premiumExpression) {
        this.premiumExpression = premiumExpression;
        return this;
    }

}
