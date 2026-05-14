package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("G6d8RomEptUnfFy8N1chRTvwLGvyiryVncwGbSKuzdcR")
public class MasterAgreementClauseVariant {
    public static String blueId() {
        return "G6d8RomEptUnfFy8N1chRTvwLGvyiryVncwGbSKuzdcR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterAgreementClauseVariant";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterAgreementClauseVariant";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MasterAgreementClauseVariant.json";
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

    private List<CounterpartyRoleEnum> counterparty;

    private MasterAgreementVariantIdentifierEnum identifier;

    private List<PartyRoleEnum> otherParty;

    private List<MasterAgreementVariableSet> variableSet;

    public String getNamespace() {
        return namespace;
    }

    public MasterAgreementClauseVariant namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CounterpartyRoleEnum> getCounterparty() {
        return counterparty;
    }

    public MasterAgreementClauseVariant counterparty(List<CounterpartyRoleEnum> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public MasterAgreementVariantIdentifierEnum getIdentifier() {
        return identifier;
    }

    public MasterAgreementClauseVariant identifier(MasterAgreementVariantIdentifierEnum identifier) {
        this.identifier = identifier;
        return this;
    }

    public List<PartyRoleEnum> getOtherParty() {
        return otherParty;
    }

    public MasterAgreementClauseVariant otherParty(List<PartyRoleEnum> otherParty) {
        this.otherParty = otherParty;
        return this;
    }

    public List<MasterAgreementVariableSet> getVariableSet() {
        return variableSet;
    }

    public MasterAgreementClauseVariant variableSet(List<MasterAgreementVariableSet> variableSet) {
        this.variableSet = variableSet;
        return this;
    }

}
