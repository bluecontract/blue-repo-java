package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EpLc6jLkuUK6zqV8MHtWQiHnixuVbJZVg9NBMgLGcomT")
public class CdmProductAssetBoundedVariance {
    public static String blueId() {
        return "EpLc6jLkuUK6zqV8MHtWQiHnixuVbJZVg9NBMgLGcomT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/BoundedVariance";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/BoundedVariance";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetBoundedVariance.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean daysInRangeAdjustment;

    private Double lowerBarrier;

    private CdmProductAssetRealisedVarianceMethodEnum realisedVarianceMethod;

    private Double upperBarrier;

    public Boolean getDaysInRangeAdjustment() {
        return daysInRangeAdjustment;
    }

    public CdmProductAssetBoundedVariance daysInRangeAdjustment(Boolean daysInRangeAdjustment) {
        this.daysInRangeAdjustment = daysInRangeAdjustment;
        return this;
    }

    public Double getLowerBarrier() {
        return lowerBarrier;
    }

    public CdmProductAssetBoundedVariance lowerBarrier(Double lowerBarrier) {
        this.lowerBarrier = lowerBarrier;
        return this;
    }

    public CdmProductAssetRealisedVarianceMethodEnum getRealisedVarianceMethod() {
        return realisedVarianceMethod;
    }

    public CdmProductAssetBoundedVariance realisedVarianceMethod(CdmProductAssetRealisedVarianceMethodEnum realisedVarianceMethod) {
        this.realisedVarianceMethod = realisedVarianceMethod;
        return this;
    }

    public Double getUpperBarrier() {
        return upperBarrier;
    }

    public CdmProductAssetBoundedVariance upperBarrier(Double upperBarrier) {
        this.upperBarrier = upperBarrier;
        return this;
    }

}
