package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EDXdL3DpFgyCKf4MCKrXEq4dqsDKfyuPLZgnJrezHkPZ")
public class AssetAgencyRating {
    public static String blueId() {
        return "EDXdL3DpFgyCKf4MCKrXEq4dqsDKfyuPLZgnJrezHkPZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetAgencyRating";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetAgencyRating";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssetAgencyRating.json";
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

    private AgencyRatingCriteria assetAgencyRating;

    public String getNamespace() {
        return namespace;
    }

    public AssetAgencyRating namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AgencyRatingCriteria getAssetAgencyRating() {
        return assetAgencyRating;
    }

    public AssetAgencyRating assetAgencyRating(AgencyRatingCriteria assetAgencyRating) {
        this.assetAgencyRating = assetAgencyRating;
        return this;
    }

}
