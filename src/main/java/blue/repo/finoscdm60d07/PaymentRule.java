package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3qoVeYFCTRkPhSpwaEsWkagWmf1CkM2fSiJXXFzS5Ut8")
public class PaymentRule {
    public static String blueId() {
        return "3qoVeYFCTRkPhSpwaEsWkagWmf1CkM2fSiJXXFzS5Ut8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PaymentRule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PaymentRule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PaymentRule.json";
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

    private PercentageRule percentageRule;

    public String getNamespace() {
        return namespace;
    }

    public PaymentRule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PercentageRule getPercentageRule() {
        return percentageRule;
    }

    public PaymentRule percentageRule(PercentageRule percentageRule) {
        this.percentageRule = percentageRule;
        return this;
    }

}
