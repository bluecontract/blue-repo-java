package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7Z61AwQWqnZ2u2YuQKpKBFLLSJsHm2aP1F3eogUYEy8D")
public class FloatingRateIndexCalculationDefaults {
    public static String blueId() {
        return "7Z61AwQWqnZ2u2YuQKpKBFLLSJsHm2aP1F3eogUYEy8D";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndexCalculationDefaults";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndexCalculationDefaults";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateIndexCalculationDefaults.json";
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

    private FloatingRateIndexCategoryEnum category;

    private FloatingRateIndexStyleEnum indexStyle;

    private FloatingRateIndexCalculationMethodEnum method;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateIndexCalculationDefaults namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FloatingRateIndexCategoryEnum getCategory() {
        return category;
    }

    public FloatingRateIndexCalculationDefaults category(FloatingRateIndexCategoryEnum category) {
        this.category = category;
        return this;
    }

    public FloatingRateIndexStyleEnum getIndexStyle() {
        return indexStyle;
    }

    public FloatingRateIndexCalculationDefaults indexStyle(FloatingRateIndexStyleEnum indexStyle) {
        this.indexStyle = indexStyle;
        return this;
    }

    public FloatingRateIndexCalculationMethodEnum getMethod() {
        return method;
    }

    public FloatingRateIndexCalculationDefaults method(FloatingRateIndexCalculationMethodEnum method) {
        this.method = method;
        return this;
    }

}
