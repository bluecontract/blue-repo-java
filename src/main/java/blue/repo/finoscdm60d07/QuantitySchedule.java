package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Eb8JcpbEaW5rSY53tXcuGUpdwE2k8o9GGigcmQYPtN6K")
public class QuantitySchedule {
    public static String blueId() {
        return "Eb8JcpbEaW5rSY53tXcuGUpdwE2k8o9GGigcmQYPtN6K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuantitySchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuantitySchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/QuantitySchedule.json";
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

    public QuantitySchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public QuantitySchedule datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public QuantitySchedule frequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Measure getMultiplier() {
        return multiplier;
    }

    public QuantitySchedule multiplier(Measure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public QuantitySchedule unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public QuantitySchedule val(Double val) {
        this.val = val;
        return this;
    }

}
