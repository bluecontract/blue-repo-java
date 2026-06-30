package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hrt2EoYJokASG9J62NMKWt8UZbQN6BwtESp7hVDVQYvm")
public class CdmBaseStaticdataPartyPartyRole {
    public static String blueId() {
        return "Hrt2EoYJokASG9J62NMKWt8UZbQN6BwtESp7hVDVQYvm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PartyRole";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PartyRole";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPartyRole.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty ownershipPartyReference;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference;

    private CdmBaseStaticdataPartyPartyRoleEnum role;

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getOwnershipPartyReference() {
        return ownershipPartyReference;
    }

    public CdmBaseStaticdataPartyPartyRole ownershipPartyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty ownershipPartyReference) {
        this.ownershipPartyReference = ownershipPartyReference;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public CdmBaseStaticdataPartyPartyRole partyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public CdmBaseStaticdataPartyPartyRoleEnum getRole() {
        return role;
    }

    public CdmBaseStaticdataPartyPartyRole role(CdmBaseStaticdataPartyPartyRoleEnum role) {
        this.role = role;
        return this;
    }

}
