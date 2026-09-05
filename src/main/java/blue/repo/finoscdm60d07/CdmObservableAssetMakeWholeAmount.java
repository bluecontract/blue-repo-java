package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3b5FkTFcqEPUMZ4Db5BDaxLncJ9SefPCVVGPdecsD4iB")
public class CdmObservableAssetMakeWholeAmount {
    public static String blueId() {
        return "3b5FkTFcqEPUMZ4Db5BDaxLncJ9SefPCVVGPdecsD4iB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/MakeWholeAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/MakeWholeAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetMakeWholeAmount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString earlyCallDate;

    private CdmBaseStaticdataAssetRatesFloatingRateIndexEnum floatingRateIndex;

    private CdmBaseDatetimePeriod indexTenor;

    private CdmObservableAssetInterpolationMethodEnum interpolationMethod;

    private CdmObservableAssetQuotationSideEnum side;

    private Double spread;

    public ComRosettaModelFieldWithMetaString getEarlyCallDate() {
        return earlyCallDate;
    }

    public CdmObservableAssetMakeWholeAmount earlyCallDate(ComRosettaModelFieldWithMetaString earlyCallDate) {
        this.earlyCallDate = earlyCallDate;
        return this;
    }

    public CdmBaseStaticdataAssetRatesFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public CdmObservableAssetMakeWholeAmount floatingRateIndex(CdmBaseStaticdataAssetRatesFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public CdmBaseDatetimePeriod getIndexTenor() {
        return indexTenor;
    }

    public CdmObservableAssetMakeWholeAmount indexTenor(CdmBaseDatetimePeriod indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public CdmObservableAssetInterpolationMethodEnum getInterpolationMethod() {
        return interpolationMethod;
    }

    public CdmObservableAssetMakeWholeAmount interpolationMethod(CdmObservableAssetInterpolationMethodEnum interpolationMethod) {
        this.interpolationMethod = interpolationMethod;
        return this;
    }

    public CdmObservableAssetQuotationSideEnum getSide() {
        return side;
    }

    public CdmObservableAssetMakeWholeAmount side(CdmObservableAssetQuotationSideEnum side) {
        this.side = side;
        return this;
    }

    public Double getSpread() {
        return spread;
    }

    public CdmObservableAssetMakeWholeAmount spread(Double spread) {
        this.spread = spread;
        return this;
    }

}
