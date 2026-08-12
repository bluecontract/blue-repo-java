package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3ppYS4Knk7tn2jmTp6oqJegiiXbjdHnLBBkSUuNmGeHq")
public class CdmProductAssetFloatingRateBase {
    public static String blueId() {
        return "3ppYS4Knk7tn2jmTp6oqJegiiXbjdHnLBBkSUuNmGeHq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FloatingRateBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FloatingRateBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFloatingRateBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateStrikeSchedule capRateSchedule;

    private CdmProductTemplateStrikeSchedule floorRateSchedule;

    private CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption;

    private CdmProductAssetSpreadSchedule spreadSchedule;

    public CdmProductTemplateStrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public CdmProductAssetFloatingRateBase capRateSchedule(CdmProductTemplateStrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public CdmProductTemplateStrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public CdmProductAssetFloatingRateBase floorRateSchedule(CdmProductTemplateStrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public CdmProductAssetFloatingRateBase rateOption(CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public CdmProductAssetSpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public CdmProductAssetFloatingRateBase spreadSchedule(CdmProductAssetSpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
