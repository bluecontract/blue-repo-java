package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Gu2s7TriyRGK7DyQz5P5jeE6mWkQBC6ZJYhvceLwhYq6")
public class CdmObservableAssetPriceSchedule {
    public static String blueId() {
        return "Gu2s7TriyRGK7DyQz5P5jeE6mWkQBC6ZJYhvceLwhYq6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/PriceSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/PriceSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPriceSchedule.json";
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

    public CdmObservableAssetPriceSchedule arithmeticOperator(CdmBaseMathArithmeticOperationEnum arithmeticOperator) {
        this.arithmeticOperator = arithmeticOperator;
        return this;
    }

    public CdmObservableAssetCashPrice getCashPrice() {
        return cashPrice;
    }

    public CdmObservableAssetPriceSchedule cashPrice(CdmObservableAssetCashPrice cashPrice) {
        this.cashPrice = cashPrice;
        return this;
    }

    public CdmObservableAssetPriceComposite getComposite() {
        return composite;
    }

    public CdmObservableAssetPriceSchedule composite(CdmObservableAssetPriceComposite composite) {
        this.composite = composite;
        return this;
    }

    public List<CdmBaseMathDatedValue> getDatedValue() {
        return datedValue;
    }

    public CdmObservableAssetPriceSchedule datedValue(List<CdmBaseMathDatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public CdmBaseMathUnitType getPerUnitOf() {
        return perUnitOf;
    }

    public CdmObservableAssetPriceSchedule perUnitOf(CdmBaseMathUnitType perUnitOf) {
        this.perUnitOf = perUnitOf;
        return this;
    }

    public CdmObservableAssetPriceExpressionEnum getPriceExpression() {
        return priceExpression;
    }

    public CdmObservableAssetPriceSchedule priceExpression(CdmObservableAssetPriceExpressionEnum priceExpression) {
        this.priceExpression = priceExpression;
        return this;
    }

    public CdmObservableAssetPriceTypeEnum getPriceType() {
        return priceType;
    }

    public CdmObservableAssetPriceSchedule priceType(CdmObservableAssetPriceTypeEnum priceType) {
        this.priceType = priceType;
        return this;
    }

    public CdmBaseMathUnitType getUnit() {
        return unit;
    }

    public CdmObservableAssetPriceSchedule unit(CdmBaseMathUnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmObservableAssetPriceSchedule val(Double val) {
        this.val = val;
        return this;
    }

}
