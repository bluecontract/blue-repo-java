package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6bttAkwgoE4wCcbzrxpxn9QC6RyNAX7D58kev7GDsGiS")
public class CdmProductAssetRealisedVarianceMethodEnum {
    public static String blueId() {
        return "6bttAkwgoE4wCcbzrxpxn9QC6RyNAX7D58kev7GDsGiS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/RealisedVarianceMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/RealisedVarianceMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetRealisedVarianceMethodEnum.json";
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
