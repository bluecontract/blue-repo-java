package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F12rUmMj8QiL7x5J5AG6BE6nifzcxdbPCDFXtVcNJGWZ")
public class AveragingCalculationMethod {
    public static String blueId() {
        return "F12rUmMj8QiL7x5J5AG6BE6nifzcxdbPCDFXtVcNJGWZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingCalculationMethod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingCalculationMethod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AveragingCalculationMethod.json";
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

    private AveragingCalculationMethodEnum calculationMethod;

    private Boolean isWeighted;

    public String getNamespace() {
        return namespace;
    }

    public AveragingCalculationMethod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingCalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    public AveragingCalculationMethod calculationMethod(AveragingCalculationMethodEnum calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    public Boolean getIsWeighted() {
        return isWeighted;
    }

    public AveragingCalculationMethod isWeighted(Boolean isWeighted) {
        this.isWeighted = isWeighted;
        return this;
    }

}
