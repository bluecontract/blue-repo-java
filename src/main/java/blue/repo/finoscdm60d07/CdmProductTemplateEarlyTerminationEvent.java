package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Bsu7yKrKiwjYKpoRKPKrM3d9hpsNTBunvz9Xot21HqYD")
public class CdmProductTemplateEarlyTerminationEvent {
    public static String blueId() {
        return "Bsu7yKrKiwjYKpoRKPKrM3d9hpsNTBunvz9Xot21HqYD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/EarlyTerminationEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/EarlyTerminationEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateEarlyTerminationEvent.json";
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

    private String adjustedExerciseDate;

    private String adjustedExerciseFeePaymentDate;

    public String getAdjustedCashSettlementPaymentDate() {
        return adjustedCashSettlementPaymentDate;
    }

    public CdmProductTemplateEarlyTerminationEvent adjustedCashSettlementPaymentDate(String adjustedCashSettlementPaymentDate) {
        this.adjustedCashSettlementPaymentDate = adjustedCashSettlementPaymentDate;
        return this;
    }

    public String getAdjustedCashSettlementValuationDate() {
        return adjustedCashSettlementValuationDate;
    }

    public CdmProductTemplateEarlyTerminationEvent adjustedCashSettlementValuationDate(String adjustedCashSettlementValuationDate) {
        this.adjustedCashSettlementValuationDate = adjustedCashSettlementValuationDate;
        return this;
    }

    public String getAdjustedEarlyTerminationDate() {
        return adjustedEarlyTerminationDate;
    }

    public CdmProductTemplateEarlyTerminationEvent adjustedEarlyTerminationDate(String adjustedEarlyTerminationDate) {
        this.adjustedEarlyTerminationDate = adjustedEarlyTerminationDate;
        return this;
    }

    public String getAdjustedExerciseDate() {
        return adjustedExerciseDate;
    }

    public CdmProductTemplateEarlyTerminationEvent adjustedExerciseDate(String adjustedExerciseDate) {
        this.adjustedExerciseDate = adjustedExerciseDate;
        return this;
    }

    public String getAdjustedExerciseFeePaymentDate() {
        return adjustedExerciseFeePaymentDate;
    }

    public CdmProductTemplateEarlyTerminationEvent adjustedExerciseFeePaymentDate(String adjustedExerciseFeePaymentDate) {
        this.adjustedExerciseFeePaymentDate = adjustedExerciseFeePaymentDate;
        return this;
    }

}
