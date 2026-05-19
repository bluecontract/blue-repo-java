package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("13dnfCzgrcyiuxjSxbhPqXTzsE4QnU66Ax7N6gZ5o4PQ#1")
public class CollateralCriteria {
    public static String blueId() {
        return "13dnfCzgrcyiuxjSxbhPqXTzsE4QnU66Ax7N6gZ5o4PQ#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralCriteria.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    // Original Blue property name: AllCriteria
    @JsonProperty("AllCriteria")
    private AllCriteria allCriteria;

    // Original Blue property name: AnyCriteria
    @JsonProperty("AnyCriteria")
    private AnyCriteria anyCriteria;

    // Original Blue property name: AssetAgencyRating
    @JsonProperty("AssetAgencyRating")
    private AssetAgencyRating assetAgencyRating;

    // Original Blue property name: AssetCountryOfOrigin
    @JsonProperty("AssetCountryOfOrigin")
    private AssetCountryOfOrigin assetCountryOfOrigin;

    // Original Blue property name: AssetMaturity
    @JsonProperty("AssetMaturity")
    private AssetMaturity assetMaturity;

    // Original Blue property name: AssetType
    @JsonProperty("AssetType")
    private AssetType assetType;

    // Original Blue property name: CollateralIssuerType
    @JsonProperty("CollateralIssuerType")
    private CollateralIssuerType collateralIssuerType;

    // Original Blue property name: CollateralTaxonomy
    @JsonProperty("CollateralTaxonomy")
    private CollateralTaxonomy collateralTaxonomy;

    // Original Blue property name: CounterpartyOwnIssuePermitted
    @JsonProperty("CounterpartyOwnIssuePermitted")
    private CounterpartyOwnIssuePermitted counterpartyOwnIssuePermitted;

    // Original Blue property name: CurrencyCodeEnum
    @JsonProperty("CurrencyCodeEnum")
    private CurrencyCodeEnum currencyCodeEnum;

    // Original Blue property name: DomesticCurrencyIssued
    @JsonProperty("DomesticCurrencyIssued")
    private DomesticCurrencyIssued domesticCurrencyIssued;

    // Original Blue property name: Index
    @JsonProperty("Index")
    private Index index;

    // Original Blue property name: IssuerAgencyRating
    @JsonProperty("IssuerAgencyRating")
    private IssuerAgencyRating issuerAgencyRating;

    // Original Blue property name: IssuerCountryOfOrigin
    @JsonProperty("IssuerCountryOfOrigin")
    private IssuerCountryOfOrigin issuerCountryOfOrigin;

    // Original Blue property name: IssuerName
    @JsonProperty("IssuerName")
    private IssuerName issuerName;

    // Original Blue property name: ListingExchange
    @JsonProperty("ListingExchange")
    private ListingExchange listingExchange;

    // Original Blue property name: ListingSector
    @JsonProperty("ListingSector")
    private ListingSector listingSector;

    // Original Blue property name: NegativeCriteria
    @JsonProperty("NegativeCriteria")
    private NegativeCriteria negativeCriteria;

    // Original Blue property name: SovereignAgencyRating
    @JsonProperty("SovereignAgencyRating")
    private SovereignAgencyRating sovereignAgencyRating;

    // Original Blue property name: SpecificAsset
    @JsonProperty("SpecificAsset")
    private SpecificAsset specificAsset;

    public String getNamespace() {
        return namespace;
    }

    public CollateralCriteria namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AllCriteria getAllCriteria() {
        return allCriteria;
    }

    public CollateralCriteria allCriteria(AllCriteria allCriteria) {
        this.allCriteria = allCriteria;
        return this;
    }

    public AnyCriteria getAnyCriteria() {
        return anyCriteria;
    }

    public CollateralCriteria anyCriteria(AnyCriteria anyCriteria) {
        this.anyCriteria = anyCriteria;
        return this;
    }

    public AssetAgencyRating getAssetAgencyRating() {
        return assetAgencyRating;
    }

    public CollateralCriteria assetAgencyRating(AssetAgencyRating assetAgencyRating) {
        this.assetAgencyRating = assetAgencyRating;
        return this;
    }

    public AssetCountryOfOrigin getAssetCountryOfOrigin() {
        return assetCountryOfOrigin;
    }

    public CollateralCriteria assetCountryOfOrigin(AssetCountryOfOrigin assetCountryOfOrigin) {
        this.assetCountryOfOrigin = assetCountryOfOrigin;
        return this;
    }

    public AssetMaturity getAssetMaturity() {
        return assetMaturity;
    }

    public CollateralCriteria assetMaturity(AssetMaturity assetMaturity) {
        this.assetMaturity = assetMaturity;
        return this;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public CollateralCriteria assetType(AssetType assetType) {
        this.assetType = assetType;
        return this;
    }

    public CollateralIssuerType getCollateralIssuerType() {
        return collateralIssuerType;
    }

    public CollateralCriteria collateralIssuerType(CollateralIssuerType collateralIssuerType) {
        this.collateralIssuerType = collateralIssuerType;
        return this;
    }

    public CollateralTaxonomy getCollateralTaxonomy() {
        return collateralTaxonomy;
    }

    public CollateralCriteria collateralTaxonomy(CollateralTaxonomy collateralTaxonomy) {
        this.collateralTaxonomy = collateralTaxonomy;
        return this;
    }

    public CounterpartyOwnIssuePermitted getCounterpartyOwnIssuePermitted() {
        return counterpartyOwnIssuePermitted;
    }

    public CollateralCriteria counterpartyOwnIssuePermitted(CounterpartyOwnIssuePermitted counterpartyOwnIssuePermitted) {
        this.counterpartyOwnIssuePermitted = counterpartyOwnIssuePermitted;
        return this;
    }

    public CurrencyCodeEnum getCurrencyCodeEnum() {
        return currencyCodeEnum;
    }

    public CollateralCriteria currencyCodeEnum(CurrencyCodeEnum currencyCodeEnum) {
        this.currencyCodeEnum = currencyCodeEnum;
        return this;
    }

    public DomesticCurrencyIssued getDomesticCurrencyIssued() {
        return domesticCurrencyIssued;
    }

    public CollateralCriteria domesticCurrencyIssued(DomesticCurrencyIssued domesticCurrencyIssued) {
        this.domesticCurrencyIssued = domesticCurrencyIssued;
        return this;
    }

    public Index getIndex() {
        return index;
    }

    public CollateralCriteria index(Index index) {
        this.index = index;
        return this;
    }

    public IssuerAgencyRating getIssuerAgencyRating() {
        return issuerAgencyRating;
    }

    public CollateralCriteria issuerAgencyRating(IssuerAgencyRating issuerAgencyRating) {
        this.issuerAgencyRating = issuerAgencyRating;
        return this;
    }

    public IssuerCountryOfOrigin getIssuerCountryOfOrigin() {
        return issuerCountryOfOrigin;
    }

    public CollateralCriteria issuerCountryOfOrigin(IssuerCountryOfOrigin issuerCountryOfOrigin) {
        this.issuerCountryOfOrigin = issuerCountryOfOrigin;
        return this;
    }

    public IssuerName getIssuerName() {
        return issuerName;
    }

    public CollateralCriteria issuerName(IssuerName issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    public ListingExchange getListingExchange() {
        return listingExchange;
    }

    public CollateralCriteria listingExchange(ListingExchange listingExchange) {
        this.listingExchange = listingExchange;
        return this;
    }

    public ListingSector getListingSector() {
        return listingSector;
    }

    public CollateralCriteria listingSector(ListingSector listingSector) {
        this.listingSector = listingSector;
        return this;
    }

    public NegativeCriteria getNegativeCriteria() {
        return negativeCriteria;
    }

    public CollateralCriteria negativeCriteria(NegativeCriteria negativeCriteria) {
        this.negativeCriteria = negativeCriteria;
        return this;
    }

    public SovereignAgencyRating getSovereignAgencyRating() {
        return sovereignAgencyRating;
    }

    public CollateralCriteria sovereignAgencyRating(SovereignAgencyRating sovereignAgencyRating) {
        this.sovereignAgencyRating = sovereignAgencyRating;
        return this;
    }

    public SpecificAsset getSpecificAsset() {
        return specificAsset;
    }

    public CollateralCriteria specificAsset(SpecificAsset specificAsset) {
        this.specificAsset = specificAsset;
        return this;
    }

}
