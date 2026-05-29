package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5h378nRjo3jm7Ls8JJ42cmd4XHzLYLu8A6TzQsDDM4f3")
public class CdmProductAssetBoundedCorrelation {
    public static String blueId() {
        return "5h378nRjo3jm7Ls8JJ42cmd4XHzLYLu8A6TzQsDDM4f3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/BoundedCorrelation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/BoundedCorrelation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetBoundedCorrelation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double maximumBoundaryPercent;

    private Double minimumBoundaryPercent;

    public Double getMaximumBoundaryPercent() {
        return maximumBoundaryPercent;
    }

    public CdmProductAssetBoundedCorrelation maximumBoundaryPercent(Double maximumBoundaryPercent) {
        this.maximumBoundaryPercent = maximumBoundaryPercent;
        return this;
    }

    public Double getMinimumBoundaryPercent() {
        return minimumBoundaryPercent;
    }

    public CdmProductAssetBoundedCorrelation minimumBoundaryPercent(Double minimumBoundaryPercent) {
        this.minimumBoundaryPercent = minimumBoundaryPercent;
        return this;
    }

}
