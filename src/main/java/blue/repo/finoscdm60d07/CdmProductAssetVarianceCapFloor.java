package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2AZnHgoS5afFQfp3F6cunWcHpUAiCzpYycF5ZE35ZBad")
public class CdmProductAssetVarianceCapFloor {
    public static String blueId() {
        return "2AZnHgoS5afFQfp3F6cunWcHpUAiCzpYycF5ZE35ZBad";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/VarianceCapFloor";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/VarianceCapFloor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetVarianceCapFloor.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetBoundedVariance boundedVariance;

    private Double unadjustedVarianceCap;

    private Boolean varianceCap;

    public CdmProductAssetBoundedVariance getBoundedVariance() {
        return boundedVariance;
    }

    public CdmProductAssetVarianceCapFloor boundedVariance(CdmProductAssetBoundedVariance boundedVariance) {
        this.boundedVariance = boundedVariance;
        return this;
    }

    public Double getUnadjustedVarianceCap() {
        return unadjustedVarianceCap;
    }

    public CdmProductAssetVarianceCapFloor unadjustedVarianceCap(Double unadjustedVarianceCap) {
        this.unadjustedVarianceCap = unadjustedVarianceCap;
        return this;
    }

    public Boolean getVarianceCap() {
        return varianceCap;
    }

    public CdmProductAssetVarianceCapFloor varianceCap(Boolean varianceCap) {
        this.varianceCap = varianceCap;
        return this;
    }

}
