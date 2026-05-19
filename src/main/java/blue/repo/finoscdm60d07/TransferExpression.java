package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CRTfZ91Lze9aLmUnp8As6vk2WMqx7odmp3XZbN5NCFCE")
public class TransferExpression {
    public static String blueId() {
        return "CRTfZ91Lze9aLmUnp8As6vk2WMqx7odmp3XZbN5NCFCE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TransferExpression";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TransferExpression";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TransferExpression.json";
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

    private FeeTypeEnum priceTransfer;

    private ScheduledTransfer scheduledTransfer;

    public String getNamespace() {
        return namespace;
    }

    public TransferExpression namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FeeTypeEnum getPriceTransfer() {
        return priceTransfer;
    }

    public TransferExpression priceTransfer(FeeTypeEnum priceTransfer) {
        this.priceTransfer = priceTransfer;
        return this;
    }

    public ScheduledTransfer getScheduledTransfer() {
        return scheduledTransfer;
    }

    public TransferExpression scheduledTransfer(ScheduledTransfer scheduledTransfer) {
        this.scheduledTransfer = scheduledTransfer;
        return this;
    }

}
