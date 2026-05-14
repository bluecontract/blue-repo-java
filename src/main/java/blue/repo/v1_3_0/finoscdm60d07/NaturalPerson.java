package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7MD7VSLwm3ABEra36tJiLcnWXZtqt198617UxVPV28Nq")
public class NaturalPerson {
    public static String blueId() {
        return "7MD7VSLwm3ABEra36tJiLcnWXZtqt198617UxVPV28Nq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NaturalPerson";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NaturalPerson";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NaturalPerson.json";
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

    private ContactInformation contactInformation;

    private String dateOfBirth;

    private String firstName;

    private String honorific;

    private List<String> initial;

    private List<String> middleName;

    private List<FieldWithMetaPersonIdentifier> personId;

    private String suffix;

    private String surname;

    public String getNamespace() {
        return namespace;
    }

    public NaturalPerson namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public NaturalPerson contactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public NaturalPerson dateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public NaturalPerson firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getHonorific() {
        return honorific;
    }

    public NaturalPerson honorific(String honorific) {
        this.honorific = honorific;
        return this;
    }

    public List<String> getInitial() {
        return initial;
    }

    public NaturalPerson initial(List<String> initial) {
        this.initial = initial;
        return this;
    }

    public List<String> getMiddleName() {
        return middleName;
    }

    public NaturalPerson middleName(List<String> middleName) {
        this.middleName = middleName;
        return this;
    }

    public List<FieldWithMetaPersonIdentifier> getPersonId() {
        return personId;
    }

    public NaturalPerson personId(List<FieldWithMetaPersonIdentifier> personId) {
        this.personId = personId;
        return this;
    }

    public String getSuffix() {
        return suffix;
    }

    public NaturalPerson suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public NaturalPerson surname(String surname) {
        this.surname = surname;
        return this;
    }

}
