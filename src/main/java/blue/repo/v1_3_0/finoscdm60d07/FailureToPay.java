package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AGVa3pqKddXfhpyBU6RYcChufLgEm2qQXrhHrXZDUr8A")
public class FailureToPay {
    public static String blueId() {
        return "AGVa3pqKddXfhpyBU6RYcChufLgEm2qQXrhHrXZDUr8A";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FailureToPay";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FailureToPay";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FailureToPay.json";
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

    private Boolean applicable;

    private GracePeriodExtension gracePeriodExtension;

    private Money paymentRequirement;

    public String getNamespace() {
        return namespace;
    }

    public FailureToPay namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public FailureToPay applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public GracePeriodExtension getGracePeriodExtension() {
        return gracePeriodExtension;
    }

    public FailureToPay gracePeriodExtension(GracePeriodExtension gracePeriodExtension) {
        this.gracePeriodExtension = gracePeriodExtension;
        return this;
    }

    public Money getPaymentRequirement() {
        return paymentRequirement;
    }

    public FailureToPay paymentRequirement(Money paymentRequirement) {
        this.paymentRequirement = paymentRequirement;
        return this;
    }

}
