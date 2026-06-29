package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5dGWGFZAUi1PKkhPU7YyqpjKufXV7BQNEntUPbgE8HZS")
public class CdmProductAssetInterestShortFall {
    public static String blueId() {
        return "5dGWGFZAUi1PKkhPU7YyqpjKufXV7BQNEntUPbgE8HZS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/InterestShortFall";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/InterestShortFall";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetInterestShortFall.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean compounding;

    private CdmProductAssetInterestShortfallCapEnum interestShortfallCap;

    private CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum rateSource;

    public Boolean getCompounding() {
        return compounding;
    }

    public CdmProductAssetInterestShortFall compounding(Boolean compounding) {
        this.compounding = compounding;
        return this;
    }

    public CdmProductAssetInterestShortfallCapEnum getInterestShortfallCap() {
        return interestShortfallCap;
    }

    public CdmProductAssetInterestShortFall interestShortfallCap(CdmProductAssetInterestShortfallCapEnum interestShortfallCap) {
        this.interestShortfallCap = interestShortfallCap;
        return this;
    }

    public CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum getRateSource() {
        return rateSource;
    }

    public CdmProductAssetInterestShortFall rateSource(CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum rateSource) {
        this.rateSource = rateSource;
        return this;
    }

}
