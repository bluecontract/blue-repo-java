package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FPz2gxL3hhBbrKzsyDHCfd6NPDNRZN4HckQY4e1gj5u9")
public class CdmLegaldocumentationCommonFieldWithMetaGoverningLawEnum {
    public static String blueId() {
        return "FPz2gxL3hhBbrKzsyDHCfd6NPDNRZN4HckQY4e1gj5u9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/FieldWithMetaGoverningLawEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/FieldWithMetaGoverningLawEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonFieldWithMetaGoverningLawEnum.json";
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

    private CdmLegaldocumentationCommonGoverningLawEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmLegaldocumentationCommonFieldWithMetaGoverningLawEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmLegaldocumentationCommonGoverningLawEnum getVal() {
        return val;
    }

    public CdmLegaldocumentationCommonFieldWithMetaGoverningLawEnum val(CdmLegaldocumentationCommonGoverningLawEnum val) {
        this.val = val;
        return this;
    }

}
