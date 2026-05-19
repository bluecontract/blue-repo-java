package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Br596jsZmfvtR5BdQv1bE5NgFBbCK9NduSFiK4oAJ2ch")
public class ReturnAmount {
    public static String blueId() {
        return "Br596jsZmfvtR5BdQv1bE5NgFBbCK9NduSFiK4oAJ2ch";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReturnAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReturnAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReturnAmount.json";
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

    private String customElection;

    private Boolean includesDefaultLanguage;

    public String getNamespace() {
        return namespace;
    }

    public ReturnAmount namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getCustomElection() {
        return customElection;
    }

    public ReturnAmount customElection(String customElection) {
        this.customElection = customElection;
        return this;
    }

    public Boolean getIncludesDefaultLanguage() {
        return includesDefaultLanguage;
    }

    public ReturnAmount includesDefaultLanguage(Boolean includesDefaultLanguage) {
        this.includesDefaultLanguage = includesDefaultLanguage;
        return this;
    }

}
