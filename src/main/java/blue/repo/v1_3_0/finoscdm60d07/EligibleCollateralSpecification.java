package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BYmrgGgfScxJpKSKuGQH8Gch59qEvVjYytYpTafxFaBe")
public class EligibleCollateralSpecification {
    public static String blueId() {
        return "BYmrgGgfScxJpKSKuGQH8Gch59qEvVjYytYpTafxFaBe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EligibleCollateralSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EligibleCollateralSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EligibleCollateralSpecification.json";
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

    private List<Counterparty> counterparty;

    private List<EligibleCollateralCriteria> criteria;

    private List<Identifier> identifier;

    private List<Party> party;

    private List<PartyRole> partyRole;

    public String getNamespace() {
        return namespace;
    }

    public EligibleCollateralSpecification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Counterparty> getCounterparty() {
        return counterparty;
    }

    public EligibleCollateralSpecification counterparty(List<Counterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public List<EligibleCollateralCriteria> getCriteria() {
        return criteria;
    }

    public EligibleCollateralSpecification criteria(List<EligibleCollateralCriteria> criteria) {
        this.criteria = criteria;
        return this;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public EligibleCollateralSpecification identifier(List<Identifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public EligibleCollateralSpecification party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public EligibleCollateralSpecification partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

}
