package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("14UHCXtf9XLpi3Z3n4xbo1dmXRzfXnDEH23iVaechxzh")
public class TransactionInitiated extends Response {
    public static String blueId() {
        return "14UHCXtf9XLpi3Z3n4xbo1dmXRzfXnDEH23iVaechxzh";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Initiated";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Initiated";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/TransactionInitiated.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String railType;

    private String attachmentPoint;

    private String providerReference;

    private BigInteger initiatedAmount;

    public String getRailType() {
        return railType;
    }

    public TransactionInitiated railType(String railType) {
        this.railType = railType;
        return this;
    }

    public String getAttachmentPoint() {
        return attachmentPoint;
    }

    public TransactionInitiated attachmentPoint(String attachmentPoint) {
        this.attachmentPoint = attachmentPoint;
        return this;
    }

    public String getProviderReference() {
        return providerReference;
    }

    public TransactionInitiated providerReference(String providerReference) {
        this.providerReference = providerReference;
        return this;
    }

    public BigInteger getInitiatedAmount() {
        return initiatedAmount;
    }

    public TransactionInitiated initiatedAmount(BigInteger initiatedAmount) {
        this.initiatedAmount = initiatedAmount;
        return this;
    }

}
