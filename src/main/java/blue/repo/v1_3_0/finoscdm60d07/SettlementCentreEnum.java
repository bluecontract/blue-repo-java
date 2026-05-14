package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F2kWsFH3YS6aJ8w3kXkTuggJC7TzD7DYUawMeWqh1e2n")
public class SettlementCentreEnum {
    public static String blueId() {
        return "F2kWsFH3YS6aJ8w3kXkTuggJC7TzD7DYUawMeWqh1e2n";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementCentreEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementCentreEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SettlementCentreEnum.json";
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

    public SettlementCentreEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
