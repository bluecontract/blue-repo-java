package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6iJiAU97rXg132hTVQbjh3FsXHzHf2BPT2Yq5MmjVgVW")
public class CdmObservableAssetFxRate {
    public static String blueId() {
        return "6iJiAU97rXg132hTVQbjh3FsXHzHf2BPT2Yq5MmjVgVW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FxRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FxRate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFxRate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetQuotedCurrencyPair quotedCurrencyPair;

    private Double rate;

    public CdmObservableAssetQuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    public CdmObservableAssetFxRate quotedCurrencyPair(CdmObservableAssetQuotedCurrencyPair quotedCurrencyPair) {
        this.quotedCurrencyPair = quotedCurrencyPair;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public CdmObservableAssetFxRate rate(Double rate) {
        this.rate = rate;
        return this;
    }

}
