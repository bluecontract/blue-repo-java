package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3i5e7FCHPWiRqmM7cMjNwNubBYQbN7XnLgj7a63kX7JD")
public class DebtType {
    public static String blueId() {
        return "3i5e7FCHPWiRqmM7cMjNwNubBYQbN7XnLgj7a63kX7JD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DebtType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DebtType";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DebtType.json";
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

    private DebtClassEnum debtClass;

    private List<DebtEconomics> debtEconomics;

    public String getNamespace() {
        return namespace;
    }

    public DebtType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DebtClassEnum getDebtClass() {
        return debtClass;
    }

    public DebtType debtClass(DebtClassEnum debtClass) {
        this.debtClass = debtClass;
        return this;
    }

    public List<DebtEconomics> getDebtEconomics() {
        return debtEconomics;
    }

    public DebtType debtEconomics(List<DebtEconomics> debtEconomics) {
        this.debtEconomics = debtEconomics;
        return this;
    }

}
