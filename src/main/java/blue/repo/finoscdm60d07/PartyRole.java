package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HjRiCP4U2kbina9KzZmsLbxfxuEKtL8de46X5Pvi5j4Q")
public class PartyRole {
    public static String blueId() {
        return "HjRiCP4U2kbina9KzZmsLbxfxuEKtL8de46X5Pvi5j4Q";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyRole";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyRole";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PartyRole.json";
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

    private ReferenceWithMetaParty ownershipPartyReference;

    private ReferenceWithMetaParty partyReference;

    private PartyRoleEnum role;

    public String getNamespace() {
        return namespace;
    }

    public PartyRole namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaParty getOwnershipPartyReference() {
        return ownershipPartyReference;
    }

    public PartyRole ownershipPartyReference(ReferenceWithMetaParty ownershipPartyReference) {
        this.ownershipPartyReference = ownershipPartyReference;
        return this;
    }

    public ReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public PartyRole partyReference(ReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public PartyRoleEnum getRole() {
        return role;
    }

    public PartyRole role(PartyRoleEnum role) {
        this.role = role;
        return this;
    }

}
