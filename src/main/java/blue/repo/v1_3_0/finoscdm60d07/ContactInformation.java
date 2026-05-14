package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AbQeBqs8eJgVdhRHC5m3GNejbZjiSBosKWGuTkNLhf45")
public class ContactInformation {
    public static String blueId() {
        return "AbQeBqs8eJgVdhRHC5m3GNejbZjiSBosKWGuTkNLhf45";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContactInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContactInformation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ContactInformation.json";
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

    private List<Address> address;

    private List<String> email;

    private List<TelephoneNumber> telephone;

    private List<String> webPage;

    public String getNamespace() {
        return namespace;
    }

    public ContactInformation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Address> getAddress() {
        return address;
    }

    public ContactInformation address(List<Address> address) {
        this.address = address;
        return this;
    }

    public List<String> getEmail() {
        return email;
    }

    public ContactInformation email(List<String> email) {
        this.email = email;
        return this;
    }

    public List<TelephoneNumber> getTelephone() {
        return telephone;
    }

    public ContactInformation telephone(List<TelephoneNumber> telephone) {
        this.telephone = telephone;
        return this;
    }

    public List<String> getWebPage() {
        return webPage;
    }

    public ContactInformation webPage(List<String> webPage) {
        this.webPage = webPage;
        return this;
    }

}
