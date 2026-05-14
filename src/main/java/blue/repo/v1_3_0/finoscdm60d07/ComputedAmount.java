package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EhDoaFQSeHQN8NKgjCr7CSTqSbSR3RpLU7GNiReiim1e")
public class ComputedAmount {
    public static String blueId() {
        return "EhDoaFQSeHQN8NKgjCr7CSTqSbSR3RpLU7GNiReiim1e";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ComputedAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ComputedAmount";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ComputedAmount.json";
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

    private Double amount;

    private String callFunction;

    private FieldWithMetaString currency;

    public String getNamespace() {
        return namespace;
    }

    public ComputedAmount namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public ComputedAmount amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public String getCallFunction() {
        return callFunction;
    }

    public ComputedAmount callFunction(String callFunction) {
        this.callFunction = callFunction;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public ComputedAmount currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

}
