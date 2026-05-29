package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BLZTp7a5CtMHrTzCq445GpujBm3ymVzCSadXjNvKVxCH")
public class CdmBaseStaticdataAssetCommonAssetType {
    public static String blueId() {
        return "BLZTp7a5CtMHrTzCq445GpujBm3ymVzCSadXjNvKVxCH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/AssetType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/AssetType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonAssetType.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonAssetTypeEnum assetType;

    private CdmBaseStaticdataAssetCommonDebtType debtType;

    private CdmBaseStaticdataAssetCommonEquityTypeEnum equityType;

    private CdmBaseStaticdataAssetCommonFundProductTypeEnum fundType;

    private List<String> otherAssetType;

    private CdmBaseStaticdataAssetCommonInstrumentTypeEnum securityType;

    public CdmBaseStaticdataAssetCommonAssetTypeEnum getAssetType() {
        return assetType;
    }

    public CdmBaseStaticdataAssetCommonAssetType assetType(CdmBaseStaticdataAssetCommonAssetTypeEnum assetType) {
        this.assetType = assetType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonDebtType getDebtType() {
        return debtType;
    }

    public CdmBaseStaticdataAssetCommonAssetType debtType(CdmBaseStaticdataAssetCommonDebtType debtType) {
        this.debtType = debtType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonEquityTypeEnum getEquityType() {
        return equityType;
    }

    public CdmBaseStaticdataAssetCommonAssetType equityType(CdmBaseStaticdataAssetCommonEquityTypeEnum equityType) {
        this.equityType = equityType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonFundProductTypeEnum getFundType() {
        return fundType;
    }

    public CdmBaseStaticdataAssetCommonAssetType fundType(CdmBaseStaticdataAssetCommonFundProductTypeEnum fundType) {
        this.fundType = fundType;
        return this;
    }

    public List<String> getOtherAssetType() {
        return otherAssetType;
    }

    public CdmBaseStaticdataAssetCommonAssetType otherAssetType(List<String> otherAssetType) {
        this.otherAssetType = otherAssetType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonInstrumentTypeEnum getSecurityType() {
        return securityType;
    }

    public CdmBaseStaticdataAssetCommonAssetType securityType(CdmBaseStaticdataAssetCommonInstrumentTypeEnum securityType) {
        this.securityType = securityType;
        return this;
    }

}
