package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8LAQKNSHCMRFJgRQ76HA4Qq3hKZxHfc2SkEF2b8u7ssp")
public class CdmObservableAssetFroFloatingRateIndexIdentification {
    public static String blueId() {
        return "8LAQKNSHCMRFJgRQ76HA4Qq3hKZxHfc2SkEF2b8u7ssp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/fro/FloatingRateIndexIdentification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/fro/FloatingRateIndexIdentification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetfroFloatingRateIndexIdentification.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonISOCurrencyCodeEnum currency;

    private CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum floatingRateIndex;

    private String froType;

    public CdmBaseStaticdataAssetCommonISOCurrencyCodeEnum getCurrency() {
        return currency;
    }

    public CdmObservableAssetFroFloatingRateIndexIdentification currency(CdmBaseStaticdataAssetCommonISOCurrencyCodeEnum currency) {
        this.currency = currency;
        return this;
    }

    public CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public CdmObservableAssetFroFloatingRateIndexIdentification floatingRateIndex(CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public String getFroType() {
        return froType;
    }

    public CdmObservableAssetFroFloatingRateIndexIdentification froType(String froType) {
        this.froType = froType;
        return this;
    }

}
