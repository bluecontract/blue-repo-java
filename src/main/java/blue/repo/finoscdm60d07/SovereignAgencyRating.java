package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5XQnrNKnytQrpJtSxJFTWK64VkpythevRL8DawdWRbzb")
public class SovereignAgencyRating {
    public static String blueId() {
        return "5XQnrNKnytQrpJtSxJFTWK64VkpythevRL8DawdWRbzb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SovereignAgencyRating";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SovereignAgencyRating";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SovereignAgencyRating.json";
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

    private AgencyRatingCriteria sovereignAgencyRating;

    public String getNamespace() {
        return namespace;
    }

    public SovereignAgencyRating namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AgencyRatingCriteria getSovereignAgencyRating() {
        return sovereignAgencyRating;
    }

    public SovereignAgencyRating sovereignAgencyRating(AgencyRatingCriteria sovereignAgencyRating) {
        this.sovereignAgencyRating = sovereignAgencyRating;
        return this;
    }

}
