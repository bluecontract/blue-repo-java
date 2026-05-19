package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("63u3EFkPo9iuNN68v8X2E51gLoD6JgNdk6NhRcWMMQG8")
public class InflationCalculationMethodEnum {
    public static String blueId() {
        return "63u3EFkPo9iuNN68v8X2E51gLoD6JgNdk6NhRcWMMQG8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InflationCalculationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InflationCalculationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InflationCalculationMethodEnum.json";
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

    public InflationCalculationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
