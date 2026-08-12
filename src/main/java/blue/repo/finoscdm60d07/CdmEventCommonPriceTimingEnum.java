package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9m7oFgSnUtNdoF8hut9kaWRqoPdi8Vr1jH1stL2LEuNS")
public class CdmEventCommonPriceTimingEnum {
    public static String blueId() {
        return "9m7oFgSnUtNdoF8hut9kaWRqoPdi8Vr1jH1stL2LEuNS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/PriceTimingEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/PriceTimingEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonPriceTimingEnum.json";
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
