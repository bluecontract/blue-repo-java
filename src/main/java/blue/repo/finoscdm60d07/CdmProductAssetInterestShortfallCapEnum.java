package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2aEhSjjMBd4tA2GTLahhEEQdY17ub2jHNyP3rdCKNo9E")
public class CdmProductAssetInterestShortfallCapEnum {
    public static String blueId() {
        return "2aEhSjjMBd4tA2GTLahhEEQdY17ub2jHNyP3rdCKNo9E";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/InterestShortfallCapEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/InterestShortfallCapEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetInterestShortfallCapEnum.json";
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
