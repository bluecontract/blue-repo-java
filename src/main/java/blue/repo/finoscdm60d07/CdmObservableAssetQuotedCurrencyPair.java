package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2oe1cUMpzftBYrJsFJVwFosKMH6vYgm3PaW7EA9HimWx")
public class CdmObservableAssetQuotedCurrencyPair {
    public static String blueId() {
        return "2oe1cUMpzftBYrJsFJVwFosKMH6vYgm3PaW7EA9HimWx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/QuotedCurrencyPair";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/QuotedCurrencyPair";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetQuotedCurrencyPair.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString currency1;

    private ComRosettaModelFieldWithMetaString currency2;

    private CdmObservableAssetQuoteBasisEnum quoteBasis;

    public ComRosettaModelFieldWithMetaString getCurrency1() {
        return currency1;
    }

    public CdmObservableAssetQuotedCurrencyPair currency1(ComRosettaModelFieldWithMetaString currency1) {
        this.currency1 = currency1;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency2() {
        return currency2;
    }

    public CdmObservableAssetQuotedCurrencyPair currency2(ComRosettaModelFieldWithMetaString currency2) {
        this.currency2 = currency2;
        return this;
    }

    public CdmObservableAssetQuoteBasisEnum getQuoteBasis() {
        return quoteBasis;
    }

    public CdmObservableAssetQuotedCurrencyPair quoteBasis(CdmObservableAssetQuoteBasisEnum quoteBasis) {
        this.quoteBasis = quoteBasis;
        return this;
    }

}
