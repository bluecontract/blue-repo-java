package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("TGLgD6JzxBwGgg73wJHhpG8Pk91o3ZvWGrPwgLjR8Rm")
public class CdmProductAssetFieldWithMetaSpreadScheduleTypeEnum {
    public static String blueId() {
        return "TGLgD6JzxBwGgg73wJHhpG8Pk91o3ZvWGrPwgLjR8Rm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FieldWithMetaSpreadScheduleTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FieldWithMetaSpreadScheduleTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFieldWithMetaSpreadScheduleTypeEnum.json";
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

    private CdmProductAssetSpreadScheduleTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmProductAssetFieldWithMetaSpreadScheduleTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmProductAssetSpreadScheduleTypeEnum getVal() {
        return val;
    }

    public CdmProductAssetFieldWithMetaSpreadScheduleTypeEnum val(CdmProductAssetSpreadScheduleTypeEnum val) {
        this.val = val;
        return this;
    }

}
