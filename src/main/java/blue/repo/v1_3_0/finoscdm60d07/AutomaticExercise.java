package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AjiuYsTcA3sffRaXTMvvFsLSnZJ8RXaQoSwNwpqt1PsZ")
public class AutomaticExercise {
    public static String blueId() {
        return "AjiuYsTcA3sffRaXTMvvFsLSnZJ8RXaQoSwNwpqt1PsZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AutomaticExercise";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AutomaticExercise";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AutomaticExercise.json";
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

    private Boolean isApplicable;

    private Double thresholdRate;

    public String getNamespace() {
        return namespace;
    }

    public AutomaticExercise namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getIsApplicable() {
        return isApplicable;
    }

    public AutomaticExercise isApplicable(Boolean isApplicable) {
        this.isApplicable = isApplicable;
        return this;
    }

    public Double getThresholdRate() {
        return thresholdRate;
    }

    public AutomaticExercise thresholdRate(Double thresholdRate) {
        this.thresholdRate = thresholdRate;
        return this;
    }

}
