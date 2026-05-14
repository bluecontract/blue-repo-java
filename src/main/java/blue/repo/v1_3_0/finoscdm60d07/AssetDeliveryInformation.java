package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("RKNL6BeQ9L5RWiRxhDcWKY2HSMYSveFZ2XYNSGdAbd9")
public class AssetDeliveryInformation {
    public static String blueId() {
        return "RKNL6BeQ9L5RWiRxhDcWKY2HSMYSveFZ2XYNSGdAbd9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetDeliveryInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetDeliveryInformation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetDeliveryInformation.json";
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

    private List<LocationIdentifier> location;

    private AssetDeliveryPeriods periods;

    public String getNamespace() {
        return namespace;
    }

    public AssetDeliveryInformation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Quantity getDeliveryCapacity() {
        return deliveryCapacity;
    }

    public AssetDeliveryInformation deliveryCapacity(Quantity deliveryCapacity) {
        this.deliveryCapacity = deliveryCapacity;
        return this;
    }

    public List<LocationIdentifier> getLocation() {
        return location;
    }

    public AssetDeliveryInformation location(List<LocationIdentifier> location) {
        this.location = location;
        return this;
    }

    public AssetDeliveryPeriods getPeriods() {
        return periods;
    }

    public AssetDeliveryInformation periods(AssetDeliveryPeriods periods) {
        this.periods = periods;
        return this;
    }

}
