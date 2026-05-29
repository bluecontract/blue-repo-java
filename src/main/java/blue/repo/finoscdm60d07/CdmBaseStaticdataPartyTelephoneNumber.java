package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Bu9EEGZ85BZh64bWjZ7PR1Hd9aRbPZXAWCC5gJzfiDr5")
public class CdmBaseStaticdataPartyTelephoneNumber {
    public static String blueId() {
        return "Bu9EEGZ85BZh64bWjZ7PR1Hd9aRbPZXAWCC5gJzfiDr5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/TelephoneNumber";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/TelephoneNumber";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyTelephoneNumber.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String number;

    private CdmBaseStaticdataPartyTelephoneTypeEnum telephoneNumberType;

    public String getNumber() {
        return number;
    }

    public CdmBaseStaticdataPartyTelephoneNumber number(String number) {
        this.number = number;
        return this;
    }

    public CdmBaseStaticdataPartyTelephoneTypeEnum getTelephoneNumberType() {
        return telephoneNumberType;
    }

    public CdmBaseStaticdataPartyTelephoneNumber telephoneNumberType(CdmBaseStaticdataPartyTelephoneTypeEnum telephoneNumberType) {
        this.telephoneNumberType = telephoneNumberType;
        return this;
    }

}
