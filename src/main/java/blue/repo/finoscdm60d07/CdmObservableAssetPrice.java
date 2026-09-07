package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Eq9qZQHxqGHrhdWMG4ATnQxDGtQB2E3EkW56WnwBvYkg")
public class CdmObservableAssetPrice {
    public static String blueId() {
        return "Eq9qZQHxqGHrhdWMG4ATnQxDGtQB2E3EkW56WnwBvYkg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/Price";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/Price";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPrice.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathArithmeticOperationEnum arithmeticOperator;

    private CdmObservableAssetCashPrice cashPrice;

    private CdmObservableAssetPriceComposite composite;

    private List<CdmBaseMathDatedValue> datedValue;

    private CdmBaseMathUnitType perUnitOf;

    private CdmObservableAssetPriceExpressionEnum priceExpression;

    private CdmObservableAssetPriceTypeEnum priceType;

    private CdmBaseMathUnitType unit;

    private Double val;

    public CdmBaseMathArithmeticOperationEnum getArithmeticOperator() {
        return arithmeticOperator;
    }

    public CdmObservableAssetPrice arithmeticOperator(CdmBaseMathArithmeticOperationEnum arithmeticOperator) {
        this.arithmeticOperator = arithmeticOperator;
        return this;
    }

    public CdmObservableAssetCashPrice getCashPrice() {
        return cashPrice;
    }

    public CdmObservableAssetPrice cashPrice(CdmObservableAssetCashPrice cashPrice) {
        this.cashPrice = cashPrice;
        return this;
    }

    public CdmObservableAssetPriceComposite getComposite() {
        return composite;
    }

    public CdmObservableAssetPrice composite(CdmObservableAssetPriceComposite composite) {
        this.composite = composite;
        return this;
    }

    public List<CdmBaseMathDatedValue> getDatedValue() {
        return datedValue;
    }

    public CdmObservableAssetPrice datedValue(List<CdmBaseMathDatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public CdmBaseMathUnitType getPerUnitOf() {
        return perUnitOf;
    }

    public CdmObservableAssetPrice perUnitOf(CdmBaseMathUnitType perUnitOf) {
        this.perUnitOf = perUnitOf;
        return this;
    }

    public CdmObservableAssetPriceExpressionEnum getPriceExpression() {
        return priceExpression;
    }

    public CdmObservableAssetPrice priceExpression(CdmObservableAssetPriceExpressionEnum priceExpression) {
        this.priceExpression = priceExpression;
        return this;
    }

    public CdmObservableAssetPriceTypeEnum getPriceType() {
        return priceType;
    }

    public CdmObservableAssetPrice priceType(CdmObservableAssetPriceTypeEnum priceType) {
        this.priceType = priceType;
        return this;
    }

    public CdmBaseMathUnitType getUnit() {
        return unit;
    }

    public CdmObservableAssetPrice unit(CdmBaseMathUnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmObservableAssetPrice val(Double val) {
        this.val = val;
        return this;
    }

}
