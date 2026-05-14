package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7LtrDiGHU2GXVifkZ35wubNV3qNSidQE4TxhiNyudXj")
public class CounterpartyRoleEnum {
    public static String blueId() {
        return "7LtrDiGHU2GXVifkZ35wubNV3qNSidQE4TxhiNyudXj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CounterpartyRoleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CounterpartyRoleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CounterpartyRoleEnum.json";
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

    public CounterpartyRoleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
