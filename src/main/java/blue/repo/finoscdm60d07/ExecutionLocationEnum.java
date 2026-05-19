package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9BaaESjLtVcDW6wUGeAcTAqJb5oXcUHBMVNntzytHyws")
public class ExecutionLocationEnum {
    public static String blueId() {
        return "9BaaESjLtVcDW6wUGeAcTAqJb5oXcUHBMVNntzytHyws";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExecutionLocationEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExecutionLocationEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExecutionLocationEnum.json";
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

    public ExecutionLocationEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
