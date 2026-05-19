package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DfqHo9xRZ3rV3DpZzCCLDKFtmk3KGHJwNTjd1JzEiJg8")
public class SettlementTypeEnum {
    public static String blueId() {
        return "DfqHo9xRZ3rV3DpZzCCLDKFtmk3KGHJwNTjd1JzEiJg8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SettlementTypeEnum.json";
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

    public SettlementTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
