package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("563YSwGNEcaUCPoPiT3d87vu4n87zvsCmFobbH1HbBar")
public class CdmLegaldocumentationCommonFieldWithMetaResourceTypeEnum {
    public static String blueId() {
        return "563YSwGNEcaUCPoPiT3d87vu4n87zvsCmFobbH1HbBar";
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
