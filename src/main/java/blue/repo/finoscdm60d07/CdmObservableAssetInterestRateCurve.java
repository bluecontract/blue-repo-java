package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("83NusanAivksgKtND6q2fvn7R6uYqidWtFCebXFTvyPT")
public class CdmObservableAssetInterestRateCurve {
    public static String blueId() {
        return "83NusanAivksgKtND6q2fvn7R6uYqidWtFCebXFTvyPT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/InterestRateCurve";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/InterestRateCurve";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetInterestRateCurve.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum floatingRateIndex;

    private CdmBaseDatetimePeriod tenor;

    public CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public CdmObservableAssetInterestRateCurve floatingRateIndex(CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public CdmBaseDatetimePeriod getTenor() {
        return tenor;
    }

    public CdmObservableAssetInterestRateCurve tenor(CdmBaseDatetimePeriod tenor) {
        this.tenor = tenor;
        return this;
    }

}
