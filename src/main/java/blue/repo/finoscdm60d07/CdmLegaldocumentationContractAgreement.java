package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("24XR8iGVZsSMcRtHNgWSpYEEza3KosniTayAxz2hnncm")
public class CdmLegaldocumentationContractAgreement {
    public static String blueId() {
        return "24XR8iGVZsSMcRtHNgWSpYEEza3KosniTayAxz2hnncm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/contract/Agreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/contract/Agreement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcontractAgreement.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmLegaldocumentationCsaCollateralTransferAgreementElections collateralTransferAgreementElections;

    private CdmLegaldocumentationCsaCreditSupportAgreementElections creditSupportAgreementElections;

    private CdmLegaldocumentationMasterMasterAgreementSchedule masterAgreementSchedule;

    private CdmLegaldocumentationCsaSecurityAgreementElections securityAgreementElections;

    private CdmLegaldocumentationMasterTransactionAdditionalTerms transactionAdditionalTerms;

    public CdmLegaldocumentationCsaCollateralTransferAgreementElections getCollateralTransferAgreementElections() {
        return collateralTransferAgreementElections;
    }

    public CdmLegaldocumentationContractAgreement collateralTransferAgreementElections(CdmLegaldocumentationCsaCollateralTransferAgreementElections collateralTransferAgreementElections) {
        this.collateralTransferAgreementElections = collateralTransferAgreementElections;
        return this;
    }

    public CdmLegaldocumentationCsaCreditSupportAgreementElections getCreditSupportAgreementElections() {
        return creditSupportAgreementElections;
    }

    public CdmLegaldocumentationContractAgreement creditSupportAgreementElections(CdmLegaldocumentationCsaCreditSupportAgreementElections creditSupportAgreementElections) {
        this.creditSupportAgreementElections = creditSupportAgreementElections;
        return this;
    }

    public CdmLegaldocumentationMasterMasterAgreementSchedule getMasterAgreementSchedule() {
        return masterAgreementSchedule;
    }

    public CdmLegaldocumentationContractAgreement masterAgreementSchedule(CdmLegaldocumentationMasterMasterAgreementSchedule masterAgreementSchedule) {
        this.masterAgreementSchedule = masterAgreementSchedule;
        return this;
    }

    public CdmLegaldocumentationCsaSecurityAgreementElections getSecurityAgreementElections() {
        return securityAgreementElections;
    }

    public CdmLegaldocumentationContractAgreement securityAgreementElections(CdmLegaldocumentationCsaSecurityAgreementElections securityAgreementElections) {
        this.securityAgreementElections = securityAgreementElections;
        return this;
    }

    public CdmLegaldocumentationMasterTransactionAdditionalTerms getTransactionAdditionalTerms() {
        return transactionAdditionalTerms;
    }

    public CdmLegaldocumentationContractAgreement transactionAdditionalTerms(CdmLegaldocumentationMasterTransactionAdditionalTerms transactionAdditionalTerms) {
        this.transactionAdditionalTerms = transactionAdditionalTerms;
        return this;
    }

}
