package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Dgb8Aj4nvTgSBPwYAVWkgSXJiAHRftW1QjEseMR3mwtv")
public class LegalAgreementBase {
    public static String blueId() {
        return "Dgb8Aj4nvTgSBPwYAVWkgSXJiAHRftW1QjEseMR3mwtv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LegalAgreementBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LegalAgreementBase";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/LegalAgreementBase.json";
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

    private List<Resource> attachment;

    private List<ReferenceWithMetaParty> contractualParty;

    private String effectiveDate;

    private List<Identifier> identifier;

    private LegalAgreementIdentification legalAgreementIdentification;

    private List<PartyRole> otherParty;

    public String getNamespace() {
        return namespace;
    }

    public LegalAgreementBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public LegalAgreementBase agreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
        return this;
    }

    public List<Resource> getAttachment() {
        return attachment;
    }

    public LegalAgreementBase attachment(List<Resource> attachment) {
        this.attachment = attachment;
        return this;
    }

    public List<ReferenceWithMetaParty> getContractualParty() {
        return contractualParty;
    }

    public LegalAgreementBase contractualParty(List<ReferenceWithMetaParty> contractualParty) {
        this.contractualParty = contractualParty;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public LegalAgreementBase effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public LegalAgreementBase identifier(List<Identifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public LegalAgreementIdentification getLegalAgreementIdentification() {
        return legalAgreementIdentification;
    }

    public LegalAgreementBase legalAgreementIdentification(LegalAgreementIdentification legalAgreementIdentification) {
        this.legalAgreementIdentification = legalAgreementIdentification;
        return this;
    }

    public List<PartyRole> getOtherParty() {
        return otherParty;
    }

    public LegalAgreementBase otherParty(List<PartyRole> otherParty) {
        this.otherParty = otherParty;
        return this;
    }

}
