package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("F2UqdquxSuKdvbbUUq7EKxQo9Tx43SKBeVyWz7YHta2y")
public class CdmEventCommonTransferInstruction {
    public static String blueId() {
        return "F2UqdquxSuKdvbbUUq7EKxQo9Tx43SKBeVyWz7YHta2y";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/TransferInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/TransferInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTransferInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventCommonTransferState> transferState;

    public List<CdmEventCommonTransferState> getTransferState() {
        return transferState;
    }

    public CdmEventCommonTransferInstruction transferState(List<CdmEventCommonTransferState> transferState) {
        this.transferState = transferState;
        return this;
    }

}
