package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4VLeT4uJM3cRp2H6JSAzzkxWxkFE6dxbawfkxq9Q2Kit")
public class CdmBaseStaticdataPartyNaturalPerson {
    public static String blueId() {
        return "4VLeT4uJM3cRp2H6JSAzzkxWxkFE6dxbawfkxq9Q2Kit";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/NaturalPerson";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/NaturalPerson";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyNaturalPerson.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyContactInformation contactInformation;

    private String dateOfBirth;

    private String firstName;

    private String honorific;

    private List<String> initial;

    private List<String> middleName;

    private List<CdmBaseStaticdataPartyFieldWithMetaPersonIdentifier> personId;

    private String suffix;

    private String surname;

    public CdmBaseStaticdataPartyContactInformation getContactInformation() {
        return contactInformation;
    }

    public CdmBaseStaticdataPartyNaturalPerson contactInformation(CdmBaseStaticdataPartyContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public CdmBaseStaticdataPartyNaturalPerson dateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CdmBaseStaticdataPartyNaturalPerson firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getHonorific() {
        return honorific;
    }

    public CdmBaseStaticdataPartyNaturalPerson honorific(String honorific) {
        this.honorific = honorific;
        return this;
    }

    public List<String> getInitial() {
        return initial;
    }

    public CdmBaseStaticdataPartyNaturalPerson initial(List<String> initial) {
        this.initial = initial;
        return this;
    }

    public List<String> getMiddleName() {
        return middleName;
    }

    public CdmBaseStaticdataPartyNaturalPerson middleName(List<String> middleName) {
        this.middleName = middleName;
        return this;
    }

    public List<CdmBaseStaticdataPartyFieldWithMetaPersonIdentifier> getPersonId() {
        return personId;
    }

    public CdmBaseStaticdataPartyNaturalPerson personId(List<CdmBaseStaticdataPartyFieldWithMetaPersonIdentifier> personId) {
        this.personId = personId;
        return this;
    }

    public String getSuffix() {
        return suffix;
    }

    public CdmBaseStaticdataPartyNaturalPerson suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public CdmBaseStaticdataPartyNaturalPerson surname(String surname) {
        this.surname = surname;
        return this;
    }

}
