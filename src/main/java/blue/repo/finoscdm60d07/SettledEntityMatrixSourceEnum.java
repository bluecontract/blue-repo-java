package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7UMfuLG69euwMQKQHaQmjMZGn4pwckpKStEtDkmgb8tz")
public class SettledEntityMatrixSourceEnum {
    public static String blueId() {
        return "7UMfuLG69euwMQKQHaQmjMZGn4pwckpKStEtDkmgb8tz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettledEntityMatrixSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettledEntityMatrixSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SettledEntityMatrixSourceEnum.json";
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

    public SettledEntityMatrixSourceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
