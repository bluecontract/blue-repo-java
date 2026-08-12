package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("huDyD12ZoREuxfsApppfcWfJ4LddBpaDDswYuKpWtH5")
public class CdmProductAssetAssetDeliveryProfile {
    public static String blueId() {
        return "huDyD12ZoREuxfsApppfcWfJ4LddBpaDDswYuKpWtH5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/AssetDeliveryProfile";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/AssetDeliveryProfile";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetAssetDeliveryProfile.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetBankHolidayTreatmentEnum bankHolidaysTreatment;

    private List<CdmProductAssetAssetDeliveryProfileBlock> block;

    private CdmProductAssetLoadTypeEnum loadType;

    public CdmProductAssetBankHolidayTreatmentEnum getBankHolidaysTreatment() {
        return bankHolidaysTreatment;
    }

    public CdmProductAssetAssetDeliveryProfile bankHolidaysTreatment(CdmProductAssetBankHolidayTreatmentEnum bankHolidaysTreatment) {
        this.bankHolidaysTreatment = bankHolidaysTreatment;
        return this;
    }

    public List<CdmProductAssetAssetDeliveryProfileBlock> getBlock() {
        return block;
    }

    public CdmProductAssetAssetDeliveryProfile block(List<CdmProductAssetAssetDeliveryProfileBlock> block) {
        this.block = block;
        return this;
    }

    public CdmProductAssetLoadTypeEnum getLoadType() {
        return loadType;
    }

    public CdmProductAssetAssetDeliveryProfile loadType(CdmProductAssetLoadTypeEnum loadType) {
        this.loadType = loadType;
        return this;
    }

}
