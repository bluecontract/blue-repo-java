package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FCTe9fTVPMRvH2mPZc7gj1HSgSdKhN3zdDDLsdkB8Z6i")
public class CdmBaseDatetimeFieldWithMetaBusinessCenterEnum {
    public static String blueId() {
        return "FCTe9fTVPMRvH2mPZc7gj1HSgSdKhN3zdDDLsdkB8Z6i";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/FieldWithMetaBusinessCenterEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/FieldWithMetaBusinessCenterEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeFieldWithMetaBusinessCenterEnum.json";
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

    private CdmBaseDatetimeBusinessCenterEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseDatetimeFieldWithMetaBusinessCenterEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterEnum getVal() {
        return val;
    }

    public CdmBaseDatetimeFieldWithMetaBusinessCenterEnum val(CdmBaseDatetimeBusinessCenterEnum val) {
        this.val = val;
        return this;
    }

}
