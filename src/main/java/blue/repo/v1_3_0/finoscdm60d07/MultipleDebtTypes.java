package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("ESniWduuyj3qM9Xr6j13iHJ9KBEdFsRpDpHvn6ER1NhH")
public class MultipleDebtTypes {
    public static String blueId() {
        return "ESniWduuyj3qM9Xr6j13iHJ9KBEdFsRpDpHvn6ER1NhH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MultipleDebtTypes";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MultipleDebtTypes";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MultipleDebtTypes.json";
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

    private QuantifierEnum condition;

    private List<FieldWithMetaString> debtType;

    public String getNamespace() {
        return namespace;
    }

    public MultipleDebtTypes namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public QuantifierEnum getCondition() {
        return condition;
    }

    public MultipleDebtTypes condition(QuantifierEnum condition) {
        this.condition = condition;
        return this;
    }

    public List<FieldWithMetaString> getDebtType() {
        return debtType;
    }

    public MultipleDebtTypes debtType(List<FieldWithMetaString> debtType) {
        this.debtType = debtType;
        return this;
    }

}
