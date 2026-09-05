package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Fc79Gv1MyvtEi14ujmDP7ia9kicdmRL9Lbo6phC7xWMy")
public class CdmProductAssetStubFloatingRate {
    public static String blueId() {
        return "Fc79Gv1MyvtEi14ujmDP7ia9kicdmRL9Lbo6phC7xWMy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/StubFloatingRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/StubFloatingRate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetStubFloatingRate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductTemplateStrikeSchedule> capRateSchedule;

    private CdmBaseStaticdataAssetRatesFloatingRateIndexEnum floatingRateIndex;

    private CdmBaseMathSchedule floatingRateMultiplierSchedule;

    private List<CdmProductTemplateStrikeSchedule> floorRateSchedule;

    private CdmBaseDatetimePeriod indexTenor;

    private CdmProductAssetRateTreatmentEnum rateTreatment;

    private List<CdmProductAssetSpreadSchedule> spreadSchedule;

    public List<CdmProductTemplateStrikeSchedule> getCapRateSchedule() {
        return capRateSchedule;
    }

    public CdmProductAssetStubFloatingRate capRateSchedule(List<CdmProductTemplateStrikeSchedule> capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public CdmBaseStaticdataAssetRatesFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public CdmProductAssetStubFloatingRate floatingRateIndex(CdmBaseStaticdataAssetRatesFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public CdmBaseMathSchedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    public CdmProductAssetStubFloatingRate floatingRateMultiplierSchedule(CdmBaseMathSchedule floatingRateMultiplierSchedule) {
        this.floatingRateMultiplierSchedule = floatingRateMultiplierSchedule;
        return this;
    }

    public List<CdmProductTemplateStrikeSchedule> getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public CdmProductAssetStubFloatingRate floorRateSchedule(List<CdmProductTemplateStrikeSchedule> floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public CdmBaseDatetimePeriod getIndexTenor() {
        return indexTenor;
    }

    public CdmProductAssetStubFloatingRate indexTenor(CdmBaseDatetimePeriod indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public CdmProductAssetRateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    public CdmProductAssetStubFloatingRate rateTreatment(CdmProductAssetRateTreatmentEnum rateTreatment) {
        this.rateTreatment = rateTreatment;
        return this;
    }

    public List<CdmProductAssetSpreadSchedule> getSpreadSchedule() {
        return spreadSchedule;
    }

    public CdmProductAssetStubFloatingRate spreadSchedule(List<CdmProductAssetSpreadSchedule> spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
