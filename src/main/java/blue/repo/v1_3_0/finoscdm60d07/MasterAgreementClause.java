package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8qxkKWXEmdBU416PWW5zgYejpnaNDtpSoYU6t7sWTRJv")
public class MasterAgreementClause {
    public static String blueId() {
        return "8qxkKWXEmdBU416PWW5zgYejpnaNDtpSoYU6t7sWTRJv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterAgreementClause";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterAgreementClause";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MasterAgreementClause.json";
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

    private MasterAgreementClauseIdentifierEnum identifer;

    private List<PartyRoleEnum> otherParty;

    private List<MasterAgreementClauseVariant> variant;

    public String getNamespace() {
        return namespace;
    }

    public MasterAgreementClause namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CounterpartyRoleEnum> getCounterparty() {
        return counterparty;
    }

    public MasterAgreementClause counterparty(List<CounterpartyRoleEnum> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public MasterAgreementClauseIdentifierEnum getIdentifer() {
        return identifer;
    }

    public MasterAgreementClause identifer(MasterAgreementClauseIdentifierEnum identifer) {
        this.identifer = identifer;
        return this;
    }

    public List<PartyRoleEnum> getOtherParty() {
        return otherParty;
    }

    public MasterAgreementClause otherParty(List<PartyRoleEnum> otherParty) {
        this.otherParty = otherParty;
        return this;
    }

    public List<MasterAgreementClauseVariant> getVariant() {
        return variant;
    }

    public MasterAgreementClause variant(List<MasterAgreementClauseVariant> variant) {
        this.variant = variant;
        return this;
    }

}
