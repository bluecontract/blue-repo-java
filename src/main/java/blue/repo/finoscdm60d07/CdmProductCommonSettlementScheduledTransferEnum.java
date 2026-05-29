package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7QVESfxVDZXRwinJhzgNgBJUPcHq4D8bda2RZ11TD5nb")
public class CdmProductCommonSettlementScheduledTransferEnum {
    public static String blueId() {
        return "7QVESfxVDZXRwinJhzgNgBJUPcHq4D8bda2RZ11TD5nb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/ScheduledTransferEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/ScheduledTransferEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementScheduledTransferEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
