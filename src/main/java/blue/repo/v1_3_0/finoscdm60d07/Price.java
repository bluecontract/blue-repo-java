package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("34JSSaiNLZkZGJCPhZGY4wsFrAd7HeP7M2MEwHXHZp2u")
public class Price {
    public static String blueId() {
        return "34JSSaiNLZkZGJCPhZGY4wsFrAd7HeP7M2MEwHXHZp2u";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Price";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Price";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Price.json";
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

    public Price namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ArithmeticOperationEnum getArithmeticOperator() {
        return arithmeticOperator;
    }

    public Price arithmeticOperator(ArithmeticOperationEnum arithmeticOperator) {
        this.arithmeticOperator = arithmeticOperator;
        return this;
    }

    public CashPrice getCashPrice() {
        return cashPrice;
    }

    public Price cashPrice(CashPrice cashPrice) {
        this.cashPrice = cashPrice;
        return this;
    }

    public PriceComposite getComposite() {
        return composite;
    }

    public Price composite(PriceComposite composite) {
        this.composite = composite;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public Price datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public UnitType getPerUnitOf() {
        return perUnitOf;
    }

    public Price perUnitOf(UnitType perUnitOf) {
        this.perUnitOf = perUnitOf;
        return this;
    }

    public PriceExpressionEnum getPriceExpression() {
        return priceExpression;
    }

    public Price priceExpression(PriceExpressionEnum priceExpression) {
        this.priceExpression = priceExpression;
        return this;
    }

    public PriceTypeEnum getPriceType() {
        return priceType;
    }

    public Price priceType(PriceTypeEnum priceType) {
        this.priceType = priceType;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public Price unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public Price val(Double val) {
        this.val = val;
        return this;
    }

}
