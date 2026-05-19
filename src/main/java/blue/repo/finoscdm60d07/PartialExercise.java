package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("GdqMvCfwj2pgsYpKqGVQuboNGHQh5XrQ4XQqDwpxfZzQ")
public class PartialExercise {
    public static String blueId() {
        return "GdqMvCfwj2pgsYpKqGVQuboNGHQh5XrQ4XQqDwpxfZzQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartialExercise";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartialExercise";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PartialExercise.json";
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

    private Double minimumNotionalAmount;

    private BigInteger minimumNumberOfOptions;

    private ReferenceWithMetaMoney notionaReference;

    public String getNamespace() {
        return namespace;
    }

    public PartialExercise namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getIntegralMultipleAmount() {
        return integralMultipleAmount;
    }

    public PartialExercise integralMultipleAmount(Double integralMultipleAmount) {
        this.integralMultipleAmount = integralMultipleAmount;
        return this;
    }

    public Double getMinimumNotionalAmount() {
        return minimumNotionalAmount;
    }

    public PartialExercise minimumNotionalAmount(Double minimumNotionalAmount) {
        this.minimumNotionalAmount = minimumNotionalAmount;
        return this;
    }

    public BigInteger getMinimumNumberOfOptions() {
        return minimumNumberOfOptions;
    }

    public PartialExercise minimumNumberOfOptions(BigInteger minimumNumberOfOptions) {
        this.minimumNumberOfOptions = minimumNumberOfOptions;
        return this;
    }

    public ReferenceWithMetaMoney getNotionaReference() {
        return notionaReference;
    }

    public PartialExercise notionaReference(ReferenceWithMetaMoney notionaReference) {
        this.notionaReference = notionaReference;
        return this;
    }

}
