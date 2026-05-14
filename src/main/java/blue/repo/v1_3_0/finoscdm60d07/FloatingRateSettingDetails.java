package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7hLDehftnAPCHiXGoxbzth7yZckVJV1Xhys6K3kfXCwA")
public class FloatingRateSettingDetails {
    public static String blueId() {
        return "7hLDehftnAPCHiXGoxbzth7yZckVJV1Xhys6K3kfXCwA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateSettingDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateSettingDetails";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateSettingDetails.json";
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

    private CalculatedRateDetails calculationDetails;

    private Double floatingRate;

    private String observationDate;

    private String resetDate;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateSettingDetails namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CalculatedRateDetails getCalculationDetails() {
        return calculationDetails;
    }

    public FloatingRateSettingDetails calculationDetails(CalculatedRateDetails calculationDetails) {
        this.calculationDetails = calculationDetails;
        return this;
    }

    public Double getFloatingRate() {
        return floatingRate;
    }

    public FloatingRateSettingDetails floatingRate(Double floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public String getObservationDate() {
        return observationDate;
    }

    public FloatingRateSettingDetails observationDate(String observationDate) {
        this.observationDate = observationDate;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public FloatingRateSettingDetails resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

}
