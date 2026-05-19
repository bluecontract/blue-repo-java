package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G6nkkyG9jaVHy8HmMo7Rpha9NwMyqXuXmpkQmn97jtHA")
public class TelephoneNumber {
    public static String blueId() {
        return "G6nkkyG9jaVHy8HmMo7Rpha9NwMyqXuXmpkQmn97jtHA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TelephoneNumber";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TelephoneNumber";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TelephoneNumber.json";
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

    private String number;

    private TelephoneTypeEnum telephoneNumberType;

    public String getNamespace() {
        return namespace;
    }

    public TelephoneNumber namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public TelephoneNumber number(String number) {
        this.number = number;
        return this;
    }

    public TelephoneTypeEnum getTelephoneNumberType() {
        return telephoneNumberType;
    }

    public TelephoneNumber telephoneNumberType(TelephoneTypeEnum telephoneNumberType) {
        this.telephoneNumberType = telephoneNumberType;
        return this;
    }

}
