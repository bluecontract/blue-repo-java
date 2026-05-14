package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("ASns9c6tNxfghYSz1kAeEFtL1NgKL2MCmtgYcMdTqvYP")
public class Instrument {
    public static String blueId() {
        return "ASns9c6tNxfghYSz1kAeEFtL1NgKL2MCmtgYcMdTqvYP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Instrument";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Instrument";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Instrument.json";
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

    // Original Blue property name: ListedDerivative
    @JsonProperty("ListedDerivative")
    private ListedDerivative listedDerivative;

    // Original Blue property name: Loan
    @JsonProperty("Loan")
    private Loan loan;

    // Original Blue property name: Security
    @JsonProperty("Security")
    private Security security;

    public String getNamespace() {
        return namespace;
    }

    public Instrument namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ListedDerivative getListedDerivative() {
        return listedDerivative;
    }

    public Instrument listedDerivative(ListedDerivative listedDerivative) {
        this.listedDerivative = listedDerivative;
        return this;
    }

    public Loan getLoan() {
        return loan;
    }

    public Instrument loan(Loan loan) {
        this.loan = loan;
        return this;
    }

    public Security getSecurity() {
        return security;
    }

    public Instrument security(Security security) {
        this.security = security;
        return this;
    }

}
