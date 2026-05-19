package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2eTZuDwz7cznsb7CoYUTqEWJuhMxb7yDRqHGFihawKQp")
public class FloatingRateIndexEnum {
    public static String blueId() {
        return "2eTZuDwz7cznsb7CoYUTqEWJuhMxb7yDRqHGFihawKQp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndexEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndexEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingRateIndexEnum.json";
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

    public FloatingRateIndexEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
