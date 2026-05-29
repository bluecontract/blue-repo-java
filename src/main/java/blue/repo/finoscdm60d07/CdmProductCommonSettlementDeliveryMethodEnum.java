package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("37grwt2PkwzdxYRTGd1FEUrRxY4Z8oHpoq2HZnisBGax")
public class CdmProductCommonSettlementDeliveryMethodEnum {
    public static String blueId() {
        return "37grwt2PkwzdxYRTGd1FEUrRxY4Z8oHpoq2HZnisBGax";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/DeliveryMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/DeliveryMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementDeliveryMethodEnum.json";
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
