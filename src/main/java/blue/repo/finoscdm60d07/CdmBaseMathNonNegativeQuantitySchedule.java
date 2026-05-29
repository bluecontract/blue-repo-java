package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("99HeX4mmBPgtY5xR8dyQssmfF2XWEAzbr68qYTdA7DrF")
public class CdmBaseMathNonNegativeQuantitySchedule {
    public static String blueId() {
        return "99HeX4mmBPgtY5xR8dyQssmfF2XWEAzbr68qYTdA7DrF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/NonNegativeQuantitySchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/NonNegativeQuantitySchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathNonNegativeQuantitySchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseMathDatedValue> datedValue;

    private CdmBaseDatetimeFrequency frequency;

    private CdmBaseMathMeasure multiplier;

    private CdmBaseMathUnitType unit;

    private Double val;

    public List<CdmBaseMathDatedValue> getDatedValue() {
        return datedValue;
    }

    public CdmBaseMathNonNegativeQuantitySchedule datedValue(List<CdmBaseMathDatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public CdmBaseDatetimeFrequency getFrequency() {
        return frequency;
    }

    public CdmBaseMathNonNegativeQuantitySchedule frequency(CdmBaseDatetimeFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public CdmBaseMathMeasure getMultiplier() {
        return multiplier;
    }

    public CdmBaseMathNonNegativeQuantitySchedule multiplier(CdmBaseMathMeasure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public CdmBaseMathUnitType getUnit() {
        return unit;
    }

    public CdmBaseMathNonNegativeQuantitySchedule unit(CdmBaseMathUnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmBaseMathNonNegativeQuantitySchedule val(Double val) {
        this.val = val;
        return this;
    }

}
