package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GtNBAyAynbg5ak9tonuCZjYhuWCYH91kN9bCBbHYAsop")
public class CdmLegaldocumentationCommonAgreementName {
    public static String blueId() {
        return "GtNBAyAynbg5ak9tonuCZjYhuWCYH91kN9bCBbHYAsop";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/AgreementName";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/AgreementName";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonAgreementName.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmLegaldocumentationCommonLegalAgreementTypeEnum agreementType;

    private List<CdmLegaldocumentationCommonFieldWithMetaContractualDefinitionsEnum> contractualDefinitionsType;

    private List<CdmLegaldocumentationCommonContractualMatrix> contractualMatrix;

    private List<CdmLegaldocumentationCommonContractualTermsSupplement> contractualTermsSupplement;

    private CdmProductCollateralCollateralMarginTypeEnum creditSupportAgreementMarginType;

    private CdmProductCollateralFieldWithMetaCreditSupportAgreementTypeEnum creditSupportAgreementType;

    private CdmLegaldocumentationMasterFieldWithMetaMasterAgreementTypeEnum masterAgreementType;

    private CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationAnnexTypeEnum masterConfirmationAnnexType;

    private CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationTypeEnum masterConfirmationType;

    private String otherAgreement;

    public CdmLegaldocumentationCommonLegalAgreementTypeEnum getAgreementType() {
        return agreementType;
    }

    public CdmLegaldocumentationCommonAgreementName agreementType(CdmLegaldocumentationCommonLegalAgreementTypeEnum agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    public List<CdmLegaldocumentationCommonFieldWithMetaContractualDefinitionsEnum> getContractualDefinitionsType() {
        return contractualDefinitionsType;
    }

    public CdmLegaldocumentationCommonAgreementName contractualDefinitionsType(List<CdmLegaldocumentationCommonFieldWithMetaContractualDefinitionsEnum> contractualDefinitionsType) {
        this.contractualDefinitionsType = contractualDefinitionsType;
        return this;
    }

    public List<CdmLegaldocumentationCommonContractualMatrix> getContractualMatrix() {
        return contractualMatrix;
    }

    public CdmLegaldocumentationCommonAgreementName contractualMatrix(List<CdmLegaldocumentationCommonContractualMatrix> contractualMatrix) {
        this.contractualMatrix = contractualMatrix;
        return this;
    }

    public List<CdmLegaldocumentationCommonContractualTermsSupplement> getContractualTermsSupplement() {
        return contractualTermsSupplement;
    }

    public CdmLegaldocumentationCommonAgreementName contractualTermsSupplement(List<CdmLegaldocumentationCommonContractualTermsSupplement> contractualTermsSupplement) {
        this.contractualTermsSupplement = contractualTermsSupplement;
        return this;
    }

    public CdmProductCollateralCollateralMarginTypeEnum getCreditSupportAgreementMarginType() {
        return creditSupportAgreementMarginType;
    }

    public CdmLegaldocumentationCommonAgreementName creditSupportAgreementMarginType(CdmProductCollateralCollateralMarginTypeEnum creditSupportAgreementMarginType) {
        this.creditSupportAgreementMarginType = creditSupportAgreementMarginType;
        return this;
    }

    public CdmProductCollateralFieldWithMetaCreditSupportAgreementTypeEnum getCreditSupportAgreementType() {
        return creditSupportAgreementType;
    }

    public CdmLegaldocumentationCommonAgreementName creditSupportAgreementType(CdmProductCollateralFieldWithMetaCreditSupportAgreementTypeEnum creditSupportAgreementType) {
        this.creditSupportAgreementType = creditSupportAgreementType;
        return this;
    }

    public CdmLegaldocumentationMasterFieldWithMetaMasterAgreementTypeEnum getMasterAgreementType() {
        return masterAgreementType;
    }

    public CdmLegaldocumentationCommonAgreementName masterAgreementType(CdmLegaldocumentationMasterFieldWithMetaMasterAgreementTypeEnum masterAgreementType) {
        this.masterAgreementType = masterAgreementType;
        return this;
    }

    public CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationAnnexTypeEnum getMasterConfirmationAnnexType() {
        return masterConfirmationAnnexType;
    }

    public CdmLegaldocumentationCommonAgreementName masterConfirmationAnnexType(CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationAnnexTypeEnum masterConfirmationAnnexType) {
        this.masterConfirmationAnnexType = masterConfirmationAnnexType;
        return this;
    }

    public CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationTypeEnum getMasterConfirmationType() {
        return masterConfirmationType;
    }

    public CdmLegaldocumentationCommonAgreementName masterConfirmationType(CdmLegaldocumentationMasterFieldWithMetaMasterConfirmationTypeEnum masterConfirmationType) {
        this.masterConfirmationType = masterConfirmationType;
        return this;
    }

    public String getOtherAgreement() {
        return otherAgreement;
    }

    public CdmLegaldocumentationCommonAgreementName otherAgreement(String otherAgreement) {
        this.otherAgreement = otherAgreement;
        return this;
    }

}
