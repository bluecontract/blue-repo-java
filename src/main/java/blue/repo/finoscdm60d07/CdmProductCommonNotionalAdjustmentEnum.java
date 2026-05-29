package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("48JDEpkM8WR1yds2w2SWP5KCjtrwqaKCSP2cmxPxjgxY")
public class CdmProductCommonNotionalAdjustmentEnum {
    public static String blueId() {
        return "48JDEpkM8WR1yds2w2SWP5KCjtrwqaKCSP2cmxPxjgxY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/NotionalAdjustmentEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/NotionalAdjustmentEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonNotionalAdjustmentEnum.json";
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
