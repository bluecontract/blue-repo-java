package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CfUQRSe9veZNknxwEsdbf7dbrpKSzCCaMB7S5bWZXaku")
public class NonNegativeStep {
    public static String blueId() {
        return "CfUQRSe9veZNknxwEsdbf7dbrpKSzCCaMB7S5bWZXaku";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NonNegativeStep";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NonNegativeStep";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/NonNegativeStep.json";
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

    private String stepDate;

    private Double stepValue;

    public String getNamespace() {
        return namespace;
    }

    public NonNegativeStep namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getStepDate() {
        return stepDate;
    }

    public NonNegativeStep stepDate(String stepDate) {
        this.stepDate = stepDate;
        return this;
    }

    public Double getStepValue() {
        return stepValue;
    }

    public NonNegativeStep stepValue(Double stepValue) {
        this.stepValue = stepValue;
        return this;
    }

}
