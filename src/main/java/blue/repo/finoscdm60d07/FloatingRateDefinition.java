package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("96cxSQ6LVE5Lwx3Z16xFUstP1FT1SpP6841CUzJHZGWq")
public class FloatingRateDefinition {
    public static String blueId() {
        return "96cxSQ6LVE5Lwx3Z16xFUstP1FT1SpP6841CUzJHZGWq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateDefinition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateDefinition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingRateDefinition.json";
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

    private Double calculatedRate;

    private List<Strike> capRate;

    private Double floatingRateMultiplier;

    private List<Strike> floorRate;

    private List<RateObservation> rateObservation;

    private Double spread;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateDefinition namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getCalculatedRate() {
        return calculatedRate;
    }

    public FloatingRateDefinition calculatedRate(Double calculatedRate) {
        this.calculatedRate = calculatedRate;
        return this;
    }

    public List<Strike> getCapRate() {
        return capRate;
    }

    public FloatingRateDefinition capRate(List<Strike> capRate) {
        this.capRate = capRate;
        return this;
    }

    public Double getFloatingRateMultiplier() {
        return floatingRateMultiplier;
    }

    public FloatingRateDefinition floatingRateMultiplier(Double floatingRateMultiplier) {
        this.floatingRateMultiplier = floatingRateMultiplier;
        return this;
    }

    public List<Strike> getFloorRate() {
        return floorRate;
    }

    public FloatingRateDefinition floorRate(List<Strike> floorRate) {
        this.floorRate = floorRate;
        return this;
    }

    public List<RateObservation> getRateObservation() {
        return rateObservation;
    }

    public FloatingRateDefinition rateObservation(List<RateObservation> rateObservation) {
        this.rateObservation = rateObservation;
        return this;
    }

    public Double getSpread() {
        return spread;
    }

    public FloatingRateDefinition spread(Double spread) {
        this.spread = spread;
        return this;
    }

}
