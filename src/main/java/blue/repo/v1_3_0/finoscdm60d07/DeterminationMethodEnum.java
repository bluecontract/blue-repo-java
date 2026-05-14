package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("A4xQ1M4K4Bxgfj42oJzfRc6Jc8n5qjBuZW3DA5zJEgMy")
public class DeterminationMethodEnum {
    public static String blueId() {
        return "A4xQ1M4K4Bxgfj42oJzfRc6Jc8n5qjBuZW3DA5zJEgMy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeterminationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeterminationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DeterminationMethodEnum.json";
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

    public DeterminationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
