package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HecpRL1z9mNunKs8iVwbjdGKMKf8o5t6v16ewNozwrff")
public class CdmProductCollateralAgencyRatingCriteria {
    public static String blueId() {
        return "HecpRL1z9mNunKs8iVwbjdGKMKf8o5t6v16ewNozwrff";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/AgencyRatingCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/AgencyRatingCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralAgencyRatingCriteria.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCreditNotationBoundaryEnum boundary;

    private CdmObservableAssetCreditNotation creditNotation;

    private CdmObservableAssetCreditNotationMismatchResolutionEnum mismatchResolution;

    private CdmObservableAssetCreditRatingAgencyEnum referenceAgency;

    public CdmObservableAssetCreditNotationBoundaryEnum getBoundary() {
        return boundary;
    }

    public CdmProductCollateralAgencyRatingCriteria boundary(CdmObservableAssetCreditNotationBoundaryEnum boundary) {
        this.boundary = boundary;
        return this;
    }

    public CdmObservableAssetCreditNotation getCreditNotation() {
        return creditNotation;
    }

    public CdmProductCollateralAgencyRatingCriteria creditNotation(CdmObservableAssetCreditNotation creditNotation) {
        this.creditNotation = creditNotation;
        return this;
    }

    public CdmObservableAssetCreditNotationMismatchResolutionEnum getMismatchResolution() {
        return mismatchResolution;
    }

    public CdmProductCollateralAgencyRatingCriteria mismatchResolution(CdmObservableAssetCreditNotationMismatchResolutionEnum mismatchResolution) {
        this.mismatchResolution = mismatchResolution;
        return this;
    }

    public CdmObservableAssetCreditRatingAgencyEnum getReferenceAgency() {
        return referenceAgency;
    }

    public CdmProductCollateralAgencyRatingCriteria referenceAgency(CdmObservableAssetCreditRatingAgencyEnum referenceAgency) {
        this.referenceAgency = referenceAgency;
        return this;
    }

}
