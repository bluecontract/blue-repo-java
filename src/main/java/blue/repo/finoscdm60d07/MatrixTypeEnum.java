package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6xvftn8Dr4ahDbtjTt6YQ38c8SaRM269jXw4NcwaKViL")
public class MatrixTypeEnum {
    public static String blueId() {
        return "6xvftn8Dr4ahDbtjTt6YQ38c8SaRM269jXw4NcwaKViL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MatrixTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MatrixTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MatrixTypeEnum.json";
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

    public MatrixTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
