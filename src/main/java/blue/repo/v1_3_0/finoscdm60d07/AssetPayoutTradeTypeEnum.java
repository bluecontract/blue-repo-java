package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("aJz9G8FYzWHVz7KmW5FZCVeNunnfWqoV3kWDbcisXHt")
public class AssetPayoutTradeTypeEnum {
    public static String blueId() {
        return "aJz9G8FYzWHVz7KmW5FZCVeNunnfWqoV3kWDbcisXHt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetPayoutTradeTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetPayoutTradeTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetPayoutTradeTypeEnum.json";
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

    public AssetPayoutTradeTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
