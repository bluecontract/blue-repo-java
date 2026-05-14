package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H34XH9GWap8TpMnABfry9nXVTS23aaXT4d69uJ47UiUH")
public class MandatoryEarlyTerminationAdjustedDates {
    public static String blueId() {
        return "H34XH9GWap8TpMnABfry9nXVTS23aaXT4d69uJ47UiUH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MandatoryEarlyTerminationAdjustedDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MandatoryEarlyTerminationAdjustedDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MandatoryEarlyTerminationAdjustedDates.json";
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

    private String adjustedCashSettlementPaymentDate;

    private String adjustedCashSettlementValuationDate;

    private String adjustedEarlyTerminationDate;

    public String getNamespace() {
        return namespace;
    }

    public MandatoryEarlyTerminationAdjustedDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedCashSettlementPaymentDate() {
        return adjustedCashSettlementPaymentDate;
    }

    public MandatoryEarlyTerminationAdjustedDates adjustedCashSettlementPaymentDate(String adjustedCashSettlementPaymentDate) {
        this.adjustedCashSettlementPaymentDate = adjustedCashSettlementPaymentDate;
        return this;
    }

    public String getAdjustedCashSettlementValuationDate() {
        return adjustedCashSettlementValuationDate;
    }

    public MandatoryEarlyTerminationAdjustedDates adjustedCashSettlementValuationDate(String adjustedCashSettlementValuationDate) {
        this.adjustedCashSettlementValuationDate = adjustedCashSettlementValuationDate;
        return this;
    }

    public String getAdjustedEarlyTerminationDate() {
        return adjustedEarlyTerminationDate;
    }

    public MandatoryEarlyTerminationAdjustedDates adjustedEarlyTerminationDate(String adjustedEarlyTerminationDate) {
        this.adjustedEarlyTerminationDate = adjustedEarlyTerminationDate;
        return this;
    }

}
