package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H1ad3ns9v2K28iSodEvzNRnfkQj5L2k85k5nRaUYh69R")
public class ValuationMethod {
    public static String blueId() {
        return "H1ad3ns9v2K28iSodEvzNRnfkQj5L2k85k5nRaUYh69R";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationMethod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationMethod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ValuationMethod.json";
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

    private CashCollateralValuationMethod cashCollateralValuationMethod;

    private Money minimumQuotationAmount;

    private Money quotationAmount;

    private QuotationRateTypeEnum quotationMethod;

    private ValuationMethodEnum valuationMethod;

    private ValuationSource valuationSource;

    public String getNamespace() {
        return namespace;
    }

    public ValuationMethod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CashCollateralValuationMethod getCashCollateralValuationMethod() {
        return cashCollateralValuationMethod;
    }

    public ValuationMethod cashCollateralValuationMethod(CashCollateralValuationMethod cashCollateralValuationMethod) {
        this.cashCollateralValuationMethod = cashCollateralValuationMethod;
        return this;
    }

    public Money getMinimumQuotationAmount() {
        return minimumQuotationAmount;
    }

    public ValuationMethod minimumQuotationAmount(Money minimumQuotationAmount) {
        this.minimumQuotationAmount = minimumQuotationAmount;
        return this;
    }

    public Money getQuotationAmount() {
        return quotationAmount;
    }

    public ValuationMethod quotationAmount(Money quotationAmount) {
        this.quotationAmount = quotationAmount;
        return this;
    }

    public QuotationRateTypeEnum getQuotationMethod() {
        return quotationMethod;
    }

    public ValuationMethod quotationMethod(QuotationRateTypeEnum quotationMethod) {
        this.quotationMethod = quotationMethod;
        return this;
    }

    public ValuationMethodEnum getValuationMethod() {
        return valuationMethod;
    }

    public ValuationMethod valuationMethod(ValuationMethodEnum valuationMethod) {
        this.valuationMethod = valuationMethod;
        return this;
    }

    public ValuationSource getValuationSource() {
        return valuationSource;
    }

    public ValuationMethod valuationSource(ValuationSource valuationSource) {
        this.valuationSource = valuationSource;
        return this;
    }

}
