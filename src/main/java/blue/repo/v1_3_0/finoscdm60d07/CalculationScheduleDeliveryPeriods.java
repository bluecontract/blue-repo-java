package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DziSDhAbKU5Qq7xaykYC7mpmUocKHsCQC6nn36XyUvv")
public class CalculationScheduleDeliveryPeriods {
    public static String blueId() {
        return "DziSDhAbKU5Qq7xaykYC7mpmUocKHsCQC6nn36XyUvv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationScheduleDeliveryPeriods";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationScheduleDeliveryPeriods";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CalculationScheduleDeliveryPeriods.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private Quantity deliveryCapacity;

    private String endDate;

    private Price priceTimeIntervalQuantity;

    private List<AssetDeliveryProfile> profile;

    private String startDate;

    public String getNamespace() {
        return namespace;
    }

    public CalculationScheduleDeliveryPeriods namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Quantity getDeliveryCapacity() {
        return deliveryCapacity;
    }

    public CalculationScheduleDeliveryPeriods deliveryCapacity(Quantity deliveryCapacity) {
        this.deliveryCapacity = deliveryCapacity;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public CalculationScheduleDeliveryPeriods endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Price getPriceTimeIntervalQuantity() {
        return priceTimeIntervalQuantity;
    }

    public CalculationScheduleDeliveryPeriods priceTimeIntervalQuantity(Price priceTimeIntervalQuantity) {
        this.priceTimeIntervalQuantity = priceTimeIntervalQuantity;
        return this;
    }

    public List<AssetDeliveryProfile> getProfile() {
        return profile;
    }

    public CalculationScheduleDeliveryPeriods profile(List<AssetDeliveryProfile> profile) {
        this.profile = profile;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CalculationScheduleDeliveryPeriods startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
