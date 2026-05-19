package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AoGAA1wPdprfSpoze2bnoXcRAuqSVxBDSVswBRtxLaSu")
public class Measure {
    public static String blueId() {
        return "AoGAA1wPdprfSpoze2bnoXcRAuqSVxBDSVswBRtxLaSu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Measure";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Measure";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Measure.json";
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

    public Measure namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public Measure unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public Measure val(Double val) {
        this.val = val;
        return this;
    }

}
