package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G2MUt4k46UAcUHr4dboya7PgANq2eYHPbGi4CL3LYoL9")
public class InflationCalculationStyleEnum {
    public static String blueId() {
        return "G2MUt4k46UAcUHr4dboya7PgANq2eYHPbGi4CL3LYoL9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InflationCalculationStyleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InflationCalculationStyleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InflationCalculationStyleEnum.json";
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

    public InflationCalculationStyleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
