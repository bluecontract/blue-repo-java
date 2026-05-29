package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5Vjv2XQNPdtQNKN8mvEx3JGyY4QKNuVtTwTEo1HZ3Gxy")
public class CdmBaseStaticdataPartyPartyContactInformation {
    public static String blueId() {
        return "5Vjv2XQNPdtQNKN8mvEx3JGyY4QKNuVtTwTEo1HZ3Gxy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PartyContactInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PartyContactInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPartyContactInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String additionalInformation;

    private List<CdmBaseStaticdataPartyBusinessUnit> businessUnit;

    private CdmBaseStaticdataPartyContactInformation contactInformation;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference;

    private List<CdmBaseStaticdataPartyNaturalPerson> person;

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public CdmBaseStaticdataPartyPartyContactInformation additionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    public List<CdmBaseStaticdataPartyBusinessUnit> getBusinessUnit() {
        return businessUnit;
    }

    public CdmBaseStaticdataPartyPartyContactInformation businessUnit(List<CdmBaseStaticdataPartyBusinessUnit> businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    public CdmBaseStaticdataPartyContactInformation getContactInformation() {
        return contactInformation;
    }

    public CdmBaseStaticdataPartyPartyContactInformation contactInformation(CdmBaseStaticdataPartyContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public CdmBaseStaticdataPartyPartyContactInformation partyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public List<CdmBaseStaticdataPartyNaturalPerson> getPerson() {
        return person;
    }

    public CdmBaseStaticdataPartyPartyContactInformation person(List<CdmBaseStaticdataPartyNaturalPerson> person) {
        this.person = person;
        return this;
    }

}
