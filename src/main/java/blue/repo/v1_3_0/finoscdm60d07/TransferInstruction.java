package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("B49k8aRP9SQWr81cKo8P3WebsN8L7imZoSbkCJYpvET5")
public class TransferInstruction {
    public static String blueId() {
        return "B49k8aRP9SQWr81cKo8P3WebsN8L7imZoSbkCJYpvET5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TransferInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TransferInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TransferInstruction.json";
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

    private List<TransferState> transferState;

    public String getNamespace() {
        return namespace;
    }

    public TransferInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<TransferState> getTransferState() {
        return transferState;
    }

    public TransferInstruction transferState(List<TransferState> transferState) {
        this.transferState = transferState;
        return this;
    }

}
