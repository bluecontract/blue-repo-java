package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5ZQJRbHs1sigSChqUCynDn3BTCeQbqJaiLpXEKJRp3w")
public class CdmBaseStaticdataAssetCommonSupraNationalIssuerTypeEnum {
    public static String blueId() {
        return "5ZQJRbHs1sigSChqUCynDn3BTCeQbqJaiLpXEKJRp3w";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/SupraNationalIssuerTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/SupraNationalIssuerTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonSupraNationalIssuerTypeEnum.json";
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
