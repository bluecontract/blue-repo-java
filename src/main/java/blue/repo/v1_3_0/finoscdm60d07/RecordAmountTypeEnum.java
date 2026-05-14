package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9df3BwJc6VtTxMhWstd3Vv1zcC8mfsHawMr4YPGFLGV1")
public class RecordAmountTypeEnum {
    public static String blueId() {
        return "9df3BwJc6VtTxMhWstd3Vv1zcC8mfsHawMr4YPGFLGV1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RecordAmountTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RecordAmountTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RecordAmountTypeEnum.json";
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

    public RecordAmountTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
