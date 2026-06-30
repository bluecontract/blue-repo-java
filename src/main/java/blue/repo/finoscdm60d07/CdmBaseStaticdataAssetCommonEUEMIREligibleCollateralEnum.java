package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JD6nBEcv7VVBDthKMnQ7bjvFeFys3igpBt4jJgWKqU6q")
public class CdmBaseStaticdataAssetCommonEUEMIREligibleCollateralEnum {
    public static String blueId() {
        return "JD6nBEcv7VVBDthKMnQ7bjvFeFys3igpBt4jJgWKqU6q";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/EU_EMIR_EligibleCollateralEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/EU_EMIR_EligibleCollateralEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonEUEMIREligibleCollateralEnum.json";
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
