package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BWR383zgZNL2sxBquBGvrzvYvvriqxSQMyYDLD44WpQq")
public class AssetDeliveryProfileBlock {
    public static String blueId() {
        return "BWR383zgZNL2sxBquBGvrzvYvvriqxSQMyYDLD44WpQq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetDeliveryProfileBlock";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetDeliveryProfileBlock";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetDeliveryProfileBlock.json";
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

    private List<DayOfWeekEnum> dayOfWeek;

    private Quantity deliveryCapacity;

    private String endTime;

    private Price priceTimeIntervalQuantity;

    private String startTime;

    public String getNamespace() {
        return namespace;
    }

    public AssetDeliveryProfileBlock namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DayOfWeekEnum> getDayOfWeek() {
        return dayOfWeek;
    }

    public AssetDeliveryProfileBlock dayOfWeek(List<DayOfWeekEnum> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public Quantity getDeliveryCapacity() {
        return deliveryCapacity;
    }

    public AssetDeliveryProfileBlock deliveryCapacity(Quantity deliveryCapacity) {
        this.deliveryCapacity = deliveryCapacity;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public AssetDeliveryProfileBlock endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public Price getPriceTimeIntervalQuantity() {
        return priceTimeIntervalQuantity;
    }

    public AssetDeliveryProfileBlock priceTimeIntervalQuantity(Price priceTimeIntervalQuantity) {
        this.priceTimeIntervalQuantity = priceTimeIntervalQuantity;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public AssetDeliveryProfileBlock startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

}
