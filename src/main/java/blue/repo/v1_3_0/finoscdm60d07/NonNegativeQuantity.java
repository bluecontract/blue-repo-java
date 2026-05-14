package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("LzqjcnUmDthjDZkgp95CFhWjxPvLYNv2nrFan3MHY99")
public class NonNegativeQuantity {
    public static String blueId() {
        return "LzqjcnUmDthjDZkgp95CFhWjxPvLYNv2nrFan3MHY99";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NonNegativeQuantity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NonNegativeQuantity";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NonNegativeQuantity.json";
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

    public NonNegativeQuantity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public NonNegativeQuantity datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public NonNegativeQuantity frequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Measure getMultiplier() {
        return multiplier;
    }

    public NonNegativeQuantity multiplier(Measure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public NonNegativeQuantity unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public NonNegativeQuantity val(Double val) {
        this.val = val;
        return this;
    }

}
