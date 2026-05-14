package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AVLZBE6vzpDFRWChzZg4qyuWyNhPEPveCf3GNnrZhuJb")
public class AncillaryParty {
    public static String blueId() {
        return "AVLZBE6vzpDFRWChzZg4qyuWyNhPEPveCf3GNnrZhuJb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AncillaryParty";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AncillaryParty";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AncillaryParty.json";
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

    private CounterpartyRoleEnum onBehalfOf;

    private List<ReferenceWithMetaParty> partyReference;

    private AncillaryRoleEnum role;

    public String getNamespace() {
        return namespace;
    }

    public AncillaryParty namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CounterpartyRoleEnum getOnBehalfOf() {
        return onBehalfOf;
    }

    public AncillaryParty onBehalfOf(CounterpartyRoleEnum onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public List<ReferenceWithMetaParty> getPartyReference() {
        return partyReference;
    }

    public AncillaryParty partyReference(List<ReferenceWithMetaParty> partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public AncillaryRoleEnum getRole() {
        return role;
    }

    public AncillaryParty role(AncillaryRoleEnum role) {
        this.role = role;
        return this;
    }

}
