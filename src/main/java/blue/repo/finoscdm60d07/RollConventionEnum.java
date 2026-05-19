package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4pQ8yTZ44vt4K44drtF27dvBAbUsvD2Kq8mUEpR3fsNC")
public class RollConventionEnum {
    public static String blueId() {
        return "4pQ8yTZ44vt4K44drtF27dvBAbUsvD2Kq8mUEpR3fsNC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RollConventionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RollConventionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/RollConventionEnum.json";
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

    public RollConventionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
