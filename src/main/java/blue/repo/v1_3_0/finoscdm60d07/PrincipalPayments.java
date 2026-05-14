package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("C5TiCQ7kXEn57JJu1ov3rosjsXUrM6Jy7MVnKtsWo4N3")
public class PrincipalPayments {
    public static String blueId() {
        return "C5TiCQ7kXEn57JJu1ov3rosjsXUrM6Jy7MVnKtsWo4N3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PrincipalPayments";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PrincipalPayments";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PrincipalPayments.json";
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

    private Boolean finalPayment;

    private Boolean initialPayment;

    private Boolean intermediatePayment;

    private PrincipalPaymentSchedule principalPaymentSchedule;

    private List<String> varyingLegNotionalCurrency;

    public String getNamespace() {
        return namespace;
    }

    public PrincipalPayments namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getFinalPayment() {
        return finalPayment;
    }

    public PrincipalPayments finalPayment(Boolean finalPayment) {
        this.finalPayment = finalPayment;
        return this;
    }

    public Boolean getInitialPayment() {
        return initialPayment;
    }

    public PrincipalPayments initialPayment(Boolean initialPayment) {
        this.initialPayment = initialPayment;
        return this;
    }

    public Boolean getIntermediatePayment() {
        return intermediatePayment;
    }

    public PrincipalPayments intermediatePayment(Boolean intermediatePayment) {
        this.intermediatePayment = intermediatePayment;
        return this;
    }

    public PrincipalPaymentSchedule getPrincipalPaymentSchedule() {
        return principalPaymentSchedule;
    }

    public PrincipalPayments principalPaymentSchedule(PrincipalPaymentSchedule principalPaymentSchedule) {
        this.principalPaymentSchedule = principalPaymentSchedule;
        return this;
    }

    public List<String> getVaryingLegNotionalCurrency() {
        return varyingLegNotionalCurrency;
    }

    public PrincipalPayments varyingLegNotionalCurrency(List<String> varyingLegNotionalCurrency) {
        this.varyingLegNotionalCurrency = varyingLegNotionalCurrency;
        return this;
    }

}
