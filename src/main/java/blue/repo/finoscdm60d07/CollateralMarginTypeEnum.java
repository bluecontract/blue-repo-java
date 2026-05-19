package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BqYjzkxAuNczGZxmxpnEsb5vTBSTN4aZ7qMSgsEssGcb")
public class CollateralMarginTypeEnum {
    public static String blueId() {
        return "BqYjzkxAuNczGZxmxpnEsb5vTBSTN4aZ7qMSgsEssGcb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralMarginTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralMarginTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralMarginTypeEnum.json";
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

    public CollateralMarginTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
