package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5QGV3mD81pp9jXwah1mb3NFuW1WWjaRiDNdX5e5tQxgD")
public class CdmLegaldocumentationMasterFieldWithMetaMasterAgreementTypeEnum {
    public static String blueId() {
        return "5QGV3mD81pp9jXwah1mb3NFuW1WWjaRiDNdX5e5tQxgD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/FieldWithMetaMasterAgreementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/FieldWithMetaMasterAgreementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterFieldWithMetaMasterAgreementTypeEnum.json";
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

    private CdmLegaldocumentationMasterMasterAgreementTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmLegaldocumentationMasterFieldWithMetaMasterAgreementTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmLegaldocumentationMasterMasterAgreementTypeEnum getVal() {
        return val;
    }

    public CdmLegaldocumentationMasterFieldWithMetaMasterAgreementTypeEnum val(CdmLegaldocumentationMasterMasterAgreementTypeEnum val) {
        this.val = val;
        return this;
    }

}
