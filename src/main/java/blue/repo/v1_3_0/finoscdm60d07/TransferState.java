package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DrULtm29FJGuf9gcKSa73Q8WFTVZwdLbsfpVUddehScC")
public class TransferState {
    public static String blueId() {
        return "DrULtm29FJGuf9gcKSa73Q8WFTVZwdLbsfpVUddehScC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TransferState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TransferState";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TransferState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private Transfer transfer;

    private TransferStatusEnum transferStatus;

    public String getNamespace() {
        return namespace;
    }

    public TransferState namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public TransferState transfer(Transfer transfer) {
        this.transfer = transfer;
        return this;
    }

    public TransferStatusEnum getTransferStatus() {
        return transferStatus;
    }

    public TransferState transferStatus(TransferStatusEnum transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }

}
