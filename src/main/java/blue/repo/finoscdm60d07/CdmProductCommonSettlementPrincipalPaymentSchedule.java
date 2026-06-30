package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Esmmz6HUDCJAgn44LSSCvC1CCKuZW9U22nKNF4fXwkjv")
public class CdmProductCommonSettlementPrincipalPaymentSchedule {
    public static String blueId() {
        return "Esmmz6HUDCJAgn44LSSCvC1CCKuZW9U22nKNF4fXwkjv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PrincipalPaymentSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PrincipalPaymentSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPrincipalPaymentSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementPrincipalPayment finalPrincipalPayment;

    private CdmProductCommonSettlementPrincipalPayment initialPrincipalPayment;

    private CdmBaseDatetimeAdjustableRelativeOrPeriodicDates intermediatePrincipalPayment;

    public CdmProductCommonSettlementPrincipalPayment getFinalPrincipalPayment() {
        return finalPrincipalPayment;
    }

    public CdmProductCommonSettlementPrincipalPaymentSchedule finalPrincipalPayment(CdmProductCommonSettlementPrincipalPayment finalPrincipalPayment) {
        this.finalPrincipalPayment = finalPrincipalPayment;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayment getInitialPrincipalPayment() {
        return initialPrincipalPayment;
    }

    public CdmProductCommonSettlementPrincipalPaymentSchedule initialPrincipalPayment(CdmProductCommonSettlementPrincipalPayment initialPrincipalPayment) {
        this.initialPrincipalPayment = initialPrincipalPayment;
        return this;
    }

    public CdmBaseDatetimeAdjustableRelativeOrPeriodicDates getIntermediatePrincipalPayment() {
        return intermediatePrincipalPayment;
    }

    public CdmProductCommonSettlementPrincipalPaymentSchedule intermediatePrincipalPayment(CdmBaseDatetimeAdjustableRelativeOrPeriodicDates intermediatePrincipalPayment) {
        this.intermediatePrincipalPayment = intermediatePrincipalPayment;
        return this;
    }

}
