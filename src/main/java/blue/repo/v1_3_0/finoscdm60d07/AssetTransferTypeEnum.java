package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DsZV2ycJfwWHiKaCRyxqwfPHHUp15tHeJouNocqD98Qo")
public class AssetTransferTypeEnum {
    public static String blueId() {
        return "DsZV2ycJfwWHiKaCRyxqwfPHHUp15tHeJouNocqD98Qo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetTransferTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetTransferTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetTransferTypeEnum.json";
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

    public AssetTransferTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
