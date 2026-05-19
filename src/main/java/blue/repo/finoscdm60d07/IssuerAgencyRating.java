package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DwQvpR1xWexp6eMgmbshNq6zfKwpgZ2PfzniQLJcRQYi")
public class IssuerAgencyRating {
    public static String blueId() {
        return "DwQvpR1xWexp6eMgmbshNq6zfKwpgZ2PfzniQLJcRQYi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IssuerAgencyRating";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IssuerAgencyRating";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/IssuerAgencyRating.json";
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

    private AgencyRatingCriteria issuerAgencyRating;

    public String getNamespace() {
        return namespace;
    }

    public IssuerAgencyRating namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AgencyRatingCriteria getIssuerAgencyRating() {
        return issuerAgencyRating;
    }

    public IssuerAgencyRating issuerAgencyRating(AgencyRatingCriteria issuerAgencyRating) {
        this.issuerAgencyRating = issuerAgencyRating;
        return this;
    }

}
