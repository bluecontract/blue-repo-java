package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4zMMXJmagrFrUiNYWCBc5UwionKhYNUPW3PY8Pp1dVTr")
public class CommodityLocationIdentifierTypeEnum {
    public static String blueId() {
        return "4zMMXJmagrFrUiNYWCBc5UwionKhYNUPW3PY8Pp1dVTr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CommodityLocationIdentifierTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CommodityLocationIdentifierTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CommodityLocationIdentifierTypeEnum.json";
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

    public CommodityLocationIdentifierTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
