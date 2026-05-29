package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2ecEbfWoxgGoaMvoa531kg7Xaabz1fbxUbirtR1N2EKN")
public class CdmEventWorkflowFieldWithMetaLimitLevelEnum {
    public static String blueId() {
        return "2ecEbfWoxgGoaMvoa531kg7Xaabz1fbxUbirtR1N2EKN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/FieldWithMetaLimitLevelEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/FieldWithMetaLimitLevelEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowFieldWithMetaLimitLevelEnum.json";
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

    private CdmEventWorkflowLimitLevelEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmEventWorkflowFieldWithMetaLimitLevelEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmEventWorkflowLimitLevelEnum getVal() {
        return val;
    }

    public CdmEventWorkflowFieldWithMetaLimitLevelEnum val(CdmEventWorkflowLimitLevelEnum val) {
        this.val = val;
        return this;
    }

}
