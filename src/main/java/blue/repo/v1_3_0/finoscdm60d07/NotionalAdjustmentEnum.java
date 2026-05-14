package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AvSuiUqnPqo3Xb3AF4y9QQ9cFpscjz17syL84AdFEKWf")
public class NotionalAdjustmentEnum {
    public static String blueId() {
        return "AvSuiUqnPqo3Xb3AF4y9QQ9cFpscjz17syL84AdFEKWf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NotionalAdjustmentEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NotionalAdjustmentEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NotionalAdjustmentEnum.json";
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

    public NotionalAdjustmentEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
