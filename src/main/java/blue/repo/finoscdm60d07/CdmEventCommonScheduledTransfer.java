package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CzRCDzyp6ApUXeaLuu4BLyTRWrUKFUXzTn9mgpeDpbuL")
public class CdmEventCommonScheduledTransfer {
    public static String blueId() {
        return "CzRCDzyp6ApUXeaLuu4BLyTRWrUKFUXzTn9mgpeDpbuL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ScheduledTransfer";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ScheduledTransfer";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonScheduledTransfer.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonCorporateActionTypeEnum corporateActionTransferType;

    private CdmProductCommonSettlementScheduledTransferEnum transferType;

    public CdmEventCommonCorporateActionTypeEnum getCorporateActionTransferType() {
        return corporateActionTransferType;
    }

    public CdmEventCommonScheduledTransfer corporateActionTransferType(CdmEventCommonCorporateActionTypeEnum corporateActionTransferType) {
        this.corporateActionTransferType = corporateActionTransferType;
        return this;
    }

    public CdmProductCommonSettlementScheduledTransferEnum getTransferType() {
        return transferType;
    }

    public CdmEventCommonScheduledTransfer transferType(CdmProductCommonSettlementScheduledTransferEnum transferType) {
        this.transferType = transferType;
        return this;
    }

}
