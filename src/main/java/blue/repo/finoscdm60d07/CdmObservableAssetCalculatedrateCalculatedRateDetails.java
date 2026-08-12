package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6tV4tMzAYkzXchyzP7mTuV91NBEboWNA5hHCsyeTZd9i")
public class CdmObservableAssetCalculatedrateCalculatedRateDetails {
    public static String blueId() {
        return "6tV4tMzAYkzXchyzP7mTuV91NBEboWNA5hHCsyeTZd9i";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/calculatedrate/CalculatedRateDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/calculatedrate/CalculatedRateDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetcalculatedrateCalculatedRateDetails.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double aggregateValue;

    private Double aggregateWeight;

    private Double calculatedRate;

    private List<Double> compoundedGrowth;

    private List<Double> growthFactor;

    private CdmObservableAssetCalculatedrateCalculatedRateObservations observations;

    private List<Double> weightedRates;

    public Double getAggregateValue() {
        return aggregateValue;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateDetails aggregateValue(Double aggregateValue) {
        this.aggregateValue = aggregateValue;
        return this;
    }

    public Double getAggregateWeight() {
        return aggregateWeight;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateDetails aggregateWeight(Double aggregateWeight) {
        this.aggregateWeight = aggregateWeight;
        return this;
    }

    public Double getCalculatedRate() {
        return calculatedRate;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateDetails calculatedRate(Double calculatedRate) {
        this.calculatedRate = calculatedRate;
        return this;
    }

    public List<Double> getCompoundedGrowth() {
        return compoundedGrowth;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateDetails compoundedGrowth(List<Double> compoundedGrowth) {
        this.compoundedGrowth = compoundedGrowth;
        return this;
    }

    public List<Double> getGrowthFactor() {
        return growthFactor;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateDetails growthFactor(List<Double> growthFactor) {
        this.growthFactor = growthFactor;
        return this;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateObservations getObservations() {
        return observations;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateDetails observations(CdmObservableAssetCalculatedrateCalculatedRateObservations observations) {
        this.observations = observations;
        return this;
    }

    public List<Double> getWeightedRates() {
        return weightedRates;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateDetails weightedRates(List<Double> weightedRates) {
        this.weightedRates = weightedRates;
        return this;
    }

}
