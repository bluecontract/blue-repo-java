package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("552tQMPt3GF4sBRCYRmWLgaHG183EE1aMKbEinn1oGvJ")
public class CdmBaseStaticdataPartyParty {
    public static String blueId() {
        return "552tQMPt3GF4sBRCYRmWLgaHG183EE1aMKbEinn1oGvJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/Party";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/Party";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyParty.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyAccount account;

    private List<CdmBaseStaticdataPartyBusinessUnit> businessUnit;

    private CdmBaseStaticdataPartyContactInformation contactInformation;

    private List<CdmBaseStaticdataPartyPartyIdentifier> partyId;

    private List<CdmBaseStaticdataPartyNaturalPerson> person;

    private List<CdmBaseStaticdataPartyNaturalPersonRole> personRole;

    public CdmBaseStaticdataPartyAccount getAccount() {
        return account;
    }

    public CdmBaseStaticdataPartyParty account(CdmBaseStaticdataPartyAccount account) {
        this.account = account;
        return this;
    }

    public List<CdmBaseStaticdataPartyBusinessUnit> getBusinessUnit() {
        return businessUnit;
    }

    public CdmBaseStaticdataPartyParty businessUnit(List<CdmBaseStaticdataPartyBusinessUnit> businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    public CdmBaseStaticdataPartyContactInformation getContactInformation() {
        return contactInformation;
    }

    public CdmBaseStaticdataPartyParty contactInformation(CdmBaseStaticdataPartyContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyIdentifier> getPartyId() {
        return partyId;
    }

    public CdmBaseStaticdataPartyParty partyId(List<CdmBaseStaticdataPartyPartyIdentifier> partyId) {
        this.partyId = partyId;
        return this;
    }

    public List<CdmBaseStaticdataPartyNaturalPerson> getPerson() {
        return person;
    }

    public CdmBaseStaticdataPartyParty person(List<CdmBaseStaticdataPartyNaturalPerson> person) {
        this.person = person;
        return this;
    }

    public List<CdmBaseStaticdataPartyNaturalPersonRole> getPersonRole() {
        return personRole;
    }

    public CdmBaseStaticdataPartyParty personRole(List<CdmBaseStaticdataPartyNaturalPersonRole> personRole) {
        this.personRole = personRole;
        return this;
    }

}
