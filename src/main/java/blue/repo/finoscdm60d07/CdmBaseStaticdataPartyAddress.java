package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EUfxNe25QF1y8hA3hnoMZSZmjF2EsBu2cVS28qky456f")
public class CdmBaseStaticdataPartyAddress {
    public static String blueId() {
        return "EUfxNe25QF1y8hA3hnoMZSZmjF2EsBu2cVS28qky456f";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/Address";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/Address";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyAddress.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String city;

    private ComRosettaModelFieldWithMetaString country;

    private String postalCode;

    private String state;

    private List<String> street;

    public String getCity() {
        return city;
    }

    public CdmBaseStaticdataPartyAddress city(String city) {
        this.city = city;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCountry() {
        return country;
    }

    public CdmBaseStaticdataPartyAddress country(ComRosettaModelFieldWithMetaString country) {
        this.country = country;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public CdmBaseStaticdataPartyAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getState() {
        return state;
    }

    public CdmBaseStaticdataPartyAddress state(String state) {
        this.state = state;
        return this;
    }

    public List<String> getStreet() {
        return street;
    }

    public CdmBaseStaticdataPartyAddress street(List<String> street) {
        this.street = street;
        return this;
    }

}
