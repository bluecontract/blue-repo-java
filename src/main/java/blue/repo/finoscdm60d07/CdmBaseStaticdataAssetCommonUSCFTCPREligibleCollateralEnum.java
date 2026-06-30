package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4uCFVBTnzc9vzmmzLSyG6TPxegT1i7fGFyiwSkSAhNNW")
public class CdmBaseStaticdataAssetCommonUSCFTCPREligibleCollateralEnum {
    public static String blueId() {
        return "4uCFVBTnzc9vzmmzLSyG6TPxegT1i7fGFyiwSkSAhNNW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/US_CFTC_PR_EligibleCollateralEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/US_CFTC_PR_EligibleCollateralEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonUSCFTCPREligibleCollateralEnum.json";
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
