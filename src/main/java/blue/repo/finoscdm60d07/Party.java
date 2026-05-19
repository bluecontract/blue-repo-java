package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AVN4ESaeQMFu31gp5PDiR55P6nWzHRiWZR2pKxQS5d6W")
public class Party {
    public static String blueId() {
        return "AVN4ESaeQMFu31gp5PDiR55P6nWzHRiWZR2pKxQS5d6W";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Party";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Party";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Party.json";
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

    private Account account;

    private List<BusinessUnit> businessUnit;

    private ContactInformation contactInformation;

    private List<PartyIdentifier> partyId;

    private List<NaturalPerson> person;

    private List<NaturalPersonRole> personRole;

    public String getNamespace() {
        return namespace;
    }

    public Party namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Account getAccount() {
        return account;
    }

    public Party account(Account account) {
        this.account = account;
        return this;
    }

    public List<BusinessUnit> getBusinessUnit() {
        return businessUnit;
    }

    public Party businessUnit(List<BusinessUnit> businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public Party contactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public List<PartyIdentifier> getPartyId() {
        return partyId;
    }

    public Party partyId(List<PartyIdentifier> partyId) {
        this.partyId = partyId;
        return this;
    }

    public List<NaturalPerson> getPerson() {
        return person;
    }

    public Party person(List<NaturalPerson> person) {
        this.person = person;
        return this;
    }

    public List<NaturalPersonRole> getPersonRole() {
        return personRole;
    }

    public Party personRole(List<NaturalPersonRole> personRole) {
        this.personRole = personRole;
        return this;
    }

}
