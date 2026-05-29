package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FrmpqNJPnR6deFCfrx5PCjxXkRTEHfDQrfnv67NeRDqy")
public class CdmBaseMathNonNegativeQuantity {
    public static String blueId() {
        return "FrmpqNJPnR6deFCfrx5PCjxXkRTEHfDQrfnv67NeRDqy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/NonNegativeQuantity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/NonNegativeQuantity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathNonNegativeQuantity.json";
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

    public CdmBaseMathNonNegativeQuantity datedValue(List<CdmBaseMathDatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public CdmBaseDatetimeFrequency getFrequency() {
        return frequency;
    }

    public CdmBaseMathNonNegativeQuantity frequency(CdmBaseDatetimeFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public CdmBaseMathMeasure getMultiplier() {
        return multiplier;
    }

    public CdmBaseMathNonNegativeQuantity multiplier(CdmBaseMathMeasure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public CdmBaseMathUnitType getUnit() {
        return unit;
    }

    public CdmBaseMathNonNegativeQuantity unit(CdmBaseMathUnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmBaseMathNonNegativeQuantity val(Double val) {
        this.val = val;
        return this;
    }

}
