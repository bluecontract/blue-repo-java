package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5BXxvUQ6iFc2CEBU4s2oBRTaT8kVAFEYTLCwaMS9CuNF")
public class CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationTypeEnum {
    public static String blueId() {
        return "5BXxvUQ6iFc2CEBU4s2oBRTaT8kVAFEYTLCwaMS9CuNF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/FieldWithMetaMasterConfirmationTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/FieldWithMetaMasterConfirmationTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterFieldWithMetaMasterConfirmationTypeEnum.json";
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

    private CdmLegaldocumentationMasterMasterConfirmationTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmLegaldocumentationMasterMasterConfirmationTypeEnum getVal() {
        return val;
    }

    public CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationTypeEnum val(CdmLegaldocumentationMasterMasterConfirmationTypeEnum val) {
        this.val = val;
        return this;
    }

}
