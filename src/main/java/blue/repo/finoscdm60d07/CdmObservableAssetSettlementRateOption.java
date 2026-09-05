package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EfCsYsvnMHc3JEPpPReg1M2TvnnikBxf49PWwxmvkMZS")
public class CdmObservableAssetSettlementRateOption {
    public static String blueId() {
        return "EfCsYsvnMHc3JEPpPReg1M2TvnnikBxf49PWwxmvkMZS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/SettlementRateOption";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/SettlementRateOption";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetSettlementRateOption.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetPriceSourceDisruption priceSourceDisruption;

    private CdmObservableAssetFieldWithMetaSettlementRateOptionEnum settlementRateOption;

    public CdmObservableAssetPriceSourceDisruption getPriceSourceDisruption() {
        return priceSourceDisruption;
    }

    public CdmObservableAssetSettlementRateOption priceSourceDisruption(CdmObservableAssetPriceSourceDisruption priceSourceDisruption) {
        this.priceSourceDisruption = priceSourceDisruption;
        return this;
    }

    public CdmObservableAssetFieldWithMetaSettlementRateOptionEnum getSettlementRateOption() {
        return settlementRateOption;
    }

    public CdmObservableAssetSettlementRateOption settlementRateOption(CdmObservableAssetFieldWithMetaSettlementRateOptionEnum settlementRateOption) {
        this.settlementRateOption = settlementRateOption;
        return this;
    }

}
