package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Gc45fCBXr4nvquUQAWp6Tpfb4nJz5yxgPbejMWXM1Py2")
public class WarehouseIdentityEnum {
    public static String blueId() {
        return "Gc45fCBXr4nvquUQAWp6Tpfb4nJz5yxgPbejMWXM1Py2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "WarehouseIdentityEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/WarehouseIdentityEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/WarehouseIdentityEnum.json";
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

    public WarehouseIdentityEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
