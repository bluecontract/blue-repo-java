package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4PEMh5H4JmbBLGo2qSFrUZHLkTPfUs9vTyV1RSmuoLXc")
public class AveragingCalculation {
    public static String blueId() {
        return "4PEMh5H4JmbBLGo2qSFrUZHLkTPfUs9vTyV1RSmuoLXc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingCalculation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingCalculation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AveragingCalculation.json";
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

    private AveragingCalculationMethod averagingMethod;

    private Rounding precision;

    public String getNamespace() {
        return namespace;
    }

    public AveragingCalculation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingCalculationMethod getAveragingMethod() {
        return averagingMethod;
    }

    public AveragingCalculation averagingMethod(AveragingCalculationMethod averagingMethod) {
        this.averagingMethod = averagingMethod;
        return this;
    }

    public Rounding getPrecision() {
        return precision;
    }

    public AveragingCalculation precision(Rounding precision) {
        this.precision = precision;
        return this;
    }

}
