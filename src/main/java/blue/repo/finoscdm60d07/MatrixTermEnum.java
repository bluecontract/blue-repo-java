package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9zzbCupj2CEmZ6PcPuVfCC77NcZsn9ikC1vS1QDwCFZJ")
public class MatrixTermEnum {
    public static String blueId() {
        return "9zzbCupj2CEmZ6PcPuVfCC77NcZsn9ikC1vS1QDwCFZJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MatrixTermEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MatrixTermEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MatrixTermEnum.json";
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

    public MatrixTermEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
