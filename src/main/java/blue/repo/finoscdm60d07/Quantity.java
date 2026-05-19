package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Dbuu2Nbin93McrV6zGUuHz3TZRvVgykmW8cbo77KwMnu")
public class Quantity {
    public static String blueId() {
        return "Dbuu2Nbin93McrV6zGUuHz3TZRvVgykmW8cbo77KwMnu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Quantity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Quantity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Quantity.json";
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

    public Quantity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public Quantity datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public Quantity frequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Measure getMultiplier() {
        return multiplier;
    }

    public Quantity multiplier(Measure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public Quantity unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public Quantity val(Double val) {
        this.val = val;
        return this;
    }

}
