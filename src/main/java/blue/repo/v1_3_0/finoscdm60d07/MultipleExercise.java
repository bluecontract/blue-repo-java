package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("3us1PnSruZTqumrMXWv8jiPrVnHQrgQjSVmB4jT8DVyv")
public class MultipleExercise {
    public static String blueId() {
        return "3us1PnSruZTqumrMXWv8jiPrVnHQrgQjSVmB4jT8DVyv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MultipleExercise";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MultipleExercise";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MultipleExercise.json";
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

    private Double integralMultipleAmount;

    private Double maximumNotionalAmount;

    private BigInteger maximumNumberOfOptions;

    private Double minimumNotionalAmount;

    private BigInteger minimumNumberOfOptions;

    private ReferenceWithMetaMoney notionaReference;

    public String getNamespace() {
        return namespace;
    }

    public MultipleExercise namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getIntegralMultipleAmount() {
        return integralMultipleAmount;
    }

    public MultipleExercise integralMultipleAmount(Double integralMultipleAmount) {
        this.integralMultipleAmount = integralMultipleAmount;
        return this;
    }

    public Double getMaximumNotionalAmount() {
        return maximumNotionalAmount;
    }

    public MultipleExercise maximumNotionalAmount(Double maximumNotionalAmount) {
        this.maximumNotionalAmount = maximumNotionalAmount;
        return this;
    }

    public BigInteger getMaximumNumberOfOptions() {
        return maximumNumberOfOptions;
    }

    public MultipleExercise maximumNumberOfOptions(BigInteger maximumNumberOfOptions) {
        this.maximumNumberOfOptions = maximumNumberOfOptions;
        return this;
    }

    public Double getMinimumNotionalAmount() {
        return minimumNotionalAmount;
    }

    public MultipleExercise minimumNotionalAmount(Double minimumNotionalAmount) {
        this.minimumNotionalAmount = minimumNotionalAmount;
        return this;
    }

    public BigInteger getMinimumNumberOfOptions() {
        return minimumNumberOfOptions;
    }

    public MultipleExercise minimumNumberOfOptions(BigInteger minimumNumberOfOptions) {
        this.minimumNumberOfOptions = minimumNumberOfOptions;
        return this;
    }

    public ReferenceWithMetaMoney getNotionaReference() {
        return notionaReference;
    }

    public MultipleExercise notionaReference(ReferenceWithMetaMoney notionaReference) {
        this.notionaReference = notionaReference;
        return this;
    }

}
