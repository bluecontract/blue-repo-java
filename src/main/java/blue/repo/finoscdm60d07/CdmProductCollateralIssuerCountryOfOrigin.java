package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CatSTTPz3ZtRwcqCKFQTUBKdZgmKfgghx1mvYL9PEk7Z")
public class CdmProductCollateralIssuerCountryOfOrigin {
    public static String blueId() {
        return "CatSTTPz3ZtRwcqCKFQTUBKdZgmKfgghx1mvYL9PEk7Z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/IssuerCountryOfOrigin";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/IssuerCountryOfOrigin";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralIssuerCountryOfOrigin.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonISOCountryCodeEnum issuerCountryOfOrigin;

    public CdmBaseStaticdataAssetCommonISOCountryCodeEnum getIssuerCountryOfOrigin() {
        return issuerCountryOfOrigin;
    }

    public CdmProductCollateralIssuerCountryOfOrigin issuerCountryOfOrigin(CdmBaseStaticdataAssetCommonISOCountryCodeEnum issuerCountryOfOrigin) {
        this.issuerCountryOfOrigin = issuerCountryOfOrigin;
        return this;
    }

}
