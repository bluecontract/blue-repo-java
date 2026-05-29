package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("74k6s48z9t7RguYoPUYhSB5pC7v3N78pRNnLJfHXHkmy")
public class CdmProductCollateralEligibilityQuery {
    public static String blueId() {
        return "74k6s48z9t7RguYoPUYhSB5pC7v3N78pRNnLJfHXHkmy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/EligibilityQuery";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/EligibilityQuery";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralEligibilityQuery.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralAgencyRatingCriteria agencyRating;

    private CdmBaseStaticdataAssetCommonISOCountryCodeEnum assetCountryOfOrigin;

    private CdmBaseStaticdataAssetCommonAssetType collateralAssetType;

    private CdmBaseStaticdataAssetCommonCurrencyCodeEnum denominatedCurrency;

    private CdmBaseStaticdataPartyLegalEntity issuerName;

    private CdmBaseStaticdataAssetCommonCollateralIssuerType issuerType;

    private Double maturity;

    public CdmProductCollateralAgencyRatingCriteria getAgencyRating() {
        return agencyRating;
    }

    public CdmProductCollateralEligibilityQuery agencyRating(CdmProductCollateralAgencyRatingCriteria agencyRating) {
        this.agencyRating = agencyRating;
        return this;
    }

    public CdmBaseStaticdataAssetCommonISOCountryCodeEnum getAssetCountryOfOrigin() {
        return assetCountryOfOrigin;
    }

    public CdmProductCollateralEligibilityQuery assetCountryOfOrigin(CdmBaseStaticdataAssetCommonISOCountryCodeEnum assetCountryOfOrigin) {
        this.assetCountryOfOrigin = assetCountryOfOrigin;
        return this;
    }

    public CdmBaseStaticdataAssetCommonAssetType getCollateralAssetType() {
        return collateralAssetType;
    }

    public CdmProductCollateralEligibilityQuery collateralAssetType(CdmBaseStaticdataAssetCommonAssetType collateralAssetType) {
        this.collateralAssetType = collateralAssetType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCurrencyCodeEnum getDenominatedCurrency() {
        return denominatedCurrency;
    }

    public CdmProductCollateralEligibilityQuery denominatedCurrency(CdmBaseStaticdataAssetCommonCurrencyCodeEnum denominatedCurrency) {
        this.denominatedCurrency = denominatedCurrency;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getIssuerName() {
        return issuerName;
    }

    public CdmProductCollateralEligibilityQuery issuerName(CdmBaseStaticdataPartyLegalEntity issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCollateralIssuerType getIssuerType() {
        return issuerType;
    }

    public CdmProductCollateralEligibilityQuery issuerType(CdmBaseStaticdataAssetCommonCollateralIssuerType issuerType) {
        this.issuerType = issuerType;
        return this;
    }

    public Double getMaturity() {
        return maturity;
    }

    public CdmProductCollateralEligibilityQuery maturity(Double maturity) {
        this.maturity = maturity;
        return this;
    }

}
