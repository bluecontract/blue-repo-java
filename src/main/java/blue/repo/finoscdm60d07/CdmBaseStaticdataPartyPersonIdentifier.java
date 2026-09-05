package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B1rL9CmkMRsTy72XnBDjEQoaQi1wySJht5x91JXi4GYW")
public class CdmBaseStaticdataPartyPersonIdentifier {
    public static String blueId() {
        return "B1rL9CmkMRsTy72XnBDjEQoaQi1wySJht5x91JXi4GYW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PersonIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PersonIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPersonIdentifier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString country;

    private ComRosettaModelFieldWithMetaString identifier;

    private CdmBaseStaticdataPartyPersonIdentifierTypeEnum identifierType;

    public ComRosettaModelFieldWithMetaString getCountry() {
        return country;
    }

    public CdmBaseStaticdataPartyPersonIdentifier country(ComRosettaModelFieldWithMetaString country) {
        this.country = country;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataPartyPersonIdentifier identifier(ComRosettaModelFieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseStaticdataPartyPersonIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public CdmBaseStaticdataPartyPersonIdentifier identifierType(CdmBaseStaticdataPartyPersonIdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

}
