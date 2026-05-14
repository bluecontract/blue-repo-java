package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D3VMtonyci4qfM6Qx7SMuPJb2R2F7wp7wr5VXd9izi1E")
public class ValuationTypeEnum {
    public static String blueId() {
        return "D3VMtonyci4qfM6Qx7SMuPJb2R2F7wp7wr5VXd9izi1E";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ValuationTypeEnum.json";
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

    public ValuationTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
