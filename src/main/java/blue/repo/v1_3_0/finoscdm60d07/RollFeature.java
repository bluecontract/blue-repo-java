package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hni8rGBUS2Adc4mDDasD7GufSnhRUa5vCwcDidiaPVhb")
public class RollFeature {
    public static String blueId() {
        return "Hni8rGBUS2Adc4mDDasD7GufSnhRUa5vCwcDidiaPVhb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RollFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RollFeature";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RollFeature.json";
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

    private Offset deliveryDateRollConvention;

    private RollSourceCalendarEnum rollSourceCalendar;

    public String getNamespace() {
        return namespace;
    }

    public RollFeature namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Offset getDeliveryDateRollConvention() {
        return deliveryDateRollConvention;
    }

    public RollFeature deliveryDateRollConvention(Offset deliveryDateRollConvention) {
        this.deliveryDateRollConvention = deliveryDateRollConvention;
        return this;
    }

    public RollSourceCalendarEnum getRollSourceCalendar() {
        return rollSourceCalendar;
    }

    public RollFeature rollSourceCalendar(RollSourceCalendarEnum rollSourceCalendar) {
        this.rollSourceCalendar = rollSourceCalendar;
        return this;
    }

}
