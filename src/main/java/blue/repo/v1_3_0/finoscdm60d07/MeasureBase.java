package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HzM7MBrHYcH6YLZfRtWXpkvuDkGgNs7CQFRdGczV9S97")
public class MeasureBase {
    public static String blueId() {
        return "HzM7MBrHYcH6YLZfRtWXpkvuDkGgNs7CQFRdGczV9S97";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MeasureBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MeasureBase";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MeasureBase.json";
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

    private UnitType unit;

    private Double val;

    public String getNamespace() {
        return namespace;
    }

    public MeasureBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public MeasureBase unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public MeasureBase val(Double val) {
        this.val = val;
        return this;
    }

}
