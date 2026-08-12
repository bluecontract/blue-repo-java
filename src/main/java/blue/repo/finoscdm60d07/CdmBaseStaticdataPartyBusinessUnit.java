package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EMjJhiDkKtnd6Xy5ATKZRxxn7miYV6i9qRKmbwi8PePK")
public class CdmBaseStaticdataPartyBusinessUnit {
    public static String blueId() {
        return "EMjJhiDkKtnd6Xy5ATKZRxxn7miYV6i9qRKmbwi8PePK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/BusinessUnit";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/BusinessUnit";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyBusinessUnit.json";
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

    private CdmBaseStaticdataIdentifierIdentifier identifier;

    public CdmBaseStaticdataPartyContactInformation getContactInformation() {
        return contactInformation;
    }

    public CdmBaseStaticdataPartyBusinessUnit contactInformation(CdmBaseStaticdataPartyContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataPartyBusinessUnit identifier(CdmBaseStaticdataIdentifierIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

}
