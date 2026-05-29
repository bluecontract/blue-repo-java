package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9ZgNDpmFTSu9LLgMCL2cJtyFspofRjKfC2WXTu47o1R5")
public class CdmProductAssetCalculationScheduleDeliveryPeriods {
    public static String blueId() {
        return "9ZgNDpmFTSu9LLgMCL2cJtyFspofRjKfC2WXTu47o1R5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/CalculationScheduleDeliveryPeriods";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/CalculationScheduleDeliveryPeriods";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetCalculationScheduleDeliveryPeriods.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathQuantity deliveryCapacity;

    private String endDate;

    private CdmObservableAssetPrice priceTimeIntervalQuantity;

    private List<CdmProductAssetAssetDeliveryProfile> profile;

    private String startDate;

    public CdmBaseMathQuantity getDeliveryCapacity() {
        return deliveryCapacity;
    }

    public CdmProductAssetCalculationScheduleDeliveryPeriods deliveryCapacity(CdmBaseMathQuantity deliveryCapacity) {
        this.deliveryCapacity = deliveryCapacity;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public CdmProductAssetCalculationScheduleDeliveryPeriods endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public CdmObservableAssetPrice getPriceTimeIntervalQuantity() {
        return priceTimeIntervalQuantity;
    }

    public CdmProductAssetCalculationScheduleDeliveryPeriods priceTimeIntervalQuantity(CdmObservableAssetPrice priceTimeIntervalQuantity) {
        this.priceTimeIntervalQuantity = priceTimeIntervalQuantity;
        return this;
    }

    public List<CdmProductAssetAssetDeliveryProfile> getProfile() {
        return profile;
    }

    public CdmProductAssetCalculationScheduleDeliveryPeriods profile(List<CdmProductAssetAssetDeliveryProfile> profile) {
        this.profile = profile;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CdmProductAssetCalculationScheduleDeliveryPeriods startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
