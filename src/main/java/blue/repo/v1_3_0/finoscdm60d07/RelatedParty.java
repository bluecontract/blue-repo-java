package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D6yDrSSLwU1pszva7YAeBY35G6qcDFo9o38CCe5ukR6E")
public class RelatedParty {
    public static String blueId() {
        return "D6yDrSSLwU1pszva7YAeBY35G6qcDFo9o38CCe5ukR6E";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RelatedParty";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RelatedParty";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RelatedParty.json";
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

    private ReferenceWithMetaAccount accountReference;

    private ReferenceWithMetaParty partyReference;

    private PartyRoleEnum role;

    public String getNamespace() {
        return namespace;
    }

    public RelatedParty namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaAccount getAccountReference() {
        return accountReference;
    }

    public RelatedParty accountReference(ReferenceWithMetaAccount accountReference) {
        this.accountReference = accountReference;
        return this;
    }

    public ReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public RelatedParty partyReference(ReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public PartyRoleEnum getRole() {
        return role;
    }

    public RelatedParty role(PartyRoleEnum role) {
        this.role = role;
        return this;
    }

}
