package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("4vdj6UFaQJsvfqnznBsJ2h4Z6niUa9pXKAY8W62wz5mz")
public class CdmProductTemplatePartialExercise {
    public static String blueId() {
        return "4vdj6UFaQJsvfqnznBsJ2h4Z6niUa9pXKAY8W62wz5mz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/PartialExercise";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/PartialExercise";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplatePartialExercise.json";
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

    private Double minimumNotionalAmount;

    private BigInteger minimumNumberOfOptions;

    private CdmObservableAssetMetafieldsReferenceWithMetaMoney notionaReference;

    public Double getIntegralMultipleAmount() {
        return integralMultipleAmount;
    }

    public CdmProductTemplatePartialExercise integralMultipleAmount(Double integralMultipleAmount) {
        this.integralMultipleAmount = integralMultipleAmount;
        return this;
    }

    public Double getMinimumNotionalAmount() {
        return minimumNotionalAmount;
    }

    public CdmProductTemplatePartialExercise minimumNotionalAmount(Double minimumNotionalAmount) {
        this.minimumNotionalAmount = minimumNotionalAmount;
        return this;
    }

    public BigInteger getMinimumNumberOfOptions() {
        return minimumNumberOfOptions;
    }

    public CdmProductTemplatePartialExercise minimumNumberOfOptions(BigInteger minimumNumberOfOptions) {
        this.minimumNumberOfOptions = minimumNumberOfOptions;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaMoney getNotionaReference() {
        return notionaReference;
    }

    public CdmProductTemplatePartialExercise notionaReference(CdmObservableAssetMetafieldsReferenceWithMetaMoney notionaReference) {
        this.notionaReference = notionaReference;
        return this;
    }

}
