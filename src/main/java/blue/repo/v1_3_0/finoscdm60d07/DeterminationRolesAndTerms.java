package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GWNehnjfrVUrkHfuoK4Bfe4MQ8Sn3WmcJhoZsPhviVen")
public class DeterminationRolesAndTerms {
    public static String blueId() {
        return "GWNehnjfrVUrkHfuoK4Bfe4MQ8Sn3WmcJhoZsPhviVen";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeterminationRolesAndTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeterminationRolesAndTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DeterminationRolesAndTerms.json";
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

    public DeterminationRolesAndTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
