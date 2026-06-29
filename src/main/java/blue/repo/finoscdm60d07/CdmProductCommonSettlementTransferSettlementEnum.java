package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BSQDJMfPWXBaqWYWPJCUYYLzftmLKsUbi3EyLhuh7Mr1")
public class CdmProductCommonSettlementTransferSettlementEnum {
    public static String blueId() {
        return "BSQDJMfPWXBaqWYWPJCUYYLzftmLKsUbi3EyLhuh7Mr1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/TransferSettlementEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/TransferSettlementEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementTransferSettlementEnum.json";
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
