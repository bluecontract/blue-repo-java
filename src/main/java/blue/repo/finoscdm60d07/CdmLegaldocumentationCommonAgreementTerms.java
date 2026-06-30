package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4KjkUNqNW52EyuCcnzPCbMA8tfR6qRi9jXUsZ3s5vFTv")
public class CdmLegaldocumentationCommonAgreementTerms {
    public static String blueId() {
        return "4KjkUNqNW52EyuCcnzPCbMA8tfR6qRi9jXUsZ3s5vFTv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/AgreementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/AgreementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonAgreementTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmLegaldocumentationContractAgreement agreement;

    private Boolean clauseLibrary;

    private List<CdmBaseStaticdataPartyCounterparty> counterparty;

    public CdmLegaldocumentationContractAgreement getAgreement() {
        return agreement;
    }

    public CdmLegaldocumentationCommonAgreementTerms agreement(CdmLegaldocumentationContractAgreement agreement) {
        this.agreement = agreement;
        return this;
    }

    public Boolean getClauseLibrary() {
        return clauseLibrary;
    }

    public CdmLegaldocumentationCommonAgreementTerms clauseLibrary(Boolean clauseLibrary) {
        this.clauseLibrary = clauseLibrary;
        return this;
    }

    public List<CdmBaseStaticdataPartyCounterparty> getCounterparty() {
        return counterparty;
    }

    public CdmLegaldocumentationCommonAgreementTerms counterparty(List<CdmBaseStaticdataPartyCounterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

}
