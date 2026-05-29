package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BcyLTtz7PCvjtQ62vawwZU9iJiBPFvhNZfSYetBTLZiM")
public class CdmProductCollateralEligibleCollateralSpecification {
    public static String blueId() {
        return "BcyLTtz7PCvjtQ62vawwZU9iJiBPFvhNZfSYetBTLZiM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/EligibleCollateralSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/EligibleCollateralSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralEligibleCollateralSpecification.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyCounterparty> counterparty;

    private List<CdmProductCollateralEligibleCollateralCriteria> criteria;

    private List<CdmBaseStaticdataIdentifierIdentifier> identifier;

    private List<CdmBaseStaticdataPartyParty> party;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    public List<CdmBaseStaticdataPartyCounterparty> getCounterparty() {
        return counterparty;
    }

    public CdmProductCollateralEligibleCollateralSpecification counterparty(List<CdmBaseStaticdataPartyCounterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public List<CdmProductCollateralEligibleCollateralCriteria> getCriteria() {
        return criteria;
    }

    public CdmProductCollateralEligibleCollateralSpecification criteria(List<CdmProductCollateralEligibleCollateralCriteria> criteria) {
        this.criteria = criteria;
        return this;
    }

    public List<CdmBaseStaticdataIdentifierIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmProductCollateralEligibleCollateralSpecification identifier(List<CdmBaseStaticdataIdentifierIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmProductCollateralEligibleCollateralSpecification party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmProductCollateralEligibleCollateralSpecification partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

}
