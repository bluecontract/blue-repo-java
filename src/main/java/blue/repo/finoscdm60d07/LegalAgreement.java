package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("68SxZmzhzLtmczgocbFLq3WE59yC7Tkr9KqNKeFBY9W1#0")
public class LegalAgreement {
    public static String blueId() {
        return "68SxZmzhzLtmczgocbFLq3WE59yC7Tkr9KqNKeFBY9W1#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LegalAgreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LegalAgreement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/LegalAgreement.json";
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

    private String agreementDate;

    private AgreementTerms agreementTerms;

    private List<Resource> attachment;

    private List<ReferenceWithMetaParty> contractualParty;

    private String effectiveDate;

    private List<Identifier> identifier;

    private LegalAgreementIdentification legalAgreementIdentification;

    private List<PartyRole> otherParty;

    private List<LegalAgreement> relatedAgreements;

    private UmbrellaAgreement umbrellaAgreement;

    public String getNamespace() {
        return namespace;
    }

    public LegalAgreement namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public LegalAgreement agreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
        return this;
    }

    public AgreementTerms getAgreementTerms() {
        return agreementTerms;
    }

    public LegalAgreement agreementTerms(AgreementTerms agreementTerms) {
        this.agreementTerms = agreementTerms;
        return this;
    }

    public List<Resource> getAttachment() {
        return attachment;
    }

    public LegalAgreement attachment(List<Resource> attachment) {
        this.attachment = attachment;
        return this;
    }

    public List<ReferenceWithMetaParty> getContractualParty() {
        return contractualParty;
    }

    public LegalAgreement contractualParty(List<ReferenceWithMetaParty> contractualParty) {
        this.contractualParty = contractualParty;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public LegalAgreement effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public LegalAgreement identifier(List<Identifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public LegalAgreementIdentification getLegalAgreementIdentification() {
        return legalAgreementIdentification;
    }

    public LegalAgreement legalAgreementIdentification(LegalAgreementIdentification legalAgreementIdentification) {
        this.legalAgreementIdentification = legalAgreementIdentification;
        return this;
    }

    public List<PartyRole> getOtherParty() {
        return otherParty;
    }

    public LegalAgreement otherParty(List<PartyRole> otherParty) {
        this.otherParty = otherParty;
        return this;
    }

    public List<LegalAgreement> getRelatedAgreements() {
        return relatedAgreements;
    }

    public LegalAgreement relatedAgreements(List<LegalAgreement> relatedAgreements) {
        this.relatedAgreements = relatedAgreements;
        return this;
    }

    public UmbrellaAgreement getUmbrellaAgreement() {
        return umbrellaAgreement;
    }

    public LegalAgreement umbrellaAgreement(UmbrellaAgreement umbrellaAgreement) {
        this.umbrellaAgreement = umbrellaAgreement;
        return this;
    }

}
