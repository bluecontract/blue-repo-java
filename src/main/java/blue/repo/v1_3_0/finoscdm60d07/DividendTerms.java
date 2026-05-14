package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F4L3c4xdhDLAzHfEqRP9tF1Vuh57RByfmKBk3o7cJbNd")
public class DividendTerms {
    public static String blueId() {
        return "F4L3c4xdhDLAzHfEqRP9tF1Vuh57RByfmKBk3o7cJbNd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DividendTerms.json";
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

    private DividendEntitlementEnum dividendEntitlement;

    private DividendPayoutRatio manufacturedIncomeRequirement;

    private Money minimumBillingAmount;

    public String getNamespace() {
        return namespace;
    }

    public DividendTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DividendEntitlementEnum getDividendEntitlement() {
        return dividendEntitlement;
    }

    public DividendTerms dividendEntitlement(DividendEntitlementEnum dividendEntitlement) {
        this.dividendEntitlement = dividendEntitlement;
        return this;
    }

    public DividendPayoutRatio getManufacturedIncomeRequirement() {
        return manufacturedIncomeRequirement;
    }

    public DividendTerms manufacturedIncomeRequirement(DividendPayoutRatio manufacturedIncomeRequirement) {
        this.manufacturedIncomeRequirement = manufacturedIncomeRequirement;
        return this;
    }

    public Money getMinimumBillingAmount() {
        return minimumBillingAmount;
    }

    public DividendTerms minimumBillingAmount(Money minimumBillingAmount) {
        this.minimumBillingAmount = minimumBillingAmount;
        return this;
    }

}
