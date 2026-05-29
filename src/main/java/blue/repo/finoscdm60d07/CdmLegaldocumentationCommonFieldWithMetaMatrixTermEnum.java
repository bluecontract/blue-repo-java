package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4NN6d8Q5fSbUgfXjWP68uxd6THX4FGkUFrvYKo2zbuKY")
public class CdmLegaldocumentationCommonFieldWithMetaMatrixTermEnum {
    public static String blueId() {
        return "4NN6d8Q5fSbUgfXjWP68uxd6THX4FGkUFrvYKo2zbuKY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/FieldWithMetaMatrixTermEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/FieldWithMetaMatrixTermEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonFieldWithMetaMatrixTermEnum.json";
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

    private CdmLegaldocumentationCommonMatrixTermEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmLegaldocumentationCommonFieldWithMetaMatrixTermEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmLegaldocumentationCommonMatrixTermEnum getVal() {
        return val;
    }

    public CdmLegaldocumentationCommonFieldWithMetaMatrixTermEnum val(CdmLegaldocumentationCommonMatrixTermEnum val) {
        this.val = val;
        return this;
    }

}
