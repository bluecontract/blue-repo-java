package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2TLdfVewjr6gGDjk2Kzg4nqHFXAxYRonnCevNfKRzqpM")
public class PrincipalPaymentSchedule {
    public static String blueId() {
        return "2TLdfVewjr6gGDjk2Kzg4nqHFXAxYRonnCevNfKRzqpM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PrincipalPaymentSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PrincipalPaymentSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PrincipalPaymentSchedule.json";
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

    private PrincipalPayment finalPrincipalPayment;

    private PrincipalPayment initialPrincipalPayment;

    private AdjustableRelativeOrPeriodicDates intermediatePrincipalPayment;

    public String getNamespace() {
        return namespace;
    }

    public PrincipalPaymentSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PrincipalPayment getFinalPrincipalPayment() {
        return finalPrincipalPayment;
    }

    public PrincipalPaymentSchedule finalPrincipalPayment(PrincipalPayment finalPrincipalPayment) {
        this.finalPrincipalPayment = finalPrincipalPayment;
        return this;
    }

    public PrincipalPayment getInitialPrincipalPayment() {
        return initialPrincipalPayment;
    }

    public PrincipalPaymentSchedule initialPrincipalPayment(PrincipalPayment initialPrincipalPayment) {
        this.initialPrincipalPayment = initialPrincipalPayment;
        return this;
    }

    public AdjustableRelativeOrPeriodicDates getIntermediatePrincipalPayment() {
        return intermediatePrincipalPayment;
    }

    public PrincipalPaymentSchedule intermediatePrincipalPayment(AdjustableRelativeOrPeriodicDates intermediatePrincipalPayment) {
        this.intermediatePrincipalPayment = intermediatePrincipalPayment;
        return this;
    }

}
