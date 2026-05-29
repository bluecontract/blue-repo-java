package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HqYEDY83D9T1JxsyawqbHP5nkLxrpHXqWUG8JuQZ9dpa")
public class CdmObservableAssetFxSettlementRateSource {
    public static String blueId() {
        return "HqYEDY83D9T1JxsyawqbHP5nkLxrpHXqWUG8JuQZ9dpa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FxSettlementRateSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FxSettlementRateSource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFxSettlementRateSource.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetFxInformationSource nonstandardSettlementRate;

    private ComRosettaModelFieldWithMetaString settlementRateOption;

    public CdmObservableAssetFxInformationSource getNonstandardSettlementRate() {
        return nonstandardSettlementRate;
    }

    public CdmObservableAssetFxSettlementRateSource nonstandardSettlementRate(CdmObservableAssetFxInformationSource nonstandardSettlementRate) {
        this.nonstandardSettlementRate = nonstandardSettlementRate;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getSettlementRateOption() {
        return settlementRateOption;
    }

    public CdmObservableAssetFxSettlementRateSource settlementRateOption(ComRosettaModelFieldWithMetaString settlementRateOption) {
        this.settlementRateOption = settlementRateOption;
        return this;
    }

}
