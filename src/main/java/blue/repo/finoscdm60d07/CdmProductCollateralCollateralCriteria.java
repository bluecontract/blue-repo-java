package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("4PomKHd5RQDs3gKG4uKXCAUX2cCJjzWQYPfeyFT6zyKv#3")
public class CdmProductCollateralCollateralCriteria {
    public static String blueId() {
        return "4PomKHd5RQDs3gKG4uKXCAUX2cCJjzWQYPfeyFT6zyKv#3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralCriteria.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: AllCriteria
    @JsonProperty("AllCriteria")
    private CdmProductCollateralAllCriteria allCriteria;

    // Original Blue property name: AnyCriteria
    @JsonProperty("AnyCriteria")
    private CdmProductCollateralAnyCriteria anyCriteria;

    // Original Blue property name: AssetAgencyRating
    @JsonProperty("AssetAgencyRating")
    private CdmProductCollateralAssetAgencyRating assetAgencyRating;

    // Original Blue property name: AssetCountryOfOrigin
    @JsonProperty("AssetCountryOfOrigin")
    private CdmProductCollateralAssetCountryOfOrigin assetCountryOfOrigin;

    // Original Blue property name: AssetMaturity
    @JsonProperty("AssetMaturity")
    private CdmProductCollateralAssetMaturity assetMaturity;

    // Original Blue property name: AssetType
    @JsonProperty("AssetType")
    private CdmBaseStaticdataAssetCommonAssetType assetType;

    // Original Blue property name: CollateralIssuerType
    @JsonProperty("CollateralIssuerType")
    private CdmBaseStaticdataAssetCommonCollateralIssuerType collateralIssuerType;

    // Original Blue property name: CollateralTaxonomy
    @JsonProperty("CollateralTaxonomy")
    private CdmBaseStaticdataAssetCommonCollateralTaxonomy collateralTaxonomy;

    // Original Blue property name: CounterpartyOwnIssuePermitted
    @JsonProperty("CounterpartyOwnIssuePermitted")
    private CdmProductCollateralCounterpartyOwnIssuePermitted counterpartyOwnIssuePermitted;

    // Original Blue property name: CurrencyCodeEnum
    @JsonProperty("CurrencyCodeEnum")
    private CdmBaseStaticdataAssetCommonCurrencyCodeEnum currencyCodeEnum;

    // Original Blue property name: DomesticCurrencyIssued
    @JsonProperty("DomesticCurrencyIssued")
    private CdmProductCollateralDomesticCurrencyIssued domesticCurrencyIssued;

    // Original Blue property name: Index
    @JsonProperty("Index")
    private CdmObservableAssetIndex index;

    // Original Blue property name: IssuerAgencyRating
    @JsonProperty("IssuerAgencyRating")
    private CdmProductCollateralIssuerAgencyRating issuerAgencyRating;

    // Original Blue property name: IssuerCountryOfOrigin
    @JsonProperty("IssuerCountryOfOrigin")
    private CdmProductCollateralIssuerCountryOfOrigin issuerCountryOfOrigin;

    // Original Blue property name: IssuerName
    @JsonProperty("IssuerName")
    private CdmProductCollateralIssuerName issuerName;

    // Original Blue property name: ListingExchange
    @JsonProperty("ListingExchange")
    private CdmProductCollateralListingExchange listingExchange;

    // Original Blue property name: ListingSector
    @JsonProperty("ListingSector")
    private CdmProductCollateralListingSector listingSector;

    // Original Blue property name: NegativeCriteria
    @JsonProperty("NegativeCriteria")
    private CdmProductCollateralNegativeCriteria negativeCriteria;

    // Original Blue property name: SovereignAgencyRating
    @JsonProperty("SovereignAgencyRating")
    private CdmProductCollateralSovereignAgencyRating sovereignAgencyRating;

    // Original Blue property name: SpecificAsset
    @JsonProperty("SpecificAsset")
    private CdmProductCollateralSpecificAsset specificAsset;

    public CdmProductCollateralAllCriteria getAllCriteria() {
        return allCriteria;
    }

    public CdmProductCollateralCollateralCriteria allCriteria(CdmProductCollateralAllCriteria allCriteria) {
        this.allCriteria = allCriteria;
        return this;
    }

    public CdmProductCollateralAnyCriteria getAnyCriteria() {
        return anyCriteria;
    }

    public CdmProductCollateralCollateralCriteria anyCriteria(CdmProductCollateralAnyCriteria anyCriteria) {
        this.anyCriteria = anyCriteria;
        return this;
    }

    public CdmProductCollateralAssetAgencyRating getAssetAgencyRating() {
        return assetAgencyRating;
    }

    public CdmProductCollateralCollateralCriteria assetAgencyRating(CdmProductCollateralAssetAgencyRating assetAgencyRating) {
        this.assetAgencyRating = assetAgencyRating;
        return this;
    }

    public CdmProductCollateralAssetCountryOfOrigin getAssetCountryOfOrigin() {
        return assetCountryOfOrigin;
    }

    public CdmProductCollateralCollateralCriteria assetCountryOfOrigin(CdmProductCollateralAssetCountryOfOrigin assetCountryOfOrigin) {
        this.assetCountryOfOrigin = assetCountryOfOrigin;
        return this;
    }

    public CdmProductCollateralAssetMaturity getAssetMaturity() {
        return assetMaturity;
    }

    public CdmProductCollateralCollateralCriteria assetMaturity(CdmProductCollateralAssetMaturity assetMaturity) {
        this.assetMaturity = assetMaturity;
        return this;
    }

    public CdmBaseStaticdataAssetCommonAssetType getAssetType() {
        return assetType;
    }

    public CdmProductCollateralCollateralCriteria assetType(CdmBaseStaticdataAssetCommonAssetType assetType) {
        this.assetType = assetType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCollateralIssuerType getCollateralIssuerType() {
        return collateralIssuerType;
    }

    public CdmProductCollateralCollateralCriteria collateralIssuerType(CdmBaseStaticdataAssetCommonCollateralIssuerType collateralIssuerType) {
        this.collateralIssuerType = collateralIssuerType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCollateralTaxonomy getCollateralTaxonomy() {
        return collateralTaxonomy;
    }

    public CdmProductCollateralCollateralCriteria collateralTaxonomy(CdmBaseStaticdataAssetCommonCollateralTaxonomy collateralTaxonomy) {
        this.collateralTaxonomy = collateralTaxonomy;
        return this;
    }

    public CdmProductCollateralCounterpartyOwnIssuePermitted getCounterpartyOwnIssuePermitted() {
        return counterpartyOwnIssuePermitted;
    }

    public CdmProductCollateralCollateralCriteria counterpartyOwnIssuePermitted(CdmProductCollateralCounterpartyOwnIssuePermitted counterpartyOwnIssuePermitted) {
        this.counterpartyOwnIssuePermitted = counterpartyOwnIssuePermitted;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCurrencyCodeEnum getCurrencyCodeEnum() {
        return currencyCodeEnum;
    }

    public CdmProductCollateralCollateralCriteria currencyCodeEnum(CdmBaseStaticdataAssetCommonCurrencyCodeEnum currencyCodeEnum) {
        this.currencyCodeEnum = currencyCodeEnum;
        return this;
    }

    public CdmProductCollateralDomesticCurrencyIssued getDomesticCurrencyIssued() {
        return domesticCurrencyIssued;
    }

    public CdmProductCollateralCollateralCriteria domesticCurrencyIssued(CdmProductCollateralDomesticCurrencyIssued domesticCurrencyIssued) {
        this.domesticCurrencyIssued = domesticCurrencyIssued;
        return this;
    }

    public CdmObservableAssetIndex getIndex() {
        return index;
    }

    public CdmProductCollateralCollateralCriteria index(CdmObservableAssetIndex index) {
        this.index = index;
        return this;
    }

    public CdmProductCollateralIssuerAgencyRating getIssuerAgencyRating() {
        return issuerAgencyRating;
    }

    public CdmProductCollateralCollateralCriteria issuerAgencyRating(CdmProductCollateralIssuerAgencyRating issuerAgencyRating) {
        this.issuerAgencyRating = issuerAgencyRating;
        return this;
    }

    public CdmProductCollateralIssuerCountryOfOrigin getIssuerCountryOfOrigin() {
        return issuerCountryOfOrigin;
    }

    public CdmProductCollateralCollateralCriteria issuerCountryOfOrigin(CdmProductCollateralIssuerCountryOfOrigin issuerCountryOfOrigin) {
        this.issuerCountryOfOrigin = issuerCountryOfOrigin;
        return this;
    }

    public CdmProductCollateralIssuerName getIssuerName() {
        return issuerName;
    }

    public CdmProductCollateralCollateralCriteria issuerName(CdmProductCollateralIssuerName issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    public CdmProductCollateralListingExchange getListingExchange() {
        return listingExchange;
    }

    public CdmProductCollateralCollateralCriteria listingExchange(CdmProductCollateralListingExchange listingExchange) {
        this.listingExchange = listingExchange;
        return this;
    }

    public CdmProductCollateralListingSector getListingSector() {
        return listingSector;
    }

    public CdmProductCollateralCollateralCriteria listingSector(CdmProductCollateralListingSector listingSector) {
        this.listingSector = listingSector;
        return this;
    }

    public CdmProductCollateralNegativeCriteria getNegativeCriteria() {
        return negativeCriteria;
    }

    public CdmProductCollateralCollateralCriteria negativeCriteria(CdmProductCollateralNegativeCriteria negativeCriteria) {
        this.negativeCriteria = negativeCriteria;
        return this;
    }

    public CdmProductCollateralSovereignAgencyRating getSovereignAgencyRating() {
        return sovereignAgencyRating;
    }

    public CdmProductCollateralCollateralCriteria sovereignAgencyRating(CdmProductCollateralSovereignAgencyRating sovereignAgencyRating) {
        this.sovereignAgencyRating = sovereignAgencyRating;
        return this;
    }

    public CdmProductCollateralSpecificAsset getSpecificAsset() {
        return specificAsset;
    }

    public CdmProductCollateralCollateralCriteria specificAsset(CdmProductCollateralSpecificAsset specificAsset) {
        this.specificAsset = specificAsset;
        return this;
    }

}
