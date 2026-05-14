package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7eQNHwy255BHnoBffoqVyHQuu4yDiZuRdQqRFnz6B2nc")
public class NumberRange {
    public static String blueId() {
        return "7eQNHwy255BHnoBffoqVyHQuu4yDiZuRdQqRFnz6B2nc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NumberRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NumberRange";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NumberRange.json";
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

    private NumberBound lowerBound;

    private NumberBound upperBound;

    public String getNamespace() {
        return namespace;
    }

    public NumberRange namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public NumberBound getLowerBound() {
        return lowerBound;
    }

    public NumberRange lowerBound(NumberBound lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public NumberBound getUpperBound() {
        return upperBound;
    }

    public NumberRange upperBound(NumberBound upperBound) {
        this.upperBound = upperBound;
        return this;
    }

}
