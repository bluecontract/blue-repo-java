package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5DE1nk33eUe1qZRRMM5fGCsyGFrVj8JswsEvwtwzL2K9")
public class CdmEventCommonTransferState {
    public static String blueId() {
        return "5DE1nk33eUe1qZRRMM5fGCsyGFrVj8JswsEvwtwzL2K9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/TransferState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/TransferState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTransferState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonTransfer transfer;

    private CdmEventCommonTransferStatusEnum transferStatus;

    public CdmEventCommonTransfer getTransfer() {
        return transfer;
    }

    public CdmEventCommonTransferState transfer(CdmEventCommonTransfer transfer) {
        this.transfer = transfer;
        return this;
    }

    public CdmEventCommonTransferStatusEnum getTransferStatus() {
        return transferStatus;
    }

    public CdmEventCommonTransferState transferStatus(CdmEventCommonTransferStatusEnum transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }

}
