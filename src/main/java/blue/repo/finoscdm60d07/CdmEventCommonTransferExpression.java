package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("28K8jWekKx6AFsw5haFZg81uADTmzkkgCKQErSng8jXd")
public class CdmEventCommonTransferExpression {
    public static String blueId() {
        return "28K8jWekKx6AFsw5haFZg81uADTmzkkgCKQErSng8jXd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/TransferExpression";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/TransferExpression";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTransferExpression.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetFeeTypeEnum priceTransfer;

    private CdmEventCommonScheduledTransfer scheduledTransfer;

    public CdmObservableAssetFeeTypeEnum getPriceTransfer() {
        return priceTransfer;
    }

    public CdmEventCommonTransferExpression priceTransfer(CdmObservableAssetFeeTypeEnum priceTransfer) {
        this.priceTransfer = priceTransfer;
        return this;
    }

    public CdmEventCommonScheduledTransfer getScheduledTransfer() {
        return scheduledTransfer;
    }

    public CdmEventCommonTransferExpression scheduledTransfer(CdmEventCommonScheduledTransfer scheduledTransfer) {
        this.scheduledTransfer = scheduledTransfer;
        return this;
    }

}
