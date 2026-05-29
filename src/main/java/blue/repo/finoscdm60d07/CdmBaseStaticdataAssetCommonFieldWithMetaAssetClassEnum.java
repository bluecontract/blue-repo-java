package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H54vqcpupNQsef2f6vcBdVSEWwG6nZmDcFrNvdSQ1T6a")
public class CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum {
    public static String blueId() {
        return "H54vqcpupNQsef2f6vcBdVSEWwG6nZmDcFrNvdSQ1T6a";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/FieldWithMetaAssetClassEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/FieldWithMetaAssetClassEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonFieldWithMetaAssetClassEnum.json";
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

    private CdmBaseStaticdataAssetCommonAssetClassEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseStaticdataAssetCommonAssetClassEnum getVal() {
        return val;
    }

    public CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum val(CdmBaseStaticdataAssetCommonAssetClassEnum val) {
        this.val = val;
        return this;
    }

}
