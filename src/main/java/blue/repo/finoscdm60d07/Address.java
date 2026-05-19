package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9KR5MwGB38jf7qVecqH7PEZtK6ZfbS2vQfVVGC43XXgA")
public class Address {
    public static String blueId() {
        return "9KR5MwGB38jf7qVecqH7PEZtK6ZfbS2vQfVVGC43XXgA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Address";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Address";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Address.json";
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

    private String city;

    private FieldWithMetaString country;

    private String postalCode;

    private String state;

    private List<String> street;

    public String getNamespace() {
        return namespace;
    }

    public Address namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    public FieldWithMetaString getCountry() {
        return country;
    }

    public Address country(FieldWithMetaString country) {
        this.country = country;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address state(String state) {
        this.state = state;
        return this;
    }

    public List<String> getStreet() {
        return street;
    }

    public Address street(List<String> street) {
        this.street = street;
        return this;
    }

}
