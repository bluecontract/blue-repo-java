package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("TuUaQmwiwbNnpZ2No6iRHWhHTr63186fYNv8REBGMWB")
public class CdmObservableAssetSwapCurveValuation {
    public static String blueId() {
        return "TuUaQmwiwbNnpZ2No6iRHWhHTr63186fYNv8REBGMWB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/SwapCurveValuation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/SwapCurveValuation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetSwapCurveValuation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetRatesFloatingRateIndexEnum floatingRateIndex;

    private CdmBaseDatetimePeriod indexTenor;

    private CdmObservableAssetQuotationSideEnum side;

    private Double spread;

    public CdmBaseStaticdataAssetRatesFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public CdmObservableAssetSwapCurveValuation floatingRateIndex(CdmBaseStaticdataAssetRatesFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public CdmBaseDatetimePeriod getIndexTenor() {
        return indexTenor;
    }

    public CdmObservableAssetSwapCurveValuation indexTenor(CdmBaseDatetimePeriod indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public CdmObservableAssetQuotationSideEnum getSide() {
        return side;
    }

    public CdmObservableAssetSwapCurveValuation side(CdmObservableAssetQuotationSideEnum side) {
        this.side = side;
        return this;
    }

    public Double getSpread() {
        return spread;
    }

    public CdmObservableAssetSwapCurveValuation spread(Double spread) {
        this.spread = spread;
        return this;
    }

}
