package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AGa4xDzohuMeonuvvfPSohH7tmSdN59ng4Gm6V1AQJmm")
public class CdmBaseStaticdataPartyPartyIdentifier {
    public static String blueId() {
        return "AGa4xDzohuMeonuvvfPSohH7tmSdN59ng4Gm6V1AQJmm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PartyIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PartyIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPartyIdentifier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString identifier;

    private CdmBaseStaticdataPartyPartyIdentifierTypeEnum identifierType;

    public ComRosettaModelFieldWithMetaString getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataPartyPartyIdentifier identifier(ComRosettaModelFieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseStaticdataPartyPartyIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public CdmBaseStaticdataPartyPartyIdentifier identifierType(CdmBaseStaticdataPartyPartyIdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

}
