package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Acs6ukfV3eCU91sJGg35wtJYCmsZtHywzXgw7C4nVMV7")
public class CdmProductTemplateMandatoryEarlyTerminationAdjustedDates {
    public static String blueId() {
        return "Acs6ukfV3eCU91sJGg35wtJYCmsZtHywzXgw7C4nVMV7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/MandatoryEarlyTerminationAdjustedDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/MandatoryEarlyTerminationAdjustedDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateMandatoryEarlyTerminationAdjustedDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedCashSettlementPaymentDate;

    private String adjustedCashSettlementValuationDate;

    private String adjustedEarlyTerminationDate;

    public String getAdjustedCashSettlementPaymentDate() {
        return adjustedCashSettlementPaymentDate;
    }

    public CdmProductTemplateMandatoryEarlyTerminationAdjustedDates adjustedCashSettlementPaymentDate(String adjustedCashSettlementPaymentDate) {
        this.adjustedCashSettlementPaymentDate = adjustedCashSettlementPaymentDate;
        return this;
    }

    public String getAdjustedCashSettlementValuationDate() {
        return adjustedCashSettlementValuationDate;
    }

    public CdmProductTemplateMandatoryEarlyTerminationAdjustedDates adjustedCashSettlementValuationDate(String adjustedCashSettlementValuationDate) {
        this.adjustedCashSettlementValuationDate = adjustedCashSettlementValuationDate;
        return this;
    }

    public String getAdjustedEarlyTerminationDate() {
        return adjustedEarlyTerminationDate;
    }

    public CdmProductTemplateMandatoryEarlyTerminationAdjustedDates adjustedEarlyTerminationDate(String adjustedEarlyTerminationDate) {
        this.adjustedEarlyTerminationDate = adjustedEarlyTerminationDate;
        return this;
    }

}
