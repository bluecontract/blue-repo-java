package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4Tf1rMX7SfMmV37FWHfwpQFxAE37Lnu3AxEQ9D2FTRoz")
public class StandardSettlementStyleEnum {
    public static String blueId() {
        return "4Tf1rMX7SfMmV37FWHfwpQFxAE37Lnu3AxEQ9D2FTRoz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StandardSettlementStyleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StandardSettlementStyleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/StandardSettlementStyleEnum.json";
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

    public StandardSettlementStyleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
