package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9je4gdfYWh5s9PxZCf36xymmiBGd59PHPrBapq7pnGVf")
public class CdmProductCollateralCollateralAgreementFloatingRate {
    public static String blueId() {
        return "9je4gdfYWh5s9PxZCf36xymmiBGd59PHPrBapq7pnGVf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralAgreementFloatingRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralAgreementFloatingRate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralAgreementFloatingRate.json";
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

    private Boolean compressibleSpread;

    private CdmProductTemplateStrikeSchedule floorRateSchedule;

    private Boolean negativeInterest;

    private CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption;

    private CdmProductAssetSpreadSchedule spreadSchedule;

    public CdmProductTemplateStrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public CdmProductCollateralCollateralAgreementFloatingRate capRateSchedule(CdmProductTemplateStrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public Boolean getCompressibleSpread() {
        return compressibleSpread;
    }

    public CdmProductCollateralCollateralAgreementFloatingRate compressibleSpread(Boolean compressibleSpread) {
        this.compressibleSpread = compressibleSpread;
        return this;
    }

    public CdmProductTemplateStrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public CdmProductCollateralCollateralAgreementFloatingRate floorRateSchedule(CdmProductTemplateStrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public Boolean getNegativeInterest() {
        return negativeInterest;
    }

    public CdmProductCollateralCollateralAgreementFloatingRate negativeInterest(Boolean negativeInterest) {
        this.negativeInterest = negativeInterest;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public CdmProductCollateralCollateralAgreementFloatingRate rateOption(CdmObservableAssetMetafieldsReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public CdmProductAssetSpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public CdmProductCollateralCollateralAgreementFloatingRate spreadSchedule(CdmProductAssetSpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
