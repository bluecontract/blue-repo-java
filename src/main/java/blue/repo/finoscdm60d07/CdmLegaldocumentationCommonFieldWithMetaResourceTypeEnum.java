package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8Wj1ScUWE2jG7vPb1vgp6xRgqJ4EbYyCS9n2CbaCYTSY")
public class CdmLegaldocumentationCommonFieldWithMetaResourceTypeEnum {
    public static String blueId() {
        return "8Wj1ScUWE2jG7vPb1vgp6xRgqJ4EbYyCS9n2CbaCYTSY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/FieldWithMetaResourceTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/FieldWithMetaResourceTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonFieldWithMetaResourceTypeEnum.json";
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

    private CdmLegaldocumentationCommonResourceTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmLegaldocumentationCommonFieldWithMetaResourceTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmLegaldocumentationCommonResourceTypeEnum getVal() {
        return val;
    }

    public CdmLegaldocumentationCommonFieldWithMetaResourceTypeEnum val(CdmLegaldocumentationCommonResourceTypeEnum val) {
        this.val = val;
        return this;
    }

}
