package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DQbEw8cTYbCHrodQHmYYcANtL7cp83mxaEfahU347NQc")
public class InflationRateIndexEnum {
    public static String blueId() {
        return "DQbEw8cTYbCHrodQHmYYcANtL7cp83mxaEfahU347NQc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InflationRateIndexEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InflationRateIndexEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InflationRateIndexEnum.json";
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

    public InflationRateIndexEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
