package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AgSLkN7jqeKNvQP9gvedVriExdLueZqTpHAJbRTD1Y9k")
public class ActionEnum {
    public static String blueId() {
        return "AgSLkN7jqeKNvQP9gvedVriExdLueZqTpHAJbRTD1Y9k";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ActionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ActionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ActionEnum.json";
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

    public ActionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
