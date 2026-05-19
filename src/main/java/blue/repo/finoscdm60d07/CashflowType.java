package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HFLE8QVSxkYmjLKtwEnzRTkupVu8kcpZnikU9B8bnSH3")
public class CashflowType {
    public static String blueId() {
        return "HFLE8QVSxkYmjLKtwEnzRTkupVu8kcpZnikU9B8bnSH3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CashflowType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CashflowType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CashflowType.json";
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

    private ScheduledTransferEnum cashflowType;

    private CashPrice cashPrice;

    private PriceExpressionEnum priceExpression;

    public String getNamespace() {
        return namespace;
    }

    public CashflowType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ScheduledTransferEnum getCashflowType() {
        return cashflowType;
    }

    public CashflowType cashflowType(ScheduledTransferEnum cashflowType) {
        this.cashflowType = cashflowType;
        return this;
    }

    public CashPrice getCashPrice() {
        return cashPrice;
    }

    public CashflowType cashPrice(CashPrice cashPrice) {
        this.cashPrice = cashPrice;
        return this;
    }

    public PriceExpressionEnum getPriceExpression() {
        return priceExpression;
    }

    public CashflowType priceExpression(PriceExpressionEnum priceExpression) {
        this.priceExpression = priceExpression;
        return this;
    }

}
