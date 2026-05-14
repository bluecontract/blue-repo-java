package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Ey2ADCheY3xTFKx6nYQgpHncb1TrrJovViwjET3X5Hp1")
public class CalculatedRateDetails {
    public static String blueId() {
        return "Ey2ADCheY3xTFKx6nYQgpHncb1TrrJovViwjET3X5Hp1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculatedRateDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculatedRateDetails";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CalculatedRateDetails.json";
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

    private Double aggregateValue;

    private Double aggregateWeight;

    private Double calculatedRate;

    private List<Double> compoundedGrowth;

    private List<Double> growthFactor;

    private CalculatedRateObservations observations;

    private List<Double> weightedRates;

    public String getNamespace() {
        return namespace;
    }

    public CalculatedRateDetails namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAggregateValue() {
        return aggregateValue;
    }

    public CalculatedRateDetails aggregateValue(Double aggregateValue) {
        this.aggregateValue = aggregateValue;
        return this;
    }

    public Double getAggregateWeight() {
        return aggregateWeight;
    }

    public CalculatedRateDetails aggregateWeight(Double aggregateWeight) {
        this.aggregateWeight = aggregateWeight;
        return this;
    }

    public Double getCalculatedRate() {
        return calculatedRate;
    }

    public CalculatedRateDetails calculatedRate(Double calculatedRate) {
        this.calculatedRate = calculatedRate;
        return this;
    }

    public List<Double> getCompoundedGrowth() {
        return compoundedGrowth;
    }

    public CalculatedRateDetails compoundedGrowth(List<Double> compoundedGrowth) {
        this.compoundedGrowth = compoundedGrowth;
        return this;
    }

    public List<Double> getGrowthFactor() {
        return growthFactor;
    }

    public CalculatedRateDetails growthFactor(List<Double> growthFactor) {
        this.growthFactor = growthFactor;
        return this;
    }

    public CalculatedRateObservations getObservations() {
        return observations;
    }

    public CalculatedRateDetails observations(CalculatedRateObservations observations) {
        this.observations = observations;
        return this;
    }

    public List<Double> getWeightedRates() {
        return weightedRates;
    }

    public CalculatedRateDetails weightedRates(List<Double> weightedRates) {
        this.weightedRates = weightedRates;
        return this;
    }

}
