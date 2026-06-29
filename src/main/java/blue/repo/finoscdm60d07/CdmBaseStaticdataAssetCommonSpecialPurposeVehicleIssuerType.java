package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5qsyiVpwMMJ634uApJQwMnZmrry7x6MHoaMJeGxdb5Bq")
public class CdmBaseStaticdataAssetCommonSpecialPurposeVehicleIssuerType {
    public static String blueId() {
        return "5qsyiVpwMMJ634uApJQwMnZmrry7x6MHoaMJeGxdb5Bq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/SpecialPurposeVehicleIssuerType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/SpecialPurposeVehicleIssuerType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonSpecialPurposeVehicleIssuerType.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonCreditRiskEnum creditRisk;

    public CdmBaseStaticdataAssetCommonCreditRiskEnum getCreditRisk() {
        return creditRisk;
    }

    public CdmBaseStaticdataAssetCommonSpecialPurposeVehicleIssuerType creditRisk(CdmBaseStaticdataAssetCommonCreditRiskEnum creditRisk) {
        this.creditRisk = creditRisk;
        return this;
    }

}
