package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H6PykJfXM1yFBz8mSRdqtcp1ATz1YwBbyjFBTGXM4Uvp")
public class CdmBaseStaticdataAssetCommonCollateralIssuerType {
    public static String blueId() {
        return "H6PykJfXM1yFBz8mSRdqtcp1ATz1YwBbyjFBTGXM4Uvp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/CollateralIssuerType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/CollateralIssuerType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCollateralIssuerType.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonIssuerTypeEnum issuerType;

    private CdmBaseStaticdataAssetCommonQuasiGovernmentIssuerType quasiGovernmentType;

    private CdmBaseStaticdataAssetCommonRegionalGovernmentIssuerType regionalGovernmentType;

    private CdmBaseStaticdataAssetCommonSpecialPurposeVehicleIssuerType specialPurposeVehicleType;

    private CdmBaseStaticdataAssetCommonSupraNationalIssuerTypeEnum supraNationalType;

    public CdmBaseStaticdataAssetCommonIssuerTypeEnum getIssuerType() {
        return issuerType;
    }

    public CdmBaseStaticdataAssetCommonCollateralIssuerType issuerType(CdmBaseStaticdataAssetCommonIssuerTypeEnum issuerType) {
        this.issuerType = issuerType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonQuasiGovernmentIssuerType getQuasiGovernmentType() {
        return quasiGovernmentType;
    }

    public CdmBaseStaticdataAssetCommonCollateralIssuerType quasiGovernmentType(CdmBaseStaticdataAssetCommonQuasiGovernmentIssuerType quasiGovernmentType) {
        this.quasiGovernmentType = quasiGovernmentType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonRegionalGovernmentIssuerType getRegionalGovernmentType() {
        return regionalGovernmentType;
    }

    public CdmBaseStaticdataAssetCommonCollateralIssuerType regionalGovernmentType(CdmBaseStaticdataAssetCommonRegionalGovernmentIssuerType regionalGovernmentType) {
        this.regionalGovernmentType = regionalGovernmentType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonSpecialPurposeVehicleIssuerType getSpecialPurposeVehicleType() {
        return specialPurposeVehicleType;
    }

    public CdmBaseStaticdataAssetCommonCollateralIssuerType specialPurposeVehicleType(CdmBaseStaticdataAssetCommonSpecialPurposeVehicleIssuerType specialPurposeVehicleType) {
        this.specialPurposeVehicleType = specialPurposeVehicleType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonSupraNationalIssuerTypeEnum getSupraNationalType() {
        return supraNationalType;
    }

    public CdmBaseStaticdataAssetCommonCollateralIssuerType supraNationalType(CdmBaseStaticdataAssetCommonSupraNationalIssuerTypeEnum supraNationalType) {
        this.supraNationalType = supraNationalType;
        return this;
    }

}
