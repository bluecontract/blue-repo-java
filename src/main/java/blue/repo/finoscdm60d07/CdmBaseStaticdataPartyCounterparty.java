package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("58TeStN7sJrzoG3o1U7FZq3fFkxbCXkvdWPYYZkf1r3x")
public class CdmBaseStaticdataPartyCounterparty {
    public static String blueId() {
        return "58TeStN7sJrzoG3o1U7FZq3fFkxbCXkvdWPYYZkf1r3x";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/Counterparty";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/Counterparty";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyCounterparty.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum role;

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public CdmBaseStaticdataPartyCounterparty partyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getRole() {
        return role;
    }

    public CdmBaseStaticdataPartyCounterparty role(CdmBaseStaticdataPartyCounterpartyRoleEnum role) {
        this.role = role;
        return this;
    }

}
