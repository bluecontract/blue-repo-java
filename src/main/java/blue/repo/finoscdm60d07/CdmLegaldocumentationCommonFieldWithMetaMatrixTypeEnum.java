package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FYJVFGt7vhpkoVeVEJx4JGHKRqnzkriXgK3S6Z43DFxA")
public class CdmLegaldocumentationCommonFieldWithMetaMatrixTypeEnum {
    public static String blueId() {
        return "FYJVFGt7vhpkoVeVEJx4JGHKRqnzkriXgK3S6Z43DFxA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/FieldWithMetaMatrixTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/FieldWithMetaMatrixTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonFieldWithMetaMatrixTypeEnum.json";
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

    private CdmLegaldocumentationCommonMatrixTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmLegaldocumentationCommonFieldWithMetaMatrixTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmLegaldocumentationCommonMatrixTypeEnum getVal() {
        return val;
    }

    public CdmLegaldocumentationCommonFieldWithMetaMatrixTypeEnum val(CdmLegaldocumentationCommonMatrixTypeEnum val) {
        this.val = val;
        return this;
    }

}
