package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("jorV2iKJ1jHHcMmkaAyPt6D5ntKw9kDY4hUmmhigpcg")
public class CdmObservableAssetReferenceSwapCurve {
    public static String blueId() {
        return "jorV2iKJ1jHHcMmkaAyPt6D5ntKw9kDY4hUmmhigpcg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/ReferenceSwapCurve";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/ReferenceSwapCurve";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetReferenceSwapCurve.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMakeWholeAmount makeWholeAmount;

    private CdmObservableAssetSwapCurveValuation swapUnwindValue;

    public CdmObservableAssetMakeWholeAmount getMakeWholeAmount() {
        return makeWholeAmount;
    }

    public CdmObservableAssetReferenceSwapCurve makeWholeAmount(CdmObservableAssetMakeWholeAmount makeWholeAmount) {
        this.makeWholeAmount = makeWholeAmount;
        return this;
    }

    public CdmObservableAssetSwapCurveValuation getSwapUnwindValue() {
        return swapUnwindValue;
    }

    public CdmObservableAssetReferenceSwapCurve swapUnwindValue(CdmObservableAssetSwapCurveValuation swapUnwindValue) {
        this.swapUnwindValue = swapUnwindValue;
        return this;
    }

}
