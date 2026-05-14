package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5itM2WcLazLrYtkfNoAgTpQUHZX63Hum8pomfa1nyt3T")
public class DeliveryDateParameters {
    public static String blueId() {
        return "5itM2WcLazLrYtkfNoAgTpQUHZX63Hum8pomfa1nyt3T";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeliveryDateParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeliveryDateParameters";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DeliveryDateParameters.json";
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

    private AdjustableDate deliveryDate;

    private Offset deliveryDateExpirationConvention;

    private Offset deliveryDateRollConvention;

    private Offset deliveryNearby;

    public String getNamespace() {
        return namespace;
    }

    public DeliveryDateParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableDate getDeliveryDate() {
        return deliveryDate;
    }

    public DeliveryDateParameters deliveryDate(AdjustableDate deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    public Offset getDeliveryDateExpirationConvention() {
        return deliveryDateExpirationConvention;
    }

    public DeliveryDateParameters deliveryDateExpirationConvention(Offset deliveryDateExpirationConvention) {
        this.deliveryDateExpirationConvention = deliveryDateExpirationConvention;
        return this;
    }

    public Offset getDeliveryDateRollConvention() {
        return deliveryDateRollConvention;
    }

    public DeliveryDateParameters deliveryDateRollConvention(Offset deliveryDateRollConvention) {
        this.deliveryDateRollConvention = deliveryDateRollConvention;
        return this;
    }

    public Offset getDeliveryNearby() {
        return deliveryNearby;
    }

    public DeliveryDateParameters deliveryNearby(Offset deliveryNearby) {
        this.deliveryNearby = deliveryNearby;
        return this;
    }

}
