package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GD824tA3PqWzcvtnUoNDTXnruFzN3M21cdYhRZbWGw71")
public class InterestRateCurve {
    public static String blueId() {
        return "GD824tA3PqWzcvtnUoNDTXnruFzN3M21cdYhRZbWGw71";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InterestRateCurve";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InterestRateCurve";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InterestRateCurve.json";
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

    private FieldWithMetaFloatingRateIndexEnum floatingRateIndex;

    private Period tenor;

    public String getNamespace() {
        return namespace;
    }

    public InterestRateCurve namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public InterestRateCurve floatingRateIndex(FieldWithMetaFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public Period getTenor() {
        return tenor;
    }

    public InterestRateCurve tenor(Period tenor) {
        this.tenor = tenor;
        return this;
    }

}
