package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CB6mEcDBY2qYvsnxSu1uz2oCQvjn5xD8iMeXT2DtD3wf")
public class FieldWithMetaAssetClassEnum {
    public static String blueId() {
        return "CB6mEcDBY2qYvsnxSu1uz2oCQvjn5xD8iMeXT2DtD3wf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaAssetClassEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaAssetClassEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaAssetClassEnum.json";
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

    private MetaFields meta;

    private AssetClassEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaAssetClassEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaAssetClassEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public AssetClassEnum getVal() {
        return val;
    }

    public FieldWithMetaAssetClassEnum val(AssetClassEnum val) {
        this.val = val;
        return this;
    }

}
