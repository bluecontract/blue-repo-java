package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GU878gDwZJG7BqrUVBPiUxqxy3CRM6gjr5KJ8rGdcH1f")
public class CdmLegaldocumentationCommonFieldWithMetaGoverningLawEnum {
    public static String blueId() {
        return "GU878gDwZJG7BqrUVBPiUxqxy3CRM6gjr5KJ8rGdcH1f";
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
