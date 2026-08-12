package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BeufGYcvdnG92TzbfkVByXuyaFrFsMh9oRPpcJSJDMXN")
public class CdmProductCollateralListingSector {
    public static String blueId() {
        return "BeufGYcvdnG92TzbfkVByXuyaFrFsMh9oRPpcJSJDMXN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/ListingSector";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/ListingSector";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralListingSector.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> sector;

    public List<ComRosettaModelFieldWithMetaString> getSector() {
        return sector;
    }

    public CdmProductCollateralListingSector sector(List<ComRosettaModelFieldWithMetaString> sector) {
        this.sector = sector;
        return this;
    }

}
