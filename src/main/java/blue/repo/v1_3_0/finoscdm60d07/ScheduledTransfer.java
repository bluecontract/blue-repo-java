package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4462dWiHEp8HUAYxXSSTkPpJS9FS3Aqvuc35KNdSVqyD")
public class ScheduledTransfer {
    public static String blueId() {
        return "4462dWiHEp8HUAYxXSSTkPpJS9FS3Aqvuc35KNdSVqyD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ScheduledTransfer";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ScheduledTransfer";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ScheduledTransfer.json";
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

    private CorporateActionTypeEnum corporateActionTransferType;

    private ScheduledTransferEnum transferType;

    public String getNamespace() {
        return namespace;
    }

    public ScheduledTransfer namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CorporateActionTypeEnum getCorporateActionTransferType() {
        return corporateActionTransferType;
    }

    public ScheduledTransfer corporateActionTransferType(CorporateActionTypeEnum corporateActionTransferType) {
        this.corporateActionTransferType = corporateActionTransferType;
        return this;
    }

    public ScheduledTransferEnum getTransferType() {
        return transferType;
    }

    public ScheduledTransfer transferType(ScheduledTransferEnum transferType) {
        this.transferType = transferType;
        return this;
    }

}
