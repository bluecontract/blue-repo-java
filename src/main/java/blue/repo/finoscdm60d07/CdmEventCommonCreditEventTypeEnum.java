package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EGfSLCNfWu5DGbdZ2ngfezkkWe9fy92E6WNeXcAUzWAP")
public class CdmEventCommonCreditEventTypeEnum {
    public static String blueId() {
        return "EGfSLCNfWu5DGbdZ2ngfezkkWe9fy92E6WNeXcAUzWAP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CreditEventTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CreditEventTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCreditEventTypeEnum.json";
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
