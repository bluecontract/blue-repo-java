package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("FtoRYZujAAg27pRyk4p13wRUXC9JWtWMkcjiAZULxMWP")
public class CdmObservableAssetIndex {
    public static String blueId() {
        return "FtoRYZujAAg27pRyk4p13wRUXC9JWtWMkcjiAZULxMWP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/Index";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/Index";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetIndex.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: CreditIndex
    @JsonProperty("CreditIndex")
    private CdmObservableAssetCreditIndex creditIndex;

    // Original Blue property name: EquityIndex
    @JsonProperty("EquityIndex")
    private CdmObservableAssetEquityIndex equityIndex;

    // Original Blue property name: ForeignExchangeRateIndex
    @JsonProperty("ForeignExchangeRateIndex")
    private CdmObservableAssetForeignExchangeRateIndex foreignExchangeRateIndex;

    // Original Blue property name: InterestRateIndex
    @JsonProperty("InterestRateIndex")
    private CdmObservableAssetFieldWithMetaInterestRateIndex interestRateIndex;

    // Original Blue property name: OtherIndex
    @JsonProperty("OtherIndex")
    private CdmObservableAssetOtherIndex otherIndex;

    public CdmObservableAssetCreditIndex getCreditIndex() {
        return creditIndex;
    }

    public CdmObservableAssetIndex creditIndex(CdmObservableAssetCreditIndex creditIndex) {
        this.creditIndex = creditIndex;
        return this;
    }

    public CdmObservableAssetEquityIndex getEquityIndex() {
        return equityIndex;
    }

    public CdmObservableAssetIndex equityIndex(CdmObservableAssetEquityIndex equityIndex) {
        this.equityIndex = equityIndex;
        return this;
    }

    public CdmObservableAssetForeignExchangeRateIndex getForeignExchangeRateIndex() {
        return foreignExchangeRateIndex;
    }

    public CdmObservableAssetIndex foreignExchangeRateIndex(CdmObservableAssetForeignExchangeRateIndex foreignExchangeRateIndex) {
        this.foreignExchangeRateIndex = foreignExchangeRateIndex;
        return this;
    }

    public CdmObservableAssetFieldWithMetaInterestRateIndex getInterestRateIndex() {
        return interestRateIndex;
    }

    public CdmObservableAssetIndex interestRateIndex(CdmObservableAssetFieldWithMetaInterestRateIndex interestRateIndex) {
        this.interestRateIndex = interestRateIndex;
        return this;
    }

    public CdmObservableAssetOtherIndex getOtherIndex() {
        return otherIndex;
    }

    public CdmObservableAssetIndex otherIndex(CdmObservableAssetOtherIndex otherIndex) {
        this.otherIndex = otherIndex;
        return this;
    }

}
