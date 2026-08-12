package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6kffco33fj474CxLdCMkkTbajx4JJDtE7zJHkyQX9Bop")
public class CdmProductAssetNonCashDividendTreatmentEnum {
    public static String blueId() {
        return "6kffco33fj474CxLdCMkkTbajx4JJDtE7zJHkyQX9Bop";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/NonCashDividendTreatmentEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/NonCashDividendTreatmentEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetNonCashDividendTreatmentEnum.json";
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
