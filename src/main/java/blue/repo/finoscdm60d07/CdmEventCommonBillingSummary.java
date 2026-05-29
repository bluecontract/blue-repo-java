package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CbqXmjhZCSFT4ofyjNZReqgyNDwNKpcKaBJkHxZs9obC")
public class CdmEventCommonBillingSummary {
    public static String blueId() {
        return "CbqXmjhZCSFT4ofyjNZReqgyNDwNKpcKaBJkHxZs9obC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/BillingSummary";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/BillingSummary";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonBillingSummary.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonRecordAmountTypeEnum summaryAmountType;

    private CdmEventCommonTransfer summaryTransfer;

    public CdmEventCommonRecordAmountTypeEnum getSummaryAmountType() {
        return summaryAmountType;
    }

    public CdmEventCommonBillingSummary summaryAmountType(CdmEventCommonRecordAmountTypeEnum summaryAmountType) {
        this.summaryAmountType = summaryAmountType;
        return this;
    }

    public CdmEventCommonTransfer getSummaryTransfer() {
        return summaryTransfer;
    }

    public CdmEventCommonBillingSummary summaryTransfer(CdmEventCommonTransfer summaryTransfer) {
        this.summaryTransfer = summaryTransfer;
        return this;
    }

}
