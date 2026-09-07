package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5vnUKbx9yA4ncUHq8nAQrZBykchbz5wv4PpZ824B1or7")
public class CdmObservableAssetValuationMethod {
    public static String blueId() {
        return "5vnUKbx9yA4ncUHq8nAQrZBykchbz5wv4PpZ824B1or7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/ValuationMethod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/ValuationMethod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetValuationMethod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCashCollateralValuationMethod cashCollateralValuationMethod;

    private CdmObservableAssetMoney minimumQuotationAmount;

    private CdmObservableAssetMoney quotationAmount;

    private CdmObservableAssetQuotationRateTypeEnum quotationMethod;

    private CdmObservableAssetValuationMethodEnum valuationMethod;

    private CdmObservableAssetValuationSource valuationSource;

    public CdmObservableAssetCashCollateralValuationMethod getCashCollateralValuationMethod() {
        return cashCollateralValuationMethod;
    }

    public CdmObservableAssetValuationMethod cashCollateralValuationMethod(CdmObservableAssetCashCollateralValuationMethod cashCollateralValuationMethod) {
        this.cashCollateralValuationMethod = cashCollateralValuationMethod;
        return this;
    }

    public CdmObservableAssetMoney getMinimumQuotationAmount() {
        return minimumQuotationAmount;
    }

    public CdmObservableAssetValuationMethod minimumQuotationAmount(CdmObservableAssetMoney minimumQuotationAmount) {
        this.minimumQuotationAmount = minimumQuotationAmount;
        return this;
    }

    public CdmObservableAssetMoney getQuotationAmount() {
        return quotationAmount;
    }

    public CdmObservableAssetValuationMethod quotationAmount(CdmObservableAssetMoney quotationAmount) {
        this.quotationAmount = quotationAmount;
        return this;
    }

    public CdmObservableAssetQuotationRateTypeEnum getQuotationMethod() {
        return quotationMethod;
    }

    public CdmObservableAssetValuationMethod quotationMethod(CdmObservableAssetQuotationRateTypeEnum quotationMethod) {
        this.quotationMethod = quotationMethod;
        return this;
    }

    public CdmObservableAssetValuationMethodEnum getValuationMethod() {
        return valuationMethod;
    }

    public CdmObservableAssetValuationMethod valuationMethod(CdmObservableAssetValuationMethodEnum valuationMethod) {
        this.valuationMethod = valuationMethod;
        return this;
    }

    public CdmObservableAssetValuationSource getValuationSource() {
        return valuationSource;
    }

    public CdmObservableAssetValuationMethod valuationSource(CdmObservableAssetValuationSource valuationSource) {
        this.valuationSource = valuationSource;
        return this;
    }

}
