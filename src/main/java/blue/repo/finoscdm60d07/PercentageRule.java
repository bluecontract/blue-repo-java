package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6fXJXyMmrkNy4Ay6jsZfJ5ASwPWyVKb2cvFbZssv2CTq")
public class PercentageRule {
    public static String blueId() {
        return "6fXJXyMmrkNy4Ay6jsZfJ5ASwPWyVKb2cvFbZssv2CTq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PercentageRule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PercentageRule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PercentageRule.json";
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

    private ReferenceWithMetaMoney notionalAmountReference;

    private Double paymentPercent;

    public String getNamespace() {
        return namespace;
    }

    public PercentageRule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaMoney getNotionalAmountReference() {
        return notionalAmountReference;
    }

    public PercentageRule notionalAmountReference(ReferenceWithMetaMoney notionalAmountReference) {
        this.notionalAmountReference = notionalAmountReference;
        return this;
    }

    public Double getPaymentPercent() {
        return paymentPercent;
    }

    public PercentageRule paymentPercent(Double paymentPercent) {
        this.paymentPercent = paymentPercent;
        return this;
    }

}
