package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GN7bQLTQRpUAHry4avjsYGsGeL8qzKLEe2BNu2CBXdaH")
public class CdmProductTemplateDividendTerms {
    public static String blueId() {
        return "GN7bQLTQRpUAHry4avjsYGsGeL8qzKLEe2BNu2CBXdaH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/DividendTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/DividendTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateDividendTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetDividendEntitlementEnum dividendEntitlement;

    private CdmProductAssetDividendPayoutRatio manufacturedIncomeRequirement;

    private CdmObservableAssetMoney minimumBillingAmount;

    public CdmProductAssetDividendEntitlementEnum getDividendEntitlement() {
        return dividendEntitlement;
    }

    public CdmProductTemplateDividendTerms dividendEntitlement(CdmProductAssetDividendEntitlementEnum dividendEntitlement) {
        this.dividendEntitlement = dividendEntitlement;
        return this;
    }

    public CdmProductAssetDividendPayoutRatio getManufacturedIncomeRequirement() {
        return manufacturedIncomeRequirement;
    }

    public CdmProductTemplateDividendTerms manufacturedIncomeRequirement(CdmProductAssetDividendPayoutRatio manufacturedIncomeRequirement) {
        this.manufacturedIncomeRequirement = manufacturedIncomeRequirement;
        return this;
    }

    public CdmObservableAssetMoney getMinimumBillingAmount() {
        return minimumBillingAmount;
    }

    public CdmProductTemplateDividendTerms minimumBillingAmount(CdmObservableAssetMoney minimumBillingAmount) {
        this.minimumBillingAmount = minimumBillingAmount;
        return this;
    }

}
