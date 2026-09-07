package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("w2z5vrdebD57MssdnVBS4tCECGETH7Svoa3B4WC431y")
public class CdmBaseStaticdataAssetCommonCollateralTaxonomy {
    public static String blueId() {
        return "w2z5vrdebD57MssdnVBS4tCECGETH7Svoa3B4WC431y";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/CollateralTaxonomy";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/CollateralTaxonomy";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCollateralTaxonomy.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonTaxonomySourceEnum taxonomySource;

    private CdmBaseStaticdataAssetCommonCollateralTaxonomyValue taxonomyValue;

    public CdmBaseStaticdataAssetCommonTaxonomySourceEnum getTaxonomySource() {
        return taxonomySource;
    }

    public CdmBaseStaticdataAssetCommonCollateralTaxonomy taxonomySource(CdmBaseStaticdataAssetCommonTaxonomySourceEnum taxonomySource) {
        this.taxonomySource = taxonomySource;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCollateralTaxonomyValue getTaxonomyValue() {
        return taxonomyValue;
    }

    public CdmBaseStaticdataAssetCommonCollateralTaxonomy taxonomyValue(CdmBaseStaticdataAssetCommonCollateralTaxonomyValue taxonomyValue) {
        this.taxonomyValue = taxonomyValue;
        return this;
    }

}
