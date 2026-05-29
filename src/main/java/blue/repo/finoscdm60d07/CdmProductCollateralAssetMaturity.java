package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ASQH72x4qzJUvyeBJspqS5NdmiF2Y2jvehGEbB4ynBNG")
public class CdmProductCollateralAssetMaturity {
    public static String blueId() {
        return "ASQH72x4qzJUvyeBJspqS5NdmiF2Y2jvehGEbB4ynBNG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/AssetMaturity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/AssetMaturity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralAssetMaturity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimePeriodRange maturityRange;

    private CdmBaseStaticdataAssetCommonMaturityTypeEnum maturityType;

    public CdmBaseDatetimePeriodRange getMaturityRange() {
        return maturityRange;
    }

    public CdmProductCollateralAssetMaturity maturityRange(CdmBaseDatetimePeriodRange maturityRange) {
        this.maturityRange = maturityRange;
        return this;
    }

    public CdmBaseStaticdataAssetCommonMaturityTypeEnum getMaturityType() {
        return maturityType;
    }

    public CdmProductCollateralAssetMaturity maturityType(CdmBaseStaticdataAssetCommonMaturityTypeEnum maturityType) {
        this.maturityType = maturityType;
        return this;
    }

}
