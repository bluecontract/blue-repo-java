package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("RDiRTVRojrnSyuHJ5j24eYYcyow8d9ujnENuJHacNVv")
public class CdmEventCommonTransferInstruction {
    public static String blueId() {
        return "RDiRTVRojrnSyuHJ5j24eYYcyow8d9ujnENuJHacNVv";
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
