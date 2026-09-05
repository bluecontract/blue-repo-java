package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ET2YBgRRP1zrK9zrqAUYvLoWw6xViAsWp615H8AZQzba")
public class CdmLegaldocumentationCommonFieldWithMetaMatrixTermEnum {
    public static String blueId() {
        return "ET2YBgRRP1zrK9zrqAUYvLoWw6xViAsWp615H8AZQzba";
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
