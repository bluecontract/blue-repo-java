package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3uCr8zw3jqoaK7CbPzdZPXZJodRNwszY8DMyc81j6RZ5")
public class AgencyRatingCriteria {
    public static String blueId() {
        return "3uCr8zw3jqoaK7CbPzdZPXZJodRNwszY8DMyc81j6RZ5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AgencyRatingCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AgencyRatingCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AgencyRatingCriteria.json";
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

    private CreditNotationBoundaryEnum boundary;

    private CreditNotation creditNotation;

    private CreditNotationMismatchResolutionEnum mismatchResolution;

    private CreditRatingAgencyEnum referenceAgency;

    public String getNamespace() {
        return namespace;
    }

    public AgencyRatingCriteria namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CreditNotationBoundaryEnum getBoundary() {
        return boundary;
    }

    public AgencyRatingCriteria boundary(CreditNotationBoundaryEnum boundary) {
        this.boundary = boundary;
        return this;
    }

    public CreditNotation getCreditNotation() {
        return creditNotation;
    }

    public AgencyRatingCriteria creditNotation(CreditNotation creditNotation) {
        this.creditNotation = creditNotation;
        return this;
    }

    public CreditNotationMismatchResolutionEnum getMismatchResolution() {
        return mismatchResolution;
    }

    public AgencyRatingCriteria mismatchResolution(CreditNotationMismatchResolutionEnum mismatchResolution) {
        this.mismatchResolution = mismatchResolution;
        return this;
    }

    public CreditRatingAgencyEnum getReferenceAgency() {
        return referenceAgency;
    }

    public AgencyRatingCriteria referenceAgency(CreditRatingAgencyEnum referenceAgency) {
        this.referenceAgency = referenceAgency;
        return this;
    }

}
