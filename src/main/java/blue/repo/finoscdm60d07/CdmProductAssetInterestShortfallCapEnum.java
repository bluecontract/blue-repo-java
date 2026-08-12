package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5aFwMNtcxHkvhXwyS7CEusCyu9yHY9hNFVSzLxj2oNEr")
public class CdmProductAssetInterestShortfallCapEnum {
    public static String blueId() {
        return "5aFwMNtcxHkvhXwyS7CEusCyu9yHY9hNFVSzLxj2oNEr";
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
