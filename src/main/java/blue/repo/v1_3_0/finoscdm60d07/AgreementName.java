package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("C3Rbxa18Z256JdLBEGN8PmNSiuJrh7LRhCYX6g2DhwPm")
public class AgreementName {
    public static String blueId() {
        return "C3Rbxa18Z256JdLBEGN8PmNSiuJrh7LRhCYX6g2DhwPm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AgreementName";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AgreementName";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AgreementName.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private LegalAgreementTypeEnum agreementType;

    private List<FieldWithMetaContractualDefinitionsEnum> contractualDefinitionsType;

    private List<ContractualMatrix> contractualMatrix;

    private List<ContractualTermsSupplement> contractualTermsSupplement;

    private CollateralMarginTypeEnum creditSupportAgreementMarginType;

    private FieldWithMetaCreditSupportAgreementTypeEnum creditSupportAgreementType;

    private FieldWithMetaMasterAgreementTypeEnum masterAgreementType;

    private FieldWithMetaMasterConfirmationAnnexTypeEnum masterConfirmationAnnexType;

    private FieldWithMetaMasterConfirmationTypeEnum masterConfirmationType;

    private String otherAgreement;

    public String getNamespace() {
        return namespace;
    }

    public AgreementName namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public LegalAgreementTypeEnum getAgreementType() {
        return agreementType;
    }

    public AgreementName agreementType(LegalAgreementTypeEnum agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    public List<FieldWithMetaContractualDefinitionsEnum> getContractualDefinitionsType() {
        return contractualDefinitionsType;
    }

    public AgreementName contractualDefinitionsType(List<FieldWithMetaContractualDefinitionsEnum> contractualDefinitionsType) {
        this.contractualDefinitionsType = contractualDefinitionsType;
        return this;
    }

    public List<ContractualMatrix> getContractualMatrix() {
        return contractualMatrix;
    }

    public AgreementName contractualMatrix(List<ContractualMatrix> contractualMatrix) {
        this.contractualMatrix = contractualMatrix;
        return this;
    }

    public List<ContractualTermsSupplement> getContractualTermsSupplement() {
        return contractualTermsSupplement;
    }

    public AgreementName contractualTermsSupplement(List<ContractualTermsSupplement> contractualTermsSupplement) {
        this.contractualTermsSupplement = contractualTermsSupplement;
        return this;
    }

    public CollateralMarginTypeEnum getCreditSupportAgreementMarginType() {
        return creditSupportAgreementMarginType;
    }

    public AgreementName creditSupportAgreementMarginType(CollateralMarginTypeEnum creditSupportAgreementMarginType) {
        this.creditSupportAgreementMarginType = creditSupportAgreementMarginType;
        return this;
    }

    public FieldWithMetaCreditSupportAgreementTypeEnum getCreditSupportAgreementType() {
        return creditSupportAgreementType;
    }

    public AgreementName creditSupportAgreementType(FieldWithMetaCreditSupportAgreementTypeEnum creditSupportAgreementType) {
        this.creditSupportAgreementType = creditSupportAgreementType;
        return this;
    }

    public FieldWithMetaMasterAgreementTypeEnum getMasterAgreementType() {
        return masterAgreementType;
    }

    public AgreementName masterAgreementType(FieldWithMetaMasterAgreementTypeEnum masterAgreementType) {
        this.masterAgreementType = masterAgreementType;
        return this;
    }

    public FieldWithMetaMasterConfirmationAnnexTypeEnum getMasterConfirmationAnnexType() {
        return masterConfirmationAnnexType;
    }

    public AgreementName masterConfirmationAnnexType(FieldWithMetaMasterConfirmationAnnexTypeEnum masterConfirmationAnnexType) {
        this.masterConfirmationAnnexType = masterConfirmationAnnexType;
        return this;
    }

    public FieldWithMetaMasterConfirmationTypeEnum getMasterConfirmationType() {
        return masterConfirmationType;
    }

    public AgreementName masterConfirmationType(FieldWithMetaMasterConfirmationTypeEnum masterConfirmationType) {
        this.masterConfirmationType = masterConfirmationType;
        return this;
    }

    public String getOtherAgreement() {
        return otherAgreement;
    }

    public AgreementName otherAgreement(String otherAgreement) {
        this.otherAgreement = otherAgreement;
        return this;
    }

}
