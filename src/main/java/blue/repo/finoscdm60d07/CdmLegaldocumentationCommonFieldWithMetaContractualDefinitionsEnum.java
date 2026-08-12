package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CftZdiJyxaHVcunERbr8EtHErVHhgbCsTvUQH5YbLAXL")
public class CdmLegaldocumentationCommonFieldWithMetaContractualDefinitionsEnum {
    public static String blueId() {
        return "CftZdiJyxaHVcunERbr8EtHErVHhgbCsTvUQH5YbLAXL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/FieldWithMetaContractualDefinitionsEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/FieldWithMetaContractualDefinitionsEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonFieldWithMetaContractualDefinitionsEnum.json";
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

    private CdmLegaldocumentationCommonContractualDefinitionsEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmLegaldocumentationCommonFieldWithMetaContractualDefinitionsEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmLegaldocumentationCommonContractualDefinitionsEnum getVal() {
        return val;
    }

    public CdmLegaldocumentationCommonFieldWithMetaContractualDefinitionsEnum val(CdmLegaldocumentationCommonContractualDefinitionsEnum val) {
        this.val = val;
        return this;
    }

}
