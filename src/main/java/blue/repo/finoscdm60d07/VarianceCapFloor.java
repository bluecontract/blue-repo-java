package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DMLhKawC3QT35JxvHmTtehjQ1swjtafRgKFoKSkneSTn")
public class VarianceCapFloor {
    public static String blueId() {
        return "DMLhKawC3QT35JxvHmTtehjQ1swjtafRgKFoKSkneSTn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "VarianceCapFloor";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/VarianceCapFloor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/VarianceCapFloor.json";
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

    private BoundedVariance boundedVariance;

    private Double unadjustedVarianceCap;

    private Boolean varianceCap;

    public String getNamespace() {
        return namespace;
    }

    public VarianceCapFloor namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BoundedVariance getBoundedVariance() {
        return boundedVariance;
    }

    public VarianceCapFloor boundedVariance(BoundedVariance boundedVariance) {
        this.boundedVariance = boundedVariance;
        return this;
    }

    public Double getUnadjustedVarianceCap() {
        return unadjustedVarianceCap;
    }

    public VarianceCapFloor unadjustedVarianceCap(Double unadjustedVarianceCap) {
        this.unadjustedVarianceCap = unadjustedVarianceCap;
        return this;
    }

    public Boolean getVarianceCap() {
        return varianceCap;
    }

    public VarianceCapFloor varianceCap(Boolean varianceCap) {
        this.varianceCap = varianceCap;
        return this;
    }

}
