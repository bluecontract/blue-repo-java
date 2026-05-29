package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9tZ8BrwCpC2J8NwtkjzPsfCpfY28GPuQz1TD89m6bt6p")
public class CdmProductAssetFieldWithMetaSettledEntityMatrixSourceEnum {
    public static String blueId() {
        return "9tZ8BrwCpC2J8NwtkjzPsfCpfY28GPuQz1TD89m6bt6p";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FieldWithMetaSettledEntityMatrixSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FieldWithMetaSettledEntityMatrixSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFieldWithMetaSettledEntityMatrixSourceEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelMetafieldsMetaFields meta;

    private CdmProductAssetSettledEntityMatrixSourceEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmProductAssetFieldWithMetaSettledEntityMatrixSourceEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmProductAssetSettledEntityMatrixSourceEnum getVal() {
        return val;
    }

    public CdmProductAssetFieldWithMetaSettledEntityMatrixSourceEnum val(CdmProductAssetSettledEntityMatrixSourceEnum val) {
        this.val = val;
        return this;
    }

}
