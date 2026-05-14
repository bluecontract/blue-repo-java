package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J8PmhmiA5SaQFNHijHZEeyZkVE8fDk9mxoJvh9JyycuX")
public class SpreadCalculationMethodEnum {
    public static String blueId() {
        return "J8PmhmiA5SaQFNHijHZEeyZkVE8fDk9mxoJvh9JyycuX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SpreadCalculationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SpreadCalculationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SpreadCalculationMethodEnum.json";
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

    public SpreadCalculationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
