package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FwUNFKJeskQXFx2sCAnvYba91TV5N2jYMUyXNiL1eMc6")
public class CdmObservableAssetFroFloatingRateIndexCalculationDefaults {
    public static String blueId() {
        return "FwUNFKJeskQXFx2sCAnvYba91TV5N2jYMUyXNiL1eMc6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/fro/FloatingRateIndexCalculationDefaults";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/fro/FloatingRateIndexCalculationDefaults";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetfroFloatingRateIndexCalculationDefaults.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetFroFloatingRateIndexCategoryEnum category;

    private CdmObservableAssetFroFloatingRateIndexStyleEnum indexStyle;

    private CdmObservableAssetFroFloatingRateIndexCalculationMethodEnum method;

    public CdmObservableAssetFroFloatingRateIndexCategoryEnum getCategory() {
        return category;
    }

    public CdmObservableAssetFroFloatingRateIndexCalculationDefaults category(CdmObservableAssetFroFloatingRateIndexCategoryEnum category) {
        this.category = category;
        return this;
    }

    public CdmObservableAssetFroFloatingRateIndexStyleEnum getIndexStyle() {
        return indexStyle;
    }

    public CdmObservableAssetFroFloatingRateIndexCalculationDefaults indexStyle(CdmObservableAssetFroFloatingRateIndexStyleEnum indexStyle) {
        this.indexStyle = indexStyle;
        return this;
    }

    public CdmObservableAssetFroFloatingRateIndexCalculationMethodEnum getMethod() {
        return method;
    }

    public CdmObservableAssetFroFloatingRateIndexCalculationDefaults method(CdmObservableAssetFroFloatingRateIndexCalculationMethodEnum method) {
        this.method = method;
        return this;
    }

}
