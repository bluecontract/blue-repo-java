package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GDCE5A9WjeLo8to23snxZRtmt4nKRXNnxJZy7deZ2xKS")
public class AgreementTerms {
    public static String blueId() {
        return "GDCE5A9WjeLo8to23snxZRtmt4nKRXNnxJZy7deZ2xKS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AgreementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AgreementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AgreementTerms.json";
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

    private Agreement agreement;

    private Boolean clauseLibrary;

    private List<Counterparty> counterparty;

    public String getNamespace() {
        return namespace;
    }

    public AgreementTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public AgreementTerms agreement(Agreement agreement) {
        this.agreement = agreement;
        return this;
    }

    public Boolean getClauseLibrary() {
        return clauseLibrary;
    }

    public AgreementTerms clauseLibrary(Boolean clauseLibrary) {
        this.clauseLibrary = clauseLibrary;
        return this;
    }

    public List<Counterparty> getCounterparty() {
        return counterparty;
    }

    public AgreementTerms counterparty(List<Counterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

}
