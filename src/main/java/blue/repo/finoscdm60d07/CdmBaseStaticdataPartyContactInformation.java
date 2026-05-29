package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("tWjzEXNpctUeMnop8Wj6gnxCUqcE9XJnXn31gdiq2xd")
public class CdmBaseStaticdataPartyContactInformation {
    public static String blueId() {
        return "tWjzEXNpctUeMnop8Wj6gnxCUqcE9XJnXn31gdiq2xd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/ContactInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/ContactInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyContactInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyAddress> address;

    private List<String> email;

    private List<CdmBaseStaticdataPartyTelephoneNumber> telephone;

    private List<String> webPage;

    public List<CdmBaseStaticdataPartyAddress> getAddress() {
        return address;
    }

    public CdmBaseStaticdataPartyContactInformation address(List<CdmBaseStaticdataPartyAddress> address) {
        this.address = address;
        return this;
    }

    public List<String> getEmail() {
        return email;
    }

    public CdmBaseStaticdataPartyContactInformation email(List<String> email) {
        this.email = email;
        return this;
    }

    public List<CdmBaseStaticdataPartyTelephoneNumber> getTelephone() {
        return telephone;
    }

    public CdmBaseStaticdataPartyContactInformation telephone(List<CdmBaseStaticdataPartyTelephoneNumber> telephone) {
        this.telephone = telephone;
        return this;
    }

    public List<String> getWebPage() {
        return webPage;
    }

    public CdmBaseStaticdataPartyContactInformation webPage(List<String> webPage) {
        this.webPage = webPage;
        return this;
    }

}
