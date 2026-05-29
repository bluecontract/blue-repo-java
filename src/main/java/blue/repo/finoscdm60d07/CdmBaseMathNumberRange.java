package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G3Czczjun5KZ7JmhFBTYxJ8kS4DetVPC7VeQenWJ3iAL")
public class CdmBaseMathNumberRange {
    public static String blueId() {
        return "G3Czczjun5KZ7JmhFBTYxJ8kS4DetVPC7VeQenWJ3iAL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/NumberRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/NumberRange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathNumberRange.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathNumberBound lowerBound;

    private CdmBaseMathNumberBound upperBound;

    public CdmBaseMathNumberBound getLowerBound() {
        return lowerBound;
    }

    public CdmBaseMathNumberRange lowerBound(CdmBaseMathNumberBound lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public CdmBaseMathNumberBound getUpperBound() {
        return upperBound;
    }

    public CdmBaseMathNumberRange upperBound(CdmBaseMathNumberBound upperBound) {
        this.upperBound = upperBound;
        return this;
    }

}
