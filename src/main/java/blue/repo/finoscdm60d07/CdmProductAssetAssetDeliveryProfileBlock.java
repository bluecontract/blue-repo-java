package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4vuqTuDoEHVYBX71EjmtMarGehySDoBUfYv4DFZxy6cD")
public class CdmProductAssetAssetDeliveryProfileBlock {
    public static String blueId() {
        return "4vuqTuDoEHVYBX71EjmtMarGehySDoBUfYv4DFZxy6cD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/AssetDeliveryProfileBlock";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/AssetDeliveryProfileBlock";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetAssetDeliveryProfileBlock.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseDatetimeDayOfWeekEnum> dayOfWeek;

    private CdmBaseMathQuantity deliveryCapacity;

    private String endTime;

    private CdmObservableAssetPrice priceTimeIntervalQuantity;

    private String startTime;

    public List<CdmBaseDatetimeDayOfWeekEnum> getDayOfWeek() {
        return dayOfWeek;
    }

    public CdmProductAssetAssetDeliveryProfileBlock dayOfWeek(List<CdmBaseDatetimeDayOfWeekEnum> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public CdmBaseMathQuantity getDeliveryCapacity() {
        return deliveryCapacity;
    }

    public CdmProductAssetAssetDeliveryProfileBlock deliveryCapacity(CdmBaseMathQuantity deliveryCapacity) {
        this.deliveryCapacity = deliveryCapacity;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public CdmProductAssetAssetDeliveryProfileBlock endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public CdmObservableAssetPrice getPriceTimeIntervalQuantity() {
        return priceTimeIntervalQuantity;
    }

    public CdmProductAssetAssetDeliveryProfileBlock priceTimeIntervalQuantity(CdmObservableAssetPrice priceTimeIntervalQuantity) {
        this.priceTimeIntervalQuantity = priceTimeIntervalQuantity;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public CdmProductAssetAssetDeliveryProfileBlock startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

}
