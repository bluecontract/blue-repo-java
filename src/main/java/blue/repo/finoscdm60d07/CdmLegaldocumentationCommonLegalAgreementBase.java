package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DcgdSd4HsySv1Kjs3mmHtjdobShDTmMi1HHGXnxFpUAb")
public class CdmLegaldocumentationCommonLegalAgreementBase {
    public static String blueId() {
        return "DcgdSd4HsySv1Kjs3mmHtjdobShDTmMi1HHGXnxFpUAb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/LegalAgreementBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/LegalAgreementBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonLegalAgreementBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String agreementDate;

    private List<CdmLegaldocumentationCommonResource> attachment;

    private List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> contractualParty;

    private String effectiveDate;

    private List<CdmBaseStaticdataIdentifierIdentifier> identifier;

    private CdmLegaldocumentationCommonLegalAgreementIdentification legalAgreementIdentification;

    private List<CdmBaseStaticdataPartyPartyRole> otherParty;

    public String getAgreementDate() {
        return agreementDate;
    }

    public CdmLegaldocumentationCommonLegalAgreementBase agreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
        return this;
    }

    public List<CdmLegaldocumentationCommonResource> getAttachment() {
        return attachment;
    }

    public CdmLegaldocumentationCommonLegalAgreementBase attachment(List<CdmLegaldocumentationCommonResource> attachment) {
        this.attachment = attachment;
        return this;
    }

    public List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> getContractualParty() {
        return contractualParty;
    }

    public CdmLegaldocumentationCommonLegalAgreementBase contractualParty(List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> contractualParty) {
        this.contractualParty = contractualParty;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmLegaldocumentationCommonLegalAgreementBase effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public List<CdmBaseStaticdataIdentifierIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmLegaldocumentationCommonLegalAgreementBase identifier(List<CdmBaseStaticdataIdentifierIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmLegaldocumentationCommonLegalAgreementIdentification getLegalAgreementIdentification() {
        return legalAgreementIdentification;
    }

    public CdmLegaldocumentationCommonLegalAgreementBase legalAgreementIdentification(CdmLegaldocumentationCommonLegalAgreementIdentification legalAgreementIdentification) {
        this.legalAgreementIdentification = legalAgreementIdentification;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getOtherParty() {
        return otherParty;
    }

    public CdmLegaldocumentationCommonLegalAgreementBase otherParty(List<CdmBaseStaticdataPartyPartyRole> otherParty) {
        this.otherParty = otherParty;
        return this;
    }

}
