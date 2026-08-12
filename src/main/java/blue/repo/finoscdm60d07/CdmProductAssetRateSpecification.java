package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("HBrMg5FXzJ1xe7cZfdnvk3h8VUcubS4i5XJvxpREkAsM")
public class CdmProductAssetRateSpecification {
    public static String blueId() {
        return "HBrMg5FXzJ1xe7cZfdnvk3h8VUcubS4i5XJvxpREkAsM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/RateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/RateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetRateSpecification.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: FixedRateSpecification
    @JsonProperty("FixedRateSpecification")
    private CdmProductAssetFixedRateSpecification fixedRateSpecification;

    // Original Blue property name: FloatingRateSpecification
    @JsonProperty("FloatingRateSpecification")
    private CdmProductAssetFloatingRateSpecification floatingRateSpecification;

    // Original Blue property name: InflationRateSpecification
    @JsonProperty("InflationRateSpecification")
    private CdmProductAssetInflationRateSpecification inflationRateSpecification;

    public CdmProductAssetFixedRateSpecification getFixedRateSpecification() {
        return fixedRateSpecification;
    }

    public CdmProductAssetRateSpecification fixedRateSpecification(CdmProductAssetFixedRateSpecification fixedRateSpecification) {
        this.fixedRateSpecification = fixedRateSpecification;
        return this;
    }

    public CdmProductAssetFloatingRateSpecification getFloatingRateSpecification() {
        return floatingRateSpecification;
    }

    public CdmProductAssetRateSpecification floatingRateSpecification(CdmProductAssetFloatingRateSpecification floatingRateSpecification) {
        this.floatingRateSpecification = floatingRateSpecification;
        return this;
    }

    public CdmProductAssetInflationRateSpecification getInflationRateSpecification() {
        return inflationRateSpecification;
    }

    public CdmProductAssetRateSpecification inflationRateSpecification(CdmProductAssetInflationRateSpecification inflationRateSpecification) {
        this.inflationRateSpecification = inflationRateSpecification;
        return this;
    }

}
