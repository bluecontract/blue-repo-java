package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("B2XmXNCEtTHXWN7xgiz1md3C7RtvMbEbsQkbHzupGdmo")
public class PriceSchedule {
    public static String blueId() {
        return "B2XmXNCEtTHXWN7xgiz1md3C7RtvMbEbsQkbHzupGdmo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PriceSchedule.json";
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

    private ArithmeticOperationEnum arithmeticOperator;

    private CashPrice cashPrice;

    private PriceComposite composite;

    private List<DatedValue> datedValue;

    private UnitType perUnitOf;

    private PriceExpressionEnum priceExpression;

    private PriceTypeEnum priceType;

    private UnitType unit;

    private Double val;

    public String getNamespace() {
        return namespace;
    }

    public PriceSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ArithmeticOperationEnum getArithmeticOperator() {
        return arithmeticOperator;
    }

    public PriceSchedule arithmeticOperator(ArithmeticOperationEnum arithmeticOperator) {
        this.arithmeticOperator = arithmeticOperator;
        return this;
    }

    public CashPrice getCashPrice() {
        return cashPrice;
    }

    public PriceSchedule cashPrice(CashPrice cashPrice) {
        this.cashPrice = cashPrice;
        return this;
    }

    public PriceComposite getComposite() {
        return composite;
    }

    public PriceSchedule composite(PriceComposite composite) {
        this.composite = composite;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public PriceSchedule datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public UnitType getPerUnitOf() {
        return perUnitOf;
    }

    public PriceSchedule perUnitOf(UnitType perUnitOf) {
        this.perUnitOf = perUnitOf;
        return this;
    }

    public PriceExpressionEnum getPriceExpression() {
        return priceExpression;
    }

    public PriceSchedule priceExpression(PriceExpressionEnum priceExpression) {
        this.priceExpression = priceExpression;
        return this;
    }

    public PriceTypeEnum getPriceType() {
        return priceType;
    }

    public PriceSchedule priceType(PriceTypeEnum priceType) {
        this.priceType = priceType;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public PriceSchedule unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public PriceSchedule val(Double val) {
        this.val = val;
        return this;
    }

}
