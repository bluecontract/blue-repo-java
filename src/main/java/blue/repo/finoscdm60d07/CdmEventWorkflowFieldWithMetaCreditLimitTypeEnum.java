package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BRdxjWnBGUSh37id1GM71wzr5JbVB7YUZknt2qh1GRd5")
public class CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum {
    public static String blueId() {
        return "BRdxjWnBGUSh37id1GM71wzr5JbVB7YUZknt2qh1GRd5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/FieldWithMetaCreditLimitTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/FieldWithMetaCreditLimitTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowFieldWithMetaCreditLimitTypeEnum.json";
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

    private CdmEventWorkflowCreditLimitTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmEventWorkflowCreditLimitTypeEnum getVal() {
        return val;
    }

    public CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum val(CdmEventWorkflowCreditLimitTypeEnum val) {
        this.val = val;
        return this;
    }

}
