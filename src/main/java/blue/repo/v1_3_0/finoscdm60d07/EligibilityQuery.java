package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5aiVGtjgYsUkhvTFqiHbWX4Hu1WSoEkYAXAZNdi7XPTk")
public class EligibilityQuery {
    public static String blueId() {
        return "5aiVGtjgYsUkhvTFqiHbWX4Hu1WSoEkYAXAZNdi7XPTk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EligibilityQuery";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EligibilityQuery";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EligibilityQuery.json";
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

    private AgencyRatingCriteria agencyRating;

    private ISOCountryCodeEnum assetCountryOfOrigin;

    private AssetType collateralAssetType;

    private CurrencyCodeEnum denominatedCurrency;

    private LegalEntity issuerName;

    private CollateralIssuerType issuerType;

    private Double maturity;

    public String getNamespace() {
        return namespace;
    }

    public EligibilityQuery namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AgencyRatingCriteria getAgencyRating() {
        return agencyRating;
    }

    public EligibilityQuery agencyRating(AgencyRatingCriteria agencyRating) {
        this.agencyRating = agencyRating;
        return this;
    }

    public ISOCountryCodeEnum getAssetCountryOfOrigin() {
        return assetCountryOfOrigin;
    }

    public EligibilityQuery assetCountryOfOrigin(ISOCountryCodeEnum assetCountryOfOrigin) {
        this.assetCountryOfOrigin = assetCountryOfOrigin;
        return this;
    }

    public AssetType getCollateralAssetType() {
        return collateralAssetType;
    }

    public EligibilityQuery collateralAssetType(AssetType collateralAssetType) {
        this.collateralAssetType = collateralAssetType;
        return this;
    }

    public CurrencyCodeEnum getDenominatedCurrency() {
        return denominatedCurrency;
    }

    public EligibilityQuery denominatedCurrency(CurrencyCodeEnum denominatedCurrency) {
        this.denominatedCurrency = denominatedCurrency;
        return this;
    }

    public LegalEntity getIssuerName() {
        return issuerName;
    }

    public EligibilityQuery issuerName(LegalEntity issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    public CollateralIssuerType getIssuerType() {
        return issuerType;
    }

    public EligibilityQuery issuerType(CollateralIssuerType issuerType) {
        this.issuerType = issuerType;
        return this;
    }

    public Double getMaturity() {
        return maturity;
    }

    public EligibilityQuery maturity(Double maturity) {
        this.maturity = maturity;
        return this;
    }

}
