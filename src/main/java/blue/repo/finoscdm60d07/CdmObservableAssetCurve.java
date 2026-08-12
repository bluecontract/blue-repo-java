package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Dc9f4BkDRJNFpM7pQZLH5UVwiCEFPCcaJDKzm5PsBZuL")
public class CdmObservableAssetCurve {
    public static String blueId() {
        return "Dc9f4BkDRJNFpM7pQZLH5UVwiCEFPCcaJDKzm5PsBZuL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/Curve";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/Curve";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCurve.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetFieldWithMetaCommodityReferencePriceEnum commodityCurve;

    private CdmObservableAssetInterestRateCurve interestRateCurve;

    public CdmObservableAssetFieldWithMetaCommodityReferencePriceEnum getCommodityCurve() {
        return commodityCurve;
    }

    public CdmObservableAssetCurve commodityCurve(CdmObservableAssetFieldWithMetaCommodityReferencePriceEnum commodityCurve) {
        this.commodityCurve = commodityCurve;
        return this;
    }

    public CdmObservableAssetInterestRateCurve getInterestRateCurve() {
        return interestRateCurve;
    }

    public CdmObservableAssetCurve interestRateCurve(CdmObservableAssetInterestRateCurve interestRateCurve) {
        this.interestRateCurve = interestRateCurve;
        return this;
    }

}
