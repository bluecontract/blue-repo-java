package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FxyFSNYePhpJmMgxTUsw5Q1cye9JhTEVNRQW2UMS4BEF")
public class DividendPeriodEnum {
    public static String blueId() {
        return "FxyFSNYePhpJmMgxTUsw5Q1cye9JhTEVNRQW2UMS4BEF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendPeriodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendPeriodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DividendPeriodEnum.json";
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

    public DividendPeriodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
