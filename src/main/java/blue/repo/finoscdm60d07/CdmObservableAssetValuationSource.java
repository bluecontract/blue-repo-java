package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6uFGEWXtnFqBKkRLuk9DZeobUjv616SKjCv5xGzMyAeX")
public class CdmObservableAssetValuationSource {
    public static String blueId() {
        return "6uFGEWXtnFqBKkRLuk9DZeobUjv616SKjCv5xGzMyAeX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/ValuationSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/ValuationSource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetValuationSource.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyAncillaryEntity dealerOrCCP;

    private CdmObservableAssetFxSpotRateSource informationSource;

    private CdmObservableAssetMetafieldsReferenceWithMetaQuotedCurrencyPair quotedCurrencyPair;

    private CdmBaseStaticdataPartyReferenceBanks referenceBanks;

    private CdmObservableAssetSettlementRateOption settlementRateOption;

    public CdmBaseStaticdataPartyAncillaryEntity getDealerOrCCP() {
        return dealerOrCCP;
    }

    public CdmObservableAssetValuationSource dealerOrCCP(CdmBaseStaticdataPartyAncillaryEntity dealerOrCCP) {
        this.dealerOrCCP = dealerOrCCP;
        return this;
    }

    public CdmObservableAssetFxSpotRateSource getInformationSource() {
        return informationSource;
    }

    public CdmObservableAssetValuationSource informationSource(CdmObservableAssetFxSpotRateSource informationSource) {
        this.informationSource = informationSource;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaQuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    public CdmObservableAssetValuationSource quotedCurrencyPair(CdmObservableAssetMetafieldsReferenceWithMetaQuotedCurrencyPair quotedCurrencyPair) {
        this.quotedCurrencyPair = quotedCurrencyPair;
        return this;
    }

    public CdmBaseStaticdataPartyReferenceBanks getReferenceBanks() {
        return referenceBanks;
    }

    public CdmObservableAssetValuationSource referenceBanks(CdmBaseStaticdataPartyReferenceBanks referenceBanks) {
        this.referenceBanks = referenceBanks;
        return this;
    }

    public CdmObservableAssetSettlementRateOption getSettlementRateOption() {
        return settlementRateOption;
    }

    public CdmObservableAssetValuationSource settlementRateOption(CdmObservableAssetSettlementRateOption settlementRateOption) {
        this.settlementRateOption = settlementRateOption;
        return this;
    }

}
