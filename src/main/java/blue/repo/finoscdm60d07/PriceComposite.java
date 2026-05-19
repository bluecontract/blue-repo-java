package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6PGnQf7JYSWF8rSyy3zbsQJ3ttWupxmXqgHRYqU8cJKB")
public class PriceComposite {
    public static String blueId() {
        return "6PGnQf7JYSWF8rSyy3zbsQJ3ttWupxmXqgHRYqU8cJKB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceComposite";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceComposite";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PriceComposite.json";
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

    private Double baseValue;

    private Double operand;

    private PriceOperandEnum operandType;

    public String getNamespace() {
        return namespace;
    }

    public PriceComposite namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ArithmeticOperationEnum getArithmeticOperator() {
        return arithmeticOperator;
    }

    public PriceComposite arithmeticOperator(ArithmeticOperationEnum arithmeticOperator) {
        this.arithmeticOperator = arithmeticOperator;
        return this;
    }

    public Double getBaseValue() {
        return baseValue;
    }

    public PriceComposite baseValue(Double baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    public Double getOperand() {
        return operand;
    }

    public PriceComposite operand(Double operand) {
        this.operand = operand;
        return this;
    }

    public PriceOperandEnum getOperandType() {
        return operandType;
    }

    public PriceComposite operandType(PriceOperandEnum operandType) {
        this.operandType = operandType;
        return this;
    }

}
