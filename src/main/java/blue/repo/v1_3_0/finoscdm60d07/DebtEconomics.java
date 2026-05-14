package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DumkTKQW8NEdtJQCjkCmRBM3zCJrztaAXF9j92xj9Xyt")
public class DebtEconomics {
    public static String blueId() {
        return "DumkTKQW8NEdtJQCjkCmRBM3zCJrztaAXF9j92xj9Xyt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DebtEconomics";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DebtEconomics";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DebtEconomics.json";
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

    private DebtInterestEnum debtInterest;

    private DebtPrincipalEnum debtPrincipal;

    private DebtSeniorityEnum debtSeniority;

    public String getNamespace() {
        return namespace;
    }

    public DebtEconomics namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DebtInterestEnum getDebtInterest() {
        return debtInterest;
    }

    public DebtEconomics debtInterest(DebtInterestEnum debtInterest) {
        this.debtInterest = debtInterest;
        return this;
    }

    public DebtPrincipalEnum getDebtPrincipal() {
        return debtPrincipal;
    }

    public DebtEconomics debtPrincipal(DebtPrincipalEnum debtPrincipal) {
        this.debtPrincipal = debtPrincipal;
        return this;
    }

    public DebtSeniorityEnum getDebtSeniority() {
        return debtSeniority;
    }

    public DebtEconomics debtSeniority(DebtSeniorityEnum debtSeniority) {
        this.debtSeniority = debtSeniority;
        return this;
    }

}
