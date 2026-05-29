package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8KBCqXi7KbZ3Hjbjoawocy6CCQAxsXejGPKZXJ897BG8")
public class CdmProductAssetFloatingRateDefinition {
    public static String blueId() {
        return "8KBCqXi7KbZ3Hjbjoawocy6CCQAxsXejGPKZXJ897BG8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FloatingRateDefinition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FloatingRateDefinition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFloatingRateDefinition.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double calculatedRate;

    private List<CdmProductTemplateStrike> capRate;

    private Double floatingRateMultiplier;

    private List<CdmProductTemplateStrike> floorRate;

    private List<CdmObservableAssetRateObservation> rateObservation;

    private Double spread;

    public Double getCalculatedRate() {
        return calculatedRate;
    }

    public CdmProductAssetFloatingRateDefinition calculatedRate(Double calculatedRate) {
        this.calculatedRate = calculatedRate;
        return this;
    }

    public List<CdmProductTemplateStrike> getCapRate() {
        return capRate;
    }

    public CdmProductAssetFloatingRateDefinition capRate(List<CdmProductTemplateStrike> capRate) {
        this.capRate = capRate;
        return this;
    }

    public Double getFloatingRateMultiplier() {
        return floatingRateMultiplier;
    }

    public CdmProductAssetFloatingRateDefinition floatingRateMultiplier(Double floatingRateMultiplier) {
        this.floatingRateMultiplier = floatingRateMultiplier;
        return this;
    }

    public List<CdmProductTemplateStrike> getFloorRate() {
        return floorRate;
    }

    public CdmProductAssetFloatingRateDefinition floorRate(List<CdmProductTemplateStrike> floorRate) {
        this.floorRate = floorRate;
        return this;
    }

    public List<CdmObservableAssetRateObservation> getRateObservation() {
        return rateObservation;
    }

    public CdmProductAssetFloatingRateDefinition rateObservation(List<CdmObservableAssetRateObservation> rateObservation) {
        this.rateObservation = rateObservation;
        return this;
    }

    public Double getSpread() {
        return spread;
    }

    public CdmProductAssetFloatingRateDefinition spread(Double spread) {
        this.spread = spread;
        return this;
    }

}
