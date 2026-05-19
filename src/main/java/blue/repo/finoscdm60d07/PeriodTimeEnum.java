package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ADwrEfXfooJEb8C6T7boEZDWG8yXLrbUKNFtJxgTk4Ji")
public class PeriodTimeEnum {
    public static String blueId() {
        return "ADwrEfXfooJEb8C6T7boEZDWG8yXLrbUKNFtJxgTk4Ji";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PeriodTimeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PeriodTimeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PeriodTimeEnum.json";
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

    public PeriodTimeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
