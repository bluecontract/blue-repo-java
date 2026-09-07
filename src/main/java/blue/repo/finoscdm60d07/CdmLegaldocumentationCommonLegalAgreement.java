package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6CbvNDFuyte8aeziYSEhGNZ67FtoQfBVBjdYC8yiLVG6#0")
public class CdmLegaldocumentationCommonLegalAgreement {
    public static String blueId() {
        return "6CbvNDFuyte8aeziYSEhGNZ67FtoQfBVBjdYC8yiLVG6#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/LegalAgreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/LegalAgreement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonLegalAgreement.json";
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

    private CdmLegaldocumentationCommonAgreementTerms agreementTerms;

    private List<CdmLegaldocumentationCommonResource> attachment;

    private List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> contractualParty;

    private String effectiveDate;

    private List<CdmBaseStaticdataIdentifierIdentifier> identifier;

    private CdmLegaldocumentationCommonLegalAgreementIdentification legalAgreementIdentification;

    private List<CdmBaseStaticdataPartyPartyRole> otherParty;

    private List<CdmLegaldocumentationCommonLegalAgreement> relatedAgreements;

    private CdmLegaldocumentationCommonUmbrellaAgreement umbrellaAgreement;

    public String getAgreementDate() {
        return agreementDate;
    }

    public CdmLegaldocumentationCommonLegalAgreement agreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
        return this;
    }

    public CdmLegaldocumentationCommonAgreementTerms getAgreementTerms() {
        return agreementTerms;
    }

    public CdmLegaldocumentationCommonLegalAgreement agreementTerms(CdmLegaldocumentationCommonAgreementTerms agreementTerms) {
        this.agreementTerms = agreementTerms;
        return this;
    }

    public List<CdmLegaldocumentationCommonResource> getAttachment() {
        return attachment;
    }

    public CdmLegaldocumentationCommonLegalAgreement attachment(List<CdmLegaldocumentationCommonResource> attachment) {
        this.attachment = attachment;
        return this;
    }

    public List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> getContractualParty() {
        return contractualParty;
    }

    public CdmLegaldocumentationCommonLegalAgreement contractualParty(List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> contractualParty) {
        this.contractualParty = contractualParty;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmLegaldocumentationCommonLegalAgreement effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public List<CdmBaseStaticdataIdentifierIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmLegaldocumentationCommonLegalAgreement identifier(List<CdmBaseStaticdataIdentifierIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmLegaldocumentationCommonLegalAgreementIdentification getLegalAgreementIdentification() {
        return legalAgreementIdentification;
    }

    public CdmLegaldocumentationCommonLegalAgreement legalAgreementIdentification(CdmLegaldocumentationCommonLegalAgreementIdentification legalAgreementIdentification) {
        this.legalAgreementIdentification = legalAgreementIdentification;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getOtherParty() {
        return otherParty;
    }

    public CdmLegaldocumentationCommonLegalAgreement otherParty(List<CdmBaseStaticdataPartyPartyRole> otherParty) {
        this.otherParty = otherParty;
        return this;
    }

    public List<CdmLegaldocumentationCommonLegalAgreement> getRelatedAgreements() {
        return relatedAgreements;
    }

    public CdmLegaldocumentationCommonLegalAgreement relatedAgreements(List<CdmLegaldocumentationCommonLegalAgreement> relatedAgreements) {
        this.relatedAgreements = relatedAgreements;
        return this;
    }

    public CdmLegaldocumentationCommonUmbrellaAgreement getUmbrellaAgreement() {
        return umbrellaAgreement;
    }

    public CdmLegaldocumentationCommonLegalAgreement umbrellaAgreement(CdmLegaldocumentationCommonUmbrellaAgreement umbrellaAgreement) {
        this.umbrellaAgreement = umbrellaAgreement;
        return this;
    }

}
