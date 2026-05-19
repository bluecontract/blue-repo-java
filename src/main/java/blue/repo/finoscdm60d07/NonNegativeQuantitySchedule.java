package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AryjbeXRD3NJGePy1YkXGQfEBmBk9CXhQ9DueVyyy3P")
public class NonNegativeQuantitySchedule {
    public static String blueId() {
        return "AryjbeXRD3NJGePy1YkXGQfEBmBk9CXhQ9DueVyyy3P";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NonNegativeQuantitySchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NonNegativeQuantitySchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/NonNegativeQuantitySchedule.json";
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

    private List<DatedValue> datedValue;

    private Frequency frequency;

    private Measure multiplier;

    private UnitType unit;

    private Double val;

    public String getNamespace() {
        return namespace;
    }

    public NonNegativeQuantitySchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public NonNegativeQuantitySchedule datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public NonNegativeQuantitySchedule frequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Measure getMultiplier() {
        return multiplier;
    }

    public NonNegativeQuantitySchedule multiplier(Measure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public NonNegativeQuantitySchedule unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public NonNegativeQuantitySchedule val(Double val) {
        this.val = val;
        return this;
    }

}
