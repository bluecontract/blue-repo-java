package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("A7edPZ2CbK443w3XiyQMPaQHm4DeV51KTTWvbZVvuMEL")
public class RegIMRoleEnum {
    public static String blueId() {
        return "A7edPZ2CbK443w3XiyQMPaQHm4DeV51KTTWvbZVvuMEL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RegIMRoleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RegIMRoleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RegIMRoleEnum.json";
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

    public RegIMRoleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
