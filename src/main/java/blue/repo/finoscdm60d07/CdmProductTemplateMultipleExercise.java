package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("8eLP8HxgpSvj1vyxDJXMhDpMcQU696aKo5Uvz1mt9Q1S")
public class CdmProductTemplateMultipleExercise {
    public static String blueId() {
        return "8eLP8HxgpSvj1vyxDJXMhDpMcQU696aKo5Uvz1mt9Q1S";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/MultipleExercise";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/MultipleExercise";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateMultipleExercise.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double integralMultipleAmount;

    private Double maximumNotionalAmount;

    private BigInteger maximumNumberOfOptions;

    private Double minimumNotionalAmount;

    private BigInteger minimumNumberOfOptions;

    private CdmObservableAssetMetafieldsReferenceWithMetaMoney notionaReference;

    public Double getIntegralMultipleAmount() {
        return integralMultipleAmount;
    }

    public CdmProductTemplateMultipleExercise integralMultipleAmount(Double integralMultipleAmount) {
        this.integralMultipleAmount = integralMultipleAmount;
        return this;
    }

    public Double getMaximumNotionalAmount() {
        return maximumNotionalAmount;
    }

    public CdmProductTemplateMultipleExercise maximumNotionalAmount(Double maximumNotionalAmount) {
        this.maximumNotionalAmount = maximumNotionalAmount;
        return this;
    }

    public BigInteger getMaximumNumberOfOptions() {
        return maximumNumberOfOptions;
    }

    public CdmProductTemplateMultipleExercise maximumNumberOfOptions(BigInteger maximumNumberOfOptions) {
        this.maximumNumberOfOptions = maximumNumberOfOptions;
        return this;
    }

    public Double getMinimumNotionalAmount() {
        return minimumNotionalAmount;
    }

    public CdmProductTemplateMultipleExercise minimumNotionalAmount(Double minimumNotionalAmount) {
        this.minimumNotionalAmount = minimumNotionalAmount;
        return this;
    }

    public BigInteger getMinimumNumberOfOptions() {
        return minimumNumberOfOptions;
    }

    public CdmProductTemplateMultipleExercise minimumNumberOfOptions(BigInteger minimumNumberOfOptions) {
        this.minimumNumberOfOptions = minimumNumberOfOptions;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaMoney getNotionaReference() {
        return notionaReference;
    }

    public CdmProductTemplateMultipleExercise notionaReference(CdmObservableAssetMetafieldsReferenceWithMetaMoney notionaReference) {
        this.notionaReference = notionaReference;
        return this;
    }

}
