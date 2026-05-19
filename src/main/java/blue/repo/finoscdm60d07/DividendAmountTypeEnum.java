package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CavaxmhGpZgCz8ftCNZDwnn3MHKdqghw6guGmBcEY585")
public class DividendAmountTypeEnum {
    public static String blueId() {
        return "CavaxmhGpZgCz8ftCNZDwnn3MHKdqghw6guGmBcEY585";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendAmountTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendAmountTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DividendAmountTypeEnum.json";
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

    public DividendAmountTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
