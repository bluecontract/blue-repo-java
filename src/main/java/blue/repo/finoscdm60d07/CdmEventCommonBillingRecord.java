package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HC7vpNX6HuCaSUFftb4rqporkfy3yH1WszW793XKYCmB")
public class CdmEventCommonBillingRecord {
    public static String blueId() {
        return "HC7vpNX6HuCaSUFftb4rqporkfy3yH1WszW793XKYCmB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/BillingRecord";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/BillingRecord";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonBillingRecord.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney minimumFee;

    private String recordEndDate;

    private String recordStartDate;

    private CdmEventCommonTransfer recordTransfer;

    private CdmEventCommonMetafieldsReferenceWithMetaTradeState tradeState;

    public CdmObservableAssetMoney getMinimumFee() {
        return minimumFee;
    }

    public CdmEventCommonBillingRecord minimumFee(CdmObservableAssetMoney minimumFee) {
        this.minimumFee = minimumFee;
        return this;
    }

    public String getRecordEndDate() {
        return recordEndDate;
    }

    public CdmEventCommonBillingRecord recordEndDate(String recordEndDate) {
        this.recordEndDate = recordEndDate;
        return this;
    }

    public String getRecordStartDate() {
        return recordStartDate;
    }

    public CdmEventCommonBillingRecord recordStartDate(String recordStartDate) {
        this.recordStartDate = recordStartDate;
        return this;
    }

    public CdmEventCommonTransfer getRecordTransfer() {
        return recordTransfer;
    }

    public CdmEventCommonBillingRecord recordTransfer(CdmEventCommonTransfer recordTransfer) {
        this.recordTransfer = recordTransfer;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaTradeState getTradeState() {
        return tradeState;
    }

    public CdmEventCommonBillingRecord tradeState(CdmEventCommonMetafieldsReferenceWithMetaTradeState tradeState) {
        this.tradeState = tradeState;
        return this;
    }

}
