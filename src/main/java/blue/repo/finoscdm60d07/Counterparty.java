package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("gfoywborZ3FfKnSaoNBtFq5TPCXFpfJKuQ2AD1nAs47")
public class Counterparty {
    public static String blueId() {
        return "gfoywborZ3FfKnSaoNBtFq5TPCXFpfJKuQ2AD1nAs47";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Counterparty";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Counterparty";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Counterparty.json";
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

    private ReferenceWithMetaParty partyReference;

    private CounterpartyRoleEnum role;

    public String getNamespace() {
        return namespace;
    }

    public Counterparty namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public Counterparty partyReference(ReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public CounterpartyRoleEnum getRole() {
        return role;
    }

    public Counterparty role(CounterpartyRoleEnum role) {
        this.role = role;
        return this;
    }

}
