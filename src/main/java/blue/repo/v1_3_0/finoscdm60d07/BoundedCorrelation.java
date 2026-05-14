package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2WE7x69cd95YZWAjrF8AmjSYeGdUPjPQK9Cf8JXUD8b8")
public class BoundedCorrelation {
    public static String blueId() {
        return "2WE7x69cd95YZWAjrF8AmjSYeGdUPjPQK9Cf8JXUD8b8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BoundedCorrelation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BoundedCorrelation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BoundedCorrelation.json";
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

    private Double maximumBoundaryPercent;

    private Double minimumBoundaryPercent;

    public String getNamespace() {
        return namespace;
    }

    public BoundedCorrelation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getMaximumBoundaryPercent() {
        return maximumBoundaryPercent;
    }

    public BoundedCorrelation maximumBoundaryPercent(Double maximumBoundaryPercent) {
        this.maximumBoundaryPercent = maximumBoundaryPercent;
        return this;
    }

    public Double getMinimumBoundaryPercent() {
        return minimumBoundaryPercent;
    }

    public BoundedCorrelation minimumBoundaryPercent(Double minimumBoundaryPercent) {
        this.minimumBoundaryPercent = minimumBoundaryPercent;
        return this;
    }

}
