package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("m6gmVUqGfk94F6jKFtKKZdyuwydsLJWWzXSLeVFTeGa")
public class FloatingRateIndexCalculationMethodEnum {
    public static String blueId() {
        return "m6gmVUqGfk94F6jKFtKKZdyuwydsLJWWzXSLeVFTeGa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndexCalculationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndexCalculationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingRateIndexCalculationMethodEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateIndexCalculationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
