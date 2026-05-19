package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BFbdcWmFpVvDuQueFKpinoesXVRnRPkFLUCxzjzjdRH4")
public class DeterminationMethodology {
    public static String blueId() {
        return "BFbdcWmFpVvDuQueFKpinoesXVRnRPkFLUCxzjzjdRH4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeterminationMethodology";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeterminationMethodology";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DeterminationMethodology.json";
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

    private AveragingCalculationMethodEnum averagingMethod;

    private DeterminationMethodEnum determinationMethod;

    public String getNamespace() {
        return namespace;
    }

    public DeterminationMethodology namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingCalculationMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    public DeterminationMethodology averagingMethod(AveragingCalculationMethodEnum averagingMethod) {
        this.averagingMethod = averagingMethod;
        return this;
    }

    public DeterminationMethodEnum getDeterminationMethod() {
        return determinationMethod;
    }

    public DeterminationMethodology determinationMethod(DeterminationMethodEnum determinationMethod) {
        this.determinationMethod = determinationMethod;
        return this;
    }

}
