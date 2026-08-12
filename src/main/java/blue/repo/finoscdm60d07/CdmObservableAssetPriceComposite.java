package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6tfFx6LjQPd8i3zPXbCkuh3MhNp2C1Ns5HdLRXK7G6eE")
public class CdmObservableAssetPriceComposite {
    public static String blueId() {
        return "6tfFx6LjQPd8i3zPXbCkuh3MhNp2C1Ns5HdLRXK7G6eE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/PriceComposite";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/PriceComposite";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPriceComposite.json";
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

    private Double baseValue;

    private Double operand;

    private CdmObservableAssetPriceOperandEnum operandType;

    public CdmBaseMathArithmeticOperationEnum getArithmeticOperator() {
        return arithmeticOperator;
    }

    public CdmObservableAssetPriceComposite arithmeticOperator(CdmBaseMathArithmeticOperationEnum arithmeticOperator) {
        this.arithmeticOperator = arithmeticOperator;
        return this;
    }

    public Double getBaseValue() {
        return baseValue;
    }

    public CdmObservableAssetPriceComposite baseValue(Double baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    public Double getOperand() {
        return operand;
    }

    public CdmObservableAssetPriceComposite operand(Double operand) {
        this.operand = operand;
        return this;
    }

    public CdmObservableAssetPriceOperandEnum getOperandType() {
        return operandType;
    }

    public CdmObservableAssetPriceComposite operandType(CdmObservableAssetPriceOperandEnum operandType) {
        this.operandType = operandType;
        return this;
    }

}
