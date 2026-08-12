package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8rrtQ7ufVFwqvtNre8bZWFUCfVmJgwVYWwZNj5N1aetV")
public class CdmEventCommonCorporateAction {
    public static String blueId() {
        return "8rrtQ7ufVFwqvtNre8bZWFUCfVmJgwVYWwZNj5N1aetV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CorporateAction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CorporateAction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCorporateAction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonCorporateActionTypeEnum corporateActionType;

    private String exDate;

    private String payDate;

    private CdmProductTemplateUnderlier underlier;

    public CdmEventCommonCorporateActionTypeEnum getCorporateActionType() {
        return corporateActionType;
    }

    public CdmEventCommonCorporateAction corporateActionType(CdmEventCommonCorporateActionTypeEnum corporateActionType) {
        this.corporateActionType = corporateActionType;
        return this;
    }

    public String getExDate() {
        return exDate;
    }

    public CdmEventCommonCorporateAction exDate(String exDate) {
        this.exDate = exDate;
        return this;
    }

    public String getPayDate() {
        return payDate;
    }

    public CdmEventCommonCorporateAction payDate(String payDate) {
        this.payDate = payDate;
        return this;
    }

    public CdmProductTemplateUnderlier getUnderlier() {
        return underlier;
    }

    public CdmEventCommonCorporateAction underlier(CdmProductTemplateUnderlier underlier) {
        this.underlier = underlier;
        return this;
    }

}
