package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DSzjfsPGzFzyEqP4bgZKbbjvBDK8PACW6ZJU4WaVTtN9")
public class MaturityTypeEnum {
    public static String blueId() {
        return "DSzjfsPGzFzyEqP4bgZKbbjvBDK8PACW6ZJU4WaVTtN9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MaturityTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MaturityTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MaturityTypeEnum.json";
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

    public MaturityTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
