package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("97zu6zSwKe6qBq2wG65xCXbFvPPFrxJX6v6mtC6WwoSr")
public class CdmProductAssetFieldWithMetaIndexAnnexSourceEnum {
    public static String blueId() {
        return "97zu6zSwKe6qBq2wG65xCXbFvPPFrxJX6v6mtC6WwoSr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FieldWithMetaIndexAnnexSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FieldWithMetaIndexAnnexSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFieldWithMetaIndexAnnexSourceEnum.json";
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

    private CdmProductAssetIndexAnnexSourceEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmProductAssetFieldWithMetaIndexAnnexSourceEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmProductAssetIndexAnnexSourceEnum getVal() {
        return val;
    }

    public CdmProductAssetFieldWithMetaIndexAnnexSourceEnum val(CdmProductAssetIndexAnnexSourceEnum val) {
        this.val = val;
        return this;
    }

}
