package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2TDGzDxjQNuhLL7RV5PCgqaxnUBouqduNUzezbcbcooc")
public class CreditEventTypeEnum {
    public static String blueId() {
        return "2TDGzDxjQNuhLL7RV5PCgqaxnUBouqduNUzezbcbcooc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditEventTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditEventTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditEventTypeEnum.json";
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

    public CreditEventTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
