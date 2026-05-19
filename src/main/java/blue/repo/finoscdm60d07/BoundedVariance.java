package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FTXPtBhhn7XSJ6iufLkKyZmKMQepYjYXUjdiP5KVjKki")
public class BoundedVariance {
    public static String blueId() {
        return "FTXPtBhhn7XSJ6iufLkKyZmKMQepYjYXUjdiP5KVjKki";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BoundedVariance";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BoundedVariance";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/BoundedVariance.json";
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

    private Boolean daysInRangeAdjustment;

    private Double lowerBarrier;

    private RealisedVarianceMethodEnum realisedVarianceMethod;

    private Double upperBarrier;

    public String getNamespace() {
        return namespace;
    }

    public BoundedVariance namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getDaysInRangeAdjustment() {
        return daysInRangeAdjustment;
    }

    public BoundedVariance daysInRangeAdjustment(Boolean daysInRangeAdjustment) {
        this.daysInRangeAdjustment = daysInRangeAdjustment;
        return this;
    }

    public Double getLowerBarrier() {
        return lowerBarrier;
    }

    public BoundedVariance lowerBarrier(Double lowerBarrier) {
        this.lowerBarrier = lowerBarrier;
        return this;
    }

    public RealisedVarianceMethodEnum getRealisedVarianceMethod() {
        return realisedVarianceMethod;
    }

    public BoundedVariance realisedVarianceMethod(RealisedVarianceMethodEnum realisedVarianceMethod) {
        this.realisedVarianceMethod = realisedVarianceMethod;
        return this;
    }

    public Double getUpperBarrier() {
        return upperBarrier;
    }

    public BoundedVariance upperBarrier(Double upperBarrier) {
        this.upperBarrier = upperBarrier;
        return this;
    }

}
