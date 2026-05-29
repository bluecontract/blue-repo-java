package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8cxBikeuHvYYMwhHNctrp8MDJJ7Vce3pohMQx29kCit9")
public class CdmObservableAssetMoney {
    public static String blueId() {
        return "8cxBikeuHvYYMwhHNctrp8MDJJ7Vce3pohMQx29kCit9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/Money";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/Money";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetMoney.json";
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

    public CdmObservableAssetMoney datedValue(List<CdmBaseMathDatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public CdmBaseDatetimeFrequency getFrequency() {
        return frequency;
    }

    public CdmObservableAssetMoney frequency(CdmBaseDatetimeFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public CdmBaseMathMeasure getMultiplier() {
        return multiplier;
    }

    public CdmObservableAssetMoney multiplier(CdmBaseMathMeasure multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public CdmBaseMathUnitType getUnit() {
        return unit;
    }

    public CdmObservableAssetMoney unit(CdmBaseMathUnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmObservableAssetMoney val(Double val) {
        this.val = val;
        return this;
    }

}
