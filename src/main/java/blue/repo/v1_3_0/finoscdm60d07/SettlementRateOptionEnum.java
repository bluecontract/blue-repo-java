package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DZCCUZxxq4ApE5HTnSH1khydAsHBv6APGqWWz91gHpvR")
public class SettlementRateOptionEnum {
    public static String blueId() {
        return "DZCCUZxxq4ApE5HTnSH1khydAsHBv6APGqWWz91gHpvR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementRateOptionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementRateOptionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SettlementRateOptionEnum.json";
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

    public SettlementRateOptionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
