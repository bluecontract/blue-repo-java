package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DDPEJCtbjCK4fCy5ZwmHdduie29MQdvdscPV38q6HwfM")
public class CdmBaseMathQuantitySchedule {
    public static String blueId() {
        return "DDPEJCtbjCK4fCy5ZwmHdduie29MQdvdscPV38q6HwfM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/QuantitySchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/QuantitySchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathQuantitySchedule.json";
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

    public CdmBaseMathQuantitySchedule datedValue(List<CdmBaseMathDatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public CdmBaseDatetimeFrequency getFrequency() {
        return frequency;
    }

    public CdmBaseMathQuantitySchedule frequency(CdmBaseDatetimeFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public CdmBaseMathMeasure getMultiplier() {
        return multiplier;
    }

    public CdmBaseMathQuantitySchedule multiplier(CdmBaseMathMeasure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public CdmBaseMathUnitType getUnit() {
        return unit;
    }

    public CdmBaseMathQuantitySchedule unit(CdmBaseMathUnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmBaseMathQuantitySchedule val(Double val) {
        this.val = val;
        return this;
    }

}
