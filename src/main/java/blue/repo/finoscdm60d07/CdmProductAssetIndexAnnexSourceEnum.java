package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("37faBDCVMUVFXcrh36ov1f1YVdqmMpEPHevmwLaWVwJA")
public class CdmProductAssetIndexAnnexSourceEnum {
    public static String blueId() {
        return "37faBDCVMUVFXcrh36ov1f1YVdqmMpEPHevmwLaWVwJA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/IndexAnnexSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/IndexAnnexSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetIndexAnnexSourceEnum.json";
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
