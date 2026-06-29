package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GxggG4PmBLZC3tQQEfAUNmomUmcbfT2ZjjQZzWL55dng")
public class CdmProductAssetVolatilityCapFloor {
    public static String blueId() {
        return "GxggG4PmBLZC3tQQEfAUNmomUmcbfT2ZjjQZzWL55dng";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/VolatilityCapFloor";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/VolatilityCapFloor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetVolatilityCapFloor.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean applicable;

    private Double totalVolatilityCap;

    private Double volatilityCapFactor;

    public Boolean getApplicable() {
        return applicable;
    }

    public CdmProductAssetVolatilityCapFloor applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Double getTotalVolatilityCap() {
        return totalVolatilityCap;
    }

    public CdmProductAssetVolatilityCapFloor totalVolatilityCap(Double totalVolatilityCap) {
        this.totalVolatilityCap = totalVolatilityCap;
        return this;
    }

    public Double getVolatilityCapFactor() {
        return volatilityCapFactor;
    }

    public CdmProductAssetVolatilityCapFloor volatilityCapFactor(Double volatilityCapFactor) {
        this.volatilityCapFactor = volatilityCapFactor;
        return this;
    }

}
