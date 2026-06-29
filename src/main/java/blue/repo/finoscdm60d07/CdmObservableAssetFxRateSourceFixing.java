package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("59cfrRQLPJncH1tkA8gcjLTVBbBRu2ex63nqTvfmmwoz")
public class CdmObservableAssetFxRateSourceFixing {
    public static String blueId() {
        return "59cfrRQLPJncH1tkA8gcjLTVBbBRu2ex63nqTvfmmwoz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FxRateSourceFixing";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FxRateSourceFixing";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFxRateSourceFixing.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableDate fixingDate;

    private CdmObservableAssetFxSettlementRateSource settlementRateSource;

    public CdmBaseDatetimeAdjustableDate getFixingDate() {
        return fixingDate;
    }

    public CdmObservableAssetFxRateSourceFixing fixingDate(CdmBaseDatetimeAdjustableDate fixingDate) {
        this.fixingDate = fixingDate;
        return this;
    }

    public CdmObservableAssetFxSettlementRateSource getSettlementRateSource() {
        return settlementRateSource;
    }

    public CdmObservableAssetFxRateSourceFixing settlementRateSource(CdmObservableAssetFxSettlementRateSource settlementRateSource) {
        this.settlementRateSource = settlementRateSource;
        return this;
    }

}
