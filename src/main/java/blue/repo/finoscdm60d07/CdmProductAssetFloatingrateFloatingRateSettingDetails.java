package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FQsK7NhvbG8qLJfMS4tZVLVuJeB4Le9vPFtixb7kDC47")
public class CdmProductAssetFloatingrateFloatingRateSettingDetails {
    public static String blueId() {
        return "FQsK7NhvbG8qLJfMS4tZVLVuJeB4Le9vPFtixb7kDC47";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/floatingrate/FloatingRateSettingDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/floatingrate/FloatingRateSettingDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetfloatingrateFloatingRateSettingDetails.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCalculatedrateCalculatedRateDetails calculationDetails;

    private Double floatingRate;

    private String observationDate;

    private String resetDate;

    public CdmObservableAssetCalculatedrateCalculatedRateDetails getCalculationDetails() {
        return calculationDetails;
    }

    public CdmProductAssetFloatingrateFloatingRateSettingDetails calculationDetails(CdmObservableAssetCalculatedrateCalculatedRateDetails calculationDetails) {
        this.calculationDetails = calculationDetails;
        return this;
    }

    public Double getFloatingRate() {
        return floatingRate;
    }

    public CdmProductAssetFloatingrateFloatingRateSettingDetails floatingRate(Double floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public String getObservationDate() {
        return observationDate;
    }

    public CdmProductAssetFloatingrateFloatingRateSettingDetails observationDate(String observationDate) {
        this.observationDate = observationDate;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public CdmProductAssetFloatingrateFloatingRateSettingDetails resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

}
