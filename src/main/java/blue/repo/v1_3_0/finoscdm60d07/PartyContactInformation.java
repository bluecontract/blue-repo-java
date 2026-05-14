package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FfC6fzygp6poaEf8EiRik1QTgMzBsmRb1UmDkyYTq42V")
public class PartyContactInformation {
    public static String blueId() {
        return "FfC6fzygp6poaEf8EiRik1QTgMzBsmRb1UmDkyYTq42V";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyContactInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyContactInformation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PartyContactInformation.json";
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

    private String additionalInformation;

    private List<BusinessUnit> businessUnit;

    private ContactInformation contactInformation;

    private ReferenceWithMetaParty partyReference;

    private List<NaturalPerson> person;

    public String getNamespace() {
        return namespace;
    }

    public PartyContactInformation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public PartyContactInformation additionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    public List<BusinessUnit> getBusinessUnit() {
        return businessUnit;
    }

    public PartyContactInformation businessUnit(List<BusinessUnit> businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public PartyContactInformation contactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public ReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public PartyContactInformation partyReference(ReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public List<NaturalPerson> getPerson() {
        return person;
    }

    public PartyContactInformation person(List<NaturalPerson> person) {
        this.person = person;
        return this;
    }

}
