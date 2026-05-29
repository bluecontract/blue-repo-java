package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Hxc4Dbr7nrj5XkPBBiJGhPhQVnfNHWHn21HViV1FpBGM")
public class CdmProductCommonSettlementPrincipalPayments {
    public static String blueId() {
        return "Hxc4Dbr7nrj5XkPBBiJGhPhQVnfNHWHn21HViV1FpBGM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PrincipalPayments";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PrincipalPayments";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPrincipalPayments.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean finalPayment;

    private Boolean initialPayment;

    private Boolean intermediatePayment;

    private CdmProductCommonSettlementPrincipalPaymentSchedule principalPaymentSchedule;

    private List<String> varyingLegNotionalCurrency;

    public Boolean getFinalPayment() {
        return finalPayment;
    }

    public CdmProductCommonSettlementPrincipalPayments finalPayment(Boolean finalPayment) {
        this.finalPayment = finalPayment;
        return this;
    }

    public Boolean getInitialPayment() {
        return initialPayment;
    }

    public CdmProductCommonSettlementPrincipalPayments initialPayment(Boolean initialPayment) {
        this.initialPayment = initialPayment;
        return this;
    }

    public Boolean getIntermediatePayment() {
        return intermediatePayment;
    }

    public CdmProductCommonSettlementPrincipalPayments intermediatePayment(Boolean intermediatePayment) {
        this.intermediatePayment = intermediatePayment;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPaymentSchedule getPrincipalPaymentSchedule() {
        return principalPaymentSchedule;
    }

    public CdmProductCommonSettlementPrincipalPayments principalPaymentSchedule(CdmProductCommonSettlementPrincipalPaymentSchedule principalPaymentSchedule) {
        this.principalPaymentSchedule = principalPaymentSchedule;
        return this;
    }

    public List<String> getVaryingLegNotionalCurrency() {
        return varyingLegNotionalCurrency;
    }

    public CdmProductCommonSettlementPrincipalPayments varyingLegNotionalCurrency(List<String> varyingLegNotionalCurrency) {
        this.varyingLegNotionalCurrency = varyingLegNotionalCurrency;
        return this;
    }

}
