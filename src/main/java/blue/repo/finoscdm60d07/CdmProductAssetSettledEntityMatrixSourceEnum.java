package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3kT2qCMLQ9M3RhyNB62h473hnneVH6oyE9Epow3ksmDk")
public class CdmProductAssetSettledEntityMatrixSourceEnum {
    public static String blueId() {
        return "3kT2qCMLQ9M3RhyNB62h473hnneVH6oyE9Epow3ksmDk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/SettledEntityMatrixSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/SettledEntityMatrixSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetSettledEntityMatrixSourceEnum.json";
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
