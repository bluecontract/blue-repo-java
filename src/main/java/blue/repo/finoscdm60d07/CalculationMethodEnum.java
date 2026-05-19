package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F6zrf4BEXM9uC8huzSYoDyjeui85qhLouK5shmCrqPbq")
public class CalculationMethodEnum {
    public static String blueId() {
        return "F6zrf4BEXM9uC8huzSYoDyjeui85qhLouK5shmCrqPbq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculationMethodEnum.json";
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

    public CalculationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
