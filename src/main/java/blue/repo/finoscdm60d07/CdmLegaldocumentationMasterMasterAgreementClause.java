package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3knfSF3hFkxPBWaCDL6NsbALuvhqTdtD3Bp3QKG4wLXq")
public class CdmLegaldocumentationMasterMasterAgreementClause {
    public static String blueId() {
        return "3knfSF3hFkxPBWaCDL6NsbALuvhqTdtD3Bp3QKG4wLXq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/MasterAgreementClause";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/MasterAgreementClause";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterMasterAgreementClause.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyCounterpartyRoleEnum> counterparty;

    private CdmLegaldocumentationMasterMasterAgreementClauseIdentifierEnum identifer;

    private List<CdmBaseStaticdataPartyPartyRoleEnum> otherParty;

    private List<CdmLegaldocumentationMasterMasterAgreementClauseVariant> variant;

    public List<CdmBaseStaticdataPartyCounterpartyRoleEnum> getCounterparty() {
        return counterparty;
    }

    public CdmLegaldocumentationMasterMasterAgreementClause counterparty(List<CdmBaseStaticdataPartyCounterpartyRoleEnum> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public CdmLegaldocumentationMasterMasterAgreementClauseIdentifierEnum getIdentifer() {
        return identifer;
    }

    public CdmLegaldocumentationMasterMasterAgreementClause identifer(CdmLegaldocumentationMasterMasterAgreementClauseIdentifierEnum identifer) {
        this.identifer = identifer;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRoleEnum> getOtherParty() {
        return otherParty;
    }

    public CdmLegaldocumentationMasterMasterAgreementClause otherParty(List<CdmBaseStaticdataPartyPartyRoleEnum> otherParty) {
        this.otherParty = otherParty;
        return this;
    }

    public List<CdmLegaldocumentationMasterMasterAgreementClauseVariant> getVariant() {
        return variant;
    }

    public CdmLegaldocumentationMasterMasterAgreementClause variant(List<CdmLegaldocumentationMasterMasterAgreementClauseVariant> variant) {
        this.variant = variant;
        return this;
    }

}
