package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AbAR9hDgkuDPyGUVbpg2virbQmHfou9H5TMSUKaAAQo3")
public class Money {
    public static String blueId() {
        return "AbAR9hDgkuDPyGUVbpg2virbQmHfou9H5TMSUKaAAQo3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Money";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Money";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Money.json";
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

    public Money namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public Money datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public Money frequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Measure getMultiplier() {
        return multiplier;
    }

    public Money multiplier(Measure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public Money unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public Money val(Double val) {
        this.val = val;
        return this;
    }

}
