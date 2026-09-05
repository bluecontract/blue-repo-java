package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6aSfP4ccQxWgDJEvRE2TzW85f3hLF7fCxghTfQsZ91Rr")
public class CdmLegaldocumentationMasterMasterAgreementClauseVariant {
    public static String blueId() {
        return "6aSfP4ccQxWgDJEvRE2TzW85f3hLF7fCxghTfQsZ91Rr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/MasterAgreementClauseVariant";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/MasterAgreementClauseVariant";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterMasterAgreementClauseVariant.json";
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

    private CdmLegaldocumentationMasterMasterAgreementVariantIdentifierEnum identifier;

    private List<CdmBaseStaticdataPartyPartyRoleEnum> otherParty;

    private List<CdmLegaldocumentationMasterMasterAgreementVariableSet> variableSet;

    public List<CdmBaseStaticdataPartyCounterpartyRoleEnum> getCounterparty() {
        return counterparty;
    }

    public CdmLegaldocumentationMasterMasterAgreementClauseVariant counterparty(List<CdmBaseStaticdataPartyCounterpartyRoleEnum> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public CdmLegaldocumentationMasterMasterAgreementVariantIdentifierEnum getIdentifier() {
        return identifier;
    }

    public CdmLegaldocumentationMasterMasterAgreementClauseVariant identifier(CdmLegaldocumentationMasterMasterAgreementVariantIdentifierEnum identifier) {
        this.identifier = identifier;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRoleEnum> getOtherParty() {
        return otherParty;
    }

    public CdmLegaldocumentationMasterMasterAgreementClauseVariant otherParty(List<CdmBaseStaticdataPartyPartyRoleEnum> otherParty) {
        this.otherParty = otherParty;
        return this;
    }

    public List<CdmLegaldocumentationMasterMasterAgreementVariableSet> getVariableSet() {
        return variableSet;
    }

    public CdmLegaldocumentationMasterMasterAgreementClauseVariant variableSet(List<CdmLegaldocumentationMasterMasterAgreementVariableSet> variableSet) {
        this.variableSet = variableSet;
        return this;
    }

}
