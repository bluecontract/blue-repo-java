package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5hvhfAv4hXhx7DYmEhYayJU1zL68YJA2HYbfymZinomw")
public class MeasureSchedule {
    public static String blueId() {
        return "5hvhfAv4hXhx7DYmEhYayJU1zL68YJA2HYbfymZinomw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MeasureSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MeasureSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MeasureSchedule.json";
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

    private UnitType unit;

    private Double val;

    public String getNamespace() {
        return namespace;
    }

    public MeasureSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public MeasureSchedule datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public UnitType getUnit() {
        return unit;
    }

    public MeasureSchedule unit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public MeasureSchedule val(Double val) {
        this.val = val;
        return this;
    }

}
